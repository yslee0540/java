package 컬렉션;

public class 할머니편지 {

	public static void main(String[] args) {
		String letter = "할머니 사랑해요!!!";
		Solution6 sol = new Solution6();
		int answer = sol.solution(letter);
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(String letter) {
		int answer = letter.length() * 2;
		return answer;
	}
}