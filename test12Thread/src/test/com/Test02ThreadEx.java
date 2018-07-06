package test.com;

public class Test02ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 30; i < 39; i++) {
			System.out.println("run" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}

