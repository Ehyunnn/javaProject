package test03array;

public class Test05stringarray {

	public static void main(String[] args) {
		System.out.println("string array");
		
		String[] strs=new String[3];
		strs[0]="kim";
		strs[1]="yangssem";
		strs[2]="choi";
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		for (String str : strs) {
			System.out.println(str);
		}
		
		
		String[] names = new String[] {"aa","vv","rr","qq"};
		System.out.println(names.length);
		
		
		
	}

}
