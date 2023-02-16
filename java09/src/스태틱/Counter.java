package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(350, 350);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font1 = new Font("D2Coding", Font.BOLD, 150);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 15);
		Color c1 = new Color(255, 253, 208);
		f.getContentPane().setBackground(c1);
		
		JButton add = new JButton("1 더하기");
		add.setFont(font2);
		add.setBackground(Color.green);
		JButton minus = new JButton("1 빼기");
		minus.setFont(font2);
		minus.setBackground(Color.green);
		JButton reset = new JButton("0으로 초기화");
		reset.setFont(font2);
		reset.setBackground(Color.cyan);
		
		JLabel num = new JLabel("0");
		num.setFont(font1);
		num.setForeground(Color.magenta);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				num.setText(count + "");
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				num.setText(count + "");
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				num.setText(count + "");
			}
		});
		
		f.add(add);
		f.add(reset);
		f.add(minus);
		f.add(num);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
