package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;

    //before    -setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //maximize browser to window
        driver.manage().window().maximize();

        driver.navigate().to("https://www.tel-ran.com/");   //with history

        //wait for all elements on site to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.get("https://www.tel-ran.com/");    //without history
        //driver.navigate().to("https://www.google.com/");  //with history
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Google opened!!!");
    }

    //after     -tearDown
    @AfterMethod(enabled = true)
    public void tearDown(){
        //driver.quit();     //all tabs and browser
        driver.close();      //only one tab
    }

}
