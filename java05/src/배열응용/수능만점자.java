package 배열응용;

import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}
		//1
		int count = 0; //maxCount
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				count++;
				System.out.println("만점자 번호: " + i);
			}
		}
		System.out.println("만점자 수: " + count);
		
		//2
		int count2 = 0;
		for (int x : jumsu) {
			if (x == 0) {
				count2++;
			}
		}
		System.out.println("0점자 수: " + count2);
		
		//3
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		double avg = (double)sum / jumsu.length;
		System.out.println("평균: " + avg);
		
		//4
		int count3 = 0;
		for (int x : jumsu) {
			if ((avg - 50 <= x) && (x <= avg + 50)) {
				count3++;
			}
		}
		System.out.println("평균보다 +-50점인 학생 수: " + count3);
		
		
	}

}
