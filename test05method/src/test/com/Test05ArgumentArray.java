package test.com;

public  class Test05ArgumentArray {

	public void aaa(int x, int y, int z) {

		System.out.println("aaa(int x, int y, int z)");
	}

	public void aaa(int[] sus) {
		System.out.println("aaa(int[] sus)");
	}

	public void aaa2(int... sus) { // ...은 대괄호[]를 의미함. 따라서 어디에 붙어도 상관없음
		System.out.println("aaa2(int ... sus)");
	}

	public void aaa2(int[]... suss) {
		System.out.println("aaa2(int[] ... suss)");
	}
	// 생성자에도 해당 되는지 해보기

	public Test05ArgumentArray() {

	}

	public Test05ArgumentArray(int... sus) {

	}
	
	//public void test(String...names);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arguments Arrary");

		Test05ArgumentArray aa = new Test05ArgumentArray();
		aa.aaa(99, 88, 77);
		aa.aaa(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		aa.aaa2(55, 66, 77, 88, 99);
		aa.aaa2(new int[] { 1, 2, 3, 4, 5, 6, 7 }, new int[] { 1, 2, 3, 4, 5, 6, 7 });

	}

}
