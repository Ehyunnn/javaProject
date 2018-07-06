package test.com;

public class Test02Score {
	int kor;
	int eng;
	int math;
	// set과 get이라는 이름을 정할때 생각해보고 정하도록
	// set은 정하는값
	// get은 얻어오는 값

	// 1. aaa1: 국어성적을 받아서 멤버변수 국어에 저장하는 메소드
	// public void aaa1(int x) {
	// int kor = x;
	// System.out.println("국어성적 : " + kor);
	// }

	public void setKor(int kor) {
		this.kor = kor;
	}

	// 2. aaa2: 멤버변수의 저장된 영어점수를 반환하는 메소드 //return
	// public int aaa2() {
	//
	// return 80;
	// }
	public int getEng() {
		return eng;
	}

	// 3. aaa3: 수학성적을 받아서 멤버변수 수학에 저장하는 메소드
	// public void aaa3(int x) {
	// int math = x;
	// System.out.println("수학성적 : " + math);
	// }

	public void setMath3(int math) {
		this.math = math;
	}

	// 4. aaa4: 영어성적을 받아서 멤버변수 영어에 저장하는 메소드

	// public void aaa4(int x) {
	// int eng = x;
	// System.out.println("영어성적 : " + eng);
	// }

	public void setEng4(int eng) {
		this.eng = eng;
	}

	// 5. aaa5: 멤버변수 국어, 영어, 수학 점수를 합계한 결과를 반환하는 메소드
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
	// System.out.println("영어성적 : " + a2);
	// sc.aaa3(70);
	// sc.aaa4(50);
	// int sum = sc.aaa5(90, 70, 50);
	// System.out.println("총점 : " + sum);
	//
	// }

}
