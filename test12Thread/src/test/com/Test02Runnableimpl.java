package test.com;

import java.util.Date;

public class Test02Runnableimpl extends Test02 implements Runnable {

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(new Date());
			try {
				Thread.sleep(1000); // 1초간 잠깐 쉬엇다가 해라 ~
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
