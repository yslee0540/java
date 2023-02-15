package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전에 온 손님 수
		int count2 = 4; //오후에 온 손님 수
		
		//전체 손님 수
		int totalCount = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + totalCount + "명 입니다.");
		
		//오전과 오후 손님수 차이
		int minus = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + Math.abs(minus) + "명 입니다.");
		
		//오전 손님 결제 금액
		int price1 = cal3.mul(price, count1);
		System.out.println("오전 결제금액은 " + price1 + "원 입니다.");
		
		//오후 손님 결제 금액
		int price2 = cal3.mul(price, count2);
		System.out.println("오후 결제금액은 " + price2 + "원 입니다.");
		
		//오전,오후 손님 결제 금액
		int price3 = cal3.add(price1, price2);
		System.out.println("오늘 하루 총 결제금액은 " + price3 + "원 입니다.");
		
		//1인당 결제금액
		int price4 = cal3.div(price3, totalCount);
		System.out.println("1인당 결제금액은 " + price4 + "원 입니다.");
		
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(3.334));
		System.out.println(Math.floor(3.334));
		System.out.println(Math.round(3.334));
		System.out.println(Math.round(3.534));
		System.out.println(Math.sqrt(100)); //루트
		System.out.println(Math.max(100, 200)); 
		System.out.println(Math.min(100, 200)); 
		System.out.println(Math.pow(2, 3)); //2의 3승
	}

}
