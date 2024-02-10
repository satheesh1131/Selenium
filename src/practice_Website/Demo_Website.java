package practice_Website;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Website {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		TakesScreenshot ts=(TakesScreenshot) driver;
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File location=new File("./Screenshot/practice_Web/img1.png");
		FileHandler.copy(scr, location);
		driver.findElement(By.name("first_name")).sendKeys("sathish");
		driver.findElement(By.name("last_name")).sendKeys("kumar");
		driver.findElement(By.name("business_name")).sendKeys("Greens Technology");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File( "./Screenshot/practice_Web/img2.png"));
		driver.findElement(By.name("email")).sendKeys("sathishkumar1131@gmail.com");
		driver.findElement(By.id("number")).clear();
		String num1 = driver.findElement(By.id("numb1")).getText();
		String num2 = driver.findElement(By.id("numb2")).getText();
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		int total=a+b;
		String tot=Integer.toString(total);
		driver.findElement(By.id("number")).sendKeys(tot);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("demo")));
		driver.findElement(By.id("demo")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File( "./Screenshot/practice_Web/img3.png"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'Thank')]")));
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Thank')]")).getText());
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File( "./Screenshot/practice_Web/img4.png"));
		driver.quit();
	}

}
