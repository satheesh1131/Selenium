package com.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	public FbLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement userNameInput;
	@FindBy(name="pass")
	private WebElement passWordInput;
	@FindBy(name="login")
	private WebElement loginButton;
	@FindBy(xpath="//img[@alt='Facebook']")
	private WebElement fbIcon;
	public WebElement getUserNameInput() {
		return userNameInput;
	}
	public WebElement getPassWordInput() {
		return passWordInput;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getFbIcon() {
		return fbIcon;
	}
}
