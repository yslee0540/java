package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {
//html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것
	
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null;
		try {
			doc = con.get();
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println(code);
			
			Elements list = doc.select("span.blind");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + " " + list.get(i));
			}
			System.out.println();
			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가: " + today);
			
			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("최고가: " + high);
			
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("최저가: " + low);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
