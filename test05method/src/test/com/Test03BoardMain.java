package test.com;

public class Test03BoardMain {

	public static void main(String[] args) {
		System.out.println("board main");

		// 게시글:객체 (글번호, 제목, 내용, 작성자)
		// 게시글 처리 : 객체

		// 1.insert 글작성, 저장, 삽입,생성
		Test03BoardDAO dao = new Test03BoardDAO();
		Test03BoardVO vo1 = new Test03BoardVO();
		vo1.setNum(1);
		vo1.setTitle("java");
		vo1.setContent("study");
		vo1.setName("kim");
		int result1 = dao.insert(vo1);
		System.out.println("result1 : " + result1);

		// 2. update
		Test03BoardVO vo2 = new Test03BoardVO();

		vo2.setNum(2);
		vo2.setTitle("java2");
		vo2.setContent("study2");
		vo2.setName("kim2");
		dao.update(vo2);
		int result2 = dao.update(vo2);
		System.out.println("result2 : " + result2);

		// 3. delete
		Test03BoardVO vo3 = new Test03BoardVO();

		vo3.setNum(3);
		vo3.setTitle("java3");
		vo3.setContent("study3");
		vo3.setName("kim3");
		dao.delete(vo3);
		int result3 = dao.delete(vo3);
		System.out.println("result3 : " + result3);

		// 4. selectOne
		Test03BoardVO vo4 = new Test03BoardVO();
		vo4.setNum(4);
		vo4.setTitle("java4");
		vo4.setContent("study4");
		vo4.setName("kim4");
		dao.selectOne(vo4);
		Test03BoardVO result4 = dao.selectOne(vo4);// selectOne에 보내줌.
		System.out.println(result4.getNum());// 잘보내어 졌는지 확인
		System.out.println(result4.getTitle());
		System.out.println(result4.getContent());
		System.out.println(result4.getName());

		// 5.selectAll
		Test03BoardVO[] vos = dao.selectAll();
		System.out.println(vos.length); // 배열의 길이를 확인하기 위해 한번 찍어봄 3
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i].getNum());
			System.out.println(vos[i].getTitle());
			System.out.println(vos[i].getContent());
			System.out.println(vos[i].getName());

		}

	}

}
