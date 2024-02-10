package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LG_DropDown {

	public static void main(String[] args) {
		int i;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select/option[text()='Selenium']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		for(i=1;i<3;i++) {
			try {
				driver.findElement(By.xpath("//label[text()='Select City']")).click();
				driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
			}catch(Exception n) {
			}
		}
		WebElement courses=driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		courses.sendKeys("AWS");
		courses.sendKeys(Keys.ENTER);
		courses.sendKeys("Selenium WebDriver");
		courses.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		for(i=1;i<3;i++) {
			try {
				driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
				driver.findElement(By.xpath("//li[@data-label='Two']")).click();
			}catch(Exception n) {
			}
		}
		driver.quit();
	}
}
