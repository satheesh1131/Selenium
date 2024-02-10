package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sauce_Demo {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		Select sortProducts=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		sortProducts.selectByValue("lohi");
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("checkout")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("first-name")).sendKeys("sathish");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600042");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		System.out.println("PRICE OF THE PRODUCT(S) : ");
		System.out.println(driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText());
		driver.findElement(By.id("finish")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		System.out.println("CONFIRMATION TEXT : ");
		System.out.println(driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='complete-text']")).getText());
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();
		System.out.print("THE URL OF THE CURRENT PAGE : ");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
