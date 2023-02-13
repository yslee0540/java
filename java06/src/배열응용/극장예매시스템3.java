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

public class 극장예매시스템3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(850, 700);
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton[] btn = new JButton[201];
		int[] seat = new int[btn.length];
		Font font = new Font("맑은 고딕", Font.BOLD, 15);
		JLabel pay = new JLabel();
		pay.setFont(font);
		
		for (int i = 1; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setBackground(Color.green);
			btn[i].setFont(font);
			f.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					if (seat[no] == 1) {
						
					} else {
						seat[no] = 1;
						btn[no].setEnabled(false);
						btn[no].setBackground(Color.blue);
						btn[no].setText("예약불가");
					}
					int count = 0;
					for (int i = 0; i < seat.length; i++) {
						if (seat[i] == 1) {
							count++;
						}
						pay.setText("결제 금액: " + count * 10000 + "원");
					}
					
				}
			});
		}
		
		JButton result = new JButton("결제하기");
		result.setFont(font);
		result.setBackground(Color.yellow);
		result.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				String seatNo = "";
				for (int i = 1; i < seat.length; i++) {
					if (seat[i] == 1) {
						seatNo = seatNo + i + " ";
						count++;
					}
				}
				
				JOptionPane.showMessageDialog(f, "선택 번호: " + seatNo);
				JOptionPane.showConfirmDialog(f, + count * 10000 + "원 결제하시겠습니까?");
				
			}
		});
		f.add(result);
		f.add(pay);
		
		f.setVisible(true);

	}

}
