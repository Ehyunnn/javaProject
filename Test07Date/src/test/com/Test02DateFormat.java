package test.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Date Fromat");
		System.out.println(new Date());//������ ������ ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//���ϴ� �������� �ٲ�
		String fDate = sdf.format(new Date());
		System.out.println(fDate);
		
		
		
		
	}

}
