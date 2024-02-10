package test_Class;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.page.objects.SauceDemo;
import com.resources.Reusauble_Methods;

public class Sauce_Demo extends Reusauble_Methods {
	public static void main(String[] args) {
		openBrowser("chrome");
		loadUrl("https://www.saucedemo.com/");
		implicityWait();
		SauceDemo sd = new SauceDemo(driver);
		sendText(sd.getUsernameTextBox(), "standard_user");
		sendText(sd.getPasswordTextBox(),"secret_sauce");
		click(sd.getLoginButton());
		screenShotPage("./Screenshot/SauceDemo/img1.png");
		click(sd.getOptionsButton());
		click(sd.getAboutLink());
		System.out.println(getPageTitle());
		screenShotPage("./Screenshot/SauceDemo/img2.png");
		back();
		click(sd.getCloseOptionsButton());
		List<WebElement> priceOfAllProducts = sd.getPriceOfAllProducts();
		List<String> allPricesString=new ArrayList<>();
		List<Float> allPricesFloat=new ArrayList<>();
		for(int i=0;i<priceOfAllProducts.size();i++) {
			allPricesString.add(priceOfAllProducts.get(i).getText().substring(1));
			allPricesFloat.add(i, Float.valueOf(allPricesString.get(i)));
		}
		System.out.println("List Of All Prices : "+allPricesFloat);
		float max=0.0f;
		for(float x:allPricesFloat) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println("The Maximum Price : "+max);
		int indexOfMaxPrice=allPricesFloat.indexOf(max);
		List<WebElement> addCartButton = sd.getAddCartButton();
		click(addCartButton.get(indexOfMaxPrice));
		click(sd.getShopCartButton());
		screenShotPage("./Screenshot/SauceDemo/img3.png");
		click(sd.getCheckoutButton());
		sendText(sd.getFirstNameTextbox(),"Sathish");
		sendText(sd.getLastNameTextbox(), "Kumar");
		sendText(sd.getPincodeTextbox(), "600041");
		click(sd.getContinueToOrder());
		System.out.println("Total Price Of The Order"+getText(sd.getTotalPrice()));
		screenShotPage("./Screenshot/SauceDemo/img4.png");
		click(sd.getFinishOrderButton());
		System.out.println("Order Confirmation Message : "+getText(sd.getOrderConfirmMessage()));
		screenShotPage("./Screenshot/SauceDemo/img5.png");
		click(sd.getBackHomeButton());
		closeBrowser();
	}
}
