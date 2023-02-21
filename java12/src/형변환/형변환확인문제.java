package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		//Object <-업캐스팅- 포장클래스  <-오토박싱- 기본형
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		//ArrayList는 toSting()이 재정의
		System.out.println(me);
		
		int money = (Integer)me.get(0); //다운캐스팅, 오토언박싱
		//int money = (int)me.get(0);
		System.out.println(money + 2000);
		
		double height = (Double)me.get(1); //다운캐스팅, 오토언박싱
		System.out.println(height + 10);
		
		boolean food = (boolean)me.get(2); //boolean<-Boolean<-Object
		if (food) { //if(조건): 조건이 true이면
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요");
		}
		
		char gender = (char)me.get(3); //char<-Character<-Object
		if (gender == '남') {
			System.out.println("주민번호는 1, 3이에요.");
		} else {
			System.out.println("주민번호는 2, 4예요.");
		}

	}

}
