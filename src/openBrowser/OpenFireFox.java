package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		
		driver.findElement(By.className("gNO89b")).click();
		
		
	}

}
