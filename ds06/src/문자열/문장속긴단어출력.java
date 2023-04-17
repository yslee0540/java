package 문자열;

public class 문장속긴단어출력 {

	public static void main(String[] args) {
		String s = "i am a boy";
		String[] s1 = s.split(" ");
		String answer = "";
		
		int max = 0;
		for (int i = 0; i < s1.length; i++) {
			if (max < s1[i].length()) {
				max = s1[i].length();
				answer = s1[i];
			}
		}
		System.out.println(answer);

	}

}
