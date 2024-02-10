package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceOrder {
	public NopCommerceOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement firstNameTextBox;
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement lastNameTextBox;
	@FindBy(id="BillingNewAddress_Email")
	private WebElement emailTextBox;
	@FindBy(id="BillingNewAddress_Company")
	private WebElement companyTextBox;
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement countryDD;
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityTextBox;
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement addressTextBox;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement pincodeTextBox;
	@FindBy(name="BillingNewAddress.PhoneNumber")
	private WebElement phoneTextBox;
	@FindBy(xpath="//button[@onclick='Billing.save()']")
	private WebElement continueAddressButton;
	@FindBy(xpath="//button[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethodButton;
	@FindBy(xpath="//button[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethodButton;
	@FindBy(xpath="//button[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInfoButton;
	@FindBy(xpath="//button[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;
	@FindBy(xpath="//button[@class='button-1 order-completed-continue-button']")
	private WebElement continueHomeButton;
	public WebElement getCountryDD() {
		return countryDD;
	}
	public WebElement getCityTextBox() {
		return cityTextBox;
	}
	public WebElement getAddressTextBox() {
		return addressTextBox;
	}
	public WebElement getPincodeTextBox() {
		return pincodeTextBox;
	}
	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}
	public WebElement getContinueAddressButton() {
		return continueAddressButton;
	}
	public WebElement getContinueShippingMethodButton() {
		return continueShippingMethodButton;
	}
	public WebElement getContinuePaymentMethodButton() {
		return continuePaymentMethodButton;
	}
	public WebElement getContinuePaymentInfoButton() {
		return continuePaymentInfoButton;
	}
	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}
	public WebElement getContinueHomeButton() {
		return continueHomeButton;
	}
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}
	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}
	public WebElement getEmailTextBox() {
		return emailTextBox;
	}
	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}
}
