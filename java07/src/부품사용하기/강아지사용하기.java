package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.color = "brown";
		dog1.type = "푸들";
		dog1.꼬리흔들기();
		System.out.println("강아지 색깔: " + dog1.color);
		System.out.println("강아지 종류: " + dog1.type);
		
		강아지 dog2 = new 강아지();
		dog2.color = "white";
		dog2.type = "말티즈";
		dog2.인형놀이();
		System.out.println("강아지 색깔: " + dog2.color);
		System.out.println("강아지 종류: " + dog2.type);

	}

}
