package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer = "";
		
		//1. 문자열 문자 하나씩 분리
		//toCharArray(), split(""), charAt(index)
		String[] s2 = s.split("");
		//2. 어떤 문자들이 들어있는지 목록 만들기(중복 없애기 - HashSet)
		HashSet<String> set = new HashSet<>();
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set);
		
		//배열 안에 set에 들어있는 요소가 1인 것만 찾기
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(s2);
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		
		System.out.println(answer);
	}

}
