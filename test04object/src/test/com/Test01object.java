package test.com;

public class Test01object {

	//제원, 속성, 멤버필드, 멤버변수, 전역변수,인스턴스변수
	
	int su;//변수선언(속성)   //선언만 해도 기본값인 0 이 자동할당됨
	String name;//변수선언(속성),선언만 해도 기본값인 null 이 자동할당됨
	Test01object obj =new Test01object();   //new 주소생성연산자(배열에서 사용해봄);//기본값null
	int[] sus;//기본값null(안적어도 기본값이 들어감)
	
	
	public static void main(String[] args) {
	System.out.println("object");
	
	Test01object obj = new Test01object();
	System.out.println(obj);
	
	
	

	}

}
