package test.com;

public class Test02main {
	public static void main(String[] args) {
		System.out.println("Thread MISSION");
		// Thread������ 3���� ���

		// 1.Thread
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 26; i++) {
					System.out.println((char) ('A' + i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}.start(); //�����带 �����°� .start();

		// 2.extends Thread
		Test02ThreadEx tx = new Test02ThreadEx();
		tx.start();

		// 3. implements Runnable
		new Thread(new Test02Runnableimpl()).start();

	}

}
