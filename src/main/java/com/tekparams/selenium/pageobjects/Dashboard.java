package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
    public WebElement element;

    public WebElement findWelecomeText(WebDriver driver){
        element=driver.findElement(By.xpath("//h1[contains(text(),\"Welcome\")]"));
        return element;
    }

}
