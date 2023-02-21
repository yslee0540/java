package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {
//html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것
	
	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null;
		try {
			doc = con.get();
			Elements list = doc.select(".menu span");
			//Elements list = doc.select("#realTimeRankFavorite a");
			//Elements list = doc.select(".tab_gr a");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				String text = tag.text();
				System.out.println(text);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
