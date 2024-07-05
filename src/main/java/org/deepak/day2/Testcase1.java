package org.deepak.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //css locators handson
        //tag id - tag#id, #id (tag optional)
        WebElement inputbox = driver.findElement(By.cssSelector("input#small-searchterms"));

        //tag classname - tag.classname, .classnameid (tag optional)
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Deepak");

        //tag[att = val] or [att=val]
        driver.findElement(By.cssSelector("[placeholder = 'Search store']")).sendKeys("Deepak");

        //tag.classname[att = val] or .classname[att = val]
        driver.findElement(By.cssSelector("input.search-box-text[name = 'q']")).sendKeys("Deepak");



    }
}
