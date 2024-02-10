package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LG_RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		boolean chennaiButton=driver.findElement(By.xpath("//label[text()='Chennai']")).isEnabled();
		boolean bangloreButton=driver.findElement(By.xpath("//label[text()='Bengaluru']")).isEnabled();
		boolean hyderabadButton=driver.findElement(By.xpath("//label[text()='Hyderabad']")).isEnabled();
		if(!chennaiButton) {
			System.out.println("CHENNAI BUTTON IS UNSELECTABLE");
		}else if(!bangloreButton){
			System.out.println("BANGLORE BUTTON IS UNSELECTABLE");
		}else if(!hyderabadButton) {
			System.out.println("HYDERABAD BUTTON IS UNSELECTABLE");
		}else {
			System.out.println("ALL BUTTONS ARE SELECTABLE");
		}
		String chromeButton=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[19]")).getAttribute("class");
		String firefoxButton=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[20]")).getAttribute("class");
		String safariButton=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[21]")).getAttribute("class");
		String edgeButton=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[22]")).getAttribute("class");
		if(chromeButton.contains("ui-state-active")) {
			System.out.println("CHROME BROWSER IS SELECTED");
		}else if(firefoxButton.contains("ui-state-active")) {
			System.out.println("FIREFOX BROWSER IS SELECTED");
		}else if(safariButton.contains("ui-state-active")) {
			System.out.println("SAFARI BROWSER IS SELECTED");
		}else if(edgeButton.contains("ui-state-active")) {
			System.out.println("EDGE BROWSER IS SELECTED");
		}else {
			System.out.println("NO BROWSER IS SELECTED");
		}
		String ageGroup1=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[23]")).getAttribute("class");
		String ageGroup2=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[24]")).getAttribute("class");
		String ageGroup3=driver.findElement(By.xpath("(//div[starts-with(@class,'ui-radiobutton-box')])[25]")).getAttribute("class");
		boolean ageSelected1=ageGroup1.contains("ui-state-active");
		boolean ageSelected2=ageGroup2.contains("ui-state-active");
		boolean ageSelected3=ageGroup3.contains("ui-state-active");
		if(!ageSelected1&&!ageSelected2&&!ageSelected3) {
			driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
		}else {
			System.out.println("ALREADY AN AGE GROUP IS SELECTED");
		}
		driver.quit();
	}
}
