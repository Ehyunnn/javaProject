package test.com;

public class Test04Mouse {

	int pNum;
	String color;
	String country;
	boolean isWheel;// ���콺 ���� �ִ��� ������
	byte isLen;// ������
	Test05Phone phone;

	
	//�����ε�overloading
	public Test04Mouse() {
		pNum = 1004;
		color = "gold";
		country = "china";
		isWheel = true;
		isLen = 1;// ����
	}

	public Test04Mouse(int pNum, String color, String country, boolean isWheel, int isLen) {
		this.pNum = pNum;
		this.color = color;
		this.country = country;
		this.isWheel = isWheel;
		this.isLen = (byte)isLen;

	}

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String x : args) {
			System.out.println(x);
		}

		Test04Mouse m = new Test04Mouse();// ��ü����
		System.out.println(m.pNum);
		System.out.println(m.color);
		System.out.println(m.country);
		System.out.println(m.isWheel);
		System.out.println(m.isLen);
		m.pNum = 33;
		m.color = "blue";
		m.country = "US";
		m.isWheel = false;
		m.isLen = 3;
		System.out.println(m.pNum);
		System.out.println(m.color);
		System.out.println(m.country);
		System.out.println(m.isWheel);
		System.out.println(m.isLen);

		// 1.������ ��ǰ��ȣ, �÷�, ������,������, ��������

		// �ѹ��� �����ؼ� ��ü�� �������� ������ ����ϼ���.
		Test04Mouse m2 = new Test04Mouse(99, "red", "kor", true,  1);
		System.out.println("������ ���콺 ����");
		System.out.println(m2.pNum + " " + m2.color + " " + m2.country + " " + m2.isWheel + " " + m2.isLen);

	}
	// 2. �޴�����ü�� ���� ���ο� Ŭ������ ����
	// �ƹ������� �� �ִ� ��ü���� �� ���
	


	


}


