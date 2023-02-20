package 형변환;

import java.util.ArrayList;
import java.util.HashSet;

public class 스키문제 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		
		ski.remove(1);
		System.out.println(ski);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println((i + 1) + "등: " + ski.get(i));
		}
		System.out.println(ski.contains("김연아"));
		
		ArrayList ski2 = new ArrayList();
		ski2.add("이스키");
		ski2.add("박스키");
		ski2.add("양스키");
		ski.addAll(ski2); //파괴형 함수
		System.out.println(ski);
		
		ski2.clear();
		System.out.println(ski2.isEmpty());
		System.out.println(ski2);

	}

}
