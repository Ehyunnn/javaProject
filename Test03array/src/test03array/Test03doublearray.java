package test03array;

public class Test03doublearray {

	public static void main(String[] args) {
		System.out.println("double array");
		
		double[] ds=new double[3];
		ds[0]=1.11;
		ds[1]=2.99;
		ds[2]=44.22;
		
		//�迭�� ��ȣ�� �ֱ⶧���� 1��°�� �������..���� ������ ����� ����.
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		
		//�迭�� ��ȣ�� ���� ���� ��Ÿ���� �׷��� �����������.
		for (double d : ds) {
			System.out.println(d);
		}
	}

}
