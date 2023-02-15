package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	static int index = 2;

	public static void main(String[] args) {
		String[] title = {"아바타2", "영웅", "타이타닉", "암살", "클래식"};
		String[] img = {"001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg"};
		double[] jumsu = {8.82, 8.43, 9.72, 8.98, 9.45};
		
		JFrame f = new JFrame();
		f.setSize(670, 847);
		f.getContentPane().setBackground(Color.orange);
		Font font = new Font("맑은 고딕", 1, 30);
		
		JLabel top = new JLabel(title[index]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		//top.setForeground(Color.blue);
		f.add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon(img[index]);
		center.setIcon(icon);
		center.setBackground(Color.yellow);
		f.add(center, BorderLayout.CENTER);
		
		//String.valueOf(): String으로 바꿈
		JLabel under = new JLabel("평점: " + jumsu[index]);
		under.setFont(font);
		under.setHorizontalAlignment(0);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("<<");
		left.setFont(font);
		left.setBackground(Color.yellow);
		left.setBorderPainted(false);
		f.add(left, BorderLayout.WEST);
		
		JButton right = new JButton(">>");
		right.setFont(font);
		right.setBackground(Color.yellow);
		right.setBorderPainted(false);
		f.add(right, BorderLayout.EAST);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					index--;
					top.setText(title[index]);
					under.setText("평점: " + jumsu[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "왼쪽 끝입니다.");
				}
				
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					index++;
					top.setText(title[index]);
					under.setText("평점: " + jumsu[index]);
					ImageIcon icon = new ImageIcon(img[index]);
					center.setIcon(icon);
				} else if (index == 4){
					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
				}
				
			}
			
//				if (index > 0) {
//					movietitle.setText(title[index - 1]);
//					jumsulabel.setText("평점 : " + jumsu[index - 1]);
//					ImageIcon icon1 = new ImageIcon(img[index - 1]);
//					imglabel.setIcon(icon1);
//					index = index - 1;
//				} else {
//					index = 4;
//					// 여기에도 변동되는 텍스트 및 이미지 값 넣어주셔야 되요!
//					movietitle.setText(title[index]);
//					jumsulabel.setText("평점 : " + jumsu[index]);
//					ImageIcon icon1 = new ImageIcon(img[index]);
//					imglabel.setIcon(icon1);
//				}
			
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
