package test.com;

public class Test01Maint {

	public static void main(String[] args) {
		System.out.println("main....���");

		Test01Person p = new Test01Person();
		System.out.println(p.sid);
		System.out.println(p.name);
		System.out.println(p.fm);
		System.out.println(p.address);
		p.ppp();

		Test01Student st = new Test01Student();
		System.out.println(st.sid);
		System.out.println(st.name);
		System.out.println(st.fm);
		System.out.println(st.address);
		st.ppp();
		st.sss();
		// Student�� �Ű������� �Է����� �ʾҽ�. ������ person�� �Ű������� �Է��߰� ���*extends
		// Test01Person)�޾ұ⶧���� �̷��� ��밡��!!!

		// student�� ������ �Է��� ���¿���. middlestudent�� student�� ������ �����. �׷��� main����
		// middlestudent�� �ҷ��ͼ� ���!!
		Test01MiddleStudent mst = new Test01MiddleStudent();
		// Test01Student mst = new Test01MiddleStudent();//�̷��� �Ѵٸ� student�� Ÿ�Ը� �����
		// �����ϰԵǴ� java�� ��������.
		System.out.println(mst.sid);
		System.out.println(mst.name);
		System.out.println(mst.fm);
		System.out.println(mst.address);
		System.out.println(mst.kor);
		mst.ppp();
		mst.sss();

		Test01Person.ppp3();
		Test01Student.ppp3();
		Test01MiddleStudent.ppp3();

		
		
		//************�������� ����*********************
		// �����ε�
		// Ŭ���� ���ο��� �޼ҵ�� �������� �̸��� ������ �����ϰ����� ��
		// �Ű������� Ÿ��,����,������ �ٸ��� ����� ��

		// �������̵�
		// ����� ������ �Ǿ��� ��, ����Ŭ������
		// �޼ҵ带 ������ �ϴ� ��

		// �������� �̿��� ��ü ����
		// ����� ������ �Ǿ��� ��
		// ����Ŭ����Ÿ�� ��ü������ ����Ŭ���������ڷ� ��ü��������
		// �̶� ����Ŭ������ �ڿ�(�Ӽ�,�޼ҵ� ��)�� ��밡��

	}

}