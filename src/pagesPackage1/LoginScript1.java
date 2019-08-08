package pagesPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScript1 {

		By help = By.xpath("//*[@id=\"n-help\"]/a");
		By readersfaq= By.xpath("//*[@id=\"mw-content-text\"]/div/div[3]/p[1]/b[1]/a");
		WebDriver driver;
		
		public  LoginScript1 (WebDriver driver) {
			this.driver = driver;
		}
		
		public void clickHelp() {
			driver.findElement(help).click();
		}
		
		public void clickreadersfaq() {
			driver.findElement(readersfaq).click();
		}

}
