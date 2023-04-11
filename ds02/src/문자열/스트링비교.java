package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		//String은 s를 프린트할 때 그 주소가 가르키는 char를 프린트되게 재정의 되어있는 객체
		//toString() 오버라이드
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s == s2);
		
		s = "김길동";
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		//String을 사용하는 것은 좋으나 String 값이 자주 변경되는 경우는 비효율적
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);
	}

}
