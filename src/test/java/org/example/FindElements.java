package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
// for finding  image we have to see which element is comman in all and take that attribute
public class FindElements {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        int webElementList = driver.findElements(By.className("homeslider-container")).size();
        System.out.println(webElementList);

    }
}
