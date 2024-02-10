package practice_Website;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemo {
	public static void main(String[] args) throws Exception, IOException {
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot) driver;
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img1.png"));
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input#login-button")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img2.png"));
		driver.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
		driver.findElement(By.cssSelector("a#about_sidebar_link")).click();
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//img[@alt='quote']")));
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img3.png"));
		driver.navigate().back();
		driver.findElement(By.cssSelector("button#react-burger-cross-btn")).click();
		List<WebElement> price=driver.findElements(By.cssSelector("div.inventory_item_price"));
		ArrayList<String> priceString= new ArrayList<>();
		ArrayList<Float> priceFloat=new ArrayList<>();
		for(int i=0;i<price.size();i++) {
			priceString.add(i, price.get(i).getText());
			String temp=priceString.get(i).substring(1);
			float temp1=Float.parseFloat(temp);
			priceFloat.add(i, temp1);
		}
		System.out.println("LIST OF PRODUCT PRICES : "+priceFloat);
		float max=0.0f;
		for(float x:priceFloat) {
			if(x>=max) {
				max=x;
			}
		}
		System.out.println("THE MAXIMUM PRICE VALUE : "+max);
		int maxPriceIndex=priceFloat.indexOf(max);
		driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])["+(maxPriceIndex+1)+"]")).click();
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img4.png"));
		driver.findElement(By.cssSelector("button#checkout")).click();
		driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("sathish");
		driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@data-test='postalCode']")).sendKeys("600042");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img5.png"));
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img6.png"));
		driver.findElement(By.xpath("//button[@data-test='finish']")).click();
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Screenshot/practice_Web/SauceDemo/img7.png"));
		System.out.println("THE ORDER CONFIRMATION MESSAGE :");
		System.out.println(driver.findElement(By.cssSelector("h2.complete-header")).getText());
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		driver.quit();
	}
}
