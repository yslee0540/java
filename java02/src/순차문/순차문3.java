package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		//입력
		String height = JOptionPane.showInputDialog("키를 입력하세요.");
		String weight = JOptionPane.showInputDialog("체중을 입력하세요.");
		
		//처리
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		
		double result = weight1 / (height1 * height1) * 10000;
		double result2 = (height1 - weight1) * 0.9;
		
		//출력
		System.out.println(result);
		System.out.println(result2);
		
		JOptionPane.showMessageDialog(null, result2);
	}

}
