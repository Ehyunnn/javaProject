package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Test05while {

	public static void main(String[] args) throws IOException {
		System.out.println("while......");
		//���ѷ����� �⺻���� �ؼ� , ~�ҷ�? ���ҷ�?�� ����� ��� ;;;(�ð�) 
		//�������� ������ for�̶�� �����ϸ� ���� .(����,�뷮...)
		
		InputStream is =System.in;
		InputStreamReader isr=new InputStreamReader(is); 
		BufferedReader br=new BufferedReader(isr);
		
		
		
		int i=0;
		
		while (i<10) {
			System.out.println("aaaa"+i);
			i++;
			if(i==6)break;
			
		}
		
		
		//x��� ���� ������ �׸��ϰڴ�.
		String x = "";
	while (!x.equals("x")) {
		System.out.println("����� x�Է�......");
		x=br.readLine();
		
	}
		
	System.out.println("end main....");
	
		}

}
