package 메서드연습;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 드라마 {
	static int index = 0;
	static int count = 0;

	public static void main(String[] args) {
		String[] title = {"더글로리", "비밀의 숲", "라이프 온 마스"};
		String[] img = {"드라마1.jpg", "드라마2.jpg", "드라마3.jpg"};
		int[] year = {2022, 2017, 2018};
		
		JFrame f = new JFrame();
		f.setSize(900, 900);
		f.getContentPane().setBackground(Color.white);
		Font font = new Font("맑은 고딕", 1, 25);
		f.setTitle("좋아하는 드라마 목록");
		
		JLabel top = new JLabel();
		top.setFont(font);
		top.setBounds(200, 10, 400, 50);
		f.add(top);
		
		f.setLayout(null);
		JLabel center = new JLabel();
		center.setBackground(Color.yellow);
		center.setBounds(20, 20, 500, 800);
		f.add(center);
		
		JLabel under = new JLabel();
		under.setFont(font);
		under.setHorizontalAlignment(0);
		under.setBounds(100, 780, 400, 50);
		f.add(under);

		JButton score = new JButton("내 점수(클릭시 1 증가)");
		score.setBackground(Color.pink);
		score.setFont(font);
		score.setBounds(550, 400, 310, 50);
		f.add(score);
		
		JTextField score1 = new JTextField(10);
		score1.setFont(font);
		score1.setBackground(Color.lightGray);
		score1.setBounds(550, 450, 310, 50);
		f.add(score1);
		
		JButton save = new JButton("확인");
		save.setBackground(Color.white);
		save.setFont(font);
		save.setBounds(550, 500, 310, 50);
		f.add(save);
		
		JLabel save1 = new JLabel();
		save1.setFont(font);
		save1.setForeground(Color.blue);
		save1.setBounds(550, 550, 310, 50);
		f.add(save1);
		
		JButton[] right = new JButton[3];
		for (index = 0; index < right.length; index++) {
			right[index] = new JButton(title[index]);
			right[index].setBackground(Color.yellow);
			right[index].setFont(font);
			right[index].setBounds(550, 100 * (index + 1), 260, 50);
			
			f.add(right[index]);
			
		}
		right[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				score1.setText("0");
				top.setText(title[0]);
				ImageIcon icon = new ImageIcon(img[0]);
				center.setIcon(icon);
				under.setText("방영 연도: " + year[0]);
				save1.setText("");
			}
		});
		right[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				score1.setText("0");
				top.setText(title[1]);
				ImageIcon icon = new ImageIcon(img[1]);
				center.setIcon(icon);
				under.setText("방영 연도: " + year[1]);
				save1.setText("");
			}
		});
		right[2].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				score1.setText("0");
				top.setText(title[2]);
				ImageIcon icon = new ImageIcon(img[2]);
				center.setIcon(icon);
				under.setText("방영 연도: " + year[2]);
				save1.setText("");
			}
		});
		
		score.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if (count >= 10) {
					count = 10;
				}
				score1.setText(count + "");
			}
		});
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				save1.setText(score1.getText() + "점");
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
