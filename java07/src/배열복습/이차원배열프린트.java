package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		//배열을 만들 때 이미 값을 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3},
				{4, 5, 6, 7}
		};
		System.out.println(n1.length); //행만
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		
		for (int i = 0; i < n1.length; i++) { //행
			for (int j = 0; j < n1[i].length; j++) { //열
				System.out.println(i + "" + j + " " + n1[i][j]);
			}
		}
		
		//아직 값을 모르는 경우
		int[][] n2 = new int[2][3];
		
	}

}
