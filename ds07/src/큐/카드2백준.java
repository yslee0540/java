package 큐;

import java.util.LinkedList;

public class 카드2백준 {

	public static void main(String[] args) {
		int n = 6;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.add(i + 1);
		}
		System.out.println(queue);
		
		for (int i = 0; i <= queue.size(); i++) {
			queue.remove();
			queue.add(queue.remove());
			System.out.println(queue);
		}
		queue.remove();
		System.out.println(queue.get(0));

	}

}
