package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		// 배열을 만드는 방법1 - 처음부터 값을 알고 있는 경우
		int[] ages = {60, 50, 30, 20, 10};
		
		// 배열을 만드는 방법2 - 나중에 값을 넣는 경우
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 35.5;
		
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i] + " " + weight[i]);
		}
		
		for (double d : weight) {
			System.out.println(d);
		}

	}

}
