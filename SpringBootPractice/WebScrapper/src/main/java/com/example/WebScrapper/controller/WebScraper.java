package com.example.WebScrapper.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebScraper {

    @GetMapping("/data")
    public String getMatchData(){
        try {
            String url = "https://www.cricbuzz.com/";
            Document document = Jsoup.connect(url).get();

            // Extract and print all links on the page
            Elements links = document.select("div."+"home_matches");
            System.out.println(links);
//            for (Element link : links) {
//                System.out.println(link.attr("href"));
//            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "done";
    }
}
