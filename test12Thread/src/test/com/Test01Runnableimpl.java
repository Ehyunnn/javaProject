package test.com;

public class Test01Runnableimpl extends Test01 implements Runnable {

	@Override
	public void run() {
		for (int i = 100; i < 110; i++) {
			System.out.println("run" + i);
			try {
				Thread.sleep(1000); // 1초간 잠깐 쉬엇다가 해라 ~
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
