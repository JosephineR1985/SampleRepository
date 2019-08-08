package testcasesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesPackage.LoginScript;

public class TestCaseScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		LoginScript login = new LoginScript(driver);
		login.clickLoginLink();
		login.typeUsername();
		login.typePassword();
		login.loginButton();
		//driver.quit();
	}

}
