package test.com;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		System.out.println("Random...Math....object");

		// 임의의 정수를 추출하고 싶을 때:Random
		// Random r = new Random();
		// int su = r.nextInt(10) + 1;
		// System.out.println("Random su: " + su);
		//
		// // 임의의 난수를 추출하고 싶을 때:Math
		// double d = Math.random() * 10;
		// System.out.println("Math d: " + (int) d);

		String[] names = new String[] { "김남은", "김윤성", "박이현", "신현명", "윤상훈", "이동준", "이세희", "장재광", "정은아", "조상묵", "진형기",
				"최준형", "한수진", "곽찬양", "최태용" };
		Random r = new Random();
		int su = r.nextInt(10);
		System.out.println("Random su: " + su);
		System.out.println("Random su: " + names[su]);
	}

}
