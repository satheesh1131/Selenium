package javascript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.resources.Reusauble_Methods;

public class NopCommerce extends Reusauble_Methods {
	
	public static void main(String[] args) throws Exception, IOException {
		WebDriver driver= new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot) driver;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
//		Reusauble_Methods.openBrowser("chrome");
//		Reusauble_Methods.loadUrl("https://demo.nopcommerce.com/");
//		Reusauble_Methods.jsScrollByElement(driver.findElement(By.cssSelector("input#newsletter-email")));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshot/JavaScript/NopCommerce/img1.png"));
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.cssSelector("input#newsletter-email")));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Screenshot/JavaScript/NopCommerce/img2.png"));
		js.executeScript("arguments[0].setAttribute('value','sathishkumar1131@gmail.com')",driver.findElement(By.cssSelector("input#newsletter-email")));
		js.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("button.button-1.newsletter-subscribe-button")));
		Thread.sleep(5000);
		String confirmMessage=(String) js.executeScript("return arguments[0].innerText;", driver.findElement(By.cssSelector("div.newsletter-result")));
		System.out.println(confirmMessage);
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/JavaScript/NopCommerce/img3.png"));
		driver.quit();
	}
}
