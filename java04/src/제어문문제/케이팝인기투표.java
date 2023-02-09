package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 케이팝인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(480, 800);

		JLabel title = new JLabel();
		title.setText("KPOP 인기투표");

		JLabel text1 = new JLabel();
		text1.setText("1. 뉴진스 ");
		JLabel text11 = new JLabel();

		JLabel text2 = new JLabel();
		text2.setText("2. 아이브");
		JLabel text22 = new JLabel();

		JLabel text3 = new JLabel();
		text3.setText("3. 르세라핌");
		JLabel text33 = new JLabel();

		JButton b1 = new JButton();
		b1.setBackground(Color.white);
		b1.addActionListener(new ActionListener() {
			int count = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				text11.setText(count + "표");
				
			}
			
		});
		
		JButton b2 = new JButton();
		b2.setBackground(Color.white);
		b2.addActionListener(new ActionListener() {
			int count = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				text22.setText(count + "표");
				
			}
			
		});
		
		JButton b3 = new JButton();
		b3.setBackground(Color.white);
		b3.addActionListener(new ActionListener() {
			int count = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				text33.setText(count + "표");
				
			}
			
		});

		ImageIcon image1 = new ImageIcon("앨범1.jpg");
		b1.setIcon(image1);
		ImageIcon image2 = new ImageIcon("앨범2.jpg");
		b2.setIcon(image2);
		ImageIcon image3 = new ImageIcon("앨범3.jpg");
		b3.setIcon(image3);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("굴림", 1, 30);
		Font font2 = new Font("D2coding", 1, 20);
		title.setFont(font);
		text1.setFont(font2);
		text11.setFont(font2);
		text2.setFont(font2);
		text22.setFont(font2);
		text3.setFont(font2);
		text33.setFont(font2);
		text11.setForeground(Color.blue);
		text22.setForeground(Color.blue);
		text33.setForeground(Color.blue);

		f.add(title);
		f.add(b1);
		f.add(text1);
		f.add(text11);
		f.add(b2);
		f.add(text2);
		f.add(text22);
		f.add(b3);
		f.add(text3);
		f.add(text33);

		f.setVisible(true);


	}

}
