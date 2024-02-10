package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("input[name='username']")).sendKeys("sathish");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sathish555");
		driver.findElement(By.cssSelector("button._acan._acap._acas._aj1-")).click();
		//driver.quit();
	}
		
		
}

