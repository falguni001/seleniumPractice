package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TravelDemo {
    WebDriver driver ;
    String baseUrl ="https://phptravels.com/demo/ ..";


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @Test
    public void openHomePage(){
        driver.get(baseUrl);
       // driver.findElement(By.xpath("/html/body/header/div/nav/a[1]"));
        driver.findElement(By.cssSelector("body > header > div > nav > a:nth-child(1)"));

    }
    @After
    public void tearDown(){

    }
}
