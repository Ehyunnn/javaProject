package test.com;

public class StaticOut {

	static int num;

	public static void test() {

	}

	public static class Inner { // class가 static이 되면 num. name가능 inner.name.가능~
		static String name = "kim";
		String id;

		public static void kkk() {
			System.out.println("kkk().............");
		}
	}

}
