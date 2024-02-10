package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'favorite')]")).getText());
		Select dd1=new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		dd1.selectByVisibleText("Selenium");
		WebElement selectedValue1=dd1.getFirstSelectedOption();
		System.out.println(selectedValue1.getText());
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'country')]")).getText());
		wait.until(ExpectedConditions.elementToBeSelected(By.id("j_idt87:country_input")));
		Select dd2=new Select(driver.findElement(By.xpath("//select[@id='j_idt87:country_input']")));
		dd2.selectByValue("India");
		WebElement selectedValue2=dd2.getFirstSelectedOption();
		System.out.println(selectedValue2.getText());
		
		}
}
