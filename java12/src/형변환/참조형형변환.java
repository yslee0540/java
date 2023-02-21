package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		//클래스 형변환 == 참조형 형변환
		//상속관계일때만 형변환 가능
		ArrayList list = new ArrayList();
		//자동형변환(업캐스팅) Object(큰)<-작
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(new JButton("나는 버튼"));
		
		//강제형변환(다운캐스팅)
		String name = (String)list.get(0);
		//String이 가지는 메서드(기능)을 쓰려면 강제형변환 반드시 필요
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age + 1);
		
		double jumsu = (Double)list.get(2);
		System.out.println(jumsu + 10);
		
		JButton b = (JButton)list.get(3);
		b.setText("나는 진짜 버튼");
	}

}
