package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
//html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것
	
	public static void main(String[] args) {
		String site = "https://finance.naver.com/item/main.naver?code=";
		String[] code = {"035720", "000660", "041510"};
		
		for (int i = 0; i < code.length; i++) {
			Connection con = Jsoup.connect(site + code[i]);
			Document doc = null;
			try {
				doc = con.get();

				Elements company = doc.select("h2 a");
				Element tag1 = company.get(0);
				String title = tag1.text();
				System.out.println(title);

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

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

}
