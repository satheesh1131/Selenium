package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Edge {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().minimize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.findElement(By.id("APjFqb")).sendKeys("nature");
		WebElement src=driver.findElement(By.className("gNO89b"));
		src.click();
		driver.quit();
	}
}
