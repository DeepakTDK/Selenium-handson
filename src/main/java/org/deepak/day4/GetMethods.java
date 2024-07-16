package org.deepak.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day4\\output2.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        WebDriver driver = new ChromeDriver();

        //get(url) - open url on browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //getTitle
        System.out.println(driver.getTitle());

        //currenturl
        System.out.println(driver.getCurrentUrl());

        //pagesource
        System.out.println(driver.getPageSource());

        //windoHandle -return single window id
        System.out.println(driver.getWindowHandle());

        //windowhandles - returns multiple window ids in set<String>
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> winids = driver.getWindowHandles();
        System.out.println(winids);
    }
}
