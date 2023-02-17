package 확인문제;

public class 카운트스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 200; i > 0; i--) {
			System.out.println("카운트: " + i + "/200");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("cpu 문제 발생");
			}
		}
	}

}
