package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		driver.findElement(By.id("email")).sendKeys("sathishscream");
		driver.findElement(By.id("pass")).sendKeys("sathish");
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
	}

}
