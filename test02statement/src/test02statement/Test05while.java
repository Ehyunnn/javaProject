package test02statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Test05while {

	public static void main(String[] args) throws IOException {
		System.out.println("while......");
		//무한루프를 기본으로 해서 , ~할래? 안할래?를 물어보는 경우 ;;;(시간) 
		//한정적인 조건은 for이라고 생각하면 좋음 .(길이,용량...)
		
		InputStream is =System.in;
		InputStreamReader isr=new InputStreamReader(is); 
		BufferedReader br=new BufferedReader(isr);
		
		
		
		int i=0;
		
		while (i<10) {
			System.out.println("aaaa"+i);
			i++;
			if(i==6)break;
			
		}
		
		
		//x라는 값이 들어오면 그만하겠다.
		String x = "";
	while (!x.equals("x")) {
		System.out.println("종료시 x입력......");
		x=br.readLine();
		
	}
		
	System.out.println("end main....");
	
		}

}
