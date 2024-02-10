package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Temp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Cities ')]")).getText());
		Select dd3=new Select(driver.findElement(By.id("j_idt87:city_input")));
		dd3.selectByValue("Chennai");
		WebElement selectedValue3=dd3.getFirstSelectedOption();
		System.out.println(selectedValue3.getText());
		
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'language randomly')]")).getText());
		Select dd4=new Select(driver.findElement(By.id("j_idt87:lang_input")));
		dd4.selectByIndex(1);
		WebElement selectedValue4=dd4.getFirstSelectedOption();
		System.out.println(selectedValue4.getText());
		
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'irrespective')]")).getText());
		Select dd5=new Select(driver.findElement(By.id("j_idt87:value_input")));
		dd5.selectByValue("Two");
		WebElement selectedValue5=dd5.getFirstSelectedOption();
		System.out.println(selectedValue5.getText());
		
		Actions act= new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		act.sendKeys(Keys.PAGE_DOWN).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form:logo")));
		System.out.println("THE SIZE OF IMAGE BEFORE : "+driver.findElement(By.id("form:logo")).getSize());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']")));
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']")), 0, 10).perform();
		act.dragAndDropBy(driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']")), 10, 0).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Width')]")));
		System.out.println("THE SIZE OF IMAGE AFTER : "+driver.findElement(By.xpath("//p[contains(text(),'Width')]")).getText());

	}

}
