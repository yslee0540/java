package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {
	
	public void naver(String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		
		Document doc = null;
		try {
			doc = con.get();
			Elements codeList = doc.select(".code");
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println(code);
			
			Elements company = doc.select("h2 a");
			Element title = company.get(0);
			String text = title.text();
			System.out.println(text);
			
			Elements list = doc.select("span.blind");
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가: " + today);
			
			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("최고가: " + high);
			
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("최저가: " + low);
			
			System.out.println();
			FileWriter file = new FileWriter(text + ".txt");
			file.write("코드: " + code + "\n");
			file.write("현재가: " + today + "\n");
			file.write("최고가: " + high + "\n");
			file.write("최저가: " + low + "\n");
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
