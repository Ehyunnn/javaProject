package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.com.model.Test01VO;

public class Test01SelectOnePage extends JFrame {
	
	public Test01SelectOnePage() {}
	public Test01SelectOnePage(int col1) {
		
		Test01VO vo = new Test01VO();
		vo.setColumn1(col1);
		Test01VO vo2 = Test01HomePage.dao.selectOne(vo);
		System.out.print(vo2.getColumn1()+" ");
		System.out.print(vo2.getColumn2()+" ");
		System.out.print(vo2.getColumn3()+" ");
		System.out.print(vo2.getColumn4()+" ");
		System.out.print(vo2.getColumn5()+" ");
		System.out.print(vo2.getColumn6());

		
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(7, 2));
		
		
		final JLabel jt_col1 = new JLabel(String.valueOf(vo.getColumn1()) );
		final JTextField jt_col2 = new JTextField(vo2.getColumn2());
		final JTextField jt_col3 = new JTextField(vo2.getColumn3());
		final JTextField jt_col4 = new JTextField(vo2.getColumn4());
		final JTextField jt_col5 = new JTextField(vo2.getColumn5());
		final JTextField jt_col6 = new JTextField(vo2.getColumn6());
		
		
		
		JButton updateBtn = new JButton("updateOK");
		updateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked okBtn");
				System.out.println(jt_col2.getText());
				System.out.println(jt_col3.getText());
				System.out.println(jt_col4.getText());
				System.out.println(jt_col5.getText());
				System.out.println(jt_col6.getText());
				Test01VO vo1 = new Test01VO();
				vo1.setColumn1(col1);
				vo1.setColumn2(jt_col2.getText());
				vo1.setColumn3(jt_col3.getText());
				vo1.setColumn4(jt_col4.getText());
				vo1.setColumn5(jt_col5.getText());
				vo1.setColumn6(jt_col6.getText());

				int result = Test01HomePage.dao.update(vo1);
				System.out.println("result:" + result);
				if (result == 1) {
					System.out.println("입력성공");
					dispose();
					new Test01SelectAllPage();
				} else {
					System.out.println("입력실패");
				}

			}
		});
		
		JButton deleteBtn = new JButton("DeletePage");
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked deleteBtn");
				new Test01DeletePage(col1);
			}
		});
		
		
		
		
//		DefaultTableModel model = 
//				new DefaultTableModel(datas, colNames);
//		JTable table = new JTable(model);
//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				int rowIndex = table.getSelectedRow();
//				System.out.println("table click"+rowIndex);
//				int col1 = vos.get(rowIndex).getColumn1();
//				System.out.println(col1);
//				new Test01SelectOnePage(col1);
//			}
//		});
		
		
		
		con.add(new JLabel("col1"));
		con.add(jt_col1);
		con.add(new JLabel("col2"));
		con.add(jt_col2);
		con.add(new JLabel("col3"));
		con.add(jt_col3);
		con.add(new JLabel("col4"));
		con.add(jt_col4);
		con.add(new JLabel("col5"));
		con.add(jt_col5);
		con.add(new JLabel("col6"));
		con.add(jt_col6);
		con.add(updateBtn);
		con.add(deleteBtn);

		
		
		
		
		
		
		setTitle("SelectOnePage");
		setBounds(0, 300, 250, 350);
		setVisible(true);
	}

}

