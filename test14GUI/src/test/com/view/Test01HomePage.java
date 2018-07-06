package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import test.com.model.Test01DAO;
import test.com.model.Test01DAOimpl;

public class Test01HomePage extends JFrame {
	static Test01DAO dao = new Test01DAOimpl();

	public Test01HomePage() {
		System.out.println("Test01HomePage.....");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		JButton insertBtn = new JButton("InsertPage");
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked insertBtn");
				new Test01InsertPage();
			}
		});
		
		JButton selectBtn = new JButton("SelectAllPage");
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked selectBtn");
				new Test01SelectAllPage();
			}
		});
		
		con.add(insertBtn);
		con.add(selectBtn);
		
		setTitle("HomePage");
		setBounds(0, 0, 250, 300);
		setVisible(true);
		
	}
}
