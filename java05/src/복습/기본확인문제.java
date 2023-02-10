package 복습;

public class 기본확인문제 {

	public static void main(String[] args) {
		String[] tour = {"부산", "강릉", "대전", "서울", "제주도"};
		for (String x : tour) {
			System.out.println(x);
		}

		char[] color = {'r', 'g', 'b', 'p', 'y'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(i + ": " + color[i]);
		}

		double[] height = {180.1, 185.2, 173.3, 165.8, 178.1};
		for (double d : height) {
			System.out.print(d + " ");
		}
	}

}
