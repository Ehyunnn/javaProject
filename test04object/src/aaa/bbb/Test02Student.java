package aaa.bbb;

public class Test02Student {

	int num;// ��ȣ
	String name;// �̸�
	int kor;// ��������
	int eng;// ��������
	int math;// ��������
	int total;// ��
	double avg;// ���
	String grade;// ���

	// Ŭ���� �ȿ� ������ �����ڴ� ���� �� ����.
	// ��, �Ű�����(�Ұ�ȣ �ȿ� ����� ����,����)�� ����, ����, Ÿ�������� �ٸ��� ������.

	// �Ű������� ���� ���� >>>>�⺻�����ڶ����.
	// �⺻ �����ڰ� ���๮�� ������ >>��������!
	public Test02Student() {
		System.out.println("Test02Student()..........");
		// System.out.println(num);
		num = 3;// �Ӽ����� �ٲٰ������,.;;
		// System.out.println(num);

	}

	public Test02Student(int x) {
		// constructor ������
	}

	public Test02Student(int x, int y) { // ������ �ٸ�
		kor = x;
		eng = y;
	}

	public Test02Student(String name, int kor) { // Ÿ���̴ٸ�
		// constructor ������
	}

	public Test02Student(int aaa , String bbb) { // Ÿ���̴ٸ�
		// constructor ������
	}
	
	public Test02Student(String x) {
		// constructor ������
		name = x;
	}

	public static void main(String[] args) {
		System.out.println("student.......info");

		// className objectName = new������ ������();
		Test02Student st = new Test02Student("kim", 88);
		System.out.println(st);// �ּ�
		System.out.println(st.num);
		st.num = 8;
		System.out.println(st.num);

		Test02Student st2 = new Test02Student(99, 88);
		System.out.println(st2.kor);
		System.out.println(st2.eng);
		System.out.println((st2.eng+st2.kor)/2);


	}

}
