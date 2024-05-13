<<<<<<< HEAD
package com.pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    WebDriver driver;

	    @FindBy(id = "email")
	    WebElement usernameField;

	    @FindBy(id = "pass")
	    WebElement passwordField;

	    @FindBy(xpath = "//input[@type='submit']")
	    WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }
	}

=======
package com.pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    WebDriver driver;

	    @FindBy(id = "email")
	    WebElement usernameField;

	    @FindBy(id = "pass")
	    WebElement passwordField;

	    @FindBy(xpath = "//input[@type='submit']")
	    WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }
	}

>>>>>>> 964da2e49d4e2d40a2bbcdd8044abf46c6592d44
