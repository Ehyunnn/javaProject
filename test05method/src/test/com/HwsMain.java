package test.com;

public class HwsMain {

	public static void main(String[] args) {
	
	HwsDAO das = new HwsDAO();
	HwsVO vo = new HwsVO();
	vo.setNum(1);
	vo.setType("�ι�");
	vo.setTitle("�ι����� ����");
	vo.setPrice(35200);
	vo.setCode("book-1111");
	vo.setTotal(250);
	vo.setHave(vo.total);
	int score1 = das.insert(vo);
	
	
	
	HwsVO vo2 = new HwsVO();
	vo2.setNum(2);
	vo2.setType("����");
	vo2.setTitle("������ ����");
	vo2.setPrice(20000);
	vo2.setCode("book-2222");
	vo2.setTotal(0);
	vo2.setHave(vo2.total);
	int score2 = das.update(vo2);
	
	
	HwsVO vo3 = new HwsVO();
	vo3.setNum(3);
	vo3.setType("�ڿ�");
	vo3.setTitle("�ڿ������� ����");
	//vo3.setPrice(32300);
	vo3.setCode("book-3333");
	vo3.setTotal(2);
	vo3.setHave(vo3.total);
	int score3 = das.delete(vo3);
	
	
	HwsVO[] voarrary = das.selectAll();
	
	System.out.println(voarrary.length);
	System.out.println("���� ���� ��ü �˻�");
	
	for (int i = 0; i < voarrary.length; i++) {
		System.out.print((i+1)+"��° ���� ����              : "+voarrary[i].num+"  ");
		System.out.print(voarrary[i].type+" ");
		System.out.print(voarrary[i].title+" ");
		System.out.print(voarrary[i].price+" ");
		System.out.print(voarrary[i].code+" ");
		System.out.print(voarrary[i].have+" ");
		System.out.println(voarrary[i].total+" ");
		
		
	}
	
	
	
	}
	
	

}


