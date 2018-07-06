package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test11MemberMain {

	public static void main(String[] args) {
		System.out.println("회원가입");

		Test11MebmerDAO dao = new Test11MebmerDAOimpl();
		Test11MemberVO vo = new Test11MemberVO();

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String menu = "";
		do {
			try {
				System.out.println("1.insert, 2.update 3. delete \n"
						+ "4.selectOne	5.selectAll	 x. Exit");
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
					selectAllUI(dao);
				} else if (menu.compareTo("x") == 0) {
					System.out.println("종료하겠습니다.");
				} else
					System.out.println("잘못입력하셨습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (menu.compareTo("x") != 0);
	}


	private static void selectOneUI(BufferedReader br, Test11MebmerDAO dao) throws NumberFormatException, IOException {
		System.out.println("selectOne");
		System.out.println("검색할 data의 num을 입력해주세요.");
		Test11MemberVO vo = new Test11MemberVO();
		vo.setNum(Integer.parseInt(br.readLine()));
		Test11MemberVO vo2 = dao.selectOne(vo);
		if(vo2.getNum()>0) {
		System.out.print(vo2.getNum()+" ");
		System.out.print(vo2.getId()+" ");
		System.out.print(vo2.getPw()+" ");
		System.out.print(vo2.getName()+" ");
		System.out.println(vo2.getTel()+" \n\n");
		} else {
			System.out.println("데이터를 찾을 수 없습니다.\n\n");
		}
		
	}


	private static void selectAllUI(Test11MebmerDAO dao) {
		ArrayList<Test11MemberVO> vos = dao.selectAll();
		for (Test11MemberVO vo : vos) {
				
			System.out.print(vo.getNum()+" ");
			System.out.print(vo.getId()+" ");
			System.out.print(vo.getPw()+" ");
			System.out.print(vo.getName()+" ");
			System.out.println(vo.getTel()+" ");
		}
		System.out.println("\n\n");
	}
		

	

	private static void deleteUI(BufferedReader br, Test11MebmerDAO dao) throws IOException {
		System.out.println("delete......");

		Test11MemberVO vo = new Test11MemberVO();
		 System.out.println("삭제할 ID를 입력해주세요");
		 vo.setName(br.readLine());
		 
		 int result = dao.insert(vo);
		 System.out.println("result :" + result);
		
	}

	private static void updateUI(BufferedReader br, Test11MebmerDAO dao) {
		System.out.println("update.......");

		Test11MemberVO vo = new Test11MemberVO();
		 System.out.println("ID를 입력해주세요");
		 vo.setName(br.readLine());
		 System.out.println("패스워드를 입력해주세요");
		 vo.setId(br.readLine());
		 System.out.println("이름를 입력해주세요");
		 vo.setPw(br.readLine());
		 System.out.println("전화번호를 입력해주세요");
		 vo.setTel(br.readLine());
		
		 int result = dao.insert(vo);
		 System.out.println("result :" + result);
		
		 if (result == 1) {
		 System.out.println("insert성공");
		 } else
		 System.out.println("insert실패");
		int result = dao.update(vo);
		System.out.println("result :" + result);

	}

	private static void insertUI(BufferedReader br, Test11MebmerDAO dao) throws IOException {
		System.out.println("insert......");

		Test11MemberVO vo = new Test11MemberVO();

		System.out.println("ID를 입력해주세요");
		vo.setName(br.readLine());
		System.out.println("패스워드를 입력해주세요");
		vo.setId(br.readLine());
		System.out.println("이름를 입력해주세요");
		vo.setPw(br.readLine());
		System.out.println("전화번호를 입력해주세요");
		vo.setTel(br.readLine());

		int result = dao.insert(vo);
		System.out.println("result :" + result);

		if (result == 1) {
			System.out.println("insert성공");
		} else
			System.out.println("insert실패");

	}
}
