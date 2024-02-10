package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceShopping {
	public NopCommerceShopping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a[text()='Computers ']")
	private WebElement toggleMenuComputers;
	@FindBy(css = "select#products-orderby")
	private WebElement productSortDD;
	@FindBy(css = "select#products-pagesize")
	private WebElement displayPageSizeDD;
	@FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/2/1/1\"),!1']")
	private WebElement digitalStormAddCart;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	@FindBy(id = "termsofservice")
	private WebElement termAndConditionCheckBox;
	@FindBy(id = "checkout")
	private WebElement CheckoutButton;
	@FindBy(xpath = "//button[text()='Checkout as Guest']")
	private WebElement chechOutGuestButton;
	@FindBy(xpath="//img[@alt='Picture for category Desktops']")
	private WebElement desktopButton;
	public WebElement getDesktopButton() {
		return desktopButton;
	}
	public WebElement getToggleMenuComputers() {
		return toggleMenuComputers;
	}
	public WebElement getProductSortDD() {
		return productSortDD;
	}
	public WebElement getDisplayPageSizeDD() {
		return displayPageSizeDD;
	}
	public WebElement getDigitalStormAddCart() {
		return digitalStormAddCart;
	}
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
	public WebElement getTermAndConditionCheckBox() {
		return termAndConditionCheckBox;
	}
	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}
	public WebElement getChechOutGuestButton() {
		return chechOutGuestButton;
	}
}
