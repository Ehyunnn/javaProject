package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.Test01VO;

public class Test01DeletePage extends JFrame {

	public Test01DeletePage(int col1) {
		System.out.println("Test01DeletePage....");
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 2));

		final JLabel jt_col1 = new JLabel("정말삭제");

		JButton okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked okBtn");

				Test01VO vo = new Test01VO();
				vo.setColumn1(col1);
				
				int result = Test01HomePage.dao.delete(vo);
				System.out.println("result:" + result);
				if (result == 1) {
					System.out.println("삭제성공");
					new Test01SelectAllPage();
				} else {
					System.out.println("삭제실패");
				}

			}
		});

		JButton canceltBtn = new JButton("cancel");
		canceltBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked canceltBtn");
				dispose();
			}
		});

		con.add(new JLabel(String.valueOf(col1)));
		con.add(jt_col1);

		con.add(okBtn);
		con.add(canceltBtn);

		setTitle("DeletePage");
		setBounds(250, 0, 250, 300);
		setVisible(true);

	}
}
