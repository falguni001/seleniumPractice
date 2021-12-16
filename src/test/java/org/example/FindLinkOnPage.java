package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// tagname is mostly use for  find the links
public class FindLinkOnPage {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        int links = driver.findElements(By.tagName("a")).size();
        System.out.println(links);
        driver.close();

    }

}
