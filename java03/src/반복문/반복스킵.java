package 반복문;

public class 반복스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중 짝수만 프린트
		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				//break;
				System.exit(0);
			}
			if (i % 2 != 0) {
				continue; //이번 i만 for문 안의 내용 실행X
			}
			System.out.println(i);
		}
		System.out.println("for문 끝");
	}

}
