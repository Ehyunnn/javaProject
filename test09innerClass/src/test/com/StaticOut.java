package test.com;

public class StaticOut {

	static int num;

	public static void test() {

	}

	public static class Inner { // class�� static�� �Ǹ� num. name���� inner.name.����~
		static String name = "kim";
		String id;

		public static void kkk() {
			System.out.println("kkk().............");
		}
	}

}
