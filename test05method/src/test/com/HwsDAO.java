package test.com;

public class HwsDAO {

	public int insert(HwsVO vo) {
		System.out.println("=========�����������============");
		System.out.println("���� ���� �з�                :���� ����        ����       ����             �ڵ�         ����� ����");
		System.out.print("���� ���� �Է�                : ");
		System.out.print(vo.getNum() + " ");
		System.out.print(vo.getType() + " ");
		System.out.print(vo.getTitle() + " ");
		System.out.print(vo.getPrice() + " ");
		System.out.print(vo.getCode() + " ");
		 System.out.print(vo.isHave() + " ");
		System.out.println(vo.getTotal()+" ");
		

		return 0;

	}

	public int update(HwsVO vo) {
		System.out.print("���� ���� �Է�                : ");
		System.out.print(vo.getNum() + " ");
		System.out.print(vo.getType() + " ");
		System.out.print(vo.getTitle() + "    ");
		System.out.print(vo.getPrice() + " ");
		System.out.print(vo.getCode() + " ");
		System.out.print(vo.isHave() + " ");
		 System.out.println(vo.getTotal()+ " ");
		 

		return 0;

	}

	public int delete(HwsVO vo) {
		System.out.print("���� ���� �Է�                : ");
		System.out.print(vo.getNum() + " ");
		System.out.print(vo.getType() + " ");
		System.out.print(vo.getTitle() + " ");
		System.out.print(vo.getPrice() + "    ");
		System.out.print(vo.getCode() + " ");
		 System.out.print(vo.isHave() + " ");
		 System.out.println(vo.getTotal()+ " ");

		return 0;
	}

	HwsVO selectOne(HwsVO vo) {
		return new HwsVO();

	}

	HwsVO[] selectAll() {
		HwsVO vo = new HwsVO();
		vo.setNum(1);
		vo.setType("�ι�");
		vo.setTitle("�ι����� ����");
		vo.setPrice(35200);
		vo.setCode("book-1111");
		 vo.setTotal(250);
		 vo.setHave(vo.total);

		HwsVO vo2 = new HwsVO();
		vo2.setNum(2);
		vo2.setType("����");
		vo2.setTitle("������ ����");
		vo2.setPrice(20000);
		vo2.setCode("book-2222");
		 vo2.setTotal(0);
		 vo2.setHave(vo2.total);

		HwsVO vo3 = new HwsVO();
		vo3.setNum(3);
		vo3.setType("�ڿ�");
		vo3.setTitle("�ڿ������� ����");
		vo3.setPrice(32300);
		vo3.setCode("book-3333");
		 vo3.setTotal(2);
		 vo3.setHave(vo3.total);

		return new HwsVO[] { vo, vo2, vo3 };
	}
}
