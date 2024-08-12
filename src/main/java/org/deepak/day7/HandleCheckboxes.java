package org.deepak.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));

        for(WebElement checkbox :checkboxes){
            checkbox.click();
        }

        for(WebElement checkbox :checkboxes){
            checkbox.click();
        }

        for(int i=3; i<checkboxes.size(); i++){
            checkboxes.get(i).click();
        }

        for(WebElement checkbox: checkboxes){
            if(checkbox.isSelected()){
                checkbox.click();
            }
        }

    }
}
