package 문자열;

public class 문자열반복하기 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "hello";
		int n = 3;
		char[] c = my_string.toCharArray();
		for (char x : c) {
			for (int i = 0; i < n; i++) {
				answer += x;
			}
		}
		System.out.println(answer);

	}

}
