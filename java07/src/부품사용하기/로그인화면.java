package 부품사용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.setTitle("내 일기장 로그인");
		f.getContentPane().setBackground(Color.orange);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		
		JLabel top = new JLabel();
		JLabel id = new JLabel("아이디: ");
		JLabel pw = new JLabel("패스워드: ");
		id.setFont(font);
		pw.setFont(font);
		//id.setForeground(Color.white);
		//pw.setForeground(Color.white);
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setText("root");
		pwText.setText("1234");
		idText.setHorizontalAlignment(JTextField.CENTER);
		pwText.setHorizontalAlignment(JTextField.CENTER);
		idText.setFont(font);
		pwText.setFont(font);
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setBackground(Color.white);
		reset.setBackground(Color.white);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText();
				String pw = pwText.getText();
				if (id.equals("root") && pw.equals("1234")) {
					//JOptionPane.showMessageDialog(f, "로그인 성공");
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
				
			}
		}); //login
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
			}
		}); //reset
		
		ImageIcon icon2 = new ImageIcon("login.png");
		login.setIcon(icon2);
		ImageIcon icon3 = new ImageIcon("reset.png");
		reset.setIcon(icon3);
		
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		
		f.setVisible(true);

	}

}
