package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductCheck {
    public static void main(String[] args) {

            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();

            driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
        driver.findElement(By.name("submit_search")).click();
        driver.manage().window().maximize();
        //driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        driver.findElement(By.partialLinkText("Printed Chiffon ")).click();
        driver.findElements(By.className("homeslider-container"));





    }
}
