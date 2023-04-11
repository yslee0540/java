package 프로그래머스;

public class 배열의연산2 {
	
	//두 수를 곱했을 때 가장 큰 숫자
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = {1, 2, 3, 4, 5, 9, 10};
		//[] numbers = {-30, -20, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}
}

class Solution3 {
	public int solution(int[] numbers) {
		int post = numbers[numbers.length - 2] * numbers[numbers.length - 1];
		int pre = numbers[0] * numbers[1];
		int answer = 0;
		if (post > pre) {
			answer = post;
		} else {
			answer = pre;
		}
		return answer;
	}
}