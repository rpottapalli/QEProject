package com.qe.project.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;

import com.qe.project.pages.calendarReviewPage;

public class calendarReviewPage_Test extends TestBase {

	calendarReviewPage reviewPage;

	@BeforeTest
	public void setUp() {
		reviewPage = new calendarReviewPage();

	}

	@Test(priority = 27)
	public void backtoEditBtnValidationTest() throws InterruptedException, IOException {
		// reviewPage =new calendarReviewPage();
		reviewPage.backtoEditBtnValidation();
	}

	@Test(priority = 28)
	public void reviewPagepriceValidationTest() throws InterruptedException {
		reviewPage.reviewPagepriceValidation();
	}

	@Test(priority = 29)
	public void projectNameTextValidationTest() throws InterruptedException {
		reviewPage.projectNameTextValidation();
	}

	@Test(priority = 30)
	public void clickOnAddToCartBtnTest() throws InterruptedException {
		reviewPage.clickOnAddToCartBtn();
	}

	@Test(priority = 31)
	public void cartPageTitleValidationTest() throws InterruptedException {
		String cartPageTitle = reviewPage.cartPageTitleValidation();
		System.out.println(cartPageTitle);
		Assert.assertEquals(cartPageTitle, "Cart");
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
}
