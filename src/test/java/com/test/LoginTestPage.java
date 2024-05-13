<<<<<<< HEAD
package com.test;


	
	

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

import com.Base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
    public class LoginTestPage extends Base{
    
        WebDriver driver;

        @BeforeTest
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void loginTest() {
            WebElement usernameField = driver.findElement(By.xpath("//input[@id='email']"));
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

            
            usernameField.sendKeys("shwetal@gmail.com");
            passwordField.sendKeys("shwetal");

        
            loginButton.click();
            try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

           
            String actualUrl = "https://www.facebook.com/";
            String expectedUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl);
        }

        @AfterTest
        public void teardown() {
            driver.quit();
        }}
    


=======
package com.test;


	
	

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

import com.Base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
    public class LoginTestPage extends Base{
    
        WebDriver driver;

        @BeforeTest
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void loginTest() {
            WebElement usernameField = driver.findElement(By.xpath("//input[@id='email']"));
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

            
            usernameField.sendKeys("shwetal@gmail.com");
            passwordField.sendKeys("shwetal");

        
            loginButton.click();
            try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

           
            String actualUrl = "https://www.facebook.com/";
            String expectedUrl = driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl, actualUrl);
        }

        @AfterTest
        public void teardown() {
            driver.quit();
        }}
    


>>>>>>> 964da2e49d4e2d40a2bbcdd8044abf46c6592d44
