package aog.ogsite.project.crawling;

import aog.ogsite.project.domain.Item;
import aog.ogsite.project.repository.ItemRepository;
import com.opencsv.CSVWriter;
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
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

@SpringBootTest
public class WebCrawling3 {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
    @Autowired
    ItemRepository itemRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void webCrawlingTest() {

//        webCrawlingMethod("https://page27.co.kr/product/%EC%97%90%EB%B8%8C%EB%A6%AC%EB%8D%B0%EC%9D%B4-%EC%AA%BC%EB%A6%AC2color/3019/category/28/display/1/", 85L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%95%A4%EB%8D%94%EC%8A%A8-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%882color/2721/category/28/display/1/", 86L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%ED%81%AC%EB%A1%9C%EC%8A%A4-%EB%A0%88%EB%8D%94-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC3color/2634/category/28/display/1/", 87L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EB%9F%AC%EC%89%AC-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%88-%EB%8B%A8%ED%99%945color/1298/category/28/display/1/", 88L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%ED%83%80%EB%B9%84-%EC%8A%A4%EB%8B%88%EC%BB%A4%EC%A6%882color/1923/category/28/display/1/", 89L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EB%A6%AC%EC%96%BC-%EC%8A%A4%EC%9B%A8%EC%9D%B4%EB%93%9C-%EB%A1%9C%ED%8D%BC3color/1753/category/28/display/1/", 90L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%85%80%EB%9F%BD-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC3color/2062/category/28/display/1/", 91L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%88%98%EC%A0%9C%ED%99%94-%EC%86%8C%EA%B0%80%EC%A3%BD-%EC%AA%BC%EB%A6%AC-%EC%8A%AC%EB%A6%AC%ED%8D%BC4color/2039/category/28/display/1/", 92L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%84%9C%ED%94%84-%EC%BF%A0%EC%85%98-%EC%8A%AC%EB%A6%AC%ED%8D%BC2color/2010/category/28/display/1/", 93L, first_category_index, second_category_index);

//        여기까지가 SHOES 크롤링

//        webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%EB%A7%88%EC%9D%BC-%EB%8D%A7%EC%8B%A0-%EC%96%91%EB%A7%902style/1962/category/67/display/1/", 84L, first_category_index, second_category_index);
//        socks

//        webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC6color/1684/category/63/display/1/", 75L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%86%8C%ED%94%84%ED%8A%B8-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC3color/1567/category/63/display/1/", 76L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EB%AA%A8%EB%8D%98-%EC%B2%B4%ED%81%AC-%EB%A8%B8%ED%94%8C%EB%9F%AC2color/1114/category/63/display/1/", 77L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EB%B0%B0%EC%83%89-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC3color/1112/category/63/display/1/", 78L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%ED%97%A4%EB%93%A0-%EC%B2%B4%ED%81%AC-%EB%A8%B8%ED%94%8C%EB%9F%AC2color/1088/category/63/display/1/", 79L, first_category_index, second_category_index);

//        webCrawlingMethod("https://page27.co.kr/product/%ED%95%98%EC%95%BC%ED%8A%B8-%EC%9A%B8-%EC%BA%90%EC%8B%9C-%EB%A8%B8%ED%94%8C%EB%9F%AC6color/2827/category/63/display/1/", 80L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EB%9D%BC%EC%9D%BC-%EC%BA%90%EC%8B%9C%EB%AF%B8%EC%96%B4-%EC%9A%B8-%EB%A8%B8%ED%94%8C%EB%9F%AC4color/2819/category/63/display/1/", 81L, first_category_index, second_category_index);

//        webCrawlingMethod("https://page27.co.kr/product/%EC%8B%AC%ED%94%8C-%EC%B2%B4%EC%9D%B8-%ED%8C%94%EC%B0%8C/2019/category/66/display/1/", 217L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%82%AC%EA%B0%81-%EC%B2%B4%EC%9D%B8-%EB%B0%98%EC%A7%80/2016/category/66/display/1/", 218L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%84%B8%EB%A7%81925-%EC%88%9C%EC%9D%80-%EC%B2%B4%EC%9D%B8%ED%8C%94%EC%B0%8C10%EB%8F%88size/83/category/66/display/1/", 219L, first_category_index, second_category_index);
//        webCrawlingMethod("https://page27.co.kr/product/%EC%8A%A4%ED%84%B8%EB%A7%81925-%EC%88%9C%EC%9D%80-%EC%B2%B4%EC%9D%B8%ED%8C%94%EC%B0%8C17%EB%8F%88size/131/category/66/display/1/", 220L, first_category_index, second_category_index);
//        jewellery

//        webCrawlingMethod("https://page27.co.kr/product/%ED%8E%98%EC%9D%B4%EC%8A%A4-%ED%81%AC%EB%A1%9C%EC%8A%A4-%EC%97%90%EC%BD%94%EB%B0%B12color/1254/category/62/display/1/", 221L, first_category_index, second_category_index);
    }

