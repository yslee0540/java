package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 확인문제 {

	public static void main(String[] args) {
		//1
		HashSet tour = new HashSet();
		tour.add("부산");
		tour.add("대구");
		tour.add("울산");
		tour.add("강릉");
		tour.add("서울");
		tour.add("부산");
		System.out.println(tour);
		
		//2
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room);
		System.out.println(room.get("현관"));
		room.replace("거실", "책상");
		System.out.println(room);
		
		//3
		ArrayList list = new ArrayList();
		list.add("자바공부");
		list.add("정리");
		list.add("카페가기");
		list.add("복습");
		list.add("산책");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		list.set(1, "청소");
		System.out.println(list);
		
	}

}
