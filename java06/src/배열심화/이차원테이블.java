package 배열심화;

//import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 300);
		String header[] = {"국어", "영어", "수학", "체육"};
		String contents[][] = { //정수 Integer
				{"100", "86", "68", "92"},
				{"95", "87", "77", "87"},
				{"82", "78", "86", "66"},
				{"59", "56", "92", "98"},
				{"67", "87", "100", "86"},
				{"86", "70", "76", "95"},
				{"72", "66", "72", "72"},
				{"67", "87", "100", "86"},
				{"86", "70", "76", "95"},
				{"72", "66", "72", "72"},
				{"59", "56", "92", "98"},
				{"72", "66", "72", "72"},
				{"67", "87", "100", "86"},
				{"86", "70", "76", "95"},
				{"72", "66", "72", "72"},
				{"59", "56", "92", "98"},
				{"67", "87", "100", "86"},
				{"86", "70", "76", "95"},
				{"72", "66", "72", "72"},
				{"90", "82", "85", "100"}
		};
		
		
		JTable table = new JTable(contents, header);
		//table.setFont(new Font("맑은 고딕", 1, 20));
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);

	}

}
