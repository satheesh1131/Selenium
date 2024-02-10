package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement typeName=driver.findElement(By.id("j_idt88:name"));
		typeName.clear();
		typeName.sendKeys("Sathish kumar");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(",Tamil Nadu,India");
		WebElement checkTextBox=driver.findElement(By.id("j_idt88:j_idt93"));
		System.out.println("THE TEXT BOX IS ENABLED :");
		System.out.println(checkTextBox.isEnabled());
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		WebElement retriveText=driver.findElement(By.name("j_idt88:j_idt97"));
		System.out.println(retriveText.getAttribute("value"));
		driver.quit();
	}
}
