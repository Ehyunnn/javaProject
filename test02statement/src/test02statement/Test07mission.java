package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test07mission {

	public static void main(String[] args) throws IOException {
		System.out.println("mission 7");

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("�л����� ���α׷�!");

		// ��ȣ ,�̸�, ��,��,���� �ý����Է�ó��.
		// �л����Ѽ��� ���� �������α׷�.
		// ����� x�� �׸��ϵ��� �ڵ�.

		String num = "";
		String name = "";
		String kor = "";
		String eng = "";
		String math = "";
		String x = "x";

		do {

			System.out.println("��ȣ �Է�");
			num = br.readLine();
			System.out.println("�̸� �Է�");
			name = br.readLine();
			System.out.println("���� �Է�");
			kor = br.readLine();
			System.out.println("���� �Է�");
			eng = br.readLine();
			System.out.println("���� �Է�");
			math = br.readLine();

			int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
			double avg = total / 3.0;
			String grade = null;

			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			default:
				grade = "����";
				break;
			}
				System.out.println(num + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " "
						+ grade + " ");
				x = br.readLine();
			
		}

		while (!x.equals("x"));
		System.out.println("end main....");

	}
}
