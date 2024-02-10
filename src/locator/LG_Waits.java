package locator;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LG_Waits {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt89')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id,'j_idt87:j_idt90')]")));
		System.out.println("The Hidden Button Is Visible");
		driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt90')]")).click();
		driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt92')]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(@id,'j_idt87:j_idt93')]")));
		System.out.println("The Button Is Hidden");
		driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt95')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id,'j_idt87:j_idt96')]")));
		driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt96')]")).click();
		WebElement textChange=driver.findElement(By.xpath("//button[contains(@name,'j_idt87:j_idt99')]"));
		driver.findElement(By.xpath("//button[contains(@name,'j_idt87:j_idt98')]")).click();
		String textBfrChange=textChange.getText();
		System.out.println("Text Before Change : "+textBfrChange);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//button[contains(@name,'j_idt87:j_idt99')]"), textBfrChange));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id,'j_idt87:j_idt99')]")));
		String textAftrChange=driver.findElement(By.xpath("//button[contains(@id,'j_idt87:j_idt99')]")).getText();
		System.out.println("Text After Change : "+textAftrChange);
		driver.quit();
	}
}
