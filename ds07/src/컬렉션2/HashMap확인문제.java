package 컬렉션2;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		String[] fruit = {"apple", "banana", "apple", "banana", "melon", "apple"};
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : fruit) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		
		int max = 0;
		String maxKey = "";
		for (String key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				maxKey = key;
			}
		}
		System.out.println("가장 많이 나온 과일: " + maxKey);
		System.out.println("득표수: " + max);
		
		System.out.println(map.keySet());

	}

}
