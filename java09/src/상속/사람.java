package 상속;

public class 사람 extends Object{ //extends~ 생략가능
	//사람의 기본적인 성질
	String name;
	int age;
	
	//사람의 동작
	public void eat() {
		System.out.println("먹다");
	}
	public void sleep() {
		System.out.println("잠자다");
	}
	
	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
	
}
