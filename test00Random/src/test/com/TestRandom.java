package test.com;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		System.out.println("Random...Math....object");

		// ������ ������ �����ϰ� ���� ��:Random
		// Random r = new Random();
		// int su = r.nextInt(10) + 1;
		// System.out.println("Random su: " + su);
		//
		// // ������ ������ �����ϰ� ���� ��:Math
		// double d = Math.random() * 10;
		// System.out.println("Math d: " + (int) d);

		String[] names = new String[] { "�賲��", "������", "������", "������", "������", "�̵���", "�̼���", "���籤", "������", "����", "������",
				"������", "�Ѽ���", "������", "���¿�" };
		Random r = new Random();
		int su = r.nextInt(10);
		System.out.println("Random su: " + su);
		System.out.println("Random su: " + names[su]);
	}

}
