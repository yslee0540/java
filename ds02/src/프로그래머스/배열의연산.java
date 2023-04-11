package 프로그래머스;

import java.util.Arrays;

public class 배열의연산 {
	
	//세 수를 더했을 때 가장 큰 숫자
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}
}

class Solution2 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int x = numbers.length;
		int answer = numbers[x - 1] + numbers[x - 2] + numbers[x - 3];
		return answer;
	}
}