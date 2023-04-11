package 문자열;

import java.util.Arrays;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] all2 = all.split(",");
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		
		System.out.println(Arrays.toString(all2));
		System.out.println("과목 수: " + all2.length);
		
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("위치: " + i);
			}
			if (all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println("과목명 3글자 미만 과목수: " + count);
		
	}

}
