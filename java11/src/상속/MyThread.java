package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread {
	int x, y;
	JLabel label;
	
	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label.setIcon(icon);
		label.setBounds(x, y, 145, 90);
	}
	
	@Override
	public void run() {
		//모든 스레드 같음(오른쪽으로 움직임)
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50);
			x = x + move;
			label.setBounds(x, y, 145, 90);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
