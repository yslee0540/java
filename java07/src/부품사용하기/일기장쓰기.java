package 부품사용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	
	public void open() {
		//jframe 화면 보이게 하기
		System.out.println("화면이 open될거에요.");
		JFrame f = new JFrame();
		f.setSize(500, 450);
		f.setTitle("내 일기장 작성화면");
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		
		JLabel date = new JLabel("오늘의 날짜 ");
		JLabel title = new JLabel("오늘의 제목 ");
		JLabel content = new JLabel("오늘의 내용 ");
		date.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dateText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		JTextArea contentText = new JTextArea(5, 10);
		dateText.setFont(font);
		titleText.setFont(font);
		contentText.setFont(font);
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		btn.setBackground(Color.green);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String date = dateText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				System.out.println(date + " " + title + " " + content);
				//파일도 만들어주고 자바프로그램과 파일간에 연결통로(stream) 만들어줌
				//외부에 있는 파일, 네트워크, cpu등을 자바에서 연결할 때는 위험한 상황이라고 인식
				//만약 문제가 발생하면 어떻게 처리할지 작성해야함
				try {
					FileWriter file = new FileWriter(date + ".txt");
					file.write(date + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
				} catch (IOException e1) {
					//처리할 내용
					System.out.println("파일로 저장하는 중 문제가 생김");
				}
			}
		});
		
		f.add(date);
		f.add(dateText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(btn);
		
		f.setVisible(true);
	}

}
