package locator;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyper_Link {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'][@class='ui-link ui-widget'])[1]")).click();
		driver.navigate().back();
		String urlOfLink=driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("href");
		String[] url=urlOfLink.split(";");
		System.out.println("THE URL OF THE LINK : ");
		System.out.println(url[0]);
		driver.findElement(By.xpath("//a[text()='Broken?']")).click();
		String brokenPageTitle=driver.getTitle();
		if(brokenPageTitle.contains("Error")) {
			System.out.println("THE LINK IS BROKEN");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='How many links in this page?']")).click();
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("TOTAL NUMBER OF LINKS IN THE PAGE : "+totalLinks.size());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		List<WebElement> layoutLinks=driver.findElements(By.tagName("a"));
		System.out.println("TOTAL NUMBER OF LINKS IN THE LAYOUT : "+layoutLinks.size());
		driver.navigate().back();
		driver.quit();
	}
}
