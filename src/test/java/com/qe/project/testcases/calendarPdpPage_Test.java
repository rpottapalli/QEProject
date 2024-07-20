package com.qe.project.testcases;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;

import com.qe.project.pages.calendarPdpPage;

public class calendarPdpPage_Test extends TestBase {

	calendarPdpPage pdpPage;

	@BeforeTest
	public void setUp() {

		pdpPage = new calendarPdpPage();

	}

	@Test(priority = 8)
	public void calendarSizetextValidationTest() {

		pdpPage.calendarSizetextValidation();
	}

	@Test(priority = 9)
	public void calendarMonthtextValidationTest() {
		pdpPage.calendarMonthtextValidation();
	}

	@Test(priority = 10)
	public void clickOnProductdetailsBtnTest() {
		pdpPage.clickOnProductdetailsBtn();
	}

	@Test(priority = 11)
	public void productdetailsBtnTextValidationTest() {
		pdpPage.productdetailsBtnTextValidation();
	}

	@Test(priority = 12)
	public void clickonMakethisCalendarBtnTest() throws InterruptedException {
		pdpPage.clickonMakethisCalendarBtn();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
}
