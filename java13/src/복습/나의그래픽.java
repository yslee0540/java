package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		JButton b = new JButton("나를 눌러");
		b.addActionListener(new /*익명클래스 시작*/ ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해져있음
				System.out.println("버튼이 클릭되었음.");
			}
		}); /*끝*/
		f.add(b);
		
		f.setVisible(true);

	}

}
