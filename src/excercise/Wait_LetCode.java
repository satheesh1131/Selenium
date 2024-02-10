package excercise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_LetCode {
	
	public static void main(String[] args) throws Exception, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.get("https://letcode.in/waits");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshot/WaitLetCode/img1.png"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("button#accept")).click();
		Alert simpleAlert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(simpleAlert.getText());
		simpleAlert.accept();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshot/WaitLetCode/img3.png"));
		driver.quit();
	}

}
