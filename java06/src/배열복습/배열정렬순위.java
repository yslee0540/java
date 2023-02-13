package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		//정렬 - Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//오름차순(작->큰), 내림차순(큰->작)
		Arrays.sort(jumsu); //오름차순
		//원본이 바뀜(파괴) -> 파괴형 함수
		//parseInt(n) 등 -> 비파괴형 함수
		System.out.println("---------------");
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//최대값, 최소값
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]);
		
		//상위 30%, 인원3000명
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i];
		}
		System.out.println("상위 30% 평균: " + sum30 / 3000.0);
		
		//하위 30%
		int sum0 = 0;
		for (int i = 0; i < 3000; i++) {
			sum0 = sum0 + jumsu[i];
		}
		System.out.println("하위 30% 평균: " + sum0 / 3000.0);
		
		String result = Arrays.toString(jumsu); //비파괴
		System.out.println(result);

	}

}
