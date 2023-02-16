package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum; //static: 누적이나 공유 목적
	
	public Day(String doing, int time, String location) {
		//객체 생성할 때마다 처리하고 싶은 내용 생성자 메서드 내에 작성
		//객체 생성할 때 생성자메서드가 자동호출되기 때문에 무조건 처리해줌
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
