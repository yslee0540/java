package 배열응용;

import java.util.Random;

public class 우리반성적변동2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		
		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}
		
		int count = 0; //동일한 개수 누적
		int count2 = 0; //동일하지 않은 개수 누적
		int count3 = 0; //성적 오른 학생
		int count4 = 0; //성적 떨어진 학생
		
		for (int i = 0; i < n2.length; i++) {
			//System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
				if (n1[i] < n2[i]) {
					count3++;
					System.out.println("2학기 성적이 더 좋은 학생: " + i);
				} else {
					count4++;
					System.out.println("1학기 성적이 더 좋은 학생: " + i);
				}
			}
		}
		System.out.println("1-2학기 성적이 동일한 학생 수>> " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생 수>> " + count2 + "명");
		
		System.out.println("2학기 성적이 더 좋은 학생 수: " + count3);
		System.out.println("1학기 성적이 더 좋은 학생 수: " + count4);
		
		
	}

}
