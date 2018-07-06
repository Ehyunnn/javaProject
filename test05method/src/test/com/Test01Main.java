package test.com;

public class Test01Main {

	// 2. 전역변수, 멤버필드, 인스턴스변수, 멤버변수
	int num;
	String name;

	// 3.생성자(Constructor)
	public Test01Main() {

		System.out.println("Test01Main().......");
	}

	public Test01Main(int a) {

		System.out.println(a);
	}
	
	public Test01Main(String b) {

		System.out.println(b);
	}
	
	// public을 안붙이는 경우 조금 더 제한.
	public Test01Main(int num, String name) {

	}

	// 4.함수(method)
	//[접근제한자][정의제한자 ] type 함수명(){}
	//가.매개변수 무, return 무(void)
	public void aaa1() {
		
		System.out.println("aaa1()");	
		//return;
	}
	

	//나.매개변수 유, return 무 (void)
 public void aaa2(int x) {
		int sum = x + 10;
		System.out.println("aaa2()"+sum);	
		//return;
	}
	
	
	//다.매개변수 무, return 유 (반환값에 대한 해당타입)
	
 public int aaa3() {
		
		System.out.println("aaa3()");	
		return 999;
	}
 
	
	//라. 매개변수 유, return 유 (반환값에 대한  해당타입)
	
 public String aaa4(String x) {
		
		System.out.println("aaa4()"+x);	
		return "kim"+x;
	}
	
	// 5. inner class(내부클래스, 중첩클래스)
	public static void main(String[] args) {
		System.out.println("method 함수 펑션(function),오퍼레이터");

		// 1. 변수 선언 및 초기화 : 지역변수, 로컬변수

		Test01Main tm = new Test01Main();
		tm.aaa1();
		tm.aaa2(30);
		int a3 = tm.aaa3();
		System.out.println(a3);
		String a4=tm.aaa4("good!!!!");
		System.out.println(a4);
		
	

		
	}

}
