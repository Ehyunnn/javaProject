package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test07mission2 {

	public static void main(String[] args) throws IOException {
		System.out.println("mission 7");

		// ��ȣ ,�̸�, ��,��,���� �ý����Է�ó��.
		// �л����Ѽ��� ���� �������α׷�.
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String students="";
		 String x = "";
		 do {
				System.out.println("��ȣ");
				String num = br.readLine();
				//System.out.println(num);
				
				System.out.println("�̸�");
				String name = br.readLine();
				//System.out.println(name);
				
				System.out.println("����");
				String kor = br.readLine();
				//System.out.println(kor);
				
				System.out.println("����");
				String eng = br.readLine();
				//System.out.println(eng);
				
				System.out.println("����");
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
					grade="����";
					break;
				}
				
				//System.out.println(grade);
				students +=num+" "+name+" "+kor+" "+eng+" "+math+" "+avg+" "+total+" "+grade+"\n";
				
				
		 System.out.println("�����x");
		 x = br.readLine();
		
		 } while (!x.equals("x"));
		 
		 System.out.println(students);
		 
		 System.out.println("end main");


	

		// �ݸ� ���� �� �Ʒ�ó�� ���
		// 1 ȫ�浿 9 90 90 270 90.0 A
		// 1 ȫ�浿 9 90 90 240 80.0 B
		// 1 ȫ�浿 40 40 40 120 40.0 ����
		
	
	}
}
