package 조건문;

import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		//1
		String pw = JOptionPane.showInputDialog("암호를 대시오.");
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		//2
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는? (자장면, 라면, 회)");
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (food.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}
		
		//3
		String num1 = JOptionPane.showInputDialog("숫자 1을 입력하세요.");
		String num2 = JOptionPane.showInputDialog("숫자 2를 입력하세요.");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11 > num22) {
			System.out.println("숫자1 " + num11);
		} else if (num11 < num22) {
			System.out.println("숫자2 " + num22);
		} else {
			
		}
		
		//4
		String no = "A100EX";
		char no1 = no.charAt(0);
		switch (no1) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
		}
		
	}

}
