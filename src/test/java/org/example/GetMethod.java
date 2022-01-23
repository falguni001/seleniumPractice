package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locketor {
    WebDriver driver;
    String baseUrl= "https://demo.nopcommerce.com/";

    @Before
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS);
    }
    @Test
    public void Add(){
        driver.get(baseUrl);

    }
    @After
    public void TearDown(){
        driver.close();

    }








}
