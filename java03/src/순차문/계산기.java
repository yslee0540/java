package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel image = new JLabel();
		ImageIcon icon1 = new ImageIcon("계산기.png");
		
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		Font font = new Font("굴림", 1, 35);
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		text1.setBackground(Color.gray);
		text1.setForeground(Color.white);
		text2.setBackground(Color.gray);
		text2.setForeground(Color.white);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b4.setBackground(Color.blue);
		b4.setForeground(Color.white);
		
		image.setIcon(icon1);
		f.add(image);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				String s1 = text1.getText();
				String s2 = text2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = n1 / (double)n2;
				JOptionPane.showMessageDialog(f, String.format("%.3f", result));
			}
		});
		
		f.setVisible(true);

	}

}
