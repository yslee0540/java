package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null);
		
		//버튼 배열
		JButton[] buttons = new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + i);
		}
		
		//위치지정
		Random r = new Random();
		//컬러배열
		Color[] colors = {Color.yellow, Color.cyan, Color.lightGray, Color.pink, Color.green};
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(900);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			
			int c = r.nextInt(colors.length);
			buttons[i].setBackground(colors[c]);
			f.add(buttons[i]);
		}
		
		//f 배경색
		f.getContentPane().setBackground(Color.white);
		
		f.setVisible(true);
		
		
	}

}
