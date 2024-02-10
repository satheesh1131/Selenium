package dropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Cher_Cher {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println(driver.findElement(By.xpath("//b[text()='Products :']")).getText());
		Select productsDD=new Select(driver.findElement(By.xpath("//select[@id='first']")));
		List<WebElement> productsOptions=productsDD.getOptions();
		System.out.println("All Options :");
		for(WebElement product:productsOptions) {
			System.out.println(product.getText());
		}
		productsDD.selectByValue("Google");
		System.out.println("Selected Option :");
		System.out.println(productsDD.getFirstSelectedOption().getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//b[text()='Animals :']")).getText());
		Select animalsDD= new Select(driver.findElement(By.xpath("//select[@id='animals']"))); 
		List<WebElement> animalsOption=animalsDD.getOptions();
		System.out.println("All Options :");
		for(WebElement animals:animalsOption) {
			System.out.println(animals.getText());
		}
		animalsDD.selectByIndex(1);
		System.out.println("Selected Option :");
		System.out.println(animalsDD.getFirstSelectedOption().getText());
		System.out.println();
		
//		System.out.println(driver.findElement(By.xpath("//b[text()='Custom Dropdown']")).getText());
//		driver.findElement(By.xpath("//button[@id='custom']")).click();
//		driver.findElement(By.xpath("//li/b[text()=' submenu']")).click();
//		System.out.println("Selected Option :");
//		System.out.println(driver.findElement(By.xpath("//li/b[text()=' submenu']")).getText());
		
		System.out.println("Food Items Multiple selection :");
		Select foodsDD = new Select(driver.findElement(By.xpath("//select[@id='second']")));
		List<WebElement> foodsOption=foodsDD.getOptions();
		System.out.println("All Options :");
		for(WebElement foods:foodsOption) {
			System.out.println(foods.getText());
		}
		foodsDD.selectByValue("pizza");
		foodsDD.selectByIndex(1);
		foodsDD.selectByVisibleText("Bonda");
		foodsDD.deselectByIndex(3);
		foodsDD.selectByValue("burger");
		System.out.println("Selected Options :");
		List<WebElement> allSelectedOptions = foodsDD.getAllSelectedOptions();
		for(WebElement n:allSelectedOptions) {
			System.out.println(n.getText());
		}
		System.out.println();
		driver.quit();
	}
}
