package 상속응용;

public class 카운트스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			//cpu에게 스레드 쉬는 시간 텀을 알려줌
			//스레드를 잠깐 재울 수 있음
			//외부자원 연결(위험한 상황)->문제가 생기면 어떻게 할지 코드 작성
			try {
				Thread.sleep(2000); //ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}

}
