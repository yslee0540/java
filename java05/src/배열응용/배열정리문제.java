package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		int[] num = new int[5];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력  >> ");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.println(num[0] + num[2]);
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum / num.length);
		
		//2
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			System.out.print("문자 입력  >> ");
			data[i] = sc.next();
		}
		System.out.println(data[0] + "보다는 " + data[1]);

	}

}
