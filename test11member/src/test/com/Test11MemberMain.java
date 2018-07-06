package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test11MemberMain {

	public static void main(String[] args) {
		System.out.println("ȸ������");

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
					System.out.println("�����ϰڽ��ϴ�.");
				} else
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (menu.compareTo("x") != 0);
	}


	private static void selectOneUI(BufferedReader br, Test11MebmerDAO dao) throws NumberFormatException, IOException {
		System.out.println("selectOne");
		System.out.println("�˻��� data�� num�� �Է����ּ���.");
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
			System.out.println("�����͸� ã�� �� �����ϴ�.\n\n");
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
		 System.out.println("������ ID�� �Է����ּ���");
		 vo.setName(br.readLine());
		 
		 int result = dao.insert(vo);
		 System.out.println("result :" + result);
		
	}

	private static void updateUI(BufferedReader br, Test11MebmerDAO dao) {
		System.out.println("update.......");

		Test11MemberVO vo = new Test11MemberVO();
		 System.out.println("ID�� �Է����ּ���");
		 vo.setName(br.readLine());
		 System.out.println("�н����带 �Է����ּ���");
		 vo.setId(br.readLine());
		 System.out.println("�̸��� �Է����ּ���");
		 vo.setPw(br.readLine());
		 System.out.println("��ȭ��ȣ�� �Է����ּ���");
		 vo.setTel(br.readLine());
		
		 int result = dao.insert(vo);
		 System.out.println("result :" + result);
		
		 if (result == 1) {
		 System.out.println("insert����");
		 } else
		 System.out.println("insert����");
		int result = dao.update(vo);
		System.out.println("result :" + result);

	}

	private static void insertUI(BufferedReader br, Test11MebmerDAO dao) throws IOException {
		System.out.println("insert......");

		Test11MemberVO vo = new Test11MemberVO();

		System.out.println("ID�� �Է����ּ���");
		vo.setName(br.readLine());
		System.out.println("�н����带 �Է����ּ���");
		vo.setId(br.readLine());
		System.out.println("�̸��� �Է����ּ���");
		vo.setPw(br.readLine());
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		vo.setTel(br.readLine());

		int result = dao.insert(vo);
		System.out.println("result :" + result);

		if (result == 1) {
			System.out.println("insert����");
		} else
			System.out.println("insert����");

	}
}
