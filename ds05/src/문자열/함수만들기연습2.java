package 문자열;

public class 함수만들기연습2 {
	
	public static void 밥먹기(String s) {
		System.out.println(s + "을 먹는다.");
	}
	
	public static void 운동하기(String s) {
		System.out.println(s + "에서 운동을 한다.");
	}
	
	public static void 잠자기(String s) {
		System.out.println("잠을 잔다.(" + s + ")");
	}
	
	public static void 세수하기(String s) {
		System.out.println(s + "세수를 한다.");
	}

	public static void main(String[] args) {
		세수하기("");
		밥먹기("아침");
		운동하기("운동장");
		잠자기("낮잠");
		밥먹기("점심");
		세수하기("외출준비를 위해 ");
		System.out.println("화장을 한다.");
		밥먹기("저녁");
		운동하기("공원");
		잠자기("저녁");
	}

}