    public Long webCrawlingMethod(String itemUrl, Long idx) {

        try{
            CSVWriter writer = new CSVWriter(new FileWriter("" + ".csv"));
            String [] record = "2,Virat,Kohli,India,30".split(",");
            writer.writeNext(record);

            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

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

//                String info = doc.text().substring(doc.text().indexOf("INFO") + 4, doc.text().indexOf("Color") - 4).trim();
//                String size = "FREE";
//                String fabric = doc.text().substring(doc.text().indexOf("FABRIC") + 6, doc.text().indexOf("SIZE") - 4).trim();
//                String model = doc.text().substring(doc.text().indexOf("MODEL") + 5, doc.text().indexOf("수량") - 1).trim();
//                String model = "174/64 FREE Size";
                int quantity = 10;

                Elements Category = doc.select(".xans-product-headcategory:last-child");
//                String firstCategory = Category.select("li:nth-child(2)").text().toLowerCase(Locale.ROOT);
//                String secondCategory = Category.select("li:nth-child(3)").text();
                String firstCategory = "acc";
                String secondCategory = "bag";

                String direction = "";

                for (int i = 0; i < url.size(); i++) {
                    Item item = new Item();
                    if (i == 0) {
                        String repUrl = url.get(i);
//                        디렉토리 생성
//                        File newFile = new File("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\OUTER\\jacket\\" + itemName);
                        File newFile = new File("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\ACC\\bag\\" + itemName);
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
//                        FileOutputStream repOut = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\OUTER\\jacket\\" + itemName + "\\" + itemName + "0" + ".jpg");
                        FileOutputStream repOut = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\ACC\\bag\\" + itemName + "\\" + itemName + i + ".jpg");

                        String totalUrl = "/image/Item/ACC/bag/" + itemName + "/" + itemName + i + ".jpg";


                        ImageIO.write(repImage, "jpg", repOut);
                        boolean rep = true;

                        String itemColor = color.get(j).attr("value");

                        item.setFirstCategory(firstCategory);
                        item.setSecondCategory(secondCategory);
                        item.setThirdCategory("");
                        item.setItemName(itemName);
                        item.setPrice(price);
//                        item.setItemInfo(info);
//                        item.setColor(itemColor);
//                        item.setFabric(fabric);
//                        item.setModel(modeL, first_category_index, second_category_index);
//                        item.setSize(size);
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
//                        FileOutputStream out = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\OUTER\\jacket\\" + itemName + "\\" + itemName + i + ".jpg");
                        FileOutputStream out = new FileOutputStream("D:\\ogsite\\src\\main\\resources\\static\\image\\Item\\ACC\\bag\\" + itemName + "\\" + itemName + i + ".jpg");

                        String totalUrl = "/image/Item/ACC/bag/" + itemName + "/" + itemName + i + ".jpg";
//                    direction += totalUrl + ',';

                        ImageIO.write(image, "jpg", out);
                        boolean rep = false;

                        String itemColor = color.get(j).attr("value");

                        item.setFirstCategory(firstCategory);
                        item.setSecondCategory(secondCategory);
                        item.setThirdCategory("");
                        item.setItemName(itemName);
                        item.setPrice(price);
//                        item.setItemInfo(info);
//                        item.setColor(itemColor);
//                        item.setFabric(fabric);
//                        item.setModel(modeL, first_category_index, second_category_index);
//                        item.setSize(size);
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
        }
        return idx;
    }
}