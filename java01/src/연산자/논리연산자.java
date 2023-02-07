package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적 판단, 조건 2개 이상
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 = 3333;
		
		System.out.println("아이디 비교 " + (id == id2));
		System.out.println("패스워드 비교 " + (pw == pw2));
		//&& - and조건
		System.out.println(id == id2 && pw == pw2);

		int mem1 = 111;
		int mem2 = 223;
		//|| - or조건
		System.out.println(mem1 == 111 || mem2 == 222);
		 
	}

}
