package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"국내여행", "미국", "캐나다"},
				{"프랑스", "독일", "아이슬란드"},
				{"베트남", "영국", "쿠바"}
		};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
