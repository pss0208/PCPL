package aog.ogsite.project.crawling;

import aog.ogsite.project.domain.Item;
import aog.ogsite.project.repository.ItemRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

@SpringBootTest
public class WebCrawling {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    ItemRepository itemRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void webCrawlingTest() {
        for (int first_category_index = 0; first_category_index < 7; first_category_index++) {
            for (int second_category_index = 0; second_category_index < 6; second_category_index++)
                // 6개의 first_category
                switch (first_category_index) {
                    case 0: // outer
                        switch (second_category_index) {
                            case 0: // outer > jacket
                                webCrawlingMethod("http://page27.co.kr/product/%EC%85%80%EB%A6%B0-%EB%82%98%EC%9D%BC%EB%A1%A0-%EB%B0%94%EB%9E%8C%EB%A7%89%EC%9D%B4-%ED%9B%84%EB%93%9C%EC%9E%90%EC%BC%933color/2989/category/45/display/1/", 1L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%ED%95%98-%EB%A6%B0%EB%84%A8-%EB%B8%94%EB%A0%88%EC%9D%B4%EC%A0%B8-%EC%9E%90%EC%BC%935color/2593/category/45/display/1/", 2L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%98%88-%EB%82%98%EC%9D%BC%EB%A1%A0-%EB%B0%94%EB%9E%8C%EB%A7%89%EC%9D%B4-%EC%A7%91%EC%97%8510color/2954/category/45/display/1/", 3L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EB%82%98-%EB%B8%94%EB%A0%88%EC%9D%B4%EC%A0%80-%EC%9E%90%EC%BC%932color/2945/category/45/display/1/", 4L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%9D%BC%EC%9D%BC%EB%9D%BD-%ED%81%AC%EB%A1%AD-%ED%9B%84%EB%93%9C%EC%9E%90%EC%BC%933color/2942/category/45/display/1/", 5L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%8F%AC%ED%85%90-%EB%82%98%EC%9D%BC%EB%A1%A0-%EC%88%8F%EC%9E%90%EC%BC%932color/2940/category/45/display/1/", 6L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%B8%94%EB%9E%91-%ED%94%BC%EA%B7%B8%EB%A8%BC%ED%8A%B8-%ED%9B%84%EB%93%9C%EC%A7%91%EC%97%854color/2937/category/45/display/1/", 7L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A5%B4%EB%B0%98-%EB%A0%88%EB%8D%94-%EC%9E%90%EC%BC%932color/2936/category/45/display/1/", 8L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%AC%B4%EB%B8%8C-%EC%98%A4%EB%B2%84%ED%95%8F-%EC%B2%AD%EC%9E%90%EC%BC%932color/2928/category/45/display/1/", 9L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%94%84%EB%9D%BC%ED%95%98-%ED%88%AC%EC%9B%A8%EC%9D%B4-%ED%9B%84%EB%93%9C%EC%9E%90%EC%BC%934color/2924/category/45/display/1/", 10L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A7%88%EC%9D%BC%EB%93%9C-2%EC%98%A8%EC%8A%A4-%EC%95%BC%EC%83%812olor/2895/category/45/display/1/", 11L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A9%9C%EB%A1%9C%EC%9D%B4-%EC%9A%B8-%EB%8B%88%ED%8A%B8%EC%9E%90%EC%BC%932color/2880/category/45/display/1/", 12L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%B2%84%EB%8B%9D-%EC%88%8F-%ED%8C%A8%EB%94%A9%EC%A0%90%ED%8D%BC5color/2877/category/45/display/1/", 13L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%BC%80%EC%9D%B4-3m-%EC%94%AC%EC%97%90%EC%96%B4-%ED%8C%A8%EB%94%A94color/2873/category/45/display/1/", 14L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%97%98-%ED%97%A4%EB%B9%84-%ED%9B%84%EB%A6%AC%EC%8A%A4-%ED%9B%84%EB%93%9C%EC%A7%91%EC%97%852color/2869/category/45/display/1/", 15L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%83%80%EC%9D%B4%EC%B9%B8-%EC%9B%B0%EB%A1%A0-%EB%A1%B1%ED%8C%A8%EB%94%A92color/2839/category/45/display/1/", 16L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%85%B8%EB%A9%80-%EC%9B%8C%EC%8B%B1-%EC%BD%94%ED%8A%BC%EC%9E%90%EC%BC%935color/3229/category/45/display/1/", 98L, first_category_index, second_category_index);
                                break;
                            case 1: // outer > cardigan
                                webCrawlingMethod("http://page27.co.kr/product/%EC%97%98%EB%B9%84%EC%8A%A4-%EB%A6%B0%EB%84%A8-%EA%B0%80%EB%94%94%EA%B1%B46color/2981/category/77/display/1/", 17L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%A0%9C%EB%83%90-%EB%AF%B9%EC%8A%A4-%EC%A7%91%EC%97%85%EA%B0%80%EB%94%94%EA%B1%B45color/2941/category/77/display/1/", 18L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%84%88%EB%93%9C-%EA%B3%A0%EB%B0%80%EB%8F%84-%EA%B0%80%EB%94%94%EA%B1%B410color/2922/category/77/display/1/", 19L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%98%88-%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%98%EC%B0%8C-%EA%B0%80%EB%94%94%EA%B1%B48color/2908/category/77/display/1/", 20L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%8B%A4%EC%9A%B4%ED%83%80%EC%9A%B4-%EB%8B%88%ED%8A%B8-%EA%B0%80%EB%94%94%EA%B1%B411color/2902/category/77/display/1/", 21L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A3%A8%EC%9D%B4%EB%A5%B4-%EB%B8%8C%EC%9D%B4%EB%84%A5-%EA%B0%80%EB%94%94%EA%B1%B45color/2900/category/77/display/1/", 22L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%94%84%EB%9E%AD%ED%81%AC-%EB%9D%BC%EC%9D%B8-%EA%B0%80%EB%94%94%EA%B1%B45color/2897/category/77/display/1/", 23L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%97%A4%EB%B9%84-%EB%9E%A8%EC%8A%A4%EC%9A%B8-%ED%95%98%EC%B0%8C-%EB%8B%88%ED%8A%B8%EC%A7%91%EC%97%855color/2885/category/77/display/1/", 24L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A5%B4%EB%A7%9D-%EC%BA%90%EC%8B%9C-%EC%A7%91%EC%97%85-%EA%B0%80%EB%94%94%EA%B1%B45color/2857/category/77/display/1/", 25L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%8A%A4%ED%83%A0-%EC%B2%B4%ED%81%AC-%EC%98%A4%EB%B2%84%ED%95%8F-%EA%B0%80%EB%94%94%EA%B1%B43color/2769/category/77/display/1/", 26L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%9B%90%EC%8A%A4-%EB%B0%B0%EC%83%89-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EA%B0%80%EB%94%94%EA%B1%B43color/2767/category/77/display/1/", 27L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%95%98%EB%B2%84-%EC%8A%A4%ED%8B%B0%EC%B9%98-%EC%98%A4%EB%B2%84%ED%95%8F-%EA%B0%80%EB%94%94%EA%B1%B42color/2754/category/77/display/1/", 28L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%95%84-%EB%AF%B9%EC%8A%A4-%EB%8B%88%ED%8A%B8-%EC%A7%91%EC%97%85-%EA%B0%80%EB%94%94%EA%B1%B45color/2752/category/77/display/1/", 29L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%94%84%EB%A6%AC%EB%AF%B8%EC%97%84-%EC%86%8C%ED%94%84%ED%8A%B8-%EA%B0%80%EB%94%94%EA%B1%B411color/2734/category/77/display/1/", 30L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A7%88%EB%A1%A0-%EC%BD%94%ED%8A%BC-%EA%B0%80%EB%94%94%EA%B1%B45color/2729/category/77/display/1/", 31L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%82%AC%EC%9A%B4%EC%A6%88-%EB%A6%B0%EB%84%A8-%EA%B0%80%EB%94%94%EA%B1%B43color/2709/category/77/display/1/", 32L, first_category_index, second_category_index);
                                break;
                            case 2: // outer > coat
                                webCrawlingMethod("http://page27.co.kr/product/%EC%83%8C%EB%93%9C-%EB%B9%84%EC%A1%B0-%EC%BA%90%EC%8B%9C-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B82color-40sale/2825/category/51/display/1/", 33L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A7%88%EA%B0%80%EB%A0%9B-%EC%98%A8%EC%8A%A4-%ED%8C%A8%EB%94%A9%EC%BD%94%ED%8A%B83color/2822/category/51/display/1/", 34L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%ED%94%84-%EB%A1%9C%EB%B8%8C-%ED%95%B8%EB%93%9C%EB%A9%94%EC%9D%B4%EB%93%9C-%EC%BD%94%ED%8A%B83color/2806/category/51/display/1/", 35L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A7%88%EB%A5%B4%EC%BD%94-%ED%95%B8%EB%93%9C%EB%A9%94%EC%9D%B4%EB%93%9C-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B84color/2785/category/51/display/1/", 36L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%9D%B4%EB%B8%90-%EC%9B%8C%EC%8B%B1-%EB%A7%A5-%ED%8A%B8%EB%A0%8C%EC%B9%98%EC%BD%94%ED%8A%B83color/2452/category/51/display/1/", 37L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%81%B4%EB%9E%98%EC%8B%9D-%ED%97%A4%EB%A7%81%EB%B3%B8-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B82color/2327/category/51/display/1/", 38L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A5%B4%EB%A9%94%EB%A5%B4-%EB%A1%9C%EB%B8%8C-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B83color/2308/category/51/display/1/", 39L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%B0%9C%EB%A7%88%EC%B9%B8-%EC%9A%B8-%EC%BD%94%ED%8A%B84color/2301/category/51/display/1/", 40L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%8E%98%EC%9D%B4%EC%A7%8027-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EC%98%A4%EB%B2%84%EC%BD%94%ED%8A%B82color-50sale/2276/category/51/display/1/", 41L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%AF%B8%EB%8B%88%EB%A9%80-%EB%A7%81-%EB%A1%9C%EB%B8%8C-%EC%9A%B8%EC%BD%94%ED%8A%B82color/2298/category/51/display/1/", 42L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%B0%9C%EB%A0%8C-%EC%9A%B8-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B82color/2284/category/51/display/1/", 43L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%97%98%ED%94%84-%EC%98%A4%EB%B2%84-%EC%9A%B8-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B84color/2281/category/51/display/1/", 44L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%95%84%EB%A5%B4%EB%8B%88-%EB%A1%9C%EB%B8%8C-%EC%9A%B8%EC%BD%94%ED%8A%B83color/2250/category/51/display/1/", 45L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%8D%BC%ED%8E%99%ED%8A%B8-%EC%9A%B8-%EB%8D%94%EB%B8%94%EC%BD%94%ED%8A%B83color/2239/category/51/display/1/", 46L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A3%A8%EC%9D%B4%EC%8A%A4-%EC%9A%B8-%EC%8B%B1%EA%B8%80%EC%BD%94%ED%8A%B83color/2236/category/51/display/1/", 47L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A9%9C%EB%A1%A0-%EC%98%A4%EB%B2%84-%EC%9A%B8-%EC%8B%B1%EA%B8%80%EC%BD%94%ED%8A%B84color/2216/category/51/display/1/", 48L, first_category_index, second_category_index);
                                break;
                            case 3: // outer > vest
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%A0%9C-%ED%95%98%EC%B0%8C-%EB%B8%8C%EC%9D%B4%EB%84%A5-%EB%8B%88%ED%8A%B8%EC%A1%B0%EB%81%BC/2934/category/69/display/1/", 99L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%84%EB%B2%A0%ED%81%AC-%EC%9B%B0%EB%A1%A0-%ED%8C%A8%EB%94%A9%EC%A1%B0%EB%81%BC3color/2774/category/69/display/1/", 100L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A5%B4%EB%B2%A4-%EB%9E%A8%EC%8A%A4%EC%9A%B8-%EB%8B%88%ED%8A%B8-%EC%A1%B0%EB%81%BC/1542/category/69/display/1/", 101L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9E%A8%EC%8A%A4%EC%9A%B8-%EC%98%A4%EB%B2%84%ED%95%8F-%EB%8B%88%ED%8A%B8%EC%A1%B0%EB%81%BC4color/1525/category/69/display/1/", 102L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BD%94%ED%8C%85-%EB%9D%BC%EC%9A%B4%EB%93%9C-%ED%8C%A8%EB%94%A9%EC%A1%B0%EB%81%BC2color/1160/category/69/display/1/", 103L, first_category_index, second_category_index);
                                break;
                            case 4: // outer > suit
                                webCrawlingMethod("https://page27.co.kr/product/%EC%A0%A0%ED%8B%80-%EC%8A%A4%ED%83%A0%EB%8B%A4%EB%93%9C-%EB%A6%B0%EB%84%A8-%EC%88%98%ED%8A%B8-%EC%85%8B%EC%97%8511color/2631/category/54/display/1/", 104L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%94%EB%A5%B4%EC%8B%9C-%ED%88%AC%EB%B2%84%ED%8A%BC-%EB%B8%94%EB%A0%88%EC%9D%B4%EC%A0%B8-%EC%85%8B%EC%97%852color/2122/category/54/display/1/", 105L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%97%A4%EB%93%A0-%ED%97%A4%EB%A7%81%EB%B3%B8-%EC%88%98%ED%8A%B8-%EC%85%8B%EC%97%852color/1727/category/54/display/1/", 106L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1: // top
                        switch (second_category_index) {
                            case 0: // top > longsleeve
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%ED%8A%B8-%EC%9C%88%EB%93%9C%EB%B8%8C%EB%A0%88%EC%9D%B4%EC%BB%A4%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A0-%EC%85%8B%EC%97%852color/2977/category/1/display/3/", 97L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EC%96%B4-%ED%94%84%EB%A6%AC%EB%AF%B8%EC%97%84-%EB%A6%B0%EB%84%A8-%EA%B8%B4%ED%8C%94%ED%8B%B011color/3263/category/53/display/1/", 107L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%AC%EB%A8%B8%EB%93%9C-%EB%B9%84%EC%B9%98-%EB%A6%B0%EB%84%A8-%EB%8B%88%ED%8A%B85color/3080/category/53/display/1/", 108L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%8C%EB%A1%9C-%EB%A6%B0%EB%84%A8-%EA%B8%B4%ED%8C%94%ED%8B%B0%EC%85%94%EC%B8%A04color/2974/category/53/display/1/", 109L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%AC%EB%8D%B0%EC%9D%B4-%EB%A6%B0%EB%84%A8-%EA%B8%B4%ED%8C%94%ED%8B%B0%EC%85%94%EC%B8%A08color/2600/category/53/display/1/", 110L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%94%EC%9D%B4%ED%8E%98%EC%96%B4-%EB%A7%A8%ED%88%AC%EB%A7%A8-%EB%B0%98%EB%B0%94%EC%A7%80-%EC%85%8B%EC%97%856color/3241/category/53/display/1/", 111L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9E%9C%EB%93%9C%EB%A7%88%ED%81%AC-%ED%80%84%EB%A6%AC%ED%8B%B0-%EB%A7%A8%ED%88%AC%EB%A7%A85color/3238/category/53/display/1/", 112L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%8D%B8%ED%83%80-%ED%94%84%EB%A6%B0%ED%8C%85-%EB%A7%A8%ED%88%AC%EB%A7%A84color/3236/category/53/display/1/", 113L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%9B%8C%EC%8B%B1-%EA%B8%B4%ED%8C%94%ED%8B%B0%EC%85%94%EC%B8%A08color/1046/category/53/display/1/", 114L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%93%A8%EC%96%B4-%EC%95%84%EC%8A%A4%ED%82%A8-%EC%8A%A4%ED%83%A0%EB%8B%A4%EB%93%9C-%EA%B8%B4%ED%8C%94%ED%8B%B09color/3098/category/53/display/1/", 115L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8E%98%ED%83%80-%ED%80%84%EB%A6%AC%ED%8B%B0-%EB%A7%A8%ED%88%AC%EB%A7%A83color/3233/category/53/display/1/", 116L, first_category_index, second_category_index);
                                break;
                            case 1: // top > shortsleeve
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%B4%EB%A7%81-%EC%8B%A4%EC%BC%93-%EC%9C%A0%EB%84%A5-%EB%B0%98%ED%8C%94%ED%8B%B04color/3035/category/25/display/1/", 49L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%A1%9C%EB%A7%9D-%EB%B6%84%EB%98%90-%EB%B0%98%ED%8C%94%ED%8B%B0%EC%85%94%EC%B8%A012color/3037/category/25/display/1/", 50L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9F%AC%EC%89%AC-%EC%B9%B4%EB%9D%BC-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B84color/3034/category/25/display/1/", 51L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%8C%EB%A6%AC-%EB%82%98%EC%97%BC-%ED%80%84%EB%A6%AC%ED%8B%B0-%EB%B0%98%ED%8C%94%ED%8B%B03color/3032/category/25/display/1/", 52L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%A1%9C%ED%82%A4-%EB%A8%B8%EC%8A%AC-%EC%B9%B4%EB%B8%8C%EB%9D%BC-%EB%B0%98%ED%8C%94%ED%8B%B06color/3030/category/25/display/1/", 53L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%93%9C%EB%9D%BC%EC%9D%B4%EB%B9%99-%EC%98%A4%EB%B2%84%ED%95%8F-%EB%B0%98%ED%8C%94%ED%8B%B03color/3028/category/25/display/1/", 54L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AA%A8%EB%8D%98-%EC%B9%B4%EB%9D%BC-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B810color/2645/category/25/display/1/", 55L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%B4%EB%93%9C-%EB%A6%B0%EB%84%A8-%EB%B0%98%ED%8C%94-%EC%B9%B4%EB%9D%BC%EB%8B%88%ED%8A%B86color/2554/category/25/display/1/", 56L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%8D%B0%EC%98%A4%EB%93%9C%EB%9E%80%ED%8A%B8-%EB%A6%B0%EB%84%A8-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B810color/3020/category/25/display/1/", 57L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%8D%B0%EC%98%A4%EB%93%9C%EB%9E%80%ED%8A%B8-%EB%A6%B0%EB%84%A8-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B810color/3020/category/25/display/2/", 94L, first_category_index, second_category_index);
                                break;
                            case 2: // top > knit
                                webCrawlingMethod("http://page27.co.kr/product/%EC%95%8C%EC%A0%9C%EB%A6%AC-%EB%B8%8C%EC%9D%B4%EB%84%A5-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EB%8B%88%ED%8A%B82color/2952/category/44/display/1/", 67L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%97%98%EB%9D%BC-%EB%B8%8C%EC%9D%B4%EB%84%A5-%EB%8B%88%ED%8A%B87color/2948/category/44/display/1/", 68L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%A0%9C-%ED%95%98%EC%B0%8C-%EB%B8%8C%EC%9D%B4%EB%84%A5-%EB%8B%88%ED%8A%B8%EC%A1%B0%EB%81%BC/2934/category/44/display/1/", 69L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%A0%9C%EB%83%90-%EB%AF%B9%EC%8A%A4-%EB%B0%98%EC%A7%91%EC%97%85-%EB%8B%88%ED%8A%B85color/2932/category/44/display/1/", 70L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%ED%86%A4-%EB%A6%B0%EB%84%A8-%EB%9D%BC%EC%9A%B4%EB%93%9C-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B814color/2519/category/44/display/1/", 71L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%ED%8A%B8%EC%9C%84%EC%8A%A4%ED%8A%B8-%EB%8B%A8%EA%B0%80%EB%9D%BC-%EB%8B%88%ED%8A%B87color/2918/category/44/display/1/", 72L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EC%97%90%EC%9D%B4%EC%8A%A4-%EB%9D%BC%EC%9A%B4%EB%93%9C-%EB%8B%88%ED%8A%B88color/2911/category/44/display/1/", 73L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%AF%B9%EC%8A%A4-%ED%95%98%ED%94%84-%EB%B0%98%EC%A7%91%EC%97%85-%EB%8B%88%ED%8A%B86color/2901/category/44/display/1/", 74L, first_category_index, second_category_index);
                                webCrawlingMethod("http://page27.co.kr/product/%EB%A1%9C%EC%A7%80%EC%8A%A4-%ED%95%98%EC%B0%8C-%EB%8B%88%ED%8A%B812color/2896/category/44/display/1/", 75L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2: // shirts
                        switch (second_category_index) {
                            case 0: // shirts > basic
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%A4%EC%85%98-%EC%BF%A8-%ED%97%A8%EB%A6%AC%EB%84%A5-%EC%85%94%EC%B8%A03color/1983/category/1/display/3/", 96L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8E%98%EB%A6%AC-%EB%A6%B0%EB%84%A8-%EC%98%A4%EB%B2%84%ED%95%8F-%EC%85%94%EC%B8%A07color/3274/category/79/display/1/", 58L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BF%A8%EB%A7%81-%ED%84%B0%EC%B9%98-%EB%82%98%EC%9D%BC%EB%A1%A0-%EC%85%94%EC%B8%A07color/3257/category/79/display/1/", 59L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%98%EB%9D%BC-%ED%94%84%EB%A6%AC%EB%AF%B8%EC%97%84-%EB%A6%B0%EB%84%A8-%EC%98%A4%EB%B2%84%ED%95%8F-%EC%85%94%EC%B8%A05color/3246/category/79/display/1/", 60L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%A4%EB%A6%AC-%ED%8C%A8%ED%84%B4-%EC%BF%A8-%EB%B0%98%ED%8C%94%EC%85%94%EC%B8%A08color/3021/category/79/display/1/", 61L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%94%84%EB%A0%88%EC%89%AC-%ED%85%90%EC%85%80-%EB%A6%B0%EB%84%A8-%EC%85%94%EC%B8%A07color/2579/category/79/display/1/", 62L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%84%EB%8D%B4-%EC%BF%A8-%EB%A6%B0%EB%84%A8-%EC%85%94%EC%B8%A013color/2992/category/79/display/1/", 63L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%85%90%EC%85%80-%ED%8F%AC%EC%BC%93-%EC%9B%8C%EC%8B%B1-%EC%85%94%EC%B8%A04color/3234/category/79/display/1/", 64L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A3%A8%ED%8C%A1-%EC%98%A4%EB%B2%84-%EB%8D%B0%EB%8B%98%EC%85%94%EC%B8%A02color/3105/category/79/display/1/", 65L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%B2%B4-%EC%98%A4%EB%B2%84-%EB%8D%B0%EB%8B%98%EC%85%94%EC%B8%A03color/3093/category/79/display/1/", 66L, first_category_index, second_category_index);
                                break;
                            case 1: // shirts > check_pattern
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%A4%EB%B8%8C-%EB%A6%B0%EB%84%A8-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A03color/3261/category/80/display/1/", 117L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%94%8C%EB%A1%9C%EC%9A%B0-%EC%98%A4%EB%B2%84-%EC%B2%B4%ED%81%AC-%EC%85%94%EC%B8%A03color/3083/category/80/display/1/", 118L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%8C%EB%A0%8C-%EC%B2%B4%ED%81%AC-%EC%85%94%EC%B8%A0/2739/category/80/display/1/", 119L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B8%8C%EB%A1%9C%EC%9A%B0-%EC%9A%B8-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A03color/2354/category/80/display/1/", 120L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%9D%B8%EB%94%94%EA%B3%A0-%EC%9B%8C%EC%8B%B1-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A03color/2138/category/80/display/1/", 121L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%85%8C%EB%94%94-%EC%9B%8C%EC%8B%B1-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A02color/1966/category/80/display/1/", 122L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%A0%A0%ED%8B%80-%EB%A6%B0%EB%84%A8-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A03style/1959/category/80/display/1/", 123L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B0%80%ED%81%AC-%EC%98%A4%EB%B2%84%ED%95%8F-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A0/1926/category/80/display/1/", 124L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%95%98%EC%9D%B4%ED%85%90-%EC%B2%B4%ED%81%AC-%EC%85%94%EC%B8%A02color/1820/category/80/display/1/", 125L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B9%8C%EB%A6%AC%EB%B8%8C-%EC%9B%8C%EC%8B%B1-%EC%B2%B4%ED%81%AC%EC%85%94%EC%B8%A02color/1780/category/80/display/1/", 126L, first_category_index, second_category_index);
                                break;
                            case 2: // shirts > stripe
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B2%A0%EB%A6%AC-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A06color/1908/category/81/display/1/", 127L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EB%94%94-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A02color/1884/category/81/display/1/", 128L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%A5%EC%8A%A4%ED%8D%BC%EB%93%9C-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A05color/1773/category/81/display/1/", 129L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%84%A4%EC%B8%84%EB%9F%B4-%EC%8D%B8%EB%A8%B8-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A03color/1354/category/81/display/1/", 130L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%9C%EB%A6%AC%EC%A6%88-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%B0%A8%EC%9D%B4%EB%82%98-%EC%85%94%EC%B8%A04color/1313/category/81/display/1/", 131L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%98%A4%EB%B2%84%ED%95%8F-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A03color/781/category/81/display/1/", 132L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%ED%9E%88%EB%93%A0-%EC%B0%A8%EC%9D%B4%EB%82%98-%EC%85%94%EC%B8%A02color/1253/category/81/display/1/", 133L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BB%AC%EB%9F%AC-%EB%A3%A8%EC%A6%88%ED%95%8F-%ED%8F%AC%EC%BC%93-%EC%85%94%EC%B8%A011color/1233/category/81/display/1/", 134L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%99%80%EC%9D%BC%EB%93%9C-%EC%8A%A4%ED%8A%B8%EB%9D%BC%EC%9D%B4%ED%94%84-%EC%85%94%EC%B8%A02color/682/category/81/display/1/", 135L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3: // bottom
                        switch (second_category_index) {
                            case 0: // bottom > cotton
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%A8%EB%B2%88-%EB%A6%B0%EB%84%A8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A07color/3275/category/57/display/1/", 136L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EA%B8%B0%ED%9A%8D%EB%A0%88%EC%9D%B4%EB%B8%94-%EC%B9%B4%EA%B3%A0-%EB%B0%98%EB%B0%94%EC%A7%807color/2500/category/57/display/1/", 137L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%B4%EB%A5%B8-%EB%A6%B0%EB%84%A8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A03color/2548/category/57/display/1/", 138L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EC%BF%A8%EB%A7%81-%EC%8A%A4%ED%8C%90-%EC%B9%B4%EA%B3%A0-%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A05color/3256/category/57/display/1/", 139L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EC%97%90%EC%96%B4-%EC%BF%A8-%EC%8A%A4%ED%8C%90-%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A06color/3062/category/57/display/1/", 140L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EC%96%B4%EB%A1%9C-%EC%9B%8C%EC%8B%B1-%EC%BD%94%ED%8A%BC%EB%82%98%EC%9D%BC%EB%A1%A0-%ED%8C%AC%EC%B8%A04color/3070/category/57/display/1/", 141L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/page27%EB%A9%94%EB%A5%B4%EC%8B%9C-usa%EC%BD%94%ED%8A%BC-%EC%9E%90%EC%88%98-%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A04color/3225/category/57/display/1/", 142L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%8D%B0%EC%9D%BC%EB%A6%AC-%EC%AD%88%EB%A6%AC-%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A09color-%EB%B4%84%EA%B0%80%EC%9D%84ver/3161/category/57/display/1/", 143L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9F%AC%EB%84%88-%EC%98%A4%EB%B2%84-%ED%8A%B8%EB%A0%88%EC%9D%B4%EB%8B%9D-%EC%85%8B%EC%97%853color/3214/category/57/display/1/", 144L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/usa-%EC%BD%94%ED%8A%BC-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A04color/3211/category/57/display/1/", 145L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B0%94%EC%9D%B4%EC%98%A4-%ED%94%BC%EC%B9%98-%ED%85%8C%EC%9D%B4%ED%8D%BC%EB%93%9C-%ED%8C%AC%EC%B8%A05color/3210/category/57/display/1/", 146L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%98%EB%9D%BC-%EB%8B%88%ED%8A%B8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A05color/3206/category/57/display/1/", 147L, first_category_index, second_category_index);
                                break;
                            case 1: // bottom > denim
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%A4%ED%95%98%EC%9D%B4-%EC%8D%B8%EB%A8%B8-%EB%8D%B0%EB%8B%98%EB%B0%98%EB%B0%94%EC%A7%803color/3277/category/59/display/1/", 148L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BF%A8%EB%A7%81-%EB%A6%B0%EB%84%A8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A03color/3268/category/59/display/1/", 149L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%95%84-%ED%99%94%EC%9D%B4%ED%8A%B8-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A0/3249/category/59/display/1/", 150L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A7%88%ED%81%AC-%EC%8A%A4%ED%83%A0%EB%8B%A4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A03color/3247/category/59/display/1/", 151L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EB%A5%B4-%EC%98%A4%EA%B0%80%EB%8B%89-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A02color/3239/category/59/display/1/", 152L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%AC%EB%93%9C-%EC%84%B8%EB%AF%B8%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A03color/3209/category/59/display/1/", 153L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%98%EB%A5%B4-%EC%84%B8%EB%AF%B8%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A03color/3192/category/59/display/1/", 154L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EB%B2%88-%EC%9B%8C%EC%8B%B1-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A02color/3153/category/59/display/1/", 155L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A3%A8%ED%8C%A1-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A04color/3133/category/59/display/1/", 156L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%8C%EB%A1%9C%EC%9D%B4-%EC%83%9D%EC%A7%80-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A0/2957/category/59/display/1/", 157L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%98%88-%EC%83%9D%EC%A7%80-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A0/3118/category/59/display/1/", 158L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AE%A4%EC%A6%88-%ED%81%AC%EB%A6%BC-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%8D%B0%EB%8B%98%ED%8C%AC%EC%B8%A0/3097/category/59/display/1/", 159L, first_category_index, second_category_index);
                                break;
                            case 2: // bottom > slacks
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%A8%EB%B2%88-%EB%A6%B0%EB%84%A8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A07color/3275/category/60/display/1/", 160L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AA%A8%EC%8A%A4-%EB%A6%B0%EB%84%A8-%ED%95%80%ED%84%B1-%EC%99%80%EC%9D%B4%EB%93%9C%ED%8C%AC%EC%B8%A03color/3273/category/60/display/1/", 161L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%A0%9C%EB%A1%A0-%ED%88%AC%ED%84%B1-%EB%B0%98%EB%B0%B4%EB%94%A9-%ED%95%98%ED%94%84-%EC%8A%AC%EB%9E%99%EC%8A%A44color/3271/category/60/display/1/", 162L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BF%A8%EB%A7%A5%EC%8A%A4-%ED%80%84%EB%A6%AC%ED%8B%B0-%EC%84%B8%EB%AF%B8%EC%99%80%EC%9D%B4%EB%93%9C-%EC%8A%AC%EB%9E%99%EC%8A%A47color/3266/category/60/display/1/", 163L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BF%A0%EC%9D%B4%EC%8A%A4-%EC%8D%A8%EB%A8%B8-%EC%9B%90%ED%84%B1-%EC%99%80%EC%9D%B4%EB%93%9C-%EC%8A%AC%EB%9E%99%EC%8A%A46color/3264/category/60/display/1/", 164L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%A7%80%EC%8A%A4-%EC%BF%A8-%EC%84%B8%EB%AF%B8%EC%99%80%EC%9D%B4%EB%93%9C-%EC%8A%AC%EB%9E%99%EC%8A%A47color/3017/category/60/display/1/", 165L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EC%96%B4%EB%A6%AC%EC%A6%98-%ED%85%8C%EC%9D%B4%ED%8D%BC%EB%93%9C-%ED%81%AC%EB%A1%AD-%ED%8C%AC%EC%B8%A012color/3258/category/60/display/1/", 166L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EC%8A%A4%ED%8A%B8-%ED%95%80%ED%84%B1-%ED%81%AC%EB%A1%AD-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A02color/3244/category/60/display/1/", 167L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8D%A8%EB%A8%B8-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%ED%8C%AC%EC%B8%A04color/3038/category/60/display/1/", 168L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EB%B2%84-%EC%BF%A8%EB%A7%A5%EC%8A%A4-%ED%9E%88%EB%93%A0%EB%B0%B4%EB%94%A9%EC%8A%AC%EB%9E%99%EC%8A%A48color/3242/category/60/display/1/", 169L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%84%EB%A1%A0-%EB%B0%B4%EB%94%A9-%EC%99%80%EC%9D%B4%EB%93%9C-%EC%8A%AC%EB%9E%99%EC%8A%A43color/3235/category/60/display/1/", 170L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%98%EB%9D%BC-%EB%B0%98-%EB%B0%B4%EB%94%A9-%EC%84%B8%EB%AF%B8%EC%99%80%EC%9D%B4%EB%93%9C-%EC%8A%AC%EB%9E%99%EC%8A%A44color/3228/category/60/display/1/", 171L, first_category_index, second_category_index);
                                break;
                            case 3: // bottom > shorts
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%A7%88%EC%95%BD-%EC%95%84%EC%9D%B4%EC%8A%A4-%EC%B9%B4%EA%B3%A0-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%804color/3033/category/26/display/2/", 95L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%98%A4%ED%95%98%EC%9D%B4-%EC%8D%B8%EB%A8%B8-%EB%8D%B0%EB%8B%98%EB%B0%98%EB%B0%94%EC%A7%803color/3277/category/61/display/1/", 172L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%A0%9C%EB%A1%A0-%ED%88%AC%ED%84%B1-%EB%B0%98%EB%B0%B4%EB%94%A9-%ED%95%98%ED%94%84-%EC%8A%AC%EB%9E%99%EC%8A%A44color/3271/category/61/display/1/", 173L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EA%B8%B0%ED%9A%8D%EB%B2%A0%EC%9D%B4%EC%A7%81-%EC%AD%88%EB%A6%AC-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%8015color/3262/category/61/display/1/", 174L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%94%EC%9D%B4-%EC%BD%94%ED%8A%BC-%EC%99%80%EC%9D%B4%EB%93%9C-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%806color/3255/category/61/display/1/", 175L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EA%B3%A0%EB%B0%80%EB%8F%84-%EC%9C%88%EB%93%9C-%ED%9B%84%EB%93%9C-%EC%95%84%EB%85%B8%EB%9D%BD-%EB%B0%98%EB%B0%94%EC%A7%80-%EC%85%8B%EC%97%856color/3252/category/61/display/1/", 176L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%8D%B0%EC%9D%BC%EB%A6%AC-%ED%80%84%EB%A6%AC%ED%8B%B0-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%805color/2997/category/61/display/1/", 177L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%94%EC%9D%B4%ED%8E%98%EC%96%B4-%EB%A7%A8%ED%88%AC%EB%A7%A8-%EB%B0%98%EB%B0%94%EC%A7%80-%EC%85%8B%EC%97%856color/3241/category/61/display/1/", 178L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EB%A7%88%EC%95%BD-%EC%95%84%EC%9D%B4%EC%8A%A4-%EC%B9%B4%EA%B3%A0-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%804color/3033/category/61/display/1/", 179L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A7%88%EB%A1%A0-%EC%9B%8C%EC%8B%B1-%EC%B9%B4%EA%B3%A0%EB%B0%98%EB%B0%94%EC%A7%805color/3027/category/61/display/1/", 180L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11%EC%95%84%EC%9D%B4%EC%8A%A4-%EC%BF%A8-%EC%8A%A4%ED%8C%90-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%8013color/2699/category/61/display/1/", 181L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%ED%81%AC-%EC%9B%8C%EC%8B%B1-%EC%B9%B4%EA%B3%A0-%EB%B0%98%EB%B0%94%EC%A7%805color/2588/category/61/display/1/", 182L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%9B%8C%ED%81%AC-%ED%97%A4%EB%B9%84-%EC%AD%88%EB%A6%AC-%EB%B0%98%EB%B0%94%EC%A7%8010color/2995/category/61/display/1/", 183L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%BF%A8%EB%A7%81-%EC%9C%88%EB%93%9C%EB%B8%8C%EB%A0%88%EC%9D%B4%EC%BB%A4-%EB%B0%94%EB%9E%8C%EB%A7%89%EC%9D%B4-%EC%85%8B%EC%97%855color-%EC%84%B8%ED%8A%B8%EA%B0%80%EA%B2%A9/3059/category/61/display/1/", 184L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8D%A8%EB%A8%B8-%EC%9C%88%EB%93%9C%EB%B8%8C%EB%A0%88%EC%9D%B4%EC%BB%A4-%EC%95%84%EB%85%B8%EB%9D%BD%EC%85%8B%EC%97%853color-%EC%84%B8%ED%8A%B8%EA%B0%80%EA%B2%A9/3040/category/61/display/1/", 185L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AA%A8%EB%85%B8-%EB%A0%88%EA%B7%A4%EB%9F%AC-%ED%95%98%ED%94%84%ED%8C%AC%EC%B8%A03color/3024/category/61/display/1/", 186L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A5%B4%EB%84%A4-%ED%95%80%ED%84%B1-%EB%B0%98-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%804color/3014/category/61/display/1/", 187L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EA%B8%B0%ED%9A%8D11%EB%A1%9C%EC%9E%89-%EC%87%BC%EC%B8%A0-%EC%8A%AC%EB%9E%99%EC%8A%A47color/2986/category/61/display/1/", 188L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%EC%A7%95-%EC%95%84%EB%85%B8%EB%9D%BD-%EB%B0%98%EB%B0%94%EC%A7%80-%EC%85%8B%EC%97%854color/2964/category/61/display/1/", 189L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4: // acc
                        switch (second_category_index) {
                            case 0: // ACC > socks   가져올 때 정보 주의. 없는 것을 가져오려고 하면 에러 뜸.
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%EB%A7%88%EC%9D%BC-%EB%8D%A7%EC%8B%A0-%EC%96%91%EB%A7%902style/1962/category/67/display/1/", 190L, first_category_index, second_category_index);
                                break;
                            case 1: // ACC > scarf_muffler
                                webCrawlingMethod("https://page27.co.kr/product/%ED%95%98%EC%95%BC%ED%8A%B8-%EC%9A%B8-%EC%BA%90%EC%8B%9C-%EB%A8%B8%ED%94%8C%EB%9F%AC6color/2827/category/63/display/1/", 191L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%BC-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC4color/2819/category/63/display/1/", 192L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC6color/1684/category/63/display/1/", 193L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC3color/1567/category/63/display/1/", 194L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AA%A8%EB%8D%98-%EC%B2%B4%ED%81%AC-%EB%A8%B8%ED%94%8C%EB%9F%AC2color/1114/category/63/display/1/", 195L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B0%B0%EC%83%89-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC3color/1112/category/63/display/1/", 196L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%97%A4%EB%93%A0-%EC%B2%B4%ED%81%AC-%EB%A8%B8%ED%94%8C%EB%9F%AC2color/1088/category/63/display/1/", 197L, first_category_index, second_category_index);
                                break;
                            case 2: // ACC > jewellery   가져올 때 정보 주의. 없는 것을 가져오려고 하면 에러 뜸.
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8B%AC%ED%94%8C-%EC%B2%B4%EC%9D%B8-%ED%8C%94%EC%B0%8C/2019/category/66/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%82%AC%EA%B0%81-%EC%B2%B4%EC%9D%B8-%EB%B0%98%EC%A7%80/2016/category/66/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%84%B8%EB%A7%81925-%EC%88%9C%EC%9D%80-%EC%B2%B4%EC%9D%B8%ED%8C%94%EC%B0%8C10%EB%8F%88size/83/category/66/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%84%B8%EB%A7%81925-%EC%88%9C%EC%9D%80-%EC%B2%B4%EC%9D%B8%ED%8C%94%EC%B0%8C17%EB%8F%88size/131/category/66/display/1/", 197L, first_category_index, second_category_index);
                                break;
                            case 3: // ACC > bag
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%8F%AC-%EB%AF%B8%EB%8B%88%EB%A9%80-%ED%81%AC%EB%A1%9C%EC%8A%A4%EB%B0%B1/2756/category/62/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%9C%A0%ED%8B%B8%EB%A6%AC%ED%8B%B0-%EB%A0%88%EB%8D%94-%ED%81%AC%EB%A1%9C%EC%8A%A4%EB%B0%B1/2490/category/62/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8E%98%EC%9D%B4%EC%8A%A4-%ED%81%AC%EB%A1%9C%EC%8A%A4-%EC%97%90%EC%BD%94%EB%B0%B12color/1254/category/62/display/1/", 197L, first_category_index, second_category_index);
                                break;
                            case 4: // ACC > belt
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%94%ED%8B%B1-%EC%86%8C%EA%B0%80%EC%A3%BD-%EB%B2%A8%ED%8A%B8/1971/category/94/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%94%EC%A2%85-%EC%9D%B4%ED%83%9C%EB%A6%AC-%EB%A0%88%EB%8D%94-%EB%B2%A8%ED%8A%B84color/2487/category/94/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%9D%B4%ED%83%9C%EB%A6%AC-%EC%8A%A4%EC%9B%A8%EC%9D%B4%EB%93%9C-%EB%B2%A8%ED%8A%B84color/2890/category/94/display/1/", 197L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%8F%B4%EB%A5%B8-%EC%8A%A4%ED%8B%B0%EC%B9%98-%EC%86%8C%EA%B0%80%EC%A3%BD%EB%B2%A8%ED%8A%B83color/3006/category/94/display/1/", 197L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 5: // shoes
                        switch (second_category_index) {
                            case 0: // SHOES
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A9%9C%EB%A1%9C%EC%9A%B0-%EC%88%98%EC%A0%9C-%EB%82%98%ED%8C%8C%EB%A0%88%EB%8D%94-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/3222/category/28/display/1/", 198L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%83%8C%EB%93%9C-%ED%8D%BC-%EC%8A%AC%EB%A6%AC%ED%8D%BC2color/3178/category/28/display/1/", 199L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EA%B2%BD%EB%9F%89-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC3color/3049/category/28/display/1/", 200L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EB%B8%8C%EB%A6%AC%EB%8D%B0%EC%9D%B4-%EC%AA%BC%EB%A6%AC2color/3019/category/28/display/1/", 201L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%EC%BB%A4-%EC%97%90%EC%96%B4-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/2915/category/28/display/1/", 202L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%AC%B4%EB%93%9C-%EC%86%8C%EA%B0%80%EC%A3%BD-%EC%B2%BC%EC%8B%9C%EB%B6%80%EC%B8%A0/2816/category/28/display/1/", 203L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%EC%9B%A8%EC%9D%B4%EB%93%9C-%ED%8E%98%EB%8B%88-%EB%A1%9C%ED%8D%BC2color/2793/category/28/display/1/", 204L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%95%A4%EB%8D%94%EC%8A%A8-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%882color/2721/category/28/display/1/", 205L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/11-%EC%BF%A0%EC%85%98-%EC%BF%A8-%EC%8A%AC%EB%A6%AC%ED%8D%BC4color/2649/category/28/display/1/", 206L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%ED%81%AC%EB%A1%9C%EC%8A%A4-%EB%A0%88%EB%8D%94-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC3color/2634/category/28/display/1/", 207L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EB%94%94%EC%8A%A4-%EC%88%98%EC%A0%9C-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC/2589/category/28/display/1/", 208L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EB%A0%8C-%EB%8F%85%EC%9D%BC%EA%B5%B0-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/2373/category/28/display/1/", 209L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%A7%88%EC%83%8C%EB%8D%94-%EB%8D%94%EB%B8%94%EC%86%94-%EB%8D%94%EB%B9%84%EC%8A%88%EC%A6%88/2277/category/28/display/1/", 210L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%B2%A0%EC%9D%B4%EC%A7%81-%ED%8E%98%EB%8B%88-%EB%A1%9C%ED%8D%BC/2217/category/28/display/1/", 211L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A8%B8%EC%8A%A4%ED%8A%B8%EC%9E%87-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/2185/category/28/display/1/", 212L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9F%AC%EC%89%AC-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88-%EB%8B%A8%ED%99%945color/1298/category/28/display/1/", 213L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%ED%85%8D%EC%8A%A4-%EC%88%98%EC%A0%9C-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/1072/category/28/display/1/", 214L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EC%88%98%EC%A0%9C%ED%99%94-%EB%AF%B8%ED%95%B4%EA%B5%B0%EB%8B%A8%ED%99%94230285size/1064/category/28/display/1/", 215L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A6%AC%EC%96%BC-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88/551/category/28/display/1/", 216L, first_category_index, second_category_index);
                                webCrawlingMethod("https://page27.co.kr/product/%EB%A1%9C%EB%B2%84%ED%8A%B8-%ED%8E%98%EB%8B%88%EB%A1%9C%ED%8D%BC3color/471/category/28/display/1/", 217L, first_category_index, second_category_index);
                                break;
                            default:
                                break;
                        }
                        break;
                    default: // main carousel
//                        // TOP > shortsleeve
//                        webCrawlingMethod("https://page27.co.kr/product/11%EB%8D%B0%EC%98%A4%EB%93%9C%EB%9E%80%ED%8A%B8-%EB%A6%B0%EB%84%A8-%EB%B0%98%ED%8C%94%EB%8B%88%ED%8A%B810color/3020/category/25/display/2/", 94L, first_category_index, second_category_index);
//                        // BOTTOM > shorts
//                        webCrawlingMethod("https://page27.co.kr/product/11%EB%A7%88%EC%95%BD-%EC%95%84%EC%9D%B4%EC%8A%A4-%EC%B9%B4%EA%B3%A0-%EB%B0%B4%EB%94%A9%EB%B0%98%EB%B0%94%EC%A7%804color/3033/category/26/display/2/", 95L, first_category_index, second_category_index);
//                        // SHIRTS > basic
//                        webCrawlingMethod("https://page27.co.kr/product/%EC%98%A4%EC%85%98-%EC%BF%A8-%ED%97%A8%EB%A6%AC%EB%84%A5-%EC%85%94%EC%B8%A03color/1983/category/1/display/3/", 96L, first_category_index, second_category_index);
//                        // TOP > longsleeve
//                        webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%B4%ED%8A%B8-%EC%9C%88%EB%93%9C%EB%B8%8C%EB%A0%88%EC%9D%B4%EC%BB%A4%EC%A1%B0%EA%B1%B0%ED%8C%AC%EC%B8%A0-%EC%85%8B%EC%97%852color/2977/category/1/display/3/", 97L, first_category_index, second_category_index);
//                        // OUTER > jacket
//                        webCrawlingMethod("https://page27.co.kr/product/%EB%85%B8%EB%A9%80-%EC%9B%8C%EC%8B%B1-%EC%BD%94%ED%8A%BC%EC%9E%90%EC%BC%935color/3229/category/45/display/1/", 98L, first_category_index, second_category_index);
                        break;
                }
        }
    }

    public Long webCrawlingMethod(String itemUrl, Long idx, int first_category_index, int second_category_index) {
        try {
            Document doc = Jsoup.connect(itemUrl).get();

            Elements color = doc.select("#product_option_id1 option");

            for (int j = 2; j < color.size(); j++) {

                String tempItemName = doc.select(".name").get(0).text();
                String itemName = tempItemName.replaceAll("\\%", "-").replaceAll("\\[", "").replaceAll("\\]", "");


                Elements img = doc.select(".cont img");
                ArrayList<String> url = new ArrayList<String>();

                for (int i = 1; i < img.size(); i += 2) {
//                System.out.println(img.get(i).attr("ec-data-src"));
                    url.add("http://page27.co.kr" + img.get(i).attr("ec-data-src"));
                }

                String stringPrice = doc.select(".sale_rate").attr("item_price");
                int price = Integer.parseInt(stringPrice);

//                indexOf("~~~~") ~~ 안에 들어가는 단어를 찾는데, 없으면 StringIndexOutOfBoundsException
                String info = null;
                String size = "FREE";
                String fabric = null;
                String model = null;




                if(!(doc.text().indexOf("INFO") == -1 || doc.text().indexOf("Color") == -1)) {
                    info = doc.text().substring(doc.text().indexOf("INFO") + 4, doc.text().indexOf("Color") - 4).trim();
                }
                if (!(doc.text().indexOf("FABRIC") == -1 || doc.text().indexOf("SIZE") == -1)) {
                    fabric = doc.text().substring(doc.text().indexOf("FABRIC") + 6, doc.text().indexOf("SIZE") - 4).trim();
                }
                if (!(doc.text().indexOf("MODEL") == -1 || doc.text().indexOf("수량") == -1)) {
                    model = doc.text().substring(doc.text().indexOf("MODEL") + 5, doc.text().indexOf("수량") - 1).trim();
                }

//                String model = "174/64 FREE Size";
                int quantity = 10;

                Elements Category = doc.select(".xans-product-headcategory:last-child");
//                String firstCategory = Category.select("li:nth-child(2)").text().toLowerCase(Locale.ROOT);
//                String secondCategory = Category.select("li:nth-child(3)").text();

                String firstCategory = null;
                String secondCategory = null;
                // first category
                switch (first_category_index) {
                    case 0:
                        firstCategory = "outer";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "jacket";
                                break;
                            case 1:
                                secondCategory = "cardigan";
                                break;
                            case 2:
                                secondCategory = "coat";
                                break;
                            case 3:
                                secondCategory = "vest";
                                break;
                            case 4:
                                secondCategory = "suit";
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1:
                        firstCategory = "top";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "longsleeve";
                                break;
                            case 1:
                                secondCategory = "shortsleeve";
                                break;
                            case 2:
                                secondCategory = "knit";
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        firstCategory = "shirts";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "basic";
                                break;
                            case 1:
                                secondCategory = "check_pattern";
                                break;
                            case 2:
                                secondCategory = "stripe";
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        firstCategory = "bottom";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "cotton";
                                break;
                            case 1:
                                secondCategory = "denim";
                                break;
                            case 2:
                                secondCategory = "slacks";
                                break;
                            case 3:
                                secondCategory = "shorts";
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        firstCategory = "acc";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "socks";
                                break;
                            case 1:
                                secondCategory = "scarf_muffler";
                                break;
                            case 2:
                                secondCategory = "jewellery";
                                break;
                            case 3:
                                secondCategory = "bag";
                                break;
                            case 4:
                                secondCategory = "belt";
                                break;
                            default:
                                break;
                        }
                        break;
                    case 5:
                        firstCategory = "shoes";
                        switch (second_category_index) {
                            case 0:
                                secondCategory = "shoes";
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }

                if (firstCategory == null || secondCategory == null) {
                    break;
                }

                String direction = "";

                for (int i = 0; i < url.size(); i++) {
                    Item item = new Item();
                    if (i == 0) {
                        String repUrl = url.get(i);
//                        디렉토리 생성
                        File newFile = new File("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\" + firstCategory.toUpperCase() + "\\" + secondCategory + "\\" + itemName);


                        if (newFile.mkdirs()) {
                            logger.info("directory make ok");
                        } else {
                            logger.warn("directory can't make");
                        }
                        if (repUrl.substring(repUrl.length() - 3, repUrl.length()).equals("png")) {
                            continue;
                        }
                        URL repImgUrl = new URL(repUrl);
                        BufferedImage repImage = ImageIO.read(repImgUrl);
//                        대표사진 넣기
                        FileOutputStream repOut = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\" + firstCategory.toUpperCase() + "\\" + secondCategory + "\\" + itemName + "\\" + itemName + "0" + ".jpg");

                        String totalUrl = "/image/Item/" + firstCategory.toUpperCase() + "/" + secondCategory + "/" + itemName + "/" + itemName + i + ".jpg";

                        ImageIO.write(repImage, "jpg", repOut);
                        boolean rep = true;

                        String itemColor = color.get(j).attr("value");

                        item.setFirstCategory(firstCategory);
                        item.setSecondCategory(secondCategory);
                        item.setThirdCategory("");
                        item.setItemName(itemName);
                        item.setPrice(price);
                        item.setItemInfo(info);
                        item.setColor(itemColor);
                        item.setFabric(fabric);
                        item.setModel(model);
                        item.setSize(size);
                        item.setStockQuantity(quantity);
                        item.setSaleStatus("onsale");
                        item.setItemIdx(idx);
//                item.setImgUrl(direction);
                        item.setImgUrl(totalUrl);
                        item.setRep(rep);

                        itemRepository.save(item);

                    } else {
                        String tempUrl = url.get(i);
                        if (tempUrl.substring(tempUrl.length() - 3, tempUrl.length()).equals("png")) {
                            continue;
                        }
                        URL imgUrl = new URL(tempUrl);
                        BufferedImage image = ImageIO.read(imgUrl);
//                        두번째 사진부터 넣기
                        FileOutputStream out = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\" + firstCategory.toUpperCase() + "\\" + secondCategory + "\\" + itemName + "\\" + itemName + i + ".jpg");

                        String totalUrl = "/image/Item/" + firstCategory.toUpperCase() + "/" + secondCategory + "/" + itemName + "/" + itemName + i + ".jpg";

//                    direction += totalUrl + ',';

                        ImageIO.write(image, "jpg", out);
                        boolean rep = false;

                        String itemColor = color.get(j).attr("value");

                        item.setFirstCategory(firstCategory);
                        item.setSecondCategory(secondCategory);
                        item.setThirdCategory("");
                        item.setItemName(itemName);
                        item.setPrice(price);
                        item.setItemInfo(info);
                        item.setColor(itemColor);
                        item.setFabric(fabric);
                        item.setModel(model);
                        item.setSize(size);
                        item.setStockQuantity(quantity);
                        item.setSaleStatus("onsale");
                        item.setItemIdx(idx);
//                item.setImgUrl(direction);
                        item.setImgUrl(totalUrl);
                        item.setRep(rep);

                        itemRepository.save(item);
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return idx;
    }
}