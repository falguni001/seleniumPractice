package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {
    public static void main(String[] args) {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");

  WebElement searchbutton = driver.findElement(By.id("email"));
searchbutton.click();
searchbutton.sendKeys("f.patel208@gmail.com");
WebElement password = driver.findElement(By.id("passwd"));
password.sendKeys("megha12");
WebElement singhbutton= driver.findElement(By.id("SubmitLogin"));
singhbutton.click();
driver.close();
    }
}