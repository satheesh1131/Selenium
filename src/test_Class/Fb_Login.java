package test_Class;

import com.page.objects.FbLoginPage;
import com.resources.Reusauble_Methods;

public class Fb_Login  extends Reusauble_Methods{

	public static void main(String[] args) {
		openBrowser("chrome");
		loadUrl("https://www.facebook.com/");
		FbLoginPage fb=new FbLoginPage(driver);
		screenShotElement(fb.getFbIcon(), "./Screenshot/fbIcon.png");
		sendText(fb.getUserNameInput(),"sathish");
		sendText(fb.getPassWordInput(), "1234567");
		click(fb.getLoginButton());
		closeBrowser();
	}
}
