package org.deepak.day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Navigation {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day6\\output.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
