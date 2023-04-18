package 컬렉션2;

import java.util.*;

public class K번째큰수4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("k: ");
		int k = sc.nextInt();
		
		//1
//		ArrayList<Integer> list = new ArrayList<>();
//		while (true) {
//			int data = sc.nextInt();
//			if (data != 0) {
//				list.add(data);
//			} else {
//				break;
//			}
//		}
//		sc.close();
//		
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println(k + "번째 작은 수: " + list.get(k - 1));
		
		//2
		TreeSet<Integer> set = new TreeSet<>();
		while (true) {
			int data = sc.nextInt();
			if (data != 0) {
				set.add(data);
			} else {
				break;
			}
		}
		sc.close();
		
		System.out.println(set);
		Object[] num = set.toArray();
		System.out.println(k + "번째 작은 수: " + num[k - 1]);

	}

}
