package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame{
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	JButton reset;
	
	public 메신저B() {
		setTitle("메신저B");
		setSize(400, 500);
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		
		try {
			socket = new DatagramSocket(5555);
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();
		list.setFont(font);
		input.setFont(font);
		
		reset = new JButton("초기화");
		
		list.setBackground(Color.green);
		input.setBackground(Color.lightGray);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				
				try {
					//UDP용 소켓이 있어야 함
					DatagramSocket socket = new DatagramSocket(); //전화기역할
					//UDP용 패킷이 있어야 함(데이터, 데이터의 크기, ip, port)
					byte[] data = s.getBytes();
					//localhost = 127.0.0.1 = 자기pc의 ip
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
					//소켓을 이용해서 패킷을 보낸다
					list.append("나>> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close(); //전화기를 끊는다
				} catch (SocketException e1) {
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
			}
		});

		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.setText("");
			}
		});
		
		add(reset, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	//받는 부분을 무한루프로 먼저 실행
	public void process() {
		while (true) {
			try {
				System.out.println("받을 준비중");
				//2. 패킷으로 보냈기 때문에 빈 패킷 만들어둠
				//	  빈 패킷 안에는 빈 byte[]이 있어야 함
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				//3. 소켓이 받아서 빈 패킷에 넣는다.
				socket.receive(packet);
				//4. byte[]에 있는 데이터 String으로 바꾸어준다.
				list.append("너>> " + new String(data) +"\n");
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		메신저B name = new 메신저B();
		name.process();
	}

}
