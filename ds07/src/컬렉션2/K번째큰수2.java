package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수: ");
		int size = sc.nextInt(); //입력할 개수, 5
		System.out.print("k: ");
		int k = sc.nextInt(); //3
		int[] num = new int[size]; //3 4 5 1 2
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		System.out.println(k + "번째 큰 수: " + num[num.length - k]);

	}

}
