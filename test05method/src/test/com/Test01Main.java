package test.com;

public class Test01Main {

	// 2. ��������, ����ʵ�, �ν��Ͻ�����, �������
	int num;
	String name;

	// 3.������(Constructor)
	public Test01Main() {

		System.out.println("Test01Main().......");
	}

	public Test01Main(int a) {

		System.out.println(a);
	}
	
	public Test01Main(String b) {

		System.out.println(b);
	}
	
	// public�� �Ⱥ��̴� ��� ���� �� ����.
	public Test01Main(int num, String name) {

	}

	// 4.�Լ�(method)
	//[����������][���������� ] type �Լ���(){}
	//��.�Ű����� ��, return ��(void)
	public void aaa1() {
		
		System.out.println("aaa1()");	
		//return;
	}
	

	//��.�Ű����� ��, return �� (void)
 public void aaa2(int x) {
		int sum = x + 10;
		System.out.println("aaa2()"+sum);	
		//return;
	}
	
	
	//��.�Ű����� ��, return �� (��ȯ���� ���� �ش�Ÿ��)
	
 public int aaa3() {
		
		System.out.println("aaa3()");	
		return 999;
	}
 
	
	//��. �Ű����� ��, return �� (��ȯ���� ����  �ش�Ÿ��)
	
 public String aaa4(String x) {
		
		System.out.println("aaa4()"+x);	
		return "kim"+x;
	}
	
	// 5. inner class(����Ŭ����, ��øŬ����)
	public static void main(String[] args) {
		System.out.println("method �Լ� ���(function),���۷�����");

		// 1. ���� ���� �� �ʱ�ȭ : ��������, ���ú���

		Test01Main tm = new Test01Main();
		tm.aaa1();
		tm.aaa2(30);
		int a3 = tm.aaa3();
		System.out.println(a3);
		String a4=tm.aaa4("good!!!!");
		System.out.println(a4);
		
	

		
	}

}
