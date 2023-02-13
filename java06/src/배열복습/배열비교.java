package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		//입력: 많은 양의 저장공간(배열 2개) 필요
		int[] 답안지 = new int[9900];
		int[] 내답안 = new int[9900];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		
		Random r = new Random(42);
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4)+1;	
			내답안[i] = r.nextInt(4)+1;
		}
		System.out.println("번호\t답안\t내답");
		System.out.println("--------------------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + ": \t" + 답안지[i] + "  <-> \t" + 내답안[i]);
		}
		
		//처리 - 동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				jumsu++;
			}
		}
		
		//출력
		System.out.println("점수: " + jumsu + "점");

	}

}
