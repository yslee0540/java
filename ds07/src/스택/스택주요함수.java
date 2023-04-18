package 스택;

import java.util.Stack;

public class 스택주요함수 {

	public static void main(String[] args) {
		//선입후출(FILO)
		Stack<String> stack = new Stack<>();
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.push("정길동");
		System.out.println(stack);
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.contains("홍길동"));
		System.out.println(stack.peek());

	}

}
