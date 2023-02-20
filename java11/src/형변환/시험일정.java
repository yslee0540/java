package 형변환;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println(subject);
		
		for (int i = 0; i < 3; i++) {
			subject.remove();
			//System.out.println(subject.size());
			System.out.println((i + 1) + "일차 시험본 후 남은 과목: " + subject);
		}

	}

}
