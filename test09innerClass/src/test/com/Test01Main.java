package test.com;

import test.com.MemberOut.Inner;

public class Test01Main {

	public void aaa() { // �Ϲ� �޼���

	}

	public static void main(String[] args) {
		System.out.println("inner Class");

		// 1. member inner //���� ��Ű�� �ȿ� ������ ����Ʈ�� �ؼ� ����ؾ��Ѵ�.
		Inner in = new MemberOut().new Inner(); // inner����ϴ� ��� ��Ȯ�� �˰� �Ѿ��.
		in.test();

		// 2. static inner //�� static�̴ϱ� Ŭ���� �̸����� ������.
		System.out.println(test.com.StaticOut.Inner.name);
		test.com.StaticOut.Inner.kkk();
		test.com.StaticOut.Inner sin = new StaticOut.Inner();
		// Inner in = new MemberOut().new Inner(); �� �ٰ� ���ٰ� ���غ��� ���̸� �˾ƺ���
		System.out.println(sin.id);

		// 3. local inner
		
		LocalOut lout = new LocalOut();
		lout.test(); //test�� call�Ǿ����� localOut���� inner�� �����ǰ� ���ư��Ե�
		
		

		// 4. anonymous inner
		// Test01Main tm = new Test01Main(); //�̰� �׳� ��ü���� �� ��
		// Test01Main tm = new Test01Main() {//�̳� Ŭ������ ����
		// @Override
		// public void aaa() { //�������̵� ����!!! �� ? ��Ӱ��谡 �Ǿ� ������ �Ҽ��ֱ� ������ , ������ �������Ϸ���
		// static
		// super.aaa();
		// }
		// };

		// �ۿ� ������ tm.aaa�� �ϸ� �ٷ� ���̵�. ������ �ؿ��� test�ȿ���

		Test01AAA ta = new Test01AAA();
		ta.test(new Test01Main() { // inner
			@Override
			public void aaa() {
				System.out.println("aaa().............");
			}
		});
		
	
	}

}
