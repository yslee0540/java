package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//입력
		String name = JOptionPane.showInputDialog("당신의 이름은?");
 		
		//처리
		String result = "나의 이름은 " + name + "입니다.";
		
		//출력
		System.out.println(result);

	}

}
