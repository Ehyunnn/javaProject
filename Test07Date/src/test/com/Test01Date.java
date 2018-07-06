package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import java.util.Date;

public class Test01Date {

//	public static java.util.Date getDate() {
//		return new java.util.Date();
//
//	}

	public static void main(String[] args) {
		System.out.println("Date");
		// System.out.println(new java.util.Date());
		// System.out.println(new java.sql.Date(2));
		// //new Date라고 쓰는 경우엔 위에 주석처럼 import를 넣어줘야하고.
		// //만약 import를 넣지않는다면 java.util.Date로 사용

		long startTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		// System.out.println(new java.util.Date());
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		System.out.println(System.currentTimeMillis() - startTime);

		Timestamp ts =new Timestamp(System.currentTimeMillis());
		System.out.println(ts.getTime());
		
		Calendar cal = Calendar.getInstance();//시간획득
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //월은 0 부터 시작하기때문
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //일:1 월:2 화:3
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		GregorianCalendar gcal = new GregorianCalendar(2018, 12, 25, 10, 15, 40);//시간획득 및 세팅
				System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); 
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); 
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		
		
		
		
		System.out.println("====================");
		System.out.println(System.currentTimeMillis() - startTime); //총걸린시간
		
		
		
	}

}
