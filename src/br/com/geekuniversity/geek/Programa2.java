package br.com.geekuniversity.geek;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Geek University");
		
		JPanel panel = new JPanel();
		
		JButton btn1 = new JButton("Bot�o 1");
		JButton btn2 = new JButton("Bot�o 2");
		JButton btn3 = new JButton("Bot�o 3");
		
		panel.setLayout(new BorderLayout(1,0));
		
		panel.add(btn1, BorderLayout.NORTH);
		panel.add(btn2, BorderLayout.CENTER);
		panel.add(btn3, BorderLayout.SOUTH);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setSize(640, 480);
		frame.setVisible(true);
	}

}
