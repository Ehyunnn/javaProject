package test02statement;

public class Test03for {

	public static void main(String[] args) {
	System.out.println("for");
	//for:길이, 카운트, 용량 등과 관련된 반복
	
	for (int i = 0; i < 5; i++) {
		System.out.println("aaa"+i);//문자와 숫자를 더하면 문자가 되어버림 string과 int가만나면 string이됨
	}
	
	
	for (int i = 10; i > 0; i--) {
		System.out.println("bbb"+i);
	}
	
	for (int i = 0; i < 10; i++) {
		if(i%2!=0)System.out.println("ccc"+i);
	}
	
	for(int i=0; i<10; i+=2) {
		System.out.println("ddd"+i);
	}
	
	for (char i = 'A'; i <='z'; i++) {
		System.out.println("eee"+i);
		System.out.println((int)i);//숫자로 써도 되지만, 문자로도 카운팅이 가능함. a~z은 26까지 A~Z는 26까지 
	}
	
	
	
	
	
	
	
	
	}

}
