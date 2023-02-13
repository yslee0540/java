package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {
	
	public static void main(String[] args) {
		//배열에는 참조형도 가능
		//정수, 실수, 문자1, 논리  + String, Jbutton, ...
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		//f.getContentPane().setBackground(Color.yellow);
		
		//버튼200개
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}
		
		//위치, 크기지정
		f.setLayout(null); //조립해서 넣을 부품의 주소가 램에 없음
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1100);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(Color.cyan);
			f.add(buttons[i]);
		}
		
		f.setVisible(true);
		
	}

}
