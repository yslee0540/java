package 컬렉션2;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복O_정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수: ");
		int size = sc.nextInt();
		System.out.print("k: ");
		int k = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<>(); //오름차순
		//TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder()); //내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		sc.close();
		System.out.println(set);
		
		Object[] result = set.toArray();
		System.out.println(k + "번째 큰 수: " + result[result.length - k]);

	}

}
