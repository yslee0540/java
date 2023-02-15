package 클래스복습;

public class Car {
	//전역변수
	//성질
	String color; //변수는 선언된 위치가 생존의 위치, 해당 변수를 포함하는 {}안에서 생존 가능
	
	//동작
	public void run() { //메서드 
		//기능을 정의
		System.out.println("부릉부릉 달리다.");
	}
	public void up() {
		System.out.println("미친듯이 속도Up");
	}

}
