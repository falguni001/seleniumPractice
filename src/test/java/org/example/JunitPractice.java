package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JunitPractice {
    WebDriver driver;
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }
    @Test
    public void Production (){
        driver.get(baseUrl);
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
        driver.findElement(By.name("submit_search")).click();

    }
    @After
    public  void TearDown(){
        driver.close();
    }

}