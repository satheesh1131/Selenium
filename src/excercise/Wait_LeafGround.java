package excercise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.Reusauble_Methods;

public class Wait_LeafGround extends Reusauble_Methods{
	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0t9zm3r8y4lo119bv4rknsr46d248116.node0");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/WaitLG/img1.png"));
		driver.findElement(By.cssSelector("button[name='j_idt87:j_idt89']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[name='j_idt87:j_idt90']")));
		System.out.println(driver.findElement(By.id("j_idt87:j_idt90")).getText());
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/WaitLG/img2.png"));
		driver.findElement(By.cssSelector("button[name='j_idt87:j_idt92']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[name='j_idt87:j_idt93']")));
		driver.findElement(By.cssSelector("button[id='j_idt87:j_idt95']")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/WaitLG/img3.png"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Message 2']")));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/WaitLG/img4.png"));
		driver.findElement(By.xpath("//button[@name='j_idt87:j_idt96']")).click();
		driver.findElement(By.xpath("//button[@name='j_idt87:j_idt98']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//button[@name='j_idt87:j_idt99']"),"Did you notice?"));
		System.out.println(driver.findElement(By.xpath("//button[@name='j_idt87:j_idt99']")).getText());
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/WaitLG/img5.png"));
		driver.quit();
//		Reusauble_Methods.openBrowser("chrome");
//		Reusauble_Methods.loadUrl("https://www.leafground.com/waits.xhtml;jsessionid=node0t9zm3r8y4lo119bv4rknsr46d248116.node0");
//		Reusauble_Methods.click(driver.findElement(By.xpath("//button[@name='j_idt87:j_idt98']")));
//		waitForTextChange(By.xpath("//button[@name='j_idt87:j_idt99']"), "Did you notice?");
//		System.out.println(getText(driver.findElement(By.xpath("//button[@name='j_idt87:j_idt99']"))));
	}

}
