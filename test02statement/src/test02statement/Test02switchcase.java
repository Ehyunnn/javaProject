package test02statement;

public class Test02switchcase {

	public static void main(String[] args) {
		System.out.println("switch~case");

		// key���� ������ ���ڸ� �� �� ����.
		//
		String name = "lee";
		switch (name) {
		case "kim":
			System.out.println("ok1");
			break;
		case "lee":
			System.out.println("ok2");
			break;
		default:
			System.out.println("other");
			break;
		}

		int num = 7;
		switch (num) {
		case 10:
			System.out.println("��");
			break;
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			break;
		}

		 //����ó�� ���α׷� swtich case�� ����ؼ� ���弼��
		 System.out.println("����ó�����α׷�");
		 //��,��,��,����,���,���
//		 int korean = 92;
//		 int english = 91;
//		 int math = 93;
//		
//		 int sum = korean + english + math;
//		 double average = (double) sum/3;
//		 
//			System.out.println("�հ�   : " + sum);
//			System.out.println("���   : " + average);
//			System.out.println("���   : " + (int)average);
//		
//		 switch((int)average) {
//		 case 100:
//		 case 99:
//		 case 98:
//		 case 97:
//		 case 96:
//		 case 95:
//		 case 94:
//		 case 93:
//		 case 92:
//		 case 91:
//		 case 90:
//		 System.out.println("��� :A");
//		 break;
//		 case 89:
//		 System.out.println("��� :B");
//		 break;
//		 case 80:
//		 System.out.println("��� :C");
//		 break;
//		 case 70:
//		 System.out.println("��� :����");
//		 break;
//		
//		 default:
//		 break;
//		 }
		 
		 int korean = 92;
		 int english = 91;
		 int math = 93;
		
		 int sum = korean + english + math;
		 double average = (double) sum/3;
		 
			System.out.println("�հ�   : " + sum);
			System.out.println("���   : " + average);
			System.out.println("���   : " + (int)average);
		String grade = null;
		System.out.println(grade);
		 switch((int)average/10) {
		 case 10:
		 case 9:
		 grade ="A";
		 break;
		 case 8:
			 grade ="B";
		 break;
		 case 7:
			 grade ="C";
		 break;
		
		 default:
			 grade ="����";
		 break;
		 }
		 System.out.println(grade);
		
		
		
		
		 
		 
		 
		

	}

}



