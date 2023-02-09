package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		double n33 = Double.parseDouble(n2);
		
		System.out.println((double)n11 / n22);
		System.out.printf("%.2f" , n11 / n33);

	}

}
