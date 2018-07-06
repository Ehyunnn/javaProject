package test.com;
//

//public class Test04ScoreDAO {
//
//	// 입력하기
//	public int insert(Test04ScoreVO vo) {
//		System.out.print("학생 성적표 입력                : ");
//		System.out.print(vo.getNum() + " ");
//		System.out.print(vo.getName() + " ");
//		System.out.print(vo.getKor() + " ");
//		System.out.print(vo.getMath() + " ");
//		System.out.print(vo.getEng() + " ");
//		System.out.print(vo.getSum() + " ");
//		System.out.print(vo.getAvg() + " ");
//		System.out.println(vo.getGrade());
//		return 0;
//	}
//
//	// 수정하기
//	public int update(Test04ScoreVO vo2) {
//		System.out.print("학생 성적표 수정(국어과목): ");
//		System.out.print(vo2.getNum() + " ");
//		System.out.print(vo2.getName() + " ");
//		System.out.print(vo2.getKor() + " ");
//		System.out.print(vo2.getMath() + " ");
//		System.out.print(vo2.getEng() + " ");
//		System.out.print(vo2.getSum() + " ");
//		System.out.print(vo2.getAvg() + " ");
//		System.out.println(vo2.getGrade());
//
//		return 0;
//	}
//
//	// 삭제하기
//	public int delete(Test04ScoreVO vo3) {
//		System.out.print("학생 성적표 삭제(영어과목): ");
//		System.out.print(vo3.getNum() + " ");
//		System.out.print(vo3.getName() + " ");
//		System.out.print(vo3.getKor() + " ");
//		System.out.print(vo3.getMath() + " ");
//		System.out.print(vo3.getEng() + " ");
//		System.out.print(vo3.getSum() + " ");
//		System.out.print(vo3.getAvg() + " ");
//		System.out.println(vo3.getGrade());
//		return 0;
//	}
//
//	// 검색하기 한개
//
//	Test04ScoreVO selectOne(Test04ScoreVO vo) {
//		return new Test04ScoreVO();
//	}
//
//	// 검색하기 모두
//
//	Test04ScoreVO[] selectAll() {
//
//		Test04ScoreVO vo = new Test04ScoreVO();
//		vo.setNum(11);
//		vo.setName("홍길동1");
//		vo.setKor(90);
//		vo.setEng(70);
//		vo.setMath(80);
//		vo.setSum(90, 70, 80);
//		vo.setAvg(vo.sum / 3);
//		vo.setGrade((int) vo.avg);
//
//		Test04ScoreVO vo2 = new Test04ScoreVO();
//		vo2.setNum(12);
//		vo2.setName("홍길동2");
//		vo2.setKor(90);
//		vo2.setEng(40);
//		vo2.setMath(80);
//		vo2.setSum(90, 40, 80);
//		vo2.setAvg(vo2.sum / 3);
//		vo2.setGrade((int) vo2.avg);
//
//		Test04ScoreVO vo3 = new Test04ScoreVO();
//		vo3.setNum(13);
//		vo3.setName("홍길동3");
//		vo3.setKor(90);
//		vo3.setEng(0);
//		vo3.setMath(80);
//		vo3.setSum(90, 0, 80);
//		vo3.setAvg(vo3.sum / 3);
//		vo3.setGrade((int) vo3.avg);
//
//		return new Test04ScoreVO[] { vo, vo2, vo3 };
//	}
//
//}
//
//public class Test04ScoreDAO {
//
//	// 1.insert(Test04ScoreVO vo):int
//	public int insert(Test04ScoreVO vo) {
//		System.out.println("insert()...........");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getKor());
//		System.out.println(vo.getEng());
//		System.out.println(vo.getMath());
//		System.out.println(vo.getTotal());
//		System.out.println(vo.getAvg());
//		System.out.println(vo.getGrade());
//		return 0;
//	}
//
//	// 2.update(Test04ScoreVO vo):int
//	public int update(Test04ScoreVO vo) {
//		System.out.println("update()...........");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getKor());
//		System.out.println(vo.getEng());
//		System.out.println(vo.getMath());
//		System.out.println(vo.getTotal());
//		System.out.println(vo.getAvg());
//		System.out.println(vo.getGrade());
//
//		return 0;
//	}
//
//	// 3. delete(Test04ScoreVO vo):int
//
//	public int delete(Test04ScoreVO vo) {
//		System.out.println("delete()...........");
//		System.out.println(vo.getNum());
//
//		return 0;
//	}
//
//	// 4.selectOne(Test04ScoreVO vo):Test04ScoreVO
//	public Test04ScoreVO selectOne(Test04ScoreVO vo) {
//		System.out.println("selectOne()...........");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getKor());
//		System.out.println(vo.getEng());
//		System.out.println(vo.getMath());
//		System.out.println(vo.getTotal());
//		System.out.println(vo.getAvg());
//		System.out.println(vo.getGrade());
//		//return new Test04ScoreVO();
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
//		vo4.setGrade(grade4);
//		return vo4;
//	}
//
//	// 5.selectAll():Test04ScoreVO[]
//	public Test04ScoreVO[] selectAll() {
//		System.out.println("selectAll()...........");
//		Test04ScoreVO[] vos = new Test04ScoreVO[2];
//		vos[0]=new Test04ScoreVO();
//		vos[0].setNum(1);
//		vos[0].setName("kim11");
//		vos[0].setKor(88);
//		vos[0].setEng(88);
//		vos[0].setMath(88);
//		vos[0].setTotal(vos[0].getKor()+vos[0].getMath()+vos[0].getEng());
//		vos[0].setNum(1);
//		vos[0].setAvg(vos[0].getTotal()/3.0);
//		String grade4 = "";
//		if (vos[0].getAvg()>=90) {
//			grade4 = "A";
//		} else if(vos[0].getAvg()>=80) {
//			grade4 = "B";
//			
//		} else if(vos[0].getAvg()>=70) {
//			grade4 = "C";
//		} else {
//			grade4="과락";
//		}
//		vos[0].setGrade(grade4);
//		
//		
//		vos[1]=new Test04ScoreVO();
//		vos[1].setNum(77);
//		vos[1].setName("kim11");
//		vos[1].setKor(77);
//		vos[1].setEng(77);
//		vos[1].setMath(7);
//		vos[1].setTotal(vos[1].getKor()+vos[1].getMath()+vos[1].getEng());
//		vos[1].setNum(1);
//		vos[1].setAvg(vos[1].getTotal()/3.0);
//		String grade2 = "";
//		if (vos[1].getAvg()>=90) {
//			grade2 = "A";
//		} else if(vos[1].getAvg()>=80) {
//			grade2 = "B";
//			
//		} else if(vos[1].getAvg()>=70) {
//			grade2 = "C";
//		} else {
//			grade2 ="과락";
//		}
//		vos[1].setGrade(grade2);
//		
//		
//		
//		vos[2]=new Test04ScoreVO();
//		vos[2].setNum(77);
//		vos[2].setName("kim11");
//		vos[2].setKor(77);
//		vos[2].setEng(77);
//		vos[2].setMath(7);
//		vos[2].setTotal(vos[2].getKor()+vos[2].getMath()+vos[2].getEng());
//		vos[2].setNum(1);
//		vos[2].setAvg(vos[2].getTotal()/3.0);
//		String grade3 = "";
//		if (vos[2].getAvg()>=90) {
//			grade3 = "A";
//		} else if(vos[2].getAvg()>=80) {
//			grade3 = "B";
//			
//		} else if(vos[2].getAvg()>=70) {
//			grade3 = "C";
//		} else {
//			grade3 ="과락";
//		}
//		vos[2].setGrade(grade3);
//		
//		
//		vos[0]=new Test04ScoreVO();
//		
//		vos[1]=new Test04ScoreVO();
//		return vos;
//	}
//}
