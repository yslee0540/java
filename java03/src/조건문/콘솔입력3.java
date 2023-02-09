package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String name = sc.next();
		
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		
		System.out.print("나의 좌우명은? ");
		sc.nextLine();
		String data = sc.nextLine();
		
		
		System.out.println("-----------");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (height + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		if (dinner) {
			System.out.println("배가 부르시겠군요.");
		} else {
			System.out.println("배가 고프시겠군요.");
		}
		//System.out.println("나는 저녁을 " + dinner + "입니다.");
		System.out.println("나의 좌우명은 " + data + "입니다.");
		
		sc.close();
	}

}
