package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] tour1 = new String[3]; //작년
		String[] tour2 = new String[3]; //올해
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 >> ");
			tour1[i] = sc.next();
		}
		for (String x : tour1) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		for (int i = 0; i < tour2.length; i++) {
			System.out.print("올해에 가고 싶었던 곳 >> ");
			tour2[i] = sc.next();
		}
		for (String x : tour2) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		int count = 0; //우선순위 동일한 곳
		for (int i = 0; i < tour2.length; i++) {
			if (tour1[i].equals(tour2[i])) {
				count++;
			}
		}
		System.out.println("우선순위 동일한 곳: " + count + "곳");

	}

}
