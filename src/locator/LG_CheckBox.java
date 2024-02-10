package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LG_CheckBox {
	
	public static void main(String[] args) {
		String notify="";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		notify=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();
		System.out.println("THE NOTIFICATION IS :"+notify);
		WebElement triStateBox=driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']"));
		boolean triStateBoxSelect=triStateBox.isSelected();
		System.out.println("TRISTATE CHECKBOX IS SELECTED :"+triStateBoxSelect);
		triStateBox.click();
		System.out.println("TRISTATE CHECKBOX IS SELECTED : State1");
		triStateBox.click();
		System.out.println("TRISTATE CHECKBOX IS SELECTED : State2");
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean checkBox=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
		if(checkBox) {
		System.out.println("THE CHECKBOX IS ENABLED. ");
		}else {
			System.out.println("THE CHECKBOX IS DISABLED.");
		}
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		driver.findElement(By.xpath("(//div[starts-with(@class,'ui-chkbox-box')])[11]")).click();
		driver.findElement(By.xpath("(//div[starts-with(@class,'ui-chkbox-box')])[12]")).click();
		driver.findElement(By.xpath("(//div[starts-with(@class,'ui-chkbox-box')])[15]")).click();
		driver.quit();
	}
}
