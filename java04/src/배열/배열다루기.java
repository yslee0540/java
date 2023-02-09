package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		//index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		char[] gender = {'남', '여', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		
		String[] name = {"hong", "lee", "hong", "hong"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		double[] eye = {1.5, 0.7, 1.0, 1.2};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		
		boolean[] food = {true, false, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		
		String[] s = new String[3];
		System.out.println(s[0]);

	}

}
