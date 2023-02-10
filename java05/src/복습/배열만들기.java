package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//1. 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book",  "swim", "walk"};
		//참조형변수, 주소 들어가 있음
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println("크기: " + hobby.length);
		System.out.println("마지막: " + hobby[hobby.length - 1]);
		//c타입
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + ": " + hobby[i]);
		}
		
		//for-each문: 알아서 처음부터 인덱스 하나씩 증가하면서 하나씩 꺼내옴
		//출력용(인덱스X)
		for (String x : hobby) {
			System.out.println(x);
		}
		
		//2.값을 모르는 경우
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[jobs.length - 1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + ": " + jobs[i]);
		}
		for (String x : jobs) {
			System.out.println(x);
		}
		
	}

}
