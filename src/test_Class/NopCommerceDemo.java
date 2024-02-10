package test_Class;

import com.page.objects.NopCommerceOrder;
import com.page.objects.NopCommerceShopping;
import com.resources.Reusauble_Methods;

public class NopCommerceDemo extends Reusauble_Methods{
	public static void main(String[] args) {
		openBrowser("chrome");
		loadUrl("https://demo.nopcommerce.com/");
		implicityWait();
		screenShotPage("./Screenshot/NopCommerce/img1.png");
		NopCommerceShopping ncs = new NopCommerceShopping(driver);
		click(ncs.getToggleMenuComputers());
		click(ncs.getDesktopButton());
		screenShotPage("./Screenshot/NopCommerce/img2.png");
		selectByValue(ncs.getProductSortDD(),"10");
		selectByIndex(ncs.getDisplayPageSizeDD(),0);
		reload();
		click(ncs.getDigitalStormAddCart());
		click(ncs.getShoppingCart());
		screenShotPage("./Screenshot/NopCommerce/img3.png");
		click(ncs.getTermAndConditionCheckBox());
		click(ncs.getCheckoutButton());
		click(ncs.getChechOutGuestButton());
		NopCommerceOrder nco = new NopCommerceOrder(driver);
		sendText(nco.getFirstNameTextBox(), "Sathish");
		sendText(nco.getLastNameTextBox(), "Kumar");
		sendText(nco.getEmailTextBox(), "sathish@gmail.com");
		sendText(nco.getCompanyTextBox(), "Greens Technology");
		selectByValue(nco.getCountryDD(),"133");
		sendText(nco.getCityTextBox(),"Chennai");
		sendText(nco.getAddressTextBox(),"Velachery");
		sendText(nco.getPincodeTextBox(),"600041");
		sendText(nco.getPhoneTextBox(),"9922558811");
		screenShotPage("./Screenshot/NopCommerce/img4.png");
		click(nco.getContinueAddressButton());
		waitForElementClickable(nco.getContinueShippingMethodButton());
		click(nco.getContinueShippingMethodButton());
		click(nco.getContinuePaymentMethodButton());
		click(nco.getContinuePaymentInfoButton());
		click(nco.getConfirmOrderButton());
		screenShotPage("./Screenshot/NopCommerce/img5.png");
		waitForElementVisible(nco.getContinueHomeButton());
		screenShotPage("./Screenshot/NopCommerce/img6.png");
		click(nco.getContinueHomeButton());
		closeBrowser();
	}
}
