package org.deepak.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By txt_username_loc =By.xpath("//input[@placeholder='Username']");
    By txt_password_loc =By.xpath("//input[@placeholder='Password']");
    By btn_login_loc =By.xpath("//button[@type='submit']");

    void setUsername(String user){
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    void setPassword(String pwd){
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    void clickLogin(){
        driver.findElement(btn_login_loc).click();
    }


}
