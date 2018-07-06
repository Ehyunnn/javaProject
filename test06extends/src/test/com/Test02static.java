package test.com;

public class Test02static {

	public void aaa() {
		
	}
	
public static void bbb() {
		
	}
	
	public static void main(String[] args) {
		Test02static st =new Test02static();
		st.aaa();
		Test02static.bbb(); //static이 이미 클래스에 할당되어 있기 때문에 바로 불러오는 것이 가능함.
 
	}

}
