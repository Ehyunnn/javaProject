package test03array;

public class Test01intarray {

	public static void main(String[] args) {
		System.out.println("int array");

		// int a1=10;
		// int a2=30;
		// int a3=90;
		// ���� �����ϴ� ������ Ÿ���� �����͸� �ϳ��� Ÿ������ ������.
		//[]�� ǥ��
		 //10,20,30
		int[] sus = new int[3];
//		sus[0]=10;
//		sus[1]=20;
//		sus[2]=30;
		//��Ģ�� ���̱� ������ �̷��� �迭�� �Է��� ������. �迭�� �Է��ϴ� �Էº�
		for (int i = 0; i < sus.length; i++) {
			sus[i]=10*(i+1);
			
		}
//		System.out.println(sus[0]);
//		System.out.println(sus[1]);
//		System.out.println(sus[2]);
		
		
		//�迭�� ��º�
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
			
		}
		
		
//		for (int x : sus) {
//			System.out.println(x);
//		}
		
		
		
		//�迭������ ���� �Ҵ�
		//�տ�ó�� �ϳ��� �����ʰ� �Ѳ����� ���� �־����. scores.length�� ���ؼ� ��� ������ Ȯ��
		//int[] scores={11,22,33,44,55}; �����
		int[] scores=new int[]{11,22,33,44,55};
		System.out.println(scores.length);
		
		
		
		
		
		
	}

}
