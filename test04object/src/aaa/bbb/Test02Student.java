package aaa.bbb;

public class Test02Student {

	int num;// 번호
	String name;// 이름
	int kor;// 국어점수
	int eng;// 영어점수
	int math;// 수학점수
	int total;// 총
	double avg;// 평균
	String grade;// 등급

	// 클래스 안에 동일한 생성자는 만들 수 없다.
	// 단, 매개변수(소괄호 안에 선언된 변수,인자)의 개수, 순서, 타입종류가 다르면 가능함.

	// 매개변수가 없는 것을 >>>>기본생성자라고함.
	// 기본 생성자가 실행문이 없을때 >>생략가능!
	public Test02Student() {
		System.out.println("Test02Student()..........");
		// System.out.println(num);
		num = 3;// 속성값을 바꾸고싶을때,.;;
		// System.out.println(num);

	}

	public Test02Student(int x) {
		// constructor 생성자
	}

	public Test02Student(int x, int y) { // 갯수가 다름
		kor = x;
		eng = y;
	}

	public Test02Student(String name, int kor) { // 타입이다름
		// constructor 생성자
	}

	public Test02Student(int aaa , String bbb) { // 타입이다름
		// constructor 생성자
	}
	
	public Test02Student(String x) {
		// constructor 생성자
		name = x;
	}

	public static void main(String[] args) {
		System.out.println("student.......info");

		// className objectName = new연산자 생성자();
		Test02Student st = new Test02Student("kim", 88);
		System.out.println(st);// 주소
		System.out.println(st.num);
		st.num = 8;
		System.out.println(st.num);

		Test02Student st2 = new Test02Student(99, 88);
		System.out.println(st2.kor);
		System.out.println(st2.eng);
		System.out.println((st2.eng+st2.kor)/2);


	}

}
