package test02statement;

public class Test01ifelse {

	public static void main(String[] args) {
		System.out.println("if~else");
		// ���׿�����ó�� ���ǽĿ� ���Ͽ� ���๮�� �����ϰ� ������!!!!!
		// if �Է��� +ctrl+space +enter:�ڵ����� ���ǹ� ���� ����
		if (true) { // ���ǹ��� �ϳ��ϰ�쿡�� ��ȣ�� �ʿ����.
			System.out.println("true");
		}
		if (5 == 5) {
			System.out.println("5==5");

		}
		if (5 > 0) {
			System.out.println("5>0");
		}
		if (5 != 4 && 5 > 0) {
			System.out.println("5!=4 && 5>0");
		}

		if (!"lee".equals("kim")) {
			System.out.println("ok");
		}
		int su = 3;
		if (su > 3) {
			System.out.println(su + ">3");
		} else {
			System.out.println("NOOOOOOO!!!!");
		}

		int score = 91;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");

		} else {
			System.out.println("����");
		}

		// 5600,5700�� ���� ž�� ���α׷�(if �����)

		int num = 5620;
		if (num == 5600 || num == 5700) {
			System.out.println("ž��");
		} else {
			System.out.println("ž�¾���");
		}

		String busNum = "5600";
		if (busNum.equals("5600") || busNum.equals("5700")) {
			System.out.println("ž��");
		} else {
			System.out.println("ž�¾���");
		}

		String busNum1 = "5600";
		if (busNum1.equals("5600")) {
			System.out.println("ž��");
		} else if (busNum.equals("5700")) {
			System.out.println("ž��");
		} else {
			System.out.println("ž�¾���");
		}

	}

}
