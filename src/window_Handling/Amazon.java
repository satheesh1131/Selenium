package window_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String primaryHandle=driver.getWindowHandle();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_6']"))).perform();
		act.contextClick().perform();
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().window(primaryHandle);
		act.moveToElement(driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles']"))).perform();
		act.contextClick().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		Set<String> handles = driver.getWindowHandles();
		Windows_LG.handleCount(handles);
		ArrayList<String> allHandles = new ArrayList<>(handles);
		Windows_LG.handleTitle(driver, allHandles);
		for(int i=0;i<allHandles.size();i++) {
		if(!allHandles.get(i).equals(primaryHandle)) {
			driver.switchTo().window(allHandles.get(i));
			driver.close();
		}
		}
		Set<String> handles2 = driver.getWindowHandles();
		Windows_LG.handleCount(handles2);
		driver.quit();
	}
}
