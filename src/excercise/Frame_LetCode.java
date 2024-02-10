package excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_LetCode{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("THE TOTAL NUMBER OF FRAMES : "+noOfFrames.size());
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("sathish");
		driver.findElement(By.name("lname")).sendKeys("kumar");
		List<WebElement> noOfFrames1 = driver.findElements(By.tagName("iframe"));
		System.out.println("THE TOTAL NUMBER OF FRAMES : "+noOfFrames1.size());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),' entered ')]")).getText());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='has-background-white']")));
		driver.findElement(By.name("email")).sendKeys("sathish@gmail.com");
		List<WebElement> noOfFrames2 = driver.findElements(By.tagName("iframe"));
		System.out.println("THE TOTAL NUMBER OF FRAMES : "+noOfFrames2.size());
		driver.switchTo().defaultContent();
		System.out.println("THE TITLE OF THE PAGE : ");
		System.out.println(driver.findElement(By.xpath("//h1[text()=' Frame']")).getText());
		driver.quit();
	}
}
