package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치 {

	public static void main(String[] args) {
		//1
		String s = "Zbcdefg";
		String answer = "";
		
		char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);
        StringBuilder s3 = new StringBuilder(s2);
        answer = s3.reverse().toString();
        System.out.println(answer);
        
        //2
        String s4 = "Zbcdefg";
        String answer2 = "";
        
        String[] s5 = s4.split("");
        List<String> list = Arrays.asList(s5);
        Collections.sort(list);
        Collections.reverse(list);
        for (String x : list) {
			answer2 += x;
		}
        System.out.println(answer2);
	}

}
