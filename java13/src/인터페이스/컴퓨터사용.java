package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		Computer c1 = new AppleComputer();
		BananaComputer c2 = new BananaComputer();
		c1.유튜브보기();
		c1.게임실행();
		c1.코딩();
		c2.유튜브보기();
		c2.게임실행();
		c2.코딩();

	}

}