package org.deepak.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //mouse hover
        driver.get("https://demo.opencart.com/en-gb?route=common/home");
        WebElement dtop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions act = new Actions(driver);
        act.moveToElement(dtop).moveToElement(mac).build().perform();

        //right click
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rc = driver.findElement(By.xpath("//span[normalize-space() = 'right click me']"));
        //Actions act = new Actions(driver);
        act.contextClick(rc).perform();

        //same for doubleClick
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement src = driver.findElement(By.xpath("//div[@id = 'box5']"));
        WebElement target = driver.findElement(By.xpath("//div[@id = 'box106']"));
        //Actions act = new Actions(driver);
        act.dragAndDrop(src, target).perform();

        //darganddropby(elem, 100, 200), getLocation

    }
}
