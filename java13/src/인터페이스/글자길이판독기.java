package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("글자 길이 판독기");
		f.setSize(450, 450);
		f.setLayout(new FlowLayout());
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		Font font2 = new Font("맑은 고딕", Font.PLAIN, 20);
		
		JLabel l1 = new JLabel("글자수: ");
		JLabel l2 = new JLabel();
		l1.setFont(font);
		l2.setFont(font);
		
		JTextArea area = new JTextArea(10, 20);
		area.setFont(font2);
		
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("pad color");
		JButton b3 = new JButton("text color");
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				l2.setText(text.length() + "");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			Random ran = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = ran.nextInt(256);
				int g = ran.nextInt(256);
				int b = ran.nextInt(256);
				area.setBackground(new Color(r, g, b));
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.white);
			}
		});
		
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
