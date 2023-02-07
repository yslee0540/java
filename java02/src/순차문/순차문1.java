package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//입력
		String data1 = JOptionPane.showInputDialog("당신의 취미는?");
		String data2 = JOptionPane.showInputDialog("언제 하시나요?");
		
		//처리
		//+연산자: 더해지는 데이터가 하나라도 String이면 결과는 무조건 String
		String result = data2 + "에 " + data1 + "을 하시는군요";
		
		//출력
		System.out.println(result);
	}

}
