package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScript {

		By loginLink = By.xpath("//*[@id=\"pt-login\"]/a");
		By userName= By.xpath("//*[@id=\"wpName1\"]");
		By password = By.xpath("//*[@id=\"wpPassword1\"]");
		By login = By.xpath("//*[@id=\"wpLoginAttempt\"]");
		WebDriver driver;
		
		public  LoginScript (WebDriver driver) {
			this.driver = driver;
		}
		
		public void clickLoginLink() {
			driver.findElement(loginLink).click();
		}
		
		public void typeUsername() {
			driver.findElement(userName).sendKeys("Josephine Rathinam");
		}
		
		public void typePassword() {
			driver.findElement(password).sendKeys("maryjo23");
		}
		
		public void loginButton() {
			driver.findElement(login).click();
	}
}
