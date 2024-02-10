package excercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_LeafGround1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0yvt5rzgzieg85579eqogvrk1236345.node0");
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt91']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN SIMPLE ALERT : "+simpleAlert.getText());
		simpleAlert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt93']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN CONFIRM ALERT : "+confirmAlert.getText());
		confirmAlert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']")).click();
		System.out.println("THE TEXT IN THE SWEET ALERT : ");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'dialog')]")).getText());
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).click();
		System.out.println("THE TEXT IN THE MODAL ALERT : ");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Unless you close this')]")).getText());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(@class,'close ui-corner')])[2]")));
		driver.findElement(By.xpath("(//a[contains(@class,'close ui-corner')])[2]")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("THE TEXT IN PROMPT ALERT : "+promptAlert.getText());
		promptAlert.sendKeys("Sathish");
		promptAlert.accept();
		System.out.println("NOTIFICATION AFTER PROMPT ALERT : ");
		System.out.println(driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt106']")).click();
		System.out.println("TEXT IN THE SWEET ALERT : ");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'proceed')]")));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'proceed')]")).getText());
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt108']")).click();
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt111']")).click();
		System.out.println("TEXT IN THE ALERT : ");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'maximized ')]")).getText());
		driver.findElement(By.xpath("//a[contains(@class,'maximize ui-corner')]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'close ui-corner')])[3]")).click();
		driver.quit();
	}
}
