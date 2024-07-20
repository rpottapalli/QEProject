package com.qe.project.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;

import com.qe.project.pages.calendarCategorypage;

public class calendarCategorypage_Test extends TestBase {

	calendarCategorypage categoryPage;

	@BeforeTest
	public void setUp() {

		categoryPage = new calendarCategorypage();

	}

	@Test(priority = 2)
	public void homePageValidationTest() throws InterruptedException, IOException {

		categoryPage.homePageValidation();
	}

	@Test(priority = 3)
	public void ClickonGiftsHeaderLinkTest() throws InterruptedException {
		categoryPage.ClickonGiftsHeaderLink();
	}

	@Test(priority = 4)
	public void categoryPageTitleValidationTest() throws InterruptedException {
		String actualcategoryPageTitle = categoryPage.categoryPageTitleValidation();
		Assert.assertEquals(actualcategoryPageTitle,prop.getProperty("expectedCategoryPageTitle"));
	}

	@Test(priority = 5)
	public void categoryPageLablesValidationTest() {
		categoryPage.categoryPageLablesValidation();
	}

	@Test(priority = 6)
	public void clickOnpremimumwallcalendarlinkTest() throws InterruptedException {
		categoryPage.clickOnpremimumwallcalendarlink();

	}
//
//	@Test(priority = 7)
//	public void validatePdpPageTitleTest() throws InterruptedException {
//		String pdpPageTitle = categoryPage.validatePdpPageTitle();
//		Assert.assertEquals(pdpPageTitle, "Create Personalized 9x12 13 Month Wall Calendar | Snapfish US");
//	}

	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
}
