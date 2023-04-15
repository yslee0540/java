package 배열문제;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers = { 5, 9, 7, 10 };
		int start = 1;
		int end = 3;
		Solution44 sol = new Solution44();
		int[] answer = sol.solution(numbers, start, end);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution44 {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = num1; i <= num2; i++) {
			list.add(numbers[i]);
		}

		answer = new int[num2 - num1 + 1];
		for (int i = 0; i < num2 - num1 + 1; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
