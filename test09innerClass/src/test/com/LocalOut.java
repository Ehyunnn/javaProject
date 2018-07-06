package test.com;

public class LocalOut {
	public void test() {
		class Inner {//inner class는 test안에 소속되어있어서 절대 밖에서 부를 순 없음. !!!! 따로 콜 해줘야함
			public void aaa() {
				System.out.println("aaa().......");
			}

		}
		
		Inner in = new Inner();//같은 클래스이므로  밖에서 콜해줌!
		in.aaa();
	}

}
