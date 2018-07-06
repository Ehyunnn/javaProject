package test.com;

public class Test05Phone {
	String modelName;
	int price;
	String os;

	public Test05Phone() {
		modelName = "G1";
		price = 100000;
		os = "WHITE";

	}
	
	public Test05Phone(String modelName2, int price2, String color2) {
		modelName = modelName2;
		price = price2;
		os = color2;

	}



	public static void main(String[] args) {
		Test05Phone phone = new Test05Phone();
		// System.out.println(phone.color);

		// 임의의 값을 설정하여
//		String modelName = "ss";
//		int price = 8000;
//		String color = "black";
		
		// 폰속성을 변경하고 출력하세요
		// 1. 객체생성할때
		
//		Test05Phone p1 = new Test05Phone(modelName,price,color);
//		System.out.println(p1.name);
//		System.out.println(p1.price);
//		System.out.println(p1.color);
		
		
		Test05Phone phone1 = new Test05Phone();

		System.out.println(phone1.modelName);
		System.out.println(phone1.price);
		System.out.println(phone1.os);
		System.out.println();

		
	
		
		// 2. 객체 생성 후에
		Test05Phone phone2 = new Test05Phone();

		phone2.modelName = "G2";
		phone2.price = 2000;
		phone2.os = "PINK";
		System.out.println(phone2.modelName);
		System.out.println(phone2.price);
		System.out.println(phone2.os);
		System.out.println();

		// 3.제품클래스를 만들고
		// 기존마우스 정보와 기존폰정보를 속성으로지정
		// 제품객체를 생성후 이를 통해
		// 마우스정보와 폰정보를 출력

		Test05PhoneMouse pm = new Test05PhoneMouse();
		System.out.println("**마우스정보");
		System.out.println(pm.phone.modelName);
		System.out.println(pm.phone.price);
		System.out.println(pm.phone.os);
		System.out.println();
		
		System.out.println("**폰정보");
		System.out.println(pm.m.pNum);
		System.out.println(pm.m.color);
		System.out.println(pm.m.country);
		System.out.println(pm.m.isWheel);
		System.out.println(pm.m.isLen);

	}
}