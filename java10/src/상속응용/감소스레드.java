package 상속응용;

//동시에 실헹시키고 싶은 부픔 Thread 클래스 상속하면 만들어짐
public class 감소스레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 50000; i > 0; i--) {
			System.out.println("감소>> " + i);
		}
	}

}
