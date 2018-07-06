package test.com;

public class Test02ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Score main.......");

		Test02Score score = new Test02Score();
		System.out.println(score);

		// 1.
		score.setKor(99);
		System.out.println(score.kor);

		// 2.

		System.out.println(score.eng);
		int eng = score.getEng();
		System.out.println(eng);

		// 3.
		score.setMath3(88);
		System.out.println("score.math : " + score.math);

		// 4.
		score.setEng4(77);
		System.out.println("score.eng : " + score.eng);

		// 5.

		System.out.println("score.aaa5() : " + score.total());

	}

}
