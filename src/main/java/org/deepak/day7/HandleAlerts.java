package org.deepak.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //using explicit wait
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alt = wait.until(ExpectedConditions.alertIsPresent());
        alt.accept();

        //normal
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();

        //confrimation
        driver.findElement((By.xpath("//button[@onclick='jsConfirm()']"))).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        //prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("dk");
        alert.accept();

    }
}
