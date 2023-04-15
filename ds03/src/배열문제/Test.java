package 배열문제;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5 };
		int[] sub1 = Arrays.copyOfRange(list, 1, 3);
		System.out.println(Arrays.toString(sub1));
	}

}
