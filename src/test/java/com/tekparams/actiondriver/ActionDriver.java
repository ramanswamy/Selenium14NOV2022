package com.tekparams.actiondriver;
import com.tekparams.selenium.base.Base;
import com.tekparams.selenium.pageobjects.Dashboard;
import com.tekparams.selenium.pageobjects.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionDriver {
    Base base = new Base();
    Login login = new Login();
    Dashboard dashboard = new Dashboard();
    WebDriver driver;
    public WebElement element;
    public String email="ramanswamy@rediffmail.com";
    public String password="EKY9GJ";

    void getWebDriverInstance(){
        driver=base.createWebDriverInstance("chrome");
        driver.manage().window().maximize();
    }

    @Test(priority=1)
    void openApplication(){
        getWebDriverInstance();
        driver.get("https://acme-test.uipath.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @Test(priority = 2)
    void loginToApplication(){
        element=login.enterEmail(driver);
        element.sendKeys(email);
        element=login.enterPassword(driver);
        element.sendKeys(password);
        element=login.clickOnlogin(driver);
        element.click();
    }

    @Test(priority = 3)
    void validateLogin(){
        element=dashboard.findWelecomeText(driver);
        String actualResult=element.getText();
        if (actualResult.contains("Welcome"))
        {
            actualResult="Welcome";
        }
        String expectedResult="Welcome";
        Assert.assertEquals(actualResult,expectedResult,"Login Validation");
    }
}
