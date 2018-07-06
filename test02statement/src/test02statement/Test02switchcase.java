package test02statement;

public class Test02switchcase {

	public static void main(String[] args) {
		System.out.println("switch~case");

		// key에는 정수와 문자만 들어갈 수 있음.
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
			System.out.println("수");
			break;
		case 9:
			System.out.println("우");
			break;
		case 8:
			System.out.println("미");
			break;
		case 7:
			System.out.println("양");
			break;
		case 6:
			System.out.println("가");
			break;
		default:
			break;
		}

		 //성적처리 프로그램 swtich case를 사용해서 만드세요
		 System.out.println("성적처리프로그램");
		 //국,영,수,총점,평균,등급
//		 int korean = 92;
//		 int english = 91;
//		 int math = 93;
//		
//		 int sum = korean + english + math;
//		 double average = (double) sum/3;
//		 
//			System.out.println("합계   : " + sum);
//			System.out.println("평균   : " + average);
//			System.out.println("평균   : " + (int)average);
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
//		 System.out.println("등급 :A");
//		 break;
//		 case 89:
//		 System.out.println("등급 :B");
//		 break;
//		 case 80:
//		 System.out.println("등급 :C");
//		 break;
//		 case 70:
//		 System.out.println("등급 :과락");
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
		 
			System.out.println("합계   : " + sum);
			System.out.println("평균   : " + average);
			System.out.println("평균   : " + (int)average);
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
			 grade ="과락";
		 break;
		 }
		 System.out.println(grade);
		
		
		
		
		 
		 
		 
		

	}

}



