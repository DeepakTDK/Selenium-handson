package org.deepak.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day4\\output1.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);

        //isdisplayed
        boolean logostatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("logostatus isdisplayed: "+logostatus);

        //isenabled
        WebElement searchstatus = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("search isenabled: "+searchstatus.isEnabled());

        //isselected
        WebElement excstatus = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        excstatus.click();
        System.out.println("excstatus isselected: "+excstatus.isSelected());


        WebElement electclick = driver.findElement(By.xpath("//a[@title='Show products in category Electronics'][normalize-space()='Electronics']"));
        electclick.click();
        driver.close();

        driver.quit();

    }
}
