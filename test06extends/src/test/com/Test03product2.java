package test.com;

public interface Test03product2 {
	// 인터페이스 안의 전역변수는 모두 초기화 되어야한다.

	/* static final */ String P_NAME = "HP001"; // static final인경우 new불가능. 대문자권장
	// 생성자 선언 불가능.
	// 다형성을 이용하여 객체 생성 가능

//	public default void test() {
//
//	}
//
//	public static void test2() {
//
//	}
//	
	public /*abstract*/ void test3();//선언만 되어진 메소드, 추상메소드
	//바디(즉,실행문)이 없다. 생략가능!
	
	public int insert(String[] names);

}
