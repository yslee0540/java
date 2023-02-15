package 메서드연습;

public class 계산기3 {
	//메서드 이름을 입력값이 다르면 다 동일하게 써도 된다. -> 다형성(오버로딩)
	public int add(int x, int y) { //매개변수(parameter)
		return x + y;
	}
	public int minus(int x, int y) { //매개변수(parameter)
		return x - y;
	}
	public int mul(int x, int y) { //매개변수(parameter)
		return x * y;
	}
	public int div(int x, int y) { //매개변수(parameter)
		return x / y;
	}

}
