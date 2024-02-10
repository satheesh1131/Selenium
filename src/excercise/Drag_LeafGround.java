package excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_LeafGround {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("form:j_idt94:j_idt99")),driver.findElement(By.id("form:j_idt94:j_idt97"))).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Columns reordered']")));
		System.out.print("THE NOTIFICATION AFTER INTERCHANGING COLOUMN : ");
		System.out.println(driver.findElement(By.xpath("//span[text()='Columns reordered']")).getText());
		System.out.println("THE LOCATION OF DRAG ELEMENT BEFORE : "+driver.findElement(By.id("form:drag_content")).getLocation());
		System.out.println("THE TEXT OF DROP ELEMENT BEFORE : "+driver.findElement(By.id("form:drop_content")).getText());
		act.dragAndDrop(driver.findElement(By.id("form:drag_content")),driver.findElement(By.id("form:drop_content"))).perform();
		System.out.println("THE LOCATION OF DRAG ELEMENT AFTER : "+driver.findElement(By.id("form:drag_content")).getLocation());
		System.out.println("THE TEXT OF DROP ELEMENT AFTER : "+driver.findElement(By.id("form:drop_content")).getText());
		act.dragAndDrop(driver.findElement(By.xpath("(//tr[@data-ri='5'])[2]")), driver.findElement(By.xpath("(//tr[@data-ri='0'])[2]"))).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'from')]")));
		System.out.print("THE NOTIFICATION AFTER INTERCHANGING ROWS : ");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'from')]")).getText());
		WebElement startSlider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		WebElement endSlider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println("THE POSITION OF START AND END SLIDER BEFORE : "+startSlider.getAttribute("style")+" "+endSlider.getAttribute("style"));
		act.dragAndDropBy(startSlider, 40 , 0).perform();
		act.dragAndDropBy(endSlider, 100 , 0).perform();
		System.out.println("THE POSITION OF START AND END SLIDER AFTER : "+startSlider.getAttribute("style")+" "+endSlider.getAttribute("style"));
		driver.quit();
	}

}
