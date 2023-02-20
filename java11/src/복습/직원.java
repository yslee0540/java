package 복습;

public class 직원 {
	public String name; //같은+다른 패키지
	String address; //같은 패키지
	protected int salary; //같은+다른(상속만) 패키지
	private int rrn; //클래스 안에서만
	
	public int getRrn() {
		return rrn;
	}

}
