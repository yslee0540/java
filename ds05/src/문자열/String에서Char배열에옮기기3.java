package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String sno = "2056521";
		
		//1. 마지막 위치의 숫자가 1이면 서대문구에서 출생, 아니면 다른 구에서 출생
		char c1 = sno.charAt(sno.length() - 1);
		String answer = "다른 구에서 출생";
		if (c1 == '1') {
			answer = "서대문구에서 출생";
		} 
		System.out.println(answer);
		
		//2. "52"를 추출하여 두 숫자를 더해보세요
		//	  더해서 10이 넘지 않아야 유효한 주민번호, 유효한 주민번호인지 출력
		char[] two = new char[2];
		sno.getChars(4, 6, two, 0);
		int n1 = Character.getNumericValue(two[0]);
		int n2 = Character.getNumericValue(two[1]);
		if (n1 + n2 < 10) {
			System.out.println("유효한 주민번호");
		} else {
			System.out.println("유효하지 않은 주민번호");
		}
		
		//3. 주민번호에 포함된 5의 갯수 출력
		//1) String배열 - split
		String[] stringArray = sno.split("");
		int count = 0;
		for (String s : stringArray) {
			if (s.equals("5")) {
				count++;
			}
		}
		System.out.println(count);
		
		//2) charAt(i)
		int count2 = 0;
		for (int i = 0; i < sno.length(); i++) {
			if (sno.charAt(i) == '5') {
				count2++;
			}
		}
		System.out.println(count2);
		
		//인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		print(stringArray);
		
		//배열의 순서를 다 뒤집는 방법
		Arrays.sort(stringArray);
		print(stringArray);
		//Arrays 컬렉션으로 변환하면 더 간단
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); //오름차순
		Collections.reverse(list); //내림차순
		System.out.println(list);
		
		//배열 안에 데이터의 빈도수(횟수) 구하는 방법
		System.out.println(Collections.frequency(list, "hoho"));
		
	}
}
