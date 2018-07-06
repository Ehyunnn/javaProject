package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test07mission2 {

	public static void main(String[] args) throws IOException {
		System.out.println("mission 7");

		// 번호 ,이름, 국,영,수는 시스템입력처리.
		// 학생제한수가 없는 성적프로그램.
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String students="";
		 String x = "";
		 do {
				System.out.println("번호");
				String num = br.readLine();
				//System.out.println(num);
				
				System.out.println("이름");
				String name = br.readLine();
				//System.out.println(name);
				
				System.out.println("국어");
				String kor = br.readLine();
				//System.out.println(kor);
				
				System.out.println("영어");
				String eng = br.readLine();
				//System.out.println(eng);
				
				System.out.println("수학");
				String math = br.readLine();
				//System.out.println(math);
				
				int total=Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
				//System.out.println(total);
				
				double avg=total/3.0;
				//System.out.println(avg);
				
				String grade = null;
				switch ((int)avg/10) {
				case 10:
				case 9:	
					grade="A";
					break;
				case 8:	
					grade="B";
					break;
				case 7:	
					grade="C";
					break;
				default:
					grade="과락";
					break;
				}
				
				//System.out.println(grade);
				students +=num+" "+name+" "+kor+" "+eng+" "+math+" "+avg+" "+total+" "+grade+"\n";
				
				
		 System.out.println("종료시x");
		 x = br.readLine();
		
		 } while (!x.equals("x"));
		 
		 System.out.println(students);
		 
		 System.out.println("end main");


	

		// 반목문 종료 후 아래처럼 출력
		// 1 홍길동 9 90 90 270 90.0 A
		// 1 홍길동 9 90 90 240 80.0 B
		// 1 홍길동 40 40 40 120 40.0 과락
		
	
	}
}
