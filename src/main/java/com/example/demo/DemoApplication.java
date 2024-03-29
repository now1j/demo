package com.example.demo;

import com.example.demo.model.Company;
import com.example.demo.scraper.Scraper;
import com.example.demo.scraper.YahooFinanceScraper;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

 @SpringBootApplication
 @EnableScheduling
public class DemoApplication {
    public static void main(String[] args) {
         SpringApplication.run(DemoApplication.class, args);


    }
}
