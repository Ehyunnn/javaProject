package test.com;

public class Test01main {

	public static void main(String[] args) {
		System.out.println("Thread~~~Runnable");
		// ��Ƽ���μ����� ����? ������� ���� ���ؼ� ....

		System.out.println("run");

		// Thread������ 3���� ���

		// 1.Thread
		new Thread() { // thread��ü ����, {}�� �ٿ��ָ鼭 ��ӹ��� �̳� Ŭ���� ����.
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("run : " + i);
					try {
						Thread.sleep(1000); //1�ʰ� ��� �����ٰ� �ض� ~
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}.start();
		
		//�Ʒ��� ���� �츮�� �ϴ�����̰� ���� ������� ���� ����� ����غ���.
//		new Thread() { // thread��ü ����, {}�� �ٿ��ָ鼭 ��ӹ��� �̳� Ŭ���� ����.
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

		// 2.extends Thread :��������� thread�� ��ӹ��� ���̸� ���� ����
		Test01ThreadEx tex = new Test01ThreadEx();
		tex.start();

		// 3. implements Runnable
		new Thread(new Test01Runnableimpl()).start();
		System.out.println("end Thread~~~Runnable ");

	}

}
