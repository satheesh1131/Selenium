package excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_LeafGround {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		List<WebElement> noOfFrames1=driver.findElements(By.tagName("iframe"));
		System.out.println("THE NO OF FRAMES IN THIS LAYOUT : "+noOfFrames1.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.xhtml']")));
		driver.findElement(By.id("Click")).click();
		System.out.println("THE TEXT CHANGE AFTER CLICKING : "+driver.findElement(By.id("Click")).getText());
		List<WebElement> noOfFrames2=driver.findElements(By.tagName("iframe"));
		System.out.println("THE NO OF FRAMES IN THIS LAYOUT : "+noOfFrames2.size());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.xhtml']")));
		List<WebElement> noOfFrames3=driver.findElements(By.tagName("iframe"));
		System.out.println("THE NO OF FRAMES IN THIS LAYOUT : "+noOfFrames3.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']")));
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println("THE TEXT CHANGE AFTER CLICKING : "+driver.findElement(By.id("Click")).getText());
		List<WebElement> noOfFrames4=driver.findElements(By.tagName("iframe"));
		System.out.println("THE NO OF FRAMES IN THIS LAYOUT : "+noOfFrames4.size());
		driver.switchTo().defaultContent();
		driver.quit();
	}
}
