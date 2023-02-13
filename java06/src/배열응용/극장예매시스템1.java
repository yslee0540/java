package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(380, 450);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding", Font.BOLD, 40);
		JLabel result = new JLabel(""); //결과 보이는 곳
		result.setFont(font);
		
		//예약 여부를 저장하는 배열 만들기
		int[] seat = new int[10];
		//각 자리에 저장된 값이 0이면 예약X, 예약되면 1로 바꿈
		JButton[] buttons = new JButton[10];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");
			buttons[i].setFont(font);
			buttons[i].setBackground(Color.yellow);
			f.add(buttons[i]);
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					//이미 좌석번호가 1인지 확인하고 1이 아니면 예약가능
					if (seat[no] == 1) {
						result.setText("예약불가");
						result.setForeground(Color.red);
					} else {
						seat[no] = 1;
						result.setText(text + "번 예약완료");
						result.setForeground(Color.blue);
					}
				}
			});
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.pink);
		total.setFont(font);
		f.add(total);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} 
				}
				JOptionPane.showMessageDialog(f, "결제 금액: " + count * 10000 + "원");
				
			}
		});
		
		f.setVisible(true);

	}

}
