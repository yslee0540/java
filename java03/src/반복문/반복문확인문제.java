package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(280, 350);

		f.getContentPane().setBackground(Color.yellow);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("별 10개");
		JButton b2 = new JButton("커피*5");
		JButton b3 = new JButton("커피*우유3");
		JButton b4 = new JButton("1: 짱!");

		// 1)버튼에 액션기능 추가
		// 2)액션처리 어떻게 할지
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ": 짱!");
				}
			}
		});

		Font font = new Font("D2Coding", 1, 30);
		b1.setFont(font);
		b1.setBackground(Color.pink);
		b2.setFont(font);
		b2.setBackground(Color.cyan);
		b3.setFont(font);
		b3.setBackground(Color.pink);
		b4.setFont(font);
		b4.setBackground(Color.cyan);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setVisible(true);

	}

}
