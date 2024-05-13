<<<<<<< HEAD
package com.Utils;


	

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent_report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

       
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Start ExtentTest
        test = extent.createTest("Facebook Login Test", "Test to validate Facebook login functionality");

        driver.get("https://www.facebook.com/");

        
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email@example.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");

       
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

       
        test.log(Status.INFO, "Clicked on login button");

        // Check if login is successful (you can add more validation steps here)
        if (driver.getTitle().equals("Facebook")) {
            test.log(Status.PASS, "Login successful");
        } else {
            test.log(Status.FAIL, "Login failed");
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        
        if (result.getStatus() == ITestResult.FAILURE) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String fileName = "screenshot_" + timestamp + ".png";
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotPath = "screenshots/" + fileName;
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            test.addScreenCaptureFromPath(screenshotPath);
        }

       
       

       
        extent.flush();
    }
}

=======
package com.Utils;


	

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
    private WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeMethod
    public void setUp() {
        
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent_report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

       
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Start ExtentTest
        test = extent.createTest("Facebook Login Test", "Test to validate Facebook login functionality");

        driver.get("https://www.facebook.com/");

        
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email@example.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");

       
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

       
        test.log(Status.INFO, "Clicked on login button");

        // Check if login is successful (you can add more validation steps here)
        if (driver.getTitle().equals("Facebook")) {
            test.log(Status.PASS, "Login successful");
        } else {
            test.log(Status.FAIL, "Login failed");
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        
        if (result.getStatus() == ITestResult.FAILURE) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String fileName = "screenshot_" + timestamp + ".png";
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotPath = "screenshots/" + fileName;
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            test.addScreenCaptureFromPath(screenshotPath);
        }

       
       

       
        extent.flush();
    }
}

>>>>>>> 964da2e49d4e2d40a2bbcdd8044abf46c6592d44
