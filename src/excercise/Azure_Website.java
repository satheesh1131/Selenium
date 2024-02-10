package excercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Azure_Website {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("Sathish Kumar");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7639551131");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sathish@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sathish");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("no.1 , Ramnagar , Velachery , Chennai.");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.id("wednesday")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		Select tourCountry=new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
		if(tourCountry.isMultiple()==true) {
			tourCountry.selectByValue("1");
			tourCountry.selectByVisibleText("Italy");
			tourCountry.selectByIndex(5);
		}else {
			tourCountry.selectByVisibleText("Finland");
		}
		driver.findElement(By.xpath("//label[@for='3years']")).click();
		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		driver.findElement(By.xpath("//label[@for='testng']")).click();
		driver.findElement(By.xpath("//label[@for='cucumber']")).click();
		driver.quit();
	}
}
