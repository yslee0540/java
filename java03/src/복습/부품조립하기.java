package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 200);
		
		f.getContentPane().setBackground(Color.yellow);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(10);
		
		JButton b = new JButton("GAME");
		
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("궁서", 1, 30);
		l.setFont(font);
		l.setForeground(Color.blue);
		
		text.setFont(font2);
		text.setBackground(Color.lightGray);
		text.setForeground(Color.red);
		
		b.setFont(font);
		b.setBackground(Color.green);
		//b.setForeground(Color.white);
		

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);

	}

}
