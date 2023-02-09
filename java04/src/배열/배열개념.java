package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		//1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40};
		System.out.println(jumsu); //주소
		System.out.println(jumsu[0]); //첫번째값
		System.out.println(jumsu[1]); //두번째값
		System.out.println(jumsu[2]); //세번째값
		System.out.println(jumsu[3]); //네번째값
		System.out.println("전체 개수 : " + jumsu.length); //length
		
		jumsu[0] = 100; //첫번째값으로 100 넣기
		System.out.println(jumsu[0]);
		
		//2. 값을 아직 모르는데 먼저 저장공간 만들고 나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
		
	}

}
