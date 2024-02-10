package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Button")) {
			System.out.println("THE BUTTON IS NOT WORKING");
		}else {
			System.out.println("THE BUTTON IS WORKING AND TITLE CHANGED");
		}
		driver.navigate().back();
		System.out.println("THE BUTTON IS ENABLED :");
		System.out.println(driver.findElement(By.id("j_idt88:j_idt92")).isEnabled());
		WebElement subButton1=driver.findElement(By.id("j_idt88:j_idt94"));
		System.out.println("THE POSITION OF THE SUBMIT BUTTON_1 IN X AND Y : ");
		System.out.println(subButton1.getLocation());
		System.out.println("THE SIZE OF THE SUBMIT BUTTON_2 IN LENGTH AND HEIGHT :");
		WebElement subButton2=driver.findElement(By.id("j_idt88:j_idt98"));
		System.out.println(subButton2.getSize());
		System.out.println("THE COLOUR OF THE SAVE BUTTON IN TERMS OF RGBA :");
		WebElement saveButton=driver.findElement(By.id("j_idt88:j_idt96"));
		String saveButtonColor=saveButton.getCssValue("background-color");
		System.out.println(saveButtonColor);
		driver.quit();
	}
}
