package org.deepak.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement drpElement = driver.findElement(By.xpath("//select[@id='country']"));
        Select drp = new Select(drpElement);

        //select dropdown

        drp.selectByVisibleText("United States");
        drp.selectByValue("usa");
        drp.selectByIndex(1);

        List<WebElement> options = drp.getOptions();

        System.out.println(options.size());

        for(WebElement el : options){
            System.out.println(el.getText());
        }

        //bootstrap drps
        //hidden drps
    }
}
