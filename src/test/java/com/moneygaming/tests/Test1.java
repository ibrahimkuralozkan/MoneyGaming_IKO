package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void setuo(){

        WebDriver  driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();




    }




    @Test
    public void  test1(){




    }

    @AfterMethod
    public void tearDown(){



    }





}
