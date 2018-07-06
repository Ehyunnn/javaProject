package test03array;

public class Test06arrayarray {

	public static void main(String[] args) {
		System.out.println("array array");
		
		int[] sus=new int[3];
		sus[0]=11;
		sus[1]=22;
		sus[2]=3;
		System.out.println(sus);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		//new 연산자의 모든 기본값은 null
		int[][] suss=new int[2][sus.length];
		System.out.println(suss);
		suss[0]=sus;
		System.out.println(suss[0]);
		for (int i = 0; i < suss[0].length; i++) {
			System.out.println(suss[0][i]);
		}
		
		suss[1]=new int[sus.length];
		System.out.println(suss[1]);
		for (int i = 0; i < suss[1].length; i++) {
			System.out.println(suss[1][i]);
		}
		//배열을 여러개 쓰면 다차원배열:2차원
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+"   ");
			}
			System.out.println();
		}
		
		
		System.out.println("===============================");
		
		int[][] pricess=new int[][] {new int[3],new int[] {11,22},{44,55,66,77}};
		pricess[1]= new int[] {99,99,99};//이것이 간단하게나타내는 동적할당. 밑의 주석은 100개가 나오면 어렵게되지 !!!
		
		// pricess[1]=new int[3];
		// pricess[1][0]=99;
		// pricess[1][1]=99;
		// pricess[1][2]=99;
		
		pricess[1][1]=88;
		pricess[0][2]=99;
		
		System.out.println(pricess.length);//길이는 3개
		
		for (int x = 0; x < pricess.length; x++) {
			for (int i = 0; i < pricess[x].length; i++) {
				System.out.print(pricess[x][i]+" ");
			}
			System.out.println();
		}
		
	
			
		
		
		
		
		
		
		
			
	}

}
