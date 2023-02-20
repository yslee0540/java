package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{

	public static void main(String[] args) {
		new CarGame();
	}
	
	public CarGame() {
		setTitle("자동차경주게임");
		setSize(800, 400);
		setLayout(null);
		
		MyThread car1 = new MyThread("car01.png", 50, 0);
		MyThread car2 = new MyThread("car02.png", 50, 100);
		MyThread car3 = new MyThread("car03.png", 50, 200);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class MyThread extends Thread {
		int x, y;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 145, 90);
			add(label);
		}
		
		@Override
		public void run() {
			//모든 스레드 같음(오른쪽으로 움직임)
			Random r = new Random();
			for (int i = 0; i < 25; i++) {
				int move = r.nextInt(50);
				x = x + move;
				System.out.println(x);
				label.setBounds(x, y, 145, 90);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
