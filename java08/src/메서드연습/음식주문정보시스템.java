package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문정보시스템 {
	
	static int count;
	final static int PRICE = 5000; //final 변경불가, 상수(대문자)

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(600, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("맑은 고딕", 1, 20);
		Font font2 = new Font("맑은 고딕", 1, 25);
		f.getContentPane().setBackground(Color.orange);
		
		JButton food1 = new JButton("짬뽕");
		food1.setFont(font);
		food1.setBackground(Color.yellow);
		JButton food2 = new JButton("짜장");
		food2.setFont(font);
		food2.setBackground(Color.green);
		JButton food3 = new JButton("우동");
		food3.setFont(font);
		food3.setBackground(Color.pink);
		
		JLabel img1 = new JLabel();
		ImageIcon icon = new ImageIcon("image.png");
		img1.setIcon(icon);
		
		JTextField text2 = new JTextField(10);
		text2.setText(count + "개");
		text2.setFont(font);
		
		JLabel text1 = new JLabel("  개수: ");
		text1.setFont(font);
		
		JLabel price = new JLabel("결제 금액:  원");
		price.setFont(font2);
		
		food1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img1.setIcon(icon);
				count++;
				text2.setText(count + "개");
				price.setText("결제 금액: " + count * PRICE + "원");
			}
		});
		food2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장.png");
				img1.setIcon(icon);
				count++;
				text2.setText(count + "개");
				price.setText("결제 금액: " + count * PRICE + "원");
			}
		});
		food3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.png");
				img1.setIcon(icon);
				count++;
				text2.setText(count + "개");
				price.setText("결제 금액: " + count * PRICE + "원");
			}
		});
		
		
		
		f.add(food1);
		f.add(food2);
		f.add(food3);
		f.add(text1);
		f.add(text2);
		f.add(img1);
		f.add(price);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
