package 제어문문제;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1 = 0; //아이유
		int data2 = 0; //방탄
		int data3 = 0; //뉴진스
		int count = 0; //총 투표 수

		System.out.println("인기투표 시스템\n===============");
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			int result = sc.nextInt();
			if (result == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (result == 1) {
				data1++;
				count++;
			} else if (result == 2) {
				data2++;
				count++;
			} else if (result == 3) {
				data3++;
				count++;
			} else {
				System.out.println("해당 번호가 없습니다.");
			}
		}
		sc.close();

		System.out.println("---------------");
		System.out.println("총 투표 수 " + count + "표");
		System.out.println("아이유 " + data1 + "표");
		System.out.println("방탄 " + data2 + "표");
		System.out.println("뉴진스 " + data3 + "표");

	}
}
