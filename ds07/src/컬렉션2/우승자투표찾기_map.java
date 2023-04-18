package 컬렉션2;

import java.util.HashMap;

public class 우승자투표찾기_map {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		//String[] find = {"홍길동", "김길동", "정길동"};
		
		HashMap<String, Integer> map = new HashMap<>();
//		for (String x : find) {
//			map.put(x, 0);
//		}
//		System.out.println(map);
//		System.out.println(map.get("홍길동"));
//		map.put("홍길동", 10); //같은 key로 다시 put하면 덮어씀
//		System.out.println(map);
		
		for (String x : all) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println(map);
		
		int max = 0;
		String answer = "";
		for (String x : map.keySet()) { //key의 목록
			System.out.println(x + ": " + map.get(x));
			if (max < map.get(x)) {
				max = map.get(x);
				answer = x;
			}
			System.out.println("현재까지 우승자: " + answer);
		}
		System.out.println("우승자: " + answer);

	}

}
