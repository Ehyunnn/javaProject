package test02statement;

public class Test04mission {

	public static void main(String[] args) {
		System.out.println("mission...");
		
		//1. 3명의 학생의 성적을 처리하는 프로그램(for문이용)
		//번호, 이름,국,영,수,총점,평균,등급
		//1 홍길동1 91 81 71 243 81 B
		//2 홍길동2 92 82 72 246 82 B
		//3 홍길동3 93 83 73 249 83 B

		
		
		
		
		for (int i = 1; i <= 3; i++) {
			String name="홍길동";
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
//				grade="과락";
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
				grade="과락";
				}
			
		
		System.out.println(i+name+i+" "+kor+" "+eng+" "+math+" "+" "+sum+" "+average+" "+grade);
			
		}
		
		
		
		//2.구구단을 출력하세요.(FOR문이용)
		//2*1=2 2*2=4...2*9=18
		//3*1=3 3*2=6...3*9=27
		//...
		//9*1=9 9*2=18...9*9=81
		
		System.out.println("========구구단=========");
		
		for (int i =2; i<=9; i++) {
			for (int x = 1; x < 10; x++) {
				
				System.out.print(i+"*"+x+"="+i*x+" ");
				//if(x==4)break; //4까지만 곱해서 끝내려면 이렇게 넣어주면됨. if에서는 조건이 하나이면 괄호필요없음.
				}		
			System.out.println();
			//if(i==4)break;//문맥상 4단까지
		}
		
		
		
		
		
		
		
	}

}
