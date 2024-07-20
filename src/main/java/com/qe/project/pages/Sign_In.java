package com.qe.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class Sign_In extends TestBase {

	@FindBy(id = "globalHeaderSignInRegister")
	WebElement LoginPage_SignIn;

	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement cookie;

	@FindBy(id = "EmailAddress")
	WebElement email;

	@FindBy(xpath = "//*[@id='Password']")
	WebElement pwd;

	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement loginButton;

	@FindBy(xpath = "(//button[text()='No thanks'])[1]")
	WebElement nothanksButton;

	@FindBy(xpath = "//h1")
	WebElement loginpageh1tag;

	@FindBy(xpath = "//a[@class='small-linktext']")
	WebElement forgotpasswordlink;

	@FindBy(xpath = "(//a[@class='gdb-p'])[1]")
	WebElement signupbtn;

	@FindBy(id = "googleSignInButton")
	WebElement continuewithGoogleactbtn;

	public Sign_In() {

		PageFactory.initElements(driver, this);
	}

	public void loginApplication(String un, String pw) throws InterruptedException {

		cookie.click();
		driver.navigate().refresh();
		LoginPage_SignIn.click();
		String actualLoginPageTitle = driver.getTitle();
		String actualloginpageh1tag = loginpageh1tag.getText();
		forgotpasswordlink.isDisplayed();
		signupbtn.isDisplayed();
		continuewithGoogleactbtn.isDisplayed();
		Assert.assertEquals(actualloginpageh1tag, prop.getProperty("expectedloginpageh1tag"));
		Assert.assertEquals(actualLoginPageTitle, prop.getProperty("expectedLoginPageTitle"));
		email.sendKeys(un);
		pwd.sendKeys(pw);
		
		try {
		nothanksButton.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		loginButton.click();
		Thread.sleep(2000);
		String homepageTitle = driver.getTitle();
		Assert.assertEquals(homepageTitle, prop.getProperty("expectedHomePageTitle"));

	}

}
