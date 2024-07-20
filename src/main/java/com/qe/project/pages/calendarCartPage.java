package com.qe.project.pages;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qe.project.base.TestBase;

public class calendarCartPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"edit_shipping_click_element\"]")
	WebElement shippingAddress;

	@FindBy(xpath = "//*[@id=\"enter_new_address\"]")
	WebElement enterNewAddressBtn;

	@FindBy(xpath = "//*[@id=\"line1\"]")
	WebElement streetName;

	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement cityName;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(xpath = "//*[@id=\"zip\"]")
	WebElement zipcode;

	@FindBy(xpath = "//*[@id=\"ship_here_link\"]")
	WebElement shiphereLink;

	@FindBy(xpath = "//input[@id='Standard']")
	WebElement changingShippingMethod;

	@FindBy(xpath = "//*[@id=\"TwoDay\"]")
	WebElement expeditedShipping;

	@FindBy(xpath = "//a[text()='Edit Order']")
	WebElement editorderBtn;

	@FindBy(xpath = "//div[@class='topbottom-text']")
	WebElement topToBottomMonth;

	@FindBy(xpath = "//*[@id=\"layoutTab\"]")
	WebElement layouts;

	@FindBy(xpath = "//*[@id=\"lay-well-category-header_1_Photo\"]")
	WebElement OneLayout;

	@FindBy(xpath = "//*[@id=\"design_0b8c51eaf68644498a89aedfb1a92f95\"]")
	WebElement layoutCategory;

	@FindBy(xpath = "//*[@id=\"review_buy\"]/span[1]")
	WebElement reviewBtn;

	@FindBy(xpath = "//*[@id=\"previewAddToCart\"]")
	WebElement addToCartBtn;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement orderAnywayBtn;

	public calendarCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void changingaddressValidation() throws InterruptedException {
		Thread.sleep(5000);
		shippingAddress.click();
		Thread.sleep(2000);
		enterNewAddressBtn.click();
		streetName.sendKeys("main street");
		cityName.sendKeys("Newyork");

		Select stateDropDown = new Select(state);
		List<WebElement> allOptions = stateDropDown.getOptions();
		System.out.println(allOptions.size());
		stateDropDown.selectByIndex(6);

		zipcode.sendKeys("90005");
		shiphereLink.click();
	}

	public void clickOnChangingshippingMethod() {
		try {
			changingShippingMethod.click();
		} catch (ElementClickInterceptedException e) {
			expeditedShipping.click();
		}
	}

	public void clickOneditorderOption() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("arguments[0].click()", editorderBtn);
		Thread.sleep(8000);
		// topToBottomMonth.click();
		// Thread.sleep(3000);
		
		script.executeScript("arguments[0].click()", layouts);
		OneLayout.click();
		layoutCategory.click();
		script.executeScript("arguments[0].click()", reviewBtn);
		Thread.sleep(3000);
		script.executeScript("arguments[0].click()", addToCartBtn);
		Thread.sleep(2000);
		orderAnywayBtn.click();

	}

}
