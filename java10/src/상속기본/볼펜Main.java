package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		pen.price = 1000;
		pen.company = "모나미";
		pen.thick = 1;
		System.out.println(pen);
		pen.buy();
		pen.write();

	}

}
