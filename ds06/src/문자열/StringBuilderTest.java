package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		s = "hahaha";
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		String[] s3 = s2.split("");
		List<String> list = Arrays.asList(s3);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
