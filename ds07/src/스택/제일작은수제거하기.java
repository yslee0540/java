package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		//Arrays.sort(arr);
        Stack<Integer> stack = new Stack<>();
        for(int x : arr) {
            stack.push(x);
        }
        stack.pop();
        System.out.println(stack);
        
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
        System.out.println(Arrays.toString(answer));
        
	}

}
