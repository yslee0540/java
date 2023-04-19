package 스택;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "()(())";
		//String s = "())(";
		
		//1
		boolean answer = true;
		Stack<Integer> stack = new Stack<>();
		try {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					stack.push(0);
				} else {
					stack.pop();
				}
				answer = stack.empty();
			}
		} catch (Exception e) {
			answer = false;
		}
		System.out.println(answer);
		
		//2
		boolean answer2 = false;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
			} else {
				count--;
			}
			if (count < 0) {
				break;
			}
		}
		if (count == 0) {
			answer2 = true;
		}
		System.out.println(answer2);

	}

}
