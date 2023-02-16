package 생성자;

public class TV {
	//전역변수(global변수)
	public int ch;
	public int vol;
	public boolean onOff; //false
	
	//다른 생성자 메서드가 없으면 부품만들때(객체생성) 자동으로 생성됨
	//기본 생성자(default constructor)
	//객체생성할 때마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 만들기(명시적으로)
	public TV() {
		//자동으로 만들어지는 메서드
		System.out.println("TV객체가 하나 생성됨.");
	}
	//파라미터 있는 생성자
	//파라미터 있는 생성자가 있을 때는 기본 생성자는 자동 생성되지 않음
	public TV(int ch, int vol, boolean onOff) {
		//무더기(힙)영역에 저장된 멤버변수에 값을 넣어주는 역할
		this.ch = ch; //this.ch 전역변수
		this.vol = vol;
		this.onOff = onOff;
	}
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수(local변수), 자동초기화X
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	public void 유튜브보다() { //메서드를 정의한다
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}
