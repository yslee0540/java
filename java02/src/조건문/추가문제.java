package 조건문;

import javax.swing.JOptionPane;

public class 추가문제 {

	public static void main(String[] args) {
		//두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String num1 = JOptionPane.showInputDialog("숫자1");
		String num2 = JOptionPane.showInputDialog("숫자2");
		String data = JOptionPane.showInputDialog("연산자");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		switch (data) {
		case "+":
			System.out.println(num11 + num22);
			break;
		case "-":
			System.out.println(num11 - num22);
			break;
		case "*":
			System.out.println(num11 * num22);
			break;
		case "/":
			System.out.println(num11 / num22);
			break;
		default:
			break;
		}
		
		//두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력
		String num3 = JOptionPane.showInputDialog("숫자1");
		String num4 = JOptionPane.showInputDialog("숫자2");
		
		int num33 = Integer.parseInt(num3);
		int num44 = Integer.parseInt(num4);
		
		double result = num33 / (double)num44;
		System.out.printf("결과는 %.2f" , result);
		
	}

}
