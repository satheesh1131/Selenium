package dropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LetCode1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		Select dd1=new Select(driver.findElement(By.id("fruits")));
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'apple')]")).getText());
		if(dd1.isMultiple()) {
			System.out.println("IT IS A MULTIPLE DROPDOWN");
		}else {
			dd1.selectByVisibleText("Apple");
			WebElement selectedValue1=dd1.getFirstSelectedOption();
			System.out.println(selectedValue1.getText());
		}
		Select dd2=new Select(driver.findElement(By.id("lang")));
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'programming language')]")).getText());
		if(dd1.isMultiple()) {
			System.out.println("IT IS A MULTIPLE DROPDOWN");
		}else {
			dd2.selectByIndex(4);
			WebElement selectedValue2=dd2.getFirstSelectedOption();
			System.out.println(selectedValue2.getText());
			List<WebElement> allOptions=dd2.getOptions();
			System.out.println("LIST OF ALL OPTIONS IN THE ABOVE DROPDOWN :");
			for(int i=0;i<allOptions.size();i++) {
				WebElement temp=allOptions.get(i);
				System.out.println(temp.getText());
			}
		}
		Select dd3=new Select(driver.findElement(By.id("superheros")));
	    System.out.println(driver.findElement(By.xpath("//label[contains(text(),'super hero')]")).getText());
		if(dd3.isMultiple()) {
			dd3.selectByVisibleText("Ant-Man");
			dd3.selectByVisibleText("Batman");
			dd3.selectByVisibleText("Iron Man");
			List<WebElement> superHero=dd3.getAllSelectedOptions();
			for(int i=0;i<superHero.size();i++) {
				WebElement temp=superHero.get(i);
				System.out.println(temp.getText());
			}
		}else {
			System.out.println("IT IS A SINGLE DROPDOWN");
		}
		Select dd4=new Select(driver.findElement(By.id("country")));
		System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Select India')]")).getText());
		if(dd4.isMultiple()) {
			System.out.println("IT IS A MULTIPLE DROPDOWN");
		}else {
			dd4.selectByValue("India");
			WebElement selectedOption=dd4.getFirstSelectedOption();
			System.out.println(selectedOption.getText());
		}
		driver.quit();
	}
}
