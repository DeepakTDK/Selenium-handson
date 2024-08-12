package org.deepak.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Browserwindows {
    public static void main(String[] args) throws FileNotFoundException {
        WebDriver driver = new ChromeDriver();
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day6\\output2.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//a[normalize-space()='Twitter']")).click();

        Set<String> winids = driver.getWindowHandles();
        List<String> winidlist = new ArrayList<>(winids);

        String parentid = winidlist.get(0);
        String childid = winidlist.get(1);

        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());



    }
}
