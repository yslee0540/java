package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		//입력을 여러번 받아서 저장공간에 넣고 싶을 때 배열 사용
		//int[] jumsu = {100, 200, 300, 400, 500};
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			jumsu[i] = Integer.parseInt(data);
		}
		
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//1
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("합계: " + sum);
		double avg = (double)sum / jumsu.length;
		System.out.println("평균: " + avg);
		
		//2
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300){
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 합계: " + sum2);
		
		//3
		System.out.print("300이상 index: ");
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300){
				System.out.print(i + " ");
			}
		}
	}

}
