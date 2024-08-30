package org.deepak.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
    WebDriver driver;

    LoginPage1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbtn;


    void setUsername(String user){
        username.sendKeys(user);
    }

    void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    void clickLogin(){
        loginbtn.click();
    }
}
