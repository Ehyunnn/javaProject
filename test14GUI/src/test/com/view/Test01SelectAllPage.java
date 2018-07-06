package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.Test01VO;


public class Test01SelectAllPage extends JFrame {
	
	public Test01SelectAllPage() {
		System.out.println("Test01SelectAllPage....");
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		JButton insertBtn = new JButton("InsertPage");
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked insertBtn");
				new Test01InsertPage();
				dispose();
			}
		});
		
		String[] colNames = new String[] {
			"col1","col2","col3","col4","col5","col6"
		};
		
		ArrayList<Test01VO> vos = Test01HomePage.dao.selectAll();
		String[][] datas = new String[vos.size()][colNames.length];
		
		for (Test01VO vo : vos) {
			System.out.print(vo.getColumn1()+" ");
			System.out.print(vo.getColumn2()+" ");
			System.out.print(vo.getColumn3()+" ");
			System.out.print(vo.getColumn4()+" ");
			System.out.print(vo.getColumn5()+" ");
			System.out.println(vo.getColumn6());
		}
		for (int i = 0; i < datas.length; i++) {
			datas[i] = new String[] {
					String.valueOf(vos.get(i).getColumn1()),
					vos.get(i).getColumn2(),
					vos.get(i).getColumn3(),
					vos.get(i).getColumn4(),
					vos.get(i).getColumn5(),
					vos.get(i).getColumn6()
					};
		}
		
		
		DefaultTableModel model = 
				new DefaultTableModel(datas, colNames);
		JTable table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int rowIndex = table.getSelectedRow();
				System.out.println("table click"+rowIndex);
				int col1 = vos.get(rowIndex).getColumn1();
				System.out.println(col1);
				new Test01SelectOnePage(col1);
			}
		});
		
		con.add(new JScrollPane(table));
		con.add(insertBtn);
		
		setTitle("SelectAllPage");
		setBounds(500, 0, 500, 300);
		setVisible(true);
	}

}