package test02statement;

public class Test04mission {

	public static void main(String[] args) {
		System.out.println("mission...");
		
		//1. 3���� �л��� ������ ó���ϴ� ���α׷�(for���̿�)
		//��ȣ, �̸�,��,��,��,����,���,���
		//1 ȫ�浿1 91 81 71 243 81 B
		//2 ȫ�浿2 92 82 72 246 82 B
		//3 ȫ�浿3 93 83 73 249 83 B

		
		
		
		
		for (int i = 1; i <= 3; i++) {
			String name="ȫ�浿";
			int kor = 90;
			int eng = 80;
			int math = 70;
			kor=kor+i;
			eng=eng+i;
			math=math+i;
			
			int sum=kor+eng+math;
			double average= sum/3;
			String grade = "";
//			String grade = null;
//			switch ((int)average/10) {
//			case 10:
//			case 9:
//				grade="A";
//			case 8:
//				grade="B";
//				break;
//			default:
//				grade="����";
//				break;
//			}
			
			if ((int)average/10==10) {
				grade="A";
			} else if (average/10==9) {
				grade="A";
			}else if (average/10==8) {
				grade="B";
			}else if (average/10==7) {
				grade="C";
			}
			else {
				grade="����";
				}
			
		
		System.out.println(i+name+i+" "+kor+" "+eng+" "+math+" "+" "+sum+" "+average+" "+grade);
			
		}
		
		
		
		//2.�������� ����ϼ���.(FOR���̿�)
		//2*1=2 2*2=4...2*9=18
		//3*1=3 3*2=6...3*9=27
		//...
		//9*1=9 9*2=18...9*9=81
		
		System.out.println("========������=========");
		
		for (int i =2; i<=9; i++) {
			for (int x = 1; x < 10; x++) {
				
				System.out.print(i+"*"+x+"="+i*x+" ");
				//if(x==4)break; //4������ ���ؼ� �������� �̷��� �־��ָ��. if������ ������ �ϳ��̸� ��ȣ�ʿ����.
				}		
			System.out.println();
			//if(i==4)break;//���ƻ� 4�ܱ���
		}
		
		
		
		
		
		
		
	}

}
