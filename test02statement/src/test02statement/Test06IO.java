package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test06IO {

	public static void main(String[] args) throws IOException {
	System.out.println("input   output");
	
	InputStream is =System.in;//system���� input�� ������ ��system.in //�ּҰ� �������� ���� ���¿����� .������ ������ �߻���!! ""�̰� ���ڿ��� �ƴ϶� �Ұ���!
	InputStreamReader isr=new InputStreamReader(is); //�ԷµǴ� Ÿ���� ���ƾ���.
	BufferedReader br=new BufferedReader(isr);
	String name = br.readLine();
	System.out.println(name);

	
	String kor=br.readLine();
	System.out.println(kor+88);//kor�� �����λ��� ���� ��°��� 9988
	System.out.println(Integer.parseInt(kor)+88);//kor�� �ľ������� ��Ʈ�� �ٲ� ���� ��°��� 187
	
	System.out.println("input korea ");
	System.out.println(kor+88);//kor�� �����λ��� ���� ��°��� 9988
	System.out.println(Integer.parseInt(kor)+88);
	
	
	
		}

}
