package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		Random r = new Random(); //씨앗값, seed
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(45) + 1));
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("번호1 : " + (r.nextInt(9) + 2));
		}
		
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.println("번호2 : " + (r.nextInt(28) + 3));
		}

	}

}
