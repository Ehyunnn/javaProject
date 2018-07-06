package test.com;

public class Test04Mouse {

	int pNum;
	String color;
	String country;
	boolean isWheel;// 마우스 휠이 있는지 없는지
	byte isLen;// 유무선
	Test05Phone phone;

	
	//오버로딩overloading
	public Test04Mouse() {
		pNum = 1004;
		color = "gold";
		country = "china";
		isWheel = true;
		isLen = 1;// 있음
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

		Test04Mouse m = new Test04Mouse();// 객체생성
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

		// 1.임의의 제품번호, 컬러, 제조국,휘유무, 선유무를

		// 한번에 제공해서 객체를 생성한후 정보를 출력하세요.
		Test04Mouse m2 = new Test04Mouse(99, "red", "kor", true,  1);
		System.out.println("임의의 마우스 정보");
		System.out.println(m2.pNum + " " + m2.color + " " + m2.country + " " + m2.isWheel + " " + m2.isLen);

	}
	// 2. 휴대폰객체를 위한 새로운 클래스를 만들어서
	// 아무정보도 안 주는 객체생성 후 출력
	


	


}


