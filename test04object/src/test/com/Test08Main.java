package test.com;

public class Test08Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test08Board board = new Test08Board();// 게시글정보에 대한 object
		System.out.println(board);
		board.num = 1;
		board.title = "java";
		board.content = "object study";
		board.name = "kim";
		System.out.println(board.num);
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.name);

		Test08BoardSave bs = new Test08BoardSave(board);
		// bs.save();

		
		Test08BoardSave bs2 = new Test08BoardSave();
		bs2.sus = new int[] {11,22,33,44,55,66};
//		System.out.println(bs2.sus.length); //배열의 크기가 잘 되었는지 확인해보는 것일 뿐!
//		System.out.println(bs2.sus[0]);
//		System.out.println(bs2.sus[1]);
//		System.out.println(bs2.sus[2]);
//		System.out.println(bs2.sus[3]);
//		System.out.println(bs2.sus[4]);
//		System.out.println(bs2.sus[5]);
		
		for (int i = 0; i < bs2.sus.length; i++) {
			System.out.println(bs2.sus[i]);
		}
		
		//bs2.sum();
		
		
		Test08Board[] boards = new Test08Board[2];//null,null
		boards[0]=new Test08Board();
		boards[0].num=1;
		boards[0].title="java";
		boards[0].content="java study";
		boards[0].name="kim";
		boards[1]=new Test08Board();
		boards[1].num=20;
		boards[1].title="android";
		boards[1].content="android study";
		boards[1].name="hong";

		Test08BoardSave bs3 = new Test08BoardSave(boards);
		System.out.println(bs3.boards.length);
		System.out.println(bs3.boards);
		System.out.println(bs3.boards[0].num);
		System.out.println(bs3.boards[0].title);
		System.out.println(bs3.boards[0].content);
		System.out.println(bs3.boards[0].name);

		System.out.println(bs3.boards[1]);
		System.out.println(bs3.boards[1].num);
		System.out.println(bs3.boards[1].title);
		System.out.println(bs3.boards[1].content);
		System.out.println(bs3.boards[1].name);
		
		
	}

}
