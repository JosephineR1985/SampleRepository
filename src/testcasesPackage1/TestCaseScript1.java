package testcasesPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesPackage1.LoginScript1;

public class TestCaseScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		LoginScript1 clickpage = new LoginScript1(driver);
		clickpage.clickHelp();
		clickpage.clickreadersfaq();
		//driver.quit();
	}

}
