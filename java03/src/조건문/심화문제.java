package 조건문;

import java.util.Scanner;

public class 심화문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 시작값, 종료값 입력
		// 시작값부터 종료값까지 모두 더해서 출력
		System.out.print("시작값: ");
		int num1 = sc.nextInt();
		System.out.print("종료: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("총 합: " + sum);
		
		// 시작값, 종료값, 점프값 입력
	    // 시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
	    // 더한 값이 100을 넘으면 프로그램 종료
		System.out.print("시작값: ");
		int start = sc.nextInt();
		System.out.print("종료값: ");
		int end = sc.nextInt();
		System.out.print("점프값: ");
		int jump = sc.nextInt();
		
		int sum2 = 0;
		for (int i = start; i <= end; i = i + jump) {
			sum2 = sum2 + i;
			if (sum2 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("총 합: " + sum2);
		
		sc.close();
	}

}
