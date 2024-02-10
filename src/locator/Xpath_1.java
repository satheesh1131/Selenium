package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath_1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement typeName=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
		typeName.clear();
		typeName.sendKeys("sathish kumar");
		driver.findElement(By.xpath("//*[@name='j_idt88:j_idt91']")).sendKeys(",India");
		boolean textBox=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']")).isEnabled();
		System.out.println("THE TEXTBOX IS ENABLED : "+textBox);
		driver.findElement(By.xpath("//*[@value='Can you clear me, please?']")).clear();
		String retriveText=driver.findElement(By.xpath("//*[@name='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(retriveText);
		WebElement emailInput=driver.findElement(By.xpath("//input[contains(@id,'j_idt88:j_idt99')]"));
		String emailInputText=emailInput.getText();
		emailInput.sendKeys("sathish@gmail.com");
		emailInput.sendKeys(Keys.TAB);
		String aboutYourselfTextBox=driver.findElement(By.xpath("//textarea[contains(@id,'j_idt88:j_idt101')]")).getText();
		if(aboutYourselfTextBox.equals(emailInputText)) {
			System.out.println("THE TAB KEY DID NOT MOVE THE CURSOR TO NEXT TEXTBOX.");
		}else {
			System.out.println("THE TAB KEY MOVE THE CURSOR TO NEXT TEXTBOX.");
		}
		driver.findElement(By.xpath("//textarea[contains(@id,'j_idt88:j_idt101')]")).sendKeys("I am learning Java Selenium");
		WebElement ageTextBox=driver.findElement(By.xpath("//input[contains(@id,'j_idt106:thisform:age')]"));
		ageTextBox.click();
		ageTextBox.sendKeys(Keys.ENTER);
		String errorMessage=driver.findElement(By.xpath("//span[contains(@id,'j_idt106:thisform:j_idt110_error-detail')]")).getText();
		System.out.println("THE ERROR MESSAGE IS : "+errorMessage);
		driver.quit();
	}
}
