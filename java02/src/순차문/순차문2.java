package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//입력
		//입력한 값 무조건 String으로 인식
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
		//처리
		//String을 int로 변경
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		
		//출력
		System.out.println(result);
		System.out.println(result2);
	}

}
