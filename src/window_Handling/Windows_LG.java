package window_Handling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows_LG {
	static String primary;
	static int totalHandles;
	static int temp;
	public static void handleCount(Set<String> n) {
		totalHandles=n.size();
		System.out.println("THE TOTAL NUMBER OF WINDOWS : "+totalHandles);
		System.out.println("THE NUMBER OF NEWLY OPENED WINDOWS : "+(totalHandles-1));
	}
	public static void handleTitle(WebDriver temp,ArrayList<String> list) {
		System.out.println("THE LIST OF PAGE TITLE :");
		for(int i=0;i<list.size();i++) {
		temp.switchTo().window(list.get(i));
		System.out.println(temp.getTitle());
		}
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0mef7drwdsnacdlnn5mkotd7s248653.node0");
		primary=driver.getWindowHandle();
		driver.findElement(By.cssSelector("button[id='j_idt88:new']")).click();
		Set<String> handles1 = driver.getWindowHandles();
		Windows_LG.handleCount(handles1);
		ArrayList<String> allHandles1=new ArrayList<>(handles1);
		Windows_LG.handleTitle(driver, allHandles1);
		for(temp=0;temp<allHandles1.size();temp++) {
			if(!allHandles1.get(temp).equals(primary)) {
				driver.switchTo().window(allHandles1.get(temp));
				driver.close();
			}
		}
		System.out.println();
		driver.switchTo().window(primary);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		Set<String> handles2 = driver.getWindowHandles();
		ArrayList<String> allHandles2 = new ArrayList<>(handles2);
		Windows_LG.handleCount(handles2);
		Windows_LG.handleTitle(driver, allHandles2);
		for(temp=0;temp<allHandles2.size();temp++) {
			if(!allHandles2.get(temp).equals(primary)) {
				driver.switchTo().window(allHandles2.get(temp));
				driver.close();
			}
		}
		System.out.println();
		driver.switchTo().window(primary);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Set<String> handles3 = driver.getWindowHandles();
		ArrayList<String> allHandles3 = new ArrayList<>(handles3);
		Windows_LG.handleCount(handles3);
		Windows_LG.handleTitle(driver, allHandles3);
		for(temp=0;temp<allHandles3.size();temp++) {
			if(!allHandles3.get(temp).equals(primary)) {
				driver.switchTo().window(allHandles3.get(temp));
				driver.close();
			}
		}
		System.out.println();
		driver.switchTo().window(primary);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();
		wait.until(ExpectedConditions.not(ExpectedConditions.numberOfWindowsToBe(1)));
		Set<String> handles4 = driver.getWindowHandles();
		ArrayList<String> allHandles4 = new ArrayList<>(handles4); 
		Windows_LG.handleCount(handles4);
		Windows_LG.handleTitle(driver, allHandles4);
		for(temp=0;temp<allHandles4.size();temp++) {
			if(!allHandles4.get(temp).equals(primary)) {
				driver.switchTo().window(allHandles4.get(temp));
				driver.close();
			}
		}
		System.out.println();
		driver.switchTo().window(primary);
		driver.quit();
	}
}

