package 생성자;

public class 통장 {
	String name;
	String ssn;
	int money;
	
	//단축키 : alt + shift + S + 화살표 위로위로
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
}
