package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "   011-245-1234   ";
		String s1 = s.trim();
		System.out.println(s1.length());
		
		String[] s2 = s1.split("-");
		for (String ss : s2) {
			System.out.println(ss);
		}
		
		if (s2[0].equals("011")) {
			System.out.println("SK");
		} else if (s2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if (s2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int total = s2[0].length() + s2[1].length() + s2[2].length();
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		int total2 = 0;
		for (int i = 0; i < s2.length; i++) {
			total2 = total2 + s2[i].length();
		}
		System.out.println(total2);
		
		String s3 = s1.replace("-", "");
		if (s3.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		

	}

}
