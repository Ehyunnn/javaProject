package test.com;

public /*final*/ class Test01Person { //������� ���� ���� ���� ������.

	final String sid = "aaa";//final�� ���̸� ������! ���� �ٲ� �� ����
	//String sid;// �ֹι�ȣ
	String name;// �̸�
	int fm;// ����
	String address;// �ּ�

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