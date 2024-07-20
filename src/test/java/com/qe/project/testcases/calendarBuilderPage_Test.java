package com.qe.project.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;

import com.qe.project.pages.calendarBuilderPage;

public class calendarBuilderPage_Test extends TestBase {

	calendarBuilderPage builderPage;

	@BeforeTest
	public void setUp() {
		builderPage = new calendarBuilderPage();

	}

	@Test(priority = 13)
	public void calendarBuilderPageTitleValidationTest() throws InterruptedException {

		String builderPageTitle = builderPage.calendarBuilderPageTitleValidation();
		Assert.assertEquals(builderPageTitle, "Wall Calendar Builder");
	}

	@Test(priority = 14)
	public void addPhotosValidationTest() throws InterruptedException {
		builderPage.addPhotosValidation();
	}

	@Test(priority = 15)
	public void clickOnMySnapfishAccountOptionTest() {
		builderPage.clickOnMySnapfishAccountOption();
	}

	@Test(priority = 16)
	public void photoPickerLablesValidationsTest() throws InterruptedException {
		builderPage.photoPickerLablesValidations();
	}

	@Test(priority = 17)
	public void BuilderPageValidationsTest() throws InterruptedException {
		builderPage.BuilderPageValidations();
	}

	@Test(priority = 18)
	public void addEmbellishmentsTOCalendarTest() throws InterruptedException {
		builderPage.addEmbellishmentsTOCalendar();
	}

	@Test(priority = 19)
	public void applyBackgroundsToCalendarTest() throws InterruptedException {
		builderPage.applyBackgroundsToCalendar();
	}

	@Test(priority = 20)
	public void applyLayoutsToCalendarTest() throws InterruptedException {
		builderPage.applyLayoutsToCalendar();
	}

	@Test(priority = 21)
	public void changingDesignToCalendarTest() throws InterruptedException {
		builderPage.changingDesignToCalendar();
	}

	@Test(priority = 22)
	public void changingDateOptionsToCalendarTest() throws InterruptedException {
		builderPage.changingDateOptionsToCalendar();
	}

	@Test(priority = 23)
	public void saveOptionValidationTest() throws InterruptedException {
		builderPage.saveOptionValidation();
	}

	@Test(priority = 24)
	public void undoRedoBtnsValidationsTest() throws InterruptedException {
		builderPage.undoRedoBtnsValidations();
	}

	@Test(priority = 25)
	public void zoominZoomOutBtnsValidationTest() throws InterruptedException {
		builderPage.zoominZoomOutBtnsValidation();
	}

	@Test(priority = 26)
	public void clickOnReviewBtnTest() {
		builderPage.clickOnReviewBtn();
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();

	}
}
