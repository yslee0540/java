package 상속응용;

//동시에 실헹시키고 싶은 부픔 Thread 클래스 상속하면 만들어짐
public class 증가스레드 extends Thread{
	
	//동시에 실행될 내용 run()메서드 안에 넣기
	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.println("증가>> " + i);
		}
	}

}
