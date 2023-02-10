package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count = 0; // 1.2학기 성적 오른 학생수
		int count2 = 0; // 2.1학기, 2학기 성적 동일한 학생수

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			} else if (term1[i] < term2[i]) {
				count++;
			}//if
		}//for
		System.out.println("2학기 성적 오른 학생 수: " + count +"명");
		System.out.println("1학기, 2학기 성적 동일한 학생 수: " + count2 +"명");

		// 3.2학기 만점인 학생 이름, 번호
		// 4.1학기 평균, 2학기 평균 중 누가 높은지
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 만점인 학생 이름: " + names[i] + ", 번호: " + i);
			}

			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		}

		double avg1 = (double) sum1 / term1.length;
		double avg2 = (double) sum2 / term2.length;
		if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높음");
		} else if (avg1 < avg2) {
			System.out.println("2학기 평균이 더 높음");
		} else {
			System.out.println("1학기 2학기 평균 동일");
		}

		// 5.뉴진스 1학기, 2학기 성적
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스 1학기 성적: " + term1[i] + "점");
				System.out.println("뉴진스 2학기 성적: " + term2[i] + "점");
			}
		}

	}

}
