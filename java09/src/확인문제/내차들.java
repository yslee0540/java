package 확인문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck c = new CoffeeTruck();
		c.color = "white";
		c.size = "크다";
		c.price = 2500;
		c.run();
		c.use();
		c.coffee();
		System.out.println(c);
		System.out.println("커피 가격: " + c.price);

	}

}
