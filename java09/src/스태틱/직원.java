package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
	
	//객체 생성 안하고 클래스 이름으로 바로 접근해서 아무때나 원할 때 사용하고 싶은 경우
	//static 메서드 사용
	public static void getAvg() {
		//static메서드에서 전역변수를 접근할 때는 같은 성격을 가진 static변수만 접근이 가능
		//System.out.println(name);
		System.out.println(sum / count);
	}
	
	public 직원(String name, int age, String gender) {
		count++;
		sum = sum + age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
