package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver  driver = WebDriverFactory.getDriver("chrome");
    @BeforeMethod
    public void setuo(){


        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");




    }




    @Test
    public void  test1() throws InterruptedException {

        WebElement firstname= driver.findElement(By.id("forename"));
        firstname.sendKeys("ibrahim");
        WebElement sirname= driver.findElement(By.cssSelector("input[name='map(lastName)']"));
        sirname.sendKeys("krl");
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown(){

driver.close();
    }





}
