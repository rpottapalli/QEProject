package com.qe.project.testcases;




import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qe.project.base.TestBase;

import com.qe.project.pages.calendarCartPage;


public class calendarCartPage_Test extends TestBase {
	
		
		 calendarCartPage cartPage;
		 
		
		@BeforeTest
		public void setUp() {
			cartPage=new calendarCartPage();
			
		}
		
		
		@Test(priority=32)
		public void  changingaddressValidationTest() throws InterruptedException{
			
			cartPage.changingaddressValidation();
		}
		@Test(priority=33)
		public void clickOnChangingshippingMethod() {
			cartPage.clickOnChangingshippingMethod();
		}
		@Test(priority=34)
		public void clickOneditorderOptionTest() throws InterruptedException {
			cartPage.clickOneditorderOption();
		}
		
		
		
		
		@AfterTest
		public void tearDown() {
	    //driver.quit();

	}}




