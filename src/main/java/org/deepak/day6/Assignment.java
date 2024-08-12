package org.deepak.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Assignment{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day6\\assoutput.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        int count = 0;
        for(WebElement element : driver.findElements(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-results\"]"))){
            count++;
            System.out.println(element.getText());
            element.click();
            System.out.println(driver.getWindowHandle());
            driver.switchTo().window(driver.getWindowHandle());
            //driver.close();
        }

        System.out.println("count of links: "+count+1);
    }

}

