package test02statement;

public class Test04formession {

	public static void main(String[] args) {
		int manCount =3;//�л���
		for (int i = 0; i < manCount; i++) {
		
			int num =i+1;
			String name = "ȫ�浿";//������������ �̸��̸� �ʱ�ȭ
			int kor =90+num;
			int eng=80+num;
			int math=70+num;
			int total=kor+eng+math;
			double avg =total/3.0;
			String grade = null;
			
			switch ((int)avg/10) {
			case 10:
			case 9:	
				grade="A";
				break;
			case 8:	
				grade="B";
				break;
			case 7:	
				grade="C";
				break;
			default:
				grade="����";
				break;
			}
			
			System.out.println(num+" "+name+num+" "+kor+" "+eng+" "+math+" "+total+" "+avg+" "+grade);

		}
		
		
		
		
		//2.�������� ����ϼ���.(FOR���̿�)
		//2*1=2 2*2=4...2*9=18
		//3*1=3 3*2=6...3*9=27
		//...
		//9*1=9 9*2=18...9*9=81
		
		
		
		for (int x = 2; x < 10; x++) {
			for (int i = 1; i < 10; i++) {
				System.out.print(x+"*"+i+"="+(x*i)+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
