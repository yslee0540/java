package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.print("id: ");
		String id = sc.next();
		System.out.print("pw: ");
		String pw = sc.next();
		
		System.out.println("----------");
		if (id.equals("root") && pw.equals("1234")) {
			//System.out.println("로그인 성공!");
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			//System.out.println("로그인 실패!");
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
		
		
		//2
		System.out.print("사과 구매 갯수: ");
		int apple = sc.nextInt();
		System.out.print("사과 한 개당 가격: ");
		int aPrice = sc.nextInt();
		System.out.print("딸기 구매 갯수: ");
		int straw = sc.nextInt();
		System.out.print("딸기 한 개당 가격: ");
		int sPrice = sc.nextInt();
		
		System.out.println("----------");
		int result1 = apple * aPrice;
		System.out.println("사과 구매 가격은 " + result1 + "원 입니다.");
		int result2 = straw * sPrice;
		System.out.println("사과 구매 가격은 " + result2 + "원 입니다.");
		System.out.println("전체 구매 가격은 " + (result1 + result2) + "원 입니다.");
		
		sc.close();
	}

}
