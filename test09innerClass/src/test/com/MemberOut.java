package test.com;

public class MemberOut {

	public int num;
	public void run() {
//		Inner in = new Inner();
		
	}

	public class Inner { //멤버 !! 메소드와 자원을 모두 사용할수 있게 이너를 만들어서 사용가능. 상속가능
		String name = "kim";

		public String getName() {
			System.out.println(num);
			//run();
			return name;
		}

		public void test() {
			System.out.println(num);

		}
	}

}
