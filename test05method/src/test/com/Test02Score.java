package test.com;

public class Test02Score {
	int kor;
	int eng;
	int math;
	// set�� get�̶�� �̸��� ���Ҷ� �����غ��� ���ϵ���
	// set�� ���ϴ°�
	// get�� ������ ��

	// 1. aaa1: ������� �޾Ƽ� ������� ��� �����ϴ� �޼ҵ�
	// public void aaa1(int x) {
	// int kor = x;
	// System.out.println("����� : " + kor);
	// }

	public void setKor(int kor) {
		this.kor = kor;
	}

	// 2. aaa2: ��������� ����� ���������� ��ȯ�ϴ� �޼ҵ� //return
	// public int aaa2() {
	//
	// return 80;
	// }
	public int getEng() {
		return eng;
	}

	// 3. aaa3: ���м����� �޾Ƽ� ������� ���п� �����ϴ� �޼ҵ�
	// public void aaa3(int x) {
	// int math = x;
	// System.out.println("���м��� : " + math);
	// }

	public void setMath3(int math) {
		this.math = math;
	}

	// 4. aaa4: ������� �޾Ƽ� ������� ��� �����ϴ� �޼ҵ�

	// public void aaa4(int x) {
	// int eng = x;
	// System.out.println("����� : " + eng);
	// }

	public void setEng4(int eng) {
		this.eng = eng;
	}

	// 5. aaa5: ������� ����, ����, ���� ������ �հ��� ����� ��ȯ�ϴ� �޼ҵ�
	// public int aaa5(int kor1, int eng1, int math1) {
	// int sum = kor1 + eng1 + math1;
	// return sum;
	// }

	public int total() {
		return kor + eng + math;
	}
	//
	// public static void main(String[] args) {
	// Test02Score sc = new Test02Score();
	// sc.aaa1(90);
	// int a2 = sc.aaa2();
	// System.out.println("����� : " + a2);
	// sc.aaa3(70);
	// sc.aaa4(50);
	// int sum = sc.aaa5(90, 70, 50);
	// System.out.println("���� : " + sum);
	//
	// }

}
