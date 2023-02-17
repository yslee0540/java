package 상속응용;

public class 기호스레드사용 {

	public static void main(String[] args) {
		$스레드 t1 = new $스레드();
		골뱅이스레드 t2 = new 골뱅이스레드();
		and스레드 t3 = new and스레드();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
