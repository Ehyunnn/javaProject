package test.com;

public class Test02StringBuffer {

	public static void main(String[] args) {
		System.out.println("StringBuffer StringBuilder");
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("aaaa"); //String �̸� concat�� ������, ���⼱append�� ���
		sb.append("aaaa"); //concat�� =�� ����ؼ� �־�������� append�� �ڵ����� �־���. ���� �ӵ�ȿ���� ����!!!!
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		System.out.println(sb.toString());
		
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		sb2.append("bbbbb");
		System.out.println(sb2.toString());
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis()-startTime);
		
		
		//Test02StringBuffer.printRunTime1();
		//printRunTime1(); 5~6��
		//printRunTime2();//0.007��
		printRunTime3();//3��
		//���� Ŭ������ �ֱ� ������ ������ ����!
	}
	//�޼ҵ�� ���� ����Ѵٸ�?
	public static void printRunTime1() {  //->�̷��� ������ 1600�� ���� �Ѱ� �ɸ�
		long startTime = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s +="ssss";
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	
	
	public static void printRunTime2() { //->append�� �̿��ϸ� 6��~7�� ����
		long startTime = System.currentTimeMillis();
		//String s = "";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) {
			sb.append("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}

	
	public static void printRunTime3() { //->concat�� �̿��ϸ� 3��
		long startTime = System.currentTimeMillis();
		String s = "";
	
		for (int i = 0; i < 100000; i++) {
			s= s.concat("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	
	//�˰����� �ۼ��Ҷ� �����Ͼ�μ� �ӵ� ȿ���� ����غ�. ������ ���� �˰����� ū �ӵ����ϸ� ������ ���� �ִ�.
	

}
