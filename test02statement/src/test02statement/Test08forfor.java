package test02statement;

public class Test08forfor {

	public static void main(String[] args) {
		System.out.println("for  for");

		// 0~9
		// 0~9
		// 0~9

		for (int x = 0; x < 3; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
			if (x == 1)
				break;
		}
		System.out.println("========================");

		for (int x = 0; x < 3; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();

		}
		System.out.println("========================");

		for (int x = 0; x < 3; x++) {
			if (x % 2 == 0) {
				System.out.print(x + ":");
				for (int i = 0; i < 10; i++) {
					System.out.print(i);
				}
				System.out.println();

			}
		}
		System.out.println("========================");

		for (int x = 0; x < 3; x++) {
			if (x == 1)
				continue;// break는 나가고 끝남. continue는 제외하고 다시또 계속진행함.
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();

		}
		System.out.println("========================");

		for (int x = 0; x < 3; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					continue;
				System.out.print(i);

			}
			System.out.println();

		}
		System.out.println("========================");

		// 라벨(c에서는 goto문법) 이름을 정해줌 ! outfor:

		outfor: for (int x = 0; x < 3; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				// if(i==5)break outfor;
				if (i == 5)
					continue outfor;
				System.out.print(i);

			}
			System.out.println();

		}
		System.out.println("========================");

		int[] sus=new int[5];               // 0 0 0 0 0
		for (int i : sus) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
