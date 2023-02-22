package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 유튜브보기() {
		System.out.println("코딩 채널 유튜브 시청");
	}

	@Override
	public void 게임실행() {
		System.out.println("게임 실행 불가");
	}

	@Override
	public void 코딩() {
		System.out.println("코딩 시 사용하지 않음");
	}

}
