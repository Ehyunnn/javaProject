package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test01Main {

	public static void main(String[] args) throws IOException {
		System.out.println("main....jdbc test");

		// 입력처리용!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
		// 1. 라이브러리 추가 >>>>.jar추가 및 경로설정 (java코딩이 oracle과 연동하기위한 라이브러리가 필요.)
		// -> ojdbc6을 추가함 (왼쪽 우유병)
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Test01DAO dao = new Test01DAOimpl(); // Test01DAO:슈퍼클래스 ,Test01DAOimpl:자식클래스
		Test01VO vo = new Test01VO();

		// 데이터를 삽입하고 싶을때, 위의 문장에 insert()에서 ()안에 내용을 담아서 보내주는 경우가있다.
		// 또다른 방법음 입력하고 던져주고, 입력하고 던져주고 하는 루트(for문)를 반복하면됨

		String x = "";
		String menu = "";
		do {

			try {
				selectAllUI(br, dao);// 가장먼저 전체 배열의 데이터가 나타나게 할수있음.

				System.out.println("1.insert, 2.update, 3.delete, 4.selectOne, 5.selectAll");
				menu = br.readLine();

				if (menu.compareTo("1") == 0) {
					insertUI(br, dao);
				} else if (menu.compareTo("2") == 0) {
					updateUI(br, dao);
				} else if (menu.compareTo("3") == 0) {
					deleteUI(br, dao);
				} else if (menu.compareTo("4") == 0) {
					selectOneUI(br, dao);
				} else if (menu.compareTo("5") == 0) {
					selectAllUI(br, dao);
				} else {

					System.out.println("잘못입력");
				}

				System.out.println("종료시 x입력하세요.계속은 아무키");
				x = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (x.compareTo("x") != 0);

		selectAllUI(br, dao);
		System.out.println("프로그램종료.......");
	}

	private static void selectAllUI(BufferedReader br, Test01DAO dao) {
		System.out.println("5.selectAll page");
		// 검색할뿐 주는건 없으니까 Test01VO vo = new Test01VO();이건 들어갈 필요가 없음.
		ArrayList<Test01VO> vos = dao.selectAll();
		for (Test01VO vo : vos) {
			System.out.print(vo.getColumn1() + " ");
			System.out.print(vo.getColumn2() + " ");
			System.out.print(vo.getColumn3() + " ");
			System.out.print(vo.getColumn4() + " ");
			System.out.println(vo.getColumn5() + " ");
		}

	}

	private static void selectOneUI(BufferedReader br, Test01DAO dao) throws NumberFormatException, IOException {
		System.out.println("4.selectOne page");
		Test01VO vo = new Test01VO();
		System.out.println("검색할 데이터 입력");
		vo.setColumn1(Integer.parseInt(br.readLine()));
		// vo.setColumn1(8);
		Test01VO vo2 = dao.selectOne(vo);
		System.out.print(vo2.getColumn1() + " ");
		System.out.print(vo2.getColumn2() + " ");
		System.out.print(vo2.getColumn3() + " ");
		System.out.print(vo2.getColumn4() + " ");
		System.out.println(vo2.getColumn5() + " ");

		// System.out.println("result:" + result);
		// if (result>0) {
		// System.out.println("한개 검색성공");
		//
		// } else {
		// System.out.println("한개 검색실패");
		// }

	}

	private static void deleteUI(BufferedReader br, Test01DAO dao) throws IOException {
		System.out.println("3.delete page");
		Test01VO vo = new Test01VO();
		System.out.println("삭제할 데이터 입력");
		vo.setColumn1(Integer.parseInt(br.readLine()));
		// vo.setColumn1(3);

		int result = dao.delete(vo);
		System.out.println("result:" + result);
		if (result > 0) {
			System.out.println("삭제성공");

		} else {
			System.out.println("삭제실패");
		}

	}

	private static void updateUI(BufferedReader br, Test01DAO dao) throws IOException {
		System.out.println("2. update page");
		Test01VO vo = new Test01VO();
		System.out.println("col1 data입력");
		vo.setColumn1(Integer.parseInt(br.readLine()));
		System.out.println("col2 data입력");
		vo.setColumn2(br.readLine());
		System.out.println("col3 data입력");
		vo.setColumn3(br.readLine());
		System.out.println("col4 data입력");
		vo.setColumn4(br.readLine());
		System.out.println("col5 data입력");
		vo.setColumn5(br.readLine());

		int result = dao.update(vo);
		System.out.println("result:" + result);

	}

	public static void insertUI(BufferedReader br, Test01DAO dao) throws IOException {

		System.out.println("1. insert page");

		Test01VO vo = new Test01VO();
		System.out.println("col2 data입력");
		vo.setColumn2(br.readLine());
		System.out.println("col3 data입력");
		vo.setColumn3(br.readLine());
		System.out.println("col4 data입력");
		vo.setColumn4(br.readLine());
		System.out.println("col5 data입력");
		vo.setColumn5(br.readLine());

		int result = dao.insert(vo);
		System.out.println("result:" + result);

		if (result > 0) {
			System.out.println("수정성공");

		} else {
			System.out.println("수정실패");
		}

	}
}
