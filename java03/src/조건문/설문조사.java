package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		int full = 0;
		int noFull = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1)배부름 2)안배부름");
			if (data.equals("1")) {
				full++; //full = full + 1;
			} else if (data.equals("2")) {
				noFull++;
			} else {
				i--;
			}
		}//for
		System.out.println("배부른 사람: " + full + "명");
		System.out.println("안배부른 사람: " + noFull + "명");
	}

}
