package test03array;

public class Test04booleanarray {

	public static void main(String[] args) {
		System.out.println("boolean array");

		//±âº»°ª:false
		boolean[] bs=new boolean[3];
		bs[2]=true;
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
		
		for (boolean b : bs) {
			System.out.println(b);
		}
		
		
		
	}

}
