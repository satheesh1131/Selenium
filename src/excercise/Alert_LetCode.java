package excercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_LetCode {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN THE SIMPLE ALERT : "+simpleAlert.getText());
		simpleAlert.accept();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN THE CONFIRM ALERT : "+confirmAlert.getText());
		confirmAlert.dismiss();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN THE PROMPT ALERT : "+promptAlert.getText());
		promptAlert.sendKeys("Sathish");
		promptAlert.accept();
		System.out.print("THE NOTIFICATION AFTER THE PROMPT ALERT : ");
		System.out.println(driver.findElement(By.xpath("//p[@id='myName']")).getText());
		driver.findElement(By.xpath("//button[@class='button is-success']")).click();
		System.out.println("THE NOTIFICATION AFTER THE SWEET ALERT : ");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Modern ')]")).getText());
		driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		driver.quit();
	}

}
