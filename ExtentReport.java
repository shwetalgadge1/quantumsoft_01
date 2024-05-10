package com.Utils;


	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {

    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setup() {
        
        ExtentSparkReporter spark = new ExtentSparkReporter("D:\\eclipse-workspace\\quantumsoft_1\\src\\test\\resources\\report\\extent report");
      
        extent = new ExtentReports();
        extent.attachReporter(spark);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testMethod() {
       
        test = extent.createTest("Your Test Name", "Description of Your Test");

       
        driver.get("https://www.facebook.com");

      
        
        Assert.assertEquals(driver.getTitle(), "Expected Page Title");

        
        test.log(Status.PASS, "Test Passed");
    }

    @AfterMethod
    public void teardown() {
       
        if (driver != null) {
            driver.quit();
        }

       
        extent.flush();
    }
}
