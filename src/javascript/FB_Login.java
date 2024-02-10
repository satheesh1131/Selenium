package javascript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_Login {
	
	public static void main(String[] args) throws  InterruptedException, WebDriverException, IOException {
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/JavaScript/img1.png"));
		js.executeScript("arguments[0].setAttribute('value','Sathish')", driver.findElement(By.cssSelector("input#email")));
		js.executeScript("arguments[0].setAttribute('value','12345678')",driver.findElement(By.cssSelector("input#pass")));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/JavaScript/img2.png"));
		js.executeScript("arguments[0].click()",driver.findElement(By.cssSelector("button[name='login']")));
		Thread.sleep(5000);
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/JavaScript/img3.png"));
		driver.quit();
	}
}
