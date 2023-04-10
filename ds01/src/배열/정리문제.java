package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);
		int[] n1 = new int[5];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = sc.nextInt();
		}
		
		int min = n1[0];
		for (int x : n1) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최소값: " + min);
		
		//2
		Random r = new Random(5);
		int[] n2 = new int[20];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextInt(900);
		}
		
		Arrays.sort(n2);
		System.out.println("최대값: " + n2[n2.length - 1]);
		
		//3
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.print(s1.equals(s2));
		if (s1.length() > s2.length()) {
			System.out.println(" s1이 더 크다.");
		} else {
			System.out.println(" s2가 더 크다.");
		}
		
		//4
		String s3 = "나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6, 21).toUpperCase());
		
		//5
		String s4 = "2056521";
		String s41 = s4.substring(0);
		if (s41.equals("1")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//6
		String s5 = "[10, 20, 50, 40, 30]";
		String s51 = s5.replace("[", "");
		String s52 = s51.replace("]", "");
		String[] s53 = s52.split(", ");
		
		int sum = 0;
		int[] n = new int[5];
		for (int i = 0; i < s53.length; i++) {
			n[i] = Integer.parseInt(s53[i]);
			sum = sum + n[i];
		}
		System.out.println("합계: " + sum);
		
		//7
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));

	}

}
