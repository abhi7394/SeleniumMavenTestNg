package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import utilities.utility;

public class LoginPage extends BaseTest {

	@FindBy(linkText = "Sign in")
	protected WebElement signIn;

	@FindBy(id = "login_id")
	protected WebElement usernameTextField;

	@FindBy(id = "nextbtn")
	protected WebElement nextButton;

	@FindBy(id = "password")
	protected WebElement passwordTextField;

	@FindBy(xpath = "//button[@id='nextbtn']//span[contains(text(),'Sign in')]")
	protected WebElement signInButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void checklogin(String s1, String s2) {
		signIn.click();
		utility.sendkey(usernameTextField, s1);
		nextButton.click();
		utility.sendkey(passwordTextField, s2);
		signInButton.click();
	}

}
