package test03array;

public class Test03doublearray {

	public static void main(String[] args) {
		System.out.println("double array");
		
		double[] ds=new double[3];
		ds[0]=1.11;
		ds[1]=2.99;
		ds[2]=44.22;
		
		//배열의 번호가 있기때문에 1번째를 빼라던지..여러 가지를 만들수 있음.
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		//배열의 번호가 없이 값만 나타내니 그렇게 ㅁ나들긴힘듬.
		for (double d : ds) {
			System.out.println(d);
		}
	}

}
