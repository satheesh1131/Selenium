package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_LeafGround1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		WebElement draggable=driver.findElement(By.id("form:conpnl"));
		System.out.println("THE POSITION OF ELEMENT BEFORE DRAG : "+draggable.getLocation());
		act.dragAndDropBy(draggable, 250, 0).perform();
		System.out.println("THE POSITION OF ELEMENT AFTER DRAG : "+draggable.getLocation());
		WebElement dragX=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		WebElement dragY=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		System.out.println(driver.findElement(By.id("form:logo")).getSize());
		Thread.sleep(2000);
		act.dragAndDropBy(dragY, 0,100).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(dragX, 100,0).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("form:logo")).getSize());
		driver.quit();
	}
}
