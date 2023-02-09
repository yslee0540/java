package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		int iu = 0;
		int njs = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 1)아이유 2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				njs++;
			} else if (data.equals("3")) {
				bts++;
			}
			
		}
		System.out.println("아이유: " + iu + "명");
		System.out.println("뉴진스: " + njs + "명");
		System.out.println("BTS: " + bts + "명");
		
	}

}
