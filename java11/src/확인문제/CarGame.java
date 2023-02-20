package 확인문제;

import java.awt.Font;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	JLabel count, timer;

	public static void main(String[] args) {
		new CarGame();
	}

	public CarGame() {
		setTitle("자동차경주게임");
		setSize(800, 400);
		setLayout(null);
		Font font = new Font("맑은 고딕", Font.BOLD, 25);

		timer = new JLabel("타이머");
		timer.setFont(font);
		timer.setBounds(200, 300, 400, 50);
		add(timer);
		
		count = new JLabel("카운트");
		count.setFont(font);
		count.setBounds(200, 250, 400, 50);
		add(count);

		타이머스레드 timer2 = new 타이머스레드();
		timer2.start();
		
		카운트스레드 count2 = new 카운트스레드();
		count2.start();

		MyThread car1 = new MyThread("car01.png", 50, 0);
		MyThread car2 = new MyThread("car02.png", 50, 100);

		car1.start();
		car2.start();

		setVisible(true);
	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label;

		public MyThread(String image, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(image);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 145, 90);
			add(label);
		}

		@Override
		public void run() {
			// 모든 스레드 같음(오른쪽으로 움직임)
			Random r = new Random();
			for (int i = 0; i < 20; i++) {
				int move = r.nextInt(60);
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

	public class 카운트스레드 extends Thread {

		@Override
		public void run() {
			for (int i = 1; i <= 20; i++) {
				count.setText("카운트>> " + i + "/20");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public class 타이머스레드 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText("" + date);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
