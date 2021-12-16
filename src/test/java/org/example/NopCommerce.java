package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys();
        driver.findElement(By.id("FirstName")).sendKeys("Dhiyana");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("Dhi.90@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("dhi123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("dhi123");
        driver.findElement(By.name("register-button")).click();
      String registers = driver.findElement(By.className("result")).getText();

        System.out.println(registers);

    }
}
