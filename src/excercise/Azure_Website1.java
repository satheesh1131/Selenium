package excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Azure_Website1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sathish");
		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='E_post']")).sendKeys("sathish123@gmail.com");
		driver.findElement(By.id("Mobile")).sendKeys("7639551131");
		driver.findElement(By.id("Username")).sendKeys("sathish123");
		driver.findElement(By.id("Password")).sendKeys("sathish321");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sathish321");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.print("AFTER SIGNUP, CONFIRMATION MESSAGE : ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='label-success']")));
		System.out.println(driver.findElement(By.xpath("//label[@class='label-success']")).getText());
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("Username")).sendKeys("sathish123");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("sathish321");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		System.out.print("AFTER LOGIN, WELCOME MESSAGE : ");
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.findElement(By.xpath("//a[text()='Create New']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("Name")).sendKeys("Ram");
		driver.findElement(By.id("Company")).sendKeys("Ram Automation Pvt. Ltd.");
		driver.findElement(By.id("Address")).sendKeys("Velachery");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("9944867550");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("ram9944867550@gmail.com");
		driver.findElement(By.xpath("//input[@value='Create']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("searching")).sendKeys("ram9944867550@gmail.com");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("searching")).sendKeys("ram9944867550@gmail.com");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		System.out.print("AFTER DELETION OF CUSTOMER : ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@colspan='3']")));
		System.out.println(driver.findElement(By.xpath("//td[@colspan='3']")).getText());
//		driver.findElement(By.xpath("//a[text()='Log out']")).click();
//		System.out.print("THE URL OF THE CURRENT PAGE : ");
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
	}

}
