package table_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("TEXT OF ALL HEADER ELEMENT : ");
		List<WebElement> headerElements=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//th"));
		for(int i=0;i<headerElements.size();i++) {
			System.out.println(headerElements.get(i).getText());
		}
		List<WebElement> allElements=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//td"));
		System.out.println("ALL ELEMENT TEXT EXCEPT HEADER : ");
		for(int i=0;i<allElements.size();i++) {
			System.out.println(allElements.get(i).getText());
		}
		System.out.println("TEXT OF SINGLE ROW ELEMENT : ");
		List<WebElement> rowElements=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr[5]//td"));
		for(int i=0;i<rowElements.size();i++) {
			System.out.println(rowElements.get(i).getText());
		}
		System.out.println("TEXT OF PARTICULAR ELEMENT : ");
		WebElement singleElement=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr[4]//td[2]"));
		System.out.print(singleElement.getText());
		driver.quit();
	}

}
