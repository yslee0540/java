package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {
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
			
			//tag .class #id
			Elements textList = doc.select(".sptxt.sp_txt9");
			System.out.println(textList.size());
			Element tag1 = textList.get(0);
			String text1 = tag1.text();
			System.out.println(text1);
			
			Elements textList2 = doc.select(".sptxt.sp_txt10");
			System.out.println(textList2.size());
			Element tag2 = textList2.get(0);
			String text2 = tag2.text();
			System.out.println(text2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
