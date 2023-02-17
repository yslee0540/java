package 확인문제;

import java.util.Date;

public class 타이머스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println("현재 시간: " + date);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 문제 발생");
			}
		}
	}

}
