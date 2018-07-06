package test.com;

import test.com.MemberOut.Inner;

public class Test01Main {

	public void aaa() { // 일반 메서드

	}

	public static void main(String[] args) {
		System.out.println("inner Class");

		// 1. member inner //같은 패키지 안에 있지만 임포트를 해서 사용해야한다.
		Inner in = new MemberOut().new Inner(); // inner사용하는 방법 정확히 알고 넘어가기.
		in.test();

		// 2. static inner //다 static이니까 클래스 이름으로 접근함.
		System.out.println(test.com.StaticOut.Inner.name);
		test.com.StaticOut.Inner.kkk();
		test.com.StaticOut.Inner sin = new StaticOut.Inner();
		// Inner in = new MemberOut().new Inner(); 이 줄과 윗줄과 비교해보고 차이를 알아봐바
		System.out.println(sin.id);

		// 3. local inner
		
		LocalOut lout = new LocalOut();
		lout.test(); //test가 call되어지면 localOut에서 inner가 생성되고 돌아가게됨
		
		

		// 4. anonymous inner
		// Test01Main tm = new Test01Main(); //이건 그냥 객체생성 한 것
		// Test01Main tm = new Test01Main() {//이너 클래스로 만듬
		// @Override
		// public void aaa() { //오버라이딩 가능!!! 왜 ? 상속관계가 되어 재정의 할수있기 때문에 , 강제로 재정의하려면
		// static
		// super.aaa();
		// }
		// };

		// 밖에 있을땐 tm.aaa를 하면 바로 콜이됨. 하지만 밑에는 test안에서

		Test01AAA ta = new Test01AAA();
		ta.test(new Test01Main() { // inner
			@Override
			public void aaa() {
				System.out.println("aaa().............");
			}
		});
		
	
	}

}
