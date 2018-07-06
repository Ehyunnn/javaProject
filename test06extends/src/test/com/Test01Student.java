package test.com;

public class Test01Student extends Test01Person {

	// String sid;// 주민번호
	// String name;// 이름
	// int fm;// 성별
	// String address;// 주소
	// 이렇게 써도되지만 변수가 한..30개 40개로 너무 많다면... 상속을 적용시켜보고 아니면 안해두되고..
	// 쓰진 않았지만 적은것처럼 사용이 가능.

	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;

	 
	
	public Test01Student() {
		// super();
		System.out.println("Test01Student()...........");
		num = 23;
		kor = 100;
		eng = 90;
		math = 80;
		
	}

	
	
	
	public Test01Student(int x) {
		this();
		num = x;
		System.out.println("Test01Student(int x)...........");
	}

	public Test01Student(int kor, int eng) {
		//this(8);
		this.kor = kor;
		this.eng = eng;
		System.out.println("Test01Student(int kor, int eng)...........");
	}

	// @선언:annotation
	// 상속이 전제, 리턴타입과 매개변수타입 동일하게 재정의
	@Override
	public void ppp() {
		System.out.println("Student.ppp()");
		super.ppp(); // 재귀호출 super<->this 자기자신의 클래스 내부에 있는것
	}
	// 이렇게되면 상속이지만, public void ppp(int x)이렇게 해버린다면 완전히 달라져서 새로 정의하게된 것임.

	public void sss() {
		super.ppp();

	}

}
