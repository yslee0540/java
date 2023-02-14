package 부품만들기;

public class TV {
	//전역변수(global변수)
	public int ch;
	public int vol;
	public boolean onOff; //false
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수(local변수), 자동초기화X
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	public void 유튜브보다() { //메서드를 정의한다
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
