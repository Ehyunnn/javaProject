package test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Date Fromat");
		System.out.println(new Date());//기존에 나오는 형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//원하는 형식으로 바꿈
		String fDate = sdf.format(new Date());
		System.out.println(fDate);
		
		
		
		
	}

}
