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

		// ������ ���� �����Ͽ�
//		String modelName = "ss";
//		int price = 8000;
//		String color = "black";
		
		// ���Ӽ��� �����ϰ� ����ϼ���
		// 1. ��ü�����Ҷ�
		
//		Test05Phone p1 = new Test05Phone(modelName,price,color);
//		System.out.println(p1.name);
//		System.out.println(p1.price);
//		System.out.println(p1.color);
		
		
		Test05Phone phone1 = new Test05Phone();

		System.out.println(phone1.modelName);
		System.out.println(phone1.price);
		System.out.println(phone1.os);
		System.out.println();

		
	
		
		// 2. ��ü ���� �Ŀ�
		Test05Phone phone2 = new Test05Phone();

		phone2.modelName = "G2";
		phone2.price = 2000;
		phone2.os = "PINK";
		System.out.println(phone2.modelName);
		System.out.println(phone2.price);
		System.out.println(phone2.os);
		System.out.println();

		// 3.��ǰŬ������ �����
		// �������콺 ������ ������������ �Ӽ���������
		// ��ǰ��ü�� ������ �̸� ����
		// ���콺������ �������� ���

		Test05PhoneMouse pm = new Test05PhoneMouse();
		System.out.println("**���콺����");
		System.out.println(pm.phone.modelName);
		System.out.println(pm.phone.price);
		System.out.println(pm.phone.os);
		System.out.println();
		
		System.out.println("**������");
		System.out.println(pm.m.pNum);
		System.out.println(pm.m.color);
		System.out.println(pm.m.country);
		System.out.println(pm.m.isWheel);
		System.out.println(pm.m.isLen);

	}
}