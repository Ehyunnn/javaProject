package test.com;

public class LocalOut {
	public void test() {
		class Inner {//inner class�� test�ȿ� �ҼӵǾ��־ ���� �ۿ��� �θ� �� ����. !!!! ���� �� �������
			public void aaa() {
				System.out.println("aaa().......");
			}

		}
		
		Inner in = new Inner();//���� Ŭ�����̹Ƿ�  �ۿ��� ������!
		in.aaa();
	}

}
