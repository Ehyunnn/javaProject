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

		// �Է�ó����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
		// 1. ���̺귯�� �߰� >>>>.jar�߰� �� ��μ��� (java�ڵ��� oracle�� �����ϱ����� ���̺귯���� �ʿ�.)
		// -> ojdbc6�� �߰��� (���� ������)
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Test01DAO dao = new Test01DAOimpl(); // Test01DAO:����Ŭ���� ,Test01DAOimpl:�ڽ�Ŭ����
		Test01VO vo = new Test01VO();

		// �����͸� �����ϰ� ������, ���� ���忡 insert()���� ()�ȿ� ������ ��Ƽ� �����ִ� ��찡�ִ�.
		// �Ǵٸ� ����� �Է��ϰ� �����ְ�, �Է��ϰ� �����ְ� �ϴ� ��Ʈ(for��)�� �ݺ��ϸ��

		String x = "";
		String menu = "";
		do {

			try {
				selectAllUI(br, dao);// ������� ��ü �迭�� �����Ͱ� ��Ÿ���� �Ҽ�����.

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

					System.out.println("�߸��Է�");
				}

				System.out.println("����� x�Է��ϼ���.����� �ƹ�Ű");
				x = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (x.compareTo("x") != 0);

		selectAllUI(br, dao);
		System.out.println("���α׷�����.......");
	}

	private static void selectAllUI(BufferedReader br, Test01DAO dao) {
		System.out.println("5.selectAll page");
		// �˻��һ� �ִ°� �����ϱ� Test01VO vo = new Test01VO();�̰� �� �ʿ䰡 ����.
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
		System.out.println("�˻��� ������ �Է�");
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
		// System.out.println("�Ѱ� �˻�����");
		//
		// } else {
		// System.out.println("�Ѱ� �˻�����");
		// }

	}

	private static void deleteUI(BufferedReader br, Test01DAO dao) throws IOException {
		System.out.println("3.delete page");
		Test01VO vo = new Test01VO();
		System.out.println("������ ������ �Է�");
		vo.setColumn1(Integer.parseInt(br.readLine()));
		// vo.setColumn1(3);

		int result = dao.delete(vo);
		System.out.println("result:" + result);
		if (result > 0) {
			System.out.println("��������");

		} else {
			System.out.println("��������");
		}

	}

	private static void updateUI(BufferedReader br, Test01DAO dao) throws IOException {
		System.out.println("2. update page");
		Test01VO vo = new Test01VO();
		System.out.println("col1 data�Է�");
		vo.setColumn1(Integer.parseInt(br.readLine()));
		System.out.println("col2 data�Է�");
		vo.setColumn2(br.readLine());
		System.out.println("col3 data�Է�");
		vo.setColumn3(br.readLine());
		System.out.println("col4 data�Է�");
		vo.setColumn4(br.readLine());
		System.out.println("col5 data�Է�");
		vo.setColumn5(br.readLine());

		int result = dao.update(vo);
		System.out.println("result:" + result);

	}

	public static void insertUI(BufferedReader br, Test01DAO dao) throws IOException {

		System.out.println("1. insert page");

		Test01VO vo = new Test01VO();
		System.out.println("col2 data�Է�");
		vo.setColumn2(br.readLine());
		System.out.println("col3 data�Է�");
		vo.setColumn3(br.readLine());
		System.out.println("col4 data�Է�");
		vo.setColumn4(br.readLine());
		System.out.println("col5 data�Է�");
		vo.setColumn5(br.readLine());

		int result = dao.insert(vo);
		System.out.println("result:" + result);

		if (result > 0) {
			System.out.println("��������");

		} else {
			System.out.println("��������");
		}

	}
}
