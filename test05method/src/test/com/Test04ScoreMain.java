//package test.com;
//
//public class Test04ScoreMain {
//
//	public static void main(String[] args) {
		
//		Test04ScoreDAO dao = new Test04ScoreDAO();
//		Test04ScoreVO vo = new Test04ScoreVO();
//		vo.setNum(1);
//		vo.setName("홍길동1");
//		vo.setKor(90);
//		vo.setEng(70);
//		vo.setMath(80);
//		vo.setSum(90, 70, 80);
//		vo.setAvg(vo.sum / 3);
//		vo.setGrade((int) vo.avg);
//		int score1 = dao.insert(vo);
//		System.out.println("result1 : " + score1);
//
//		Test04ScoreVO vo2 = new Test04ScoreVO();
//		vo2.setNum(1);
//		vo2.setName("홍길동2");
//		vo2.setKor(90);
//		vo2.setEng(40);
//		vo2.setMath(80);
//		vo2.setSum(90, 40, 80);
//		vo2.setAvg(vo2.sum / 3);
//		vo2.setGrade((int) vo2.avg);
//		int score2 = dao.update(vo2);
//
//		Test04ScoreVO vo3 = new Test04ScoreVO();
//		vo3.setNum(1);
//		vo3.setName("홍길동3");
//		vo3.setKor(90);
//		// vo3.setEng(0);
//		vo3.setMath(80);
//		vo3.setSum(90, 0, 80);
//		vo3.setAvg(vo3.sum / 3);
//		vo3.setGrade((int) vo3.avg);
//		int score3 = dao.update(vo3);
//
//		// Test04ScoreVO[] voarray = new Test04ScoreVO[] {
//		Test04ScoreVO[] voarray1 = dao.selectAll();
//
//		System.out.println();
//		System.out.println("*****학생 성적표 검색(전체성적)*****");
//		System.out.println("배열의 길이 확인 :" + voarray1.length);
//		for (int i = 0; i < voarray1.length; i++) {
//			System.out.print((i + 1) + "번 학생 성적 검색결과       : " + voarray1[i].num + " ");
//			System.out.print(voarray1[i].name + " ");
//			System.out.print(voarray1[i].kor + " ");
//			System.out.print(voarray1[i].eng + " ");
//			System.out.print(voarray1[i].math + " ");
//			System.out.print(voarray1[i].sum + " ");
//			System.out.print(voarray1[i].avg + " ");
//			System.out.println(voarray1[i].grade);
//		}
//
//	}
//
//}

//		
//		
//		System.out.println("score......");
//		Test04ScoreDAO dao = new Test04ScoreDAO();
//		System.out.println(dao);
//		
//		
//		
//		//오버로딩 : 메소드의 이름이 같고, 매개변수가 다를때(갯수,타입,순서)
//		
//		
//		//기능-입력,수정,삭제,검색(단일,복수)
//		//1.insert
//		Test04ScoreVO vo = new Test04ScoreVO();
//		vo.setNum(1);
//		vo.setName("kim");
//		vo.setKor(100);
//		vo.setEng(99);
//		vo.setMath(80);
//		vo.setTotal(vo.getKor()+vo.getMath()+vo.getEng());
//		vo.setNum(1);
//		vo.setAvg(vo.getTotal()/3.0);
//		String grade = "";
//		if (vo.getAvg()>=90) {
//			grade = "A";
//		} else if(vo.getAvg()>=80) {
//			grade = "B";
//			
//		} else if(vo.getAvg()>=70) {
//			grade = "C";
//		} else {
//			grade="과락";
//		}
//		vo.setGrade(grade);
//		
//		int result1 = dao.insert(vo);
//		System.out.println("Result1:"+result1);
//		
//		
//		//2.update
//		Test04ScoreVO vo2 = new Test04ScoreVO();
//		
//		vo2.setNum(1);
//		vo2.setName("kim11");
//		vo2.setKor(88);
//		vo2.setEng(88);
//		vo2.setMath(88);
//		vo2.setTotal(vo2.getKor()+vo2.getMath()+vo2.getEng());
//		vo2.setNum(1);
//		vo2.setAvg(vo2.getTotal()/3.0);
//		String grade2 = "";
//		if (vo.getAvg()>=90) {
//			grade2 = "A";
//		} else if(vo2.getAvg()>=80) {
//			grade2 = "B";
//			
//		} else if(vo2.getAvg()>=70) {
//			grade2 = "C";
//		} else {
//			grade2="과락";
//		}
//		vo.setGrade(grade2);
//		
//		int result2 = dao.update(vo2);
//		System.out.println("Result2:"+result2);
//		
//		//3. delete 33번인 학생만 지우고싶어!!
//		Test04ScoreVO vo3 = new Test04ScoreVO();
//		vo3.setNum(33); 
//		int result3 = dao.delete(vo3);
//		System.out.println("Result3:"+result3);
//		
//		//4.selectOne
//		
//		Test04ScoreVO vo4 = new Test04ScoreVO();
//		vo4.setNum(1);
//		vo4.setName("kim11");
//		vo4.setKor(88);
//		vo4.setEng(88);
//		vo4.setMath(88);
//		vo4.setTotal(vo4.getKor()+vo4.getMath()+vo4.getEng());
//		vo4.setNum(1);
//		vo4.setAvg(vo4.getTotal()/3.0);
//		String grade4 = "";
//		if (vo.getAvg()>=90) {
//			grade4 = "A";
//		} else if(vo4.getAvg()>=80) {
//			grade4 = "B";
//			
//		} else if(vo4.getAvg()>=70) {
//			grade4 = "C";
//		} else {
//			grade4="과락";
//		}
//		vo.setGrade(grade4);
//		Test04ScoreVO result4 = dao.selectOne(vo4);
//		System.out.println("Result4:"+result4);
//		System.out.println(result4.getNum());
//		System.out.println(result4.getName());
//		System.out.println(result4.getKor());
//		System.out.println(result4.getEng());
//		System.out.println(result4.getMath());
//		System.out.println(result4.getTotal());
//		System.out.println(result4.getAvg());
//		System.out.println(result4.getGrade());
//
//		
//
//		
//		//5.selectAll
//		
//		Test04ScoreVO[] result5 =dao.selectAll();
//		System.out.println("result5:"+result5);
//		System.out.println(result5[0]);
//		System.out.println(result5[0].getNum());
//		System.out.println(result5[0].getNum());
//		System.out.println(result5[0].getName());
//		System.out.println(result5[0].getKor());
//		System.out.println(result5[0].getEng());
//		System.out.println(result5[0].getMath());
//		System.out.println(result5[0].getTotal());
//		System.out.println(result5[0].getAvg());
//		System.out.println(result5[0].getGrade());
//		System.out.println(result5[1].getNum());
//		System.out.println(result5[1].getNum());
//		System.out.println(result5[1].getName());
//		System.out.println(result5[1].getKor());
//		System.out.println(result5[1].getEng());
//		System.out.println(result5[1].getMath());
//		System.out.println(result5[1].getTotal());
//		System.out.println(result5[1].getAvg());
//		System.out.println(result5[1].getGrade());
//
//	}
//}
