package org.deepak.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //using relative xpath
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("samsung galaxy f15");

        //using multiple attributes
        driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("samsung galaxy f15");

        //using 'and' 'or' in xpath
        driver.findElement(By.xpath("//input[@id='small-searchterms' and @name = 'q']")).sendKeys("samsung galaxy f15");
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name = 'qr']")).sendKeys("samsung galaxy f15");

        //using innertext text()
        driver.findElement(By.xpath("//a[text() = 'Build your own computer']")).click();

        //using contains
        System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'topic-block-bo')]")).getText());

        //using starts-with
        System.out.println(driver.findElement(By.xpath("//div[starts-with(@class, 'topic-block-bo')]")).getText());

        //chained xpath - relative + abs combined (l-r)
        System.out.println(driver.findElement(By.xpath("//a[@class = 'nivo-imageLink']")).getSize());

    }
}
