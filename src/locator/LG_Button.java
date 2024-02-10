package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LG_Button {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt90']")).click();
		String dashPageTitle=driver.getTitle();
		if(!pageTitle.equals(dashPageTitle)) {
			System.out.println("THE PAGE TITLE CHANGED TO DASHBOARD.");
		}
		driver.navigate().back();
		boolean button=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println("THE BUTTON IS ENABLED : "+button);
		System.out.println("THE POSITION OF SUBMIT BUTTON :");
		System.out.println(driver.findElement(By.xpath("//*[@name='j_idt88:j_idt94']")).getLocation());
		WebElement saveButton=driver.findElement(By.xpath("//*[@name='j_idt88:j_idt96']"));
		System.out.println("THE COLOUR OF SAVE BUTTON IN TERM OF RBGA :");
		System.out.println(saveButton.getCssValue("background-color"));
		System.out.println("THE SIZE OF THE SUBMIT BUTTON IN MM:");
		System.out.println(driver.findElement(By.xpath("//*[@name='j_idt88:j_idt98']")).getSize());
		Actions action=new Actions(driver);
		WebElement sucessButton=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		String sucessButtonColor=sucessButton.getCssValue("background-color");
		action.moveToElement(sucessButton).build().perform();
		String sucessButtonColorAfter=sucessButton.getCssValue("background-color");
		if(sucessButtonColor.equals(sucessButtonColorAfter)) {
			System.out.println("THE COLOR OF THE BUTTON REMAINS SAME AFTER MOUSEHOVER");
		}else {
			System.out.println("THE COLOR OF THE BUTTON CHANGES AFTER MOUSEHOVER");
		}
		driver.findElement(By.xpath("//span[starts-with(text(),'Im')]")).click();
		WebElement infoButton=driver.findElement(By.cssSelector("button[id='j_idt88:j_idt110']"));
		infoButton.click();
		try {
			driver.findElement(By.cssSelector("button[id='j_idt88:j_idt107']")).click();
		}catch(Exception n) {
			driver.findElement(By.xpath("//span[starts-with(text(),'Im')]")).click();
			driver.findElement(By.cssSelector("button[id='j_idt88:j_idt107']")).click();
		}
		driver.quit();
	}
}
