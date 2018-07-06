package test02statement;

public class Test01ifelse {

	public static void main(String[] args) {
		System.out.println("if~else");
		// 삼항연산자처럼 조건식에 의하여 실행문을 선택하고 싶을때!!!!!
		// if 입력후 +ctrl+space +enter:자동으로 조건문 형식 생성
		if (true) { // 조건문이 하나일경우에는 괄호가 필요없음.
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
			System.out.println("과락");
		}

		// 5600,5700번 버스 탑승 프로그램(if 문사용)

		int num = 5620;
		if (num == 5600 || num == 5700) {
			System.out.println("탑승");
		} else {
			System.out.println("탑승안함");
		}

		String busNum = "5600";
		if (busNum.equals("5600") || busNum.equals("5700")) {
			System.out.println("탑승");
		} else {
			System.out.println("탑승안함");
		}

		String busNum1 = "5600";
		if (busNum1.equals("5600")) {
			System.out.println("탑승");
		} else if (busNum.equals("5700")) {
			System.out.println("탑승");
		} else {
			System.out.println("탑승안함");
		}

	}

}
