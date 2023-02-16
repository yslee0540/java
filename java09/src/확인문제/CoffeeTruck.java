package 확인문제;

public class CoffeeTruck extends Truck {
	int price;
	
	public void coffee() {
		System.out.println("커피를 판매하다.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [color=" + color + ", size=" + size + "]";
	}

}
