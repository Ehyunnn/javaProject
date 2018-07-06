package test.com;

public class HwsMain {

	public static void main(String[] args) {
	
	HwsDAO das = new HwsDAO();
	HwsVO vo = new HwsVO();
	vo.setNum(1);
	vo.setType("인문");
	vo.setTitle("인문학의 이해");
	vo.setPrice(35200);
	vo.setCode("book-1111");
	vo.setTotal(250);
	vo.setHave(vo.total);
	int score1 = das.insert(vo);
	
	
	
	HwsVO vo2 = new HwsVO();
	vo2.setNum(2);
	vo2.setType("경제");
	vo2.setTitle("경제의 이해");
	vo2.setPrice(20000);
	vo2.setCode("book-2222");
	vo2.setTotal(0);
	vo2.setHave(vo2.total);
	int score2 = das.update(vo2);
	
	
	HwsVO vo3 = new HwsVO();
	vo3.setNum(3);
	vo3.setType("자연");
	vo3.setTitle("자연과학의 이해");
	//vo3.setPrice(32300);
	vo3.setCode("book-3333");
	vo3.setTotal(2);
	vo3.setHave(vo3.total);
	int score3 = das.delete(vo3);
	
	
	HwsVO[] voarrary = das.selectAll();
	
	System.out.println(voarrary.length);
	System.out.println("도서 정보 전체 검색");
	
	for (int i = 0; i < voarrary.length; i++) {
		System.out.print((i+1)+"번째 도서 정보              : "+voarrary[i].num+"  ");
		System.out.print(voarrary[i].type+" ");
		System.out.print(voarrary[i].title+" ");
		System.out.print(voarrary[i].price+" ");
		System.out.print(voarrary[i].code+" ");
		System.out.print(voarrary[i].have+" ");
		System.out.println(voarrary[i].total+" ");
		
		
	}
	
	
	
	}
	
	

}


