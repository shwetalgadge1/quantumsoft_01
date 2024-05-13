<<<<<<< HEAD
package com.Base;



	

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

			public class Base {
			public static void main(String[] args) {
			      
		
			        WebDriver driver = new ChromeDriver();
			        WebDriverManager.chromedriver().setup();
			        
			        driver.get("https://www.facebook.com/");
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}

			        driver.quit();
			    }
		}
		
		
		
		
		
		
		
	

=======
package com.Base;



	

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

			public class Base {
			public static void main(String[] args) {
			      
		
			        WebDriver driver = new ChromeDriver();
			        WebDriverManager.chromedriver().setup();
			        
			        driver.get("https://www.facebook.com/");
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}

			        driver.quit();
			    }
		}
		
		
		
		
		
		
		
	

>>>>>>> 964da2e49d4e2d40a2bbcdd8044abf46c6592d44
