package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test06IO {

	public static void main(String[] args) throws IOException {
	System.out.println("input   output");
	
	InputStream is =System.in;//system에서 input을 썼으니 가system.in //주소가 정해지지 않은 상태에서는 .구문은 오류가 발생함!! ""이건 문자열이 아니라서 불가능!
	InputStreamReader isr=new InputStreamReader(is); //입력되는 타입이 같아야함.
	BufferedReader br=new BufferedReader(isr);
	String name = br.readLine();
	System.out.println(name);

	
	String kor=br.readLine();
	System.out.println(kor+88);//kor이 문자인상태 따라서 출력값은 9988
	System.out.println(Integer.parseInt(kor)+88);//kor이 파쓰로인해 인트로 바뀜 따라서 출력값은 187
	
	System.out.println("input korea ");
	System.out.println(kor+88);//kor이 문자인상태 따라서 출력값은 9988
	System.out.println(Integer.parseInt(kor)+88);
	
	
	
		}

}
