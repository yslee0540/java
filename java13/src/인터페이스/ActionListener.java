package 인터페이스;

import java.awt.event.ActionEvent;

public interface ActionListener {
	//인터페이스는 추상메서드로만 정의
	//불완전함 -> new ActionListener X -> 익명클래스 사용
	public void actionPerformed(ActionEvent e);

}
