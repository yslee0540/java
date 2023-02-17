package 확인문제;

public class 이미지스레드 extends Thread {
	
	@Override
	public void run() {
		String[] images = {"이미지1", "이미지2", "이미지3", "이미지4", "이미지5"};
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < images.length; j++) {
				System.out.println("이미지: " + images[j]);
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
					System.out.println("cpu 문제 발생");
				} 
			}
		}
	}

}
