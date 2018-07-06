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

		System.out.println("학생성적 프로그램!");

		// 번호 ,이름, 국,영,수는 시스템입력처리.
		// 학생제한수가 없는 성적프로그램.
		// 종료시 x로 그만하도록 코딩.

		String num = "";
		String name = "";
		String kor = "";
		String eng = "";
		String math = "";
		String x = "x";

		do {

			System.out.println("번호 입력");
			num = br.readLine();
			System.out.println("이름 입력");
			name = br.readLine();
			System.out.println("국어 입력");
			kor = br.readLine();
			System.out.println("영어 입력");
			eng = br.readLine();
			System.out.println("수학 입력");
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
				grade = "과락";
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
