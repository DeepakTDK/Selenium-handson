package org.deepak.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        Actions act = new Actions(driver);

        driver.findElement(By.xpath("//textarea[@id = 'inputText1']")).sendKeys("Hello");

        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        //keydown(1).keydown(2).keyup(2).keyup(1)
        //switchto newwindow(windowType.tab/window)

    }
}
