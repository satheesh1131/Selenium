package table_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("TEXT OF ALL HEADER ELEMENT : ");
		List<WebElement> headerElements=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr//th"));
		for(int i=0;i<headerElements.size();i++) {
			System.out.println(headerElements.get(i).getText());
		}
		System.out.println("LIST OF FIRST COLUMN ELEMENTS : ");
		List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr//td[1]"));
		for(int i=0;i<firstColumn.size();i++) {
			System.out.println(firstColumn.get(i).getText());
		}
		System.out.println("LIST OF SECOND COLUMN ELEMENTS : ");
		List<WebElement> secondColumn=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr//td[2]"));
		for(int i=0;i<secondColumn.size();i++) {
			System.out.println(secondColumn.get(i).getText());
		}
		System.out.print("TOTAL NUMBER OF LINKS IN THE TABLE : ");
		List<WebElement> allLinks=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']//tr//td//a"));
		System.out.println(allLinks.size());
		driver.quit();
	}
}
