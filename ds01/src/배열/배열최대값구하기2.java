package 배열;

import java.util.Random;

public class 배열최대값구하기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] s = new int[100];
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);
		}
		
		int max = s[0];
		for (int x : s) {
			x = r.nextInt(1000);
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최대값: " + max);
	}
}