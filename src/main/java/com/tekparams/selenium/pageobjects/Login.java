package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebDriver driver;
    public WebElement element;

    public WebElement enterEmail(WebDriver driver){
        element=driver.findElement(By.id("email"));
        return element;
    }
    public WebElement enterPassword(WebDriver driver){
        element=driver.findElement(By.id("password"));
        return element;
    }
    public WebElement clickOnlogin(WebDriver driver){
        element=driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
        return element;
    }

}
