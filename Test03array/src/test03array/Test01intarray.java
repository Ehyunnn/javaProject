package test03array;

public class Test01intarray {

	public static void main(String[] args) {
		System.out.println("int array");

		// int a1=10;
		// int a2=30;
		// int a3=90;
		// 위는 불편하니 동일한 타입의 데이터를 하나의 타입으로 만들자.
		//[]로 표시
		 //10,20,30
		int[] sus = new int[3];
//		sus[0]=10;
//		sus[1]=20;
//		sus[2]=30;
		//규칙이 보이기 때문에 이렇게 배열에 입력이 가능함. 배열에 입력하는 입력부
		for (int i = 0; i < sus.length; i++) {
			sus[i]=10*(i+1);
			
		}
//		System.out.println(sus[0]);
//		System.out.println(sus[1]);
//		System.out.println(sus[2]);
		
		
		//배열의 출력부
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
			
		}
		
		
//		for (int x : sus) {
//			System.out.println(x);
//		}
		
		
		
		//배열데이터 동적 할당
		//앞에처럼 하나씩 넣지않고 한꺼번에 값을 넣어버림. scores.length를 통해서 몇개가 들어갔는지 확인
		//int[] scores={11,22,33,44,55}; 비권장
		int[] scores=new int[]{11,22,33,44,55};
		System.out.println(scores.length);
		
		
		
		
		
		
	}

}
