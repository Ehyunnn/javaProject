package test02statement;

public class Test03for {

	public static void main(String[] args) {
	System.out.println("for");
	//for:����, ī��Ʈ, �뷮 ��� ���õ� �ݺ�
	
	for (int i = 0; i < 5; i++) {
		System.out.println("aaa"+i);//���ڿ� ���ڸ� ���ϸ� ���ڰ� �Ǿ���� string�� int�������� string�̵�
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
		System.out.println((int)i);//���ڷ� �ᵵ ������, ���ڷε� ī������ ������. a~z�� 26���� A~Z�� 26���� 
	}
	
	
	
	
	
	
	
	
	}

}
