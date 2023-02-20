package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		try {
			num[3] = 2;
		} catch (Exception e) {
			//꼭 실행할 코드는 여기에 넣으면 안됨
			System.out.println("오류 발생");
			//e.printStackTrace();
		}
		System.out.println("배열 길이: " + num.length);

	}

}
