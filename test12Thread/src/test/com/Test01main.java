package test.com;

public class Test01main {

	public static void main(String[] args) {
		System.out.println("Thread~~~Runnable");
		// 멀티프로세싱의 이유? 사용자의 편리를 위해서 ....

		System.out.println("run");

		// Thread돌리는 3가지 방법

		// 1.Thread
		new Thread() { // thread객체 생성, {}를 붙여주면서 상속받은 이너 클래스 만듬.
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("run : " + i);
					try {
						Thread.sleep(1000); //1초간 잠깐 쉬엇다가 해라 ~
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}.start();
		
		//아래는 원래 우리가 하던방법이고 이제 배웠으니 위의 방법을 사용해보자.
//		new Thread() { // thread객체 생성, {}를 붙여주면서 상속받은 이너 클래스 만듬.
//			
//			Thread t = new Thread() {
//				@Override
//			
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("run : " + i);
//				}
//			}
//		};
//		t.start();

		// 2.extends Thread :명시적으로 thread를 상속받은 아이를 통해 돌림
		Test01ThreadEx tex = new Test01ThreadEx();
		tex.start();

		// 3. implements Runnable
		new Thread(new Test01Runnableimpl()).start();
		System.out.println("end Thread~~~Runnable ");

	}

}
