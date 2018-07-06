package test03array;

public class Test07mission2 {

	public static void main(String[] args) {
		System.out.println("mission");

		// 번호 이름 국어 영어 수학 총점 평균 등급
		String[] titles= new String[]{ "번호", "이름", "국어", "영어", "수학", "총점", "평균", "등급" };
		for (int i = 0; i < titles.length; i++) {
			System.out.print(titles[i]+" ");
		}
		System.out.println();
		
		
		// 1 홍길동1 99 88 77 264 88 A
		String[] row01 = new String[] { "1", "홍길동1", "99", "88", "77", null, null, null }; //null으로 기본값만들고 밑에서 어차피 값을 입력함.
		
		row01[5]=""+(Integer.parseInt(row01[2])+Integer.parseInt(row01[3])+Integer.parseInt(row01[4]));
		row01[6]=""+Integer.parseInt(row01[5])/3.0;
		
		//String grade = null; grade를 굳이 배열만들필요없음. 왜냐하면 어차피 row01[7]자리가 있은까!!!
		//등급의 값을 앞에썻던 공식을가져오면서 avg를 배열에 맞게 고쳐줌
		switch ((int) Double.parseDouble(row01[6]) / 10) {//row01[6]은 결국엔 문자열로 인식이되니까 숫자로 만들기 위해 더블.파스더블
		case 10:
		case 9:
			row01[7] = "A";
			break;
		case 8:
			row01[7] = "B";
			break;
		case 7:
			row01[7] = "C";
			break;
		default:
			row01[7] = "과락";
			break;
		}
		
		for (int i = 0; i < row01.length; i++) {
			System.out.print(row01[i] + " ");
		}
		System.out.println();
		
		
		// 2 홍길동2 99 88 77 264 88 A
String[] row02 = new String[] { "2", "홍길동2", "20", "30", "10", null, null, null }; //null으로 기본값만들고 밑에서 어차피 값을 입력함.
		
		row02[5]=""+(Integer.parseInt(row02[2])+Integer.parseInt(row02[3])+Integer.parseInt(row02[4]));
		row02[6]=""+Integer.parseInt(row02[5])/3.0;
		
		//String grade = null; grade를 굳이 배열만들필요없음. 왜냐하면 어차피 row01[7]자리가 있은까!!!
		//등급의 값을 앞에썻던 공식을가져오면서 avg를 배열에 맞게 고쳐줌
		switch ((int) Double.parseDouble(row02[6]) / 10) {//row01[6]은 결국엔 문자열로 인식이되니까 숫자로 만들기 위해 더블.파스더블
		case 10:
		case 9:
			row02[7] = "A";
			break;
		case 8:
			row02[7] = "B";
			break;
		case 7:
			row02[7] = "C";
			break;
		default:
			row02[7] = "과락";
			break;
		}
		
		for (int i = 0; i < row02.length; i++) {
			System.out.print(row02[i] + " ");
		}
		System.out.println();
		// 3 홍길동3 99 88 77 264 88 A
		
String[] row03 = new String[] { "2", "홍길동2", "90", "90", "90", null, null, null }; //null으로 기본값만들고 밑에서 어차피 값을 입력함.
		
		row03[5]=""+(Integer.parseInt(row03[2])+Integer.parseInt(row03[3])+Integer.parseInt(row03[4]));
		row03[6]=""+Integer.parseInt(row03[5])/3.0;
		
		//String grade = null; grade를 굳이 배열만들필요없음. 왜냐하면 어차피 row01[7]자리가 있은까!!!
		//등급의 값을 앞에썻던 공식을가져오면서 avg를 배열에 맞게 고쳐줌
		switch ((int) Double.parseDouble(row03[6]) / 10) {//row01[6]은 결국엔 문자열로 인식이되니까 숫자로 만들기 위해 더블.파스더블
		case 10:
		case 9:
			row03[7] = "A";
			break;
		case 8:
			row03[7] = "B";
			break;
		case 7:
			row03[7] = "C";
			break;
		default:
			row03[7] = "과락";
			break;
		}
		
		for (int i = 0; i < row03.length; i++) {
			System.out.print(row03[i] + " ");
		}
		System.out.println();
		// 배열을 이용하여 위와 같이 출력하도록 하시오.
		
		
		
		
		String[][] students = new String[4][titles.length]; //title여기에 8넣어도 가능
		//String[][] students = new String[][]{titles,row01,row02,row03}
		students[0]=titles;
		students[1]=row01;
		students[2]=row02;
		students[3]=row03;
		
		for (int x = 0; x < students.length; x++) {
			for (int i = 0; i < students[x].length; i++) {
				System.out.print(students[x][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
