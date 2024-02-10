package table_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		System.out.println(driver.findElement(By.xpath("(//p[@class='label'])[1]")).getText());
		List<WebElement> allPrice = driver.findElements(By.xpath("//table[@id='shopping']//tr//td[2]"));
		int totalPrice = 0;
		for(WebElement temp:allPrice) {
			String textPrice = temp.getText();
			totalPrice=totalPrice+Integer.parseInt(textPrice);
		}
		String total=driver.findElement(By.xpath("//table[@id='shopping']//tfoot//td[2]")).getText();
		int expectedTotal=Integer.parseInt(total);
		System.out.println("TOTAL OF ALL VALUES : "+totalPrice);
		System.out.println("EXPECTED TOTAL : "+expectedTotal);
		if(totalPrice==expectedTotal) {
			System.out.println("THE TOTAL OF RETRIVED VALUES IS EQUAL TO EXPECTED TOTAL.");
		}else {
			System.out.println("THE TOTAL OF RETRIVED VALUES IS NOT EQUAL TO EXPECTED TOTAL.");
		}
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Raj ')]")).getText());
		WebElement rajCheckbox=driver.findElement(By.xpath("//table[@id='simpletable']//tr[2]//td[4]//input[@id='second']"));
		System.out.println("BEFORE CLICKING CHECKBOX : "+rajCheckbox.isSelected());
		rajCheckbox.click();
		System.out.println("AFTER CLICKING CHECKBOX : "+rajCheckbox.isSelected());
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'working ')]")).getText());
		for(int i=2;i<=6;i++) {
		System.out.println(driver.findElement(By.xpath("//table[contains(@class,'hoverable ')]//th["+i+"]")).getText());
		List<WebElement> ElementsBefore = driver.findElements(By.xpath("//table[contains(@class,'hoverable ')]//tr//td["+i+"]"));
		System.out.print("BEFORE CLICKING : ");
		for(WebElement temp:ElementsBefore) {
			System.out.print(temp.getText()+" ");
		}
		System.out.println();
		driver.findElement(By.xpath("//table[contains(@class,'hoverable ')]//th["+i+"]//div[contains(@class,'arrowPosition ')]")).click();
		System.out.print("AFTER CLICKING : ");
		List<WebElement> ElementsAfter = driver.findElements(By.xpath("//table[contains(@class,'hoverable ')]//tr//td["+i+"]"));
		for(WebElement temp:ElementsAfter) {
			System.out.print(temp.getText()+" ");
		}
		System.out.println();
		}
		driver.quit();
	}
}
