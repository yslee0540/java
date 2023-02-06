package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 변수 만들 때 타입 미리 결정
		//선언
		int num = 100; //정수
		double num2 = 20.2; //실수
		char c = 'A'; //글자1글자=>''
		boolean b = true; //false
		
		num = 200; //ok
		//b = 300;
		
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자1개값은 " + c);
		System.out.println("부울렌값은 " + b);
	}

}
