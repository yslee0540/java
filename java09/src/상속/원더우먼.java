package 상속;

public class 원더우먼 extends 우먼 {
	
	public void use() {
		System.out.println("이름은 " + name);
		System.out.println("장비를 사용하다");
	}
	
	@Override
	public void eat() {
		System.out.println("조금 먹다");
	}

	@Override
	public String toString() {
		return "원더우먼 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
