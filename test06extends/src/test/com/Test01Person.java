package test.com;

public /*final*/ class Test01Person { //상속하지 말고 나만 쓰고 끝내라.

	final String sid = "aaa";//final을 붙이면 최종값! 값을 바꿀 수 없음
	//String sid;// 주민번호
	String name;// 이름
	int fm;// 성별
	String address;// 주소

	public Test01Person() {
		System.out.println("Test01Persono()...........");
		//sid = "98989898";
		name = "kim";
		fm = 0;
		address = "seoul";
	}
	
	
	
	
	public /*final*/ void ppp() {
		System.out.println("Person.ppp()");
	}
	 
	 public void ppp2() {
			ppp();
		}
	 
	 public static void ppp3() {
		 
	 }

	public static void ppp4() {
		
		
	}
	 
	 
	 
	 
	 
}