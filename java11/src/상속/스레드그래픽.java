package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame{
	JLabel count, image, time;

	public static void main(String[] args) {
		new 스레드그래픽();
		//객체생성시 클래스 이름과 동일한 메서드 자동호출->생성자 메서드
	}
	
	//static 없는 메서드 만들기
	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(600, 300);
		getContentPane().setBackground(Color.orange);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		
		count = new JLabel("카운터");
		count.setFont(font);
		ImageIcon icon = new ImageIcon("1.png");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);
		
		//스레드 객체 3개 만들어서 start
		카운트스레드2 count2 = new 카운트스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 timer2 = new 타이머스레드2();
		
		count2.start();
		image2.start();
		timer2.start();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//내부클래스(inner class)->전역변수 공유 목적
	//전역변수를 공유할 수는 있지만 내부클래스가 독립적으로 사용 불가능
	public class 카운트스레드2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> " + i + "  ");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {
		
		@Override
		public void run() {
			String[] images = {
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
			};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText("" + date);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
		}
	}

}
