package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_LetCode {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		Actions act=new Actions(driver);
		WebElement dragElement=driver.findElement(By.xpath("//div[contains(@class,'draggable ')]"));
		WebElement dropElement=driver.findElement(By.xpath("//div[contains(@class,'droppable')]"));
		System.out.println("THE LOCATION OF DRAG ELEMENT BEFORE : "+dragElement.getLocation());
		act.dragAndDrop(dragElement, dropElement).perform();
		System.out.println("THE LOCATION OF DRAG ELEMENT AFTER : "+dragElement.getLocation());
		driver.quit();
	}
}
