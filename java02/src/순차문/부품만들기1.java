package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {

	public static void main(String[] args) {
		//자주 사용하지 않는 부품
		//new: 틀을 가지고 찍어낼때 사용
		//new JFrame()은 JFrame이라는 틀을 이용해서 부품을 찍어내라
		//만든 부품은 모두 ram에 저장되어야 함(f변수 만들어 JFrame 저장)
		JFrame f = new JFrame();
		f.setSize(450, 200);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel t1 = new JLabel();
		t1.setText("아이디");
		JLabel t2 = new JLabel();
		t2.setText("패스워드");
		
		JTextField i1 = new JTextField(10);
		JTextField i2 = new JTextField(10);
		
		ImageIcon icon1 = new ImageIcon("001.jpg");
		ImageIcon icon2 = new ImageIcon("002.jpg");
		
		Font font = new Font("굴림", 1, 15);
		b1.setFont(font);
		i1.setFont(font);
		t1.setFont(font);
		b2.setFont(font);
		i2.setFont(font);
		t2.setFont(font);
		
		t1.setIcon(icon1);
		t2.setIcon(icon2);
		f.add(t1);
		f.add(i1);
		f.add(b1);
		f.add(t2);
		f.add(i2);
		f.add(b2);
		
		//보여주는 것 맨 끝으로
		f.setVisible(true);
		
	}

}
