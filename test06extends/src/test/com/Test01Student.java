package test.com;

public class Test01Student extends Test01Person {

	// String sid;// �ֹι�ȣ
	// String name;// �̸�
	// int fm;// ����
	// String address;// �ּ�
	// �̷��� �ᵵ������ ������ ��..30�� 40���� �ʹ� ���ٸ�... ����� ������Ѻ��� �ƴϸ� ���صεǰ�..
	// ���� �ʾ����� ������ó�� ����� ����.

	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;

	 
	
	public Test01Student() {
		// super();
		System.out.println("Test01Student()...........");
		num = 23;
		kor = 100;
		eng = 90;
		math = 80;
		
	}

	
	
	
	public Test01Student(int x) {
		this();
		num = x;
		System.out.println("Test01Student(int x)...........");
	}

	public Test01Student(int kor, int eng) {
		//this(8);
		this.kor = kor;
		this.eng = eng;
		System.out.println("Test01Student(int kor, int eng)...........");
	}

	// @����:annotation
	// ����� ����, ����Ÿ�԰� �Ű�����Ÿ�� �����ϰ� ������
	@Override
	public void ppp() {
		System.out.println("Student.ppp()");
		super.ppp(); // ���ȣ�� super<->this �ڱ��ڽ��� Ŭ���� ���ο� �ִ°�
	}
	// �̷��ԵǸ� ���������, public void ppp(int x)�̷��� �ع����ٸ� ������ �޶����� ���� �����ϰԵ� ����.

	public void sss() {
		super.ppp();

	}

}
