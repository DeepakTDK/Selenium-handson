package org.deepak.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Testcase1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\seleniumwebdriver\\seleniumwebdriver\\src\\main\\java\\org\\deepak\\day1\\output1.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        String act_title = driver.getTitle();

        if(act_title.equals("Your Store")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        driver.close();

        driver.quit();
    }
}

