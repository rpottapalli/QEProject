package com.qe.project.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qe.project.Util.TestUtil;
import com.qe.project.base.TestBase;

public class calendarCategorypage  extends TestBase{
	
	@FindBy(xpath="//*[@id='quickstart-page']/div/div[1]/section/h2")
	WebElement quickStart;
	
	@FindBy(xpath="//*[@id='myPhotos']/div/div/section/h2")
	WebElement myPhotos;
	
	@FindBy(xpath="(//a[text()='Calendars'])[1]")
	WebElement calendarSubheaderLink;
	
	@FindBy(id="header_subnav_GIFTS_dropdown")
	WebElement giftsHeader;
	
	@FindBy(xpath="(//a[@class='link-01  arialabel-from-title'])[1]")
	WebElement wallcalendar;
	
	@FindBy(xpath="(//a[@class='link-01  arialabel-from-title'])[4]")
	WebElement premimumwallcalendar;
	
	@FindBy(xpath="(//a[@class='link-01  arialabel-from-title'])[3]")
	WebElement wallcalendar12x12;
	
	public calendarCategorypage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homePageValidation() throws InterruptedException
	{
		Thread.sleep(7000);
		 
		System.out.println(quickStart.getText());
		Assert.assertEquals(quickStart.getText(),"Quick Start");
		System.out.println(myPhotos.getText());
		Assert.assertEquals(myPhotos.getText(),"My Photos");
	}
		
	public void ClickonGiftsHeaderLink() throws InterruptedException {
		
		TestUtil.mousehoveronElement(giftsHeader);
		Thread.sleep(3000);
		calendarSubheaderLink.click();
	}
	public String categoryPageTitleValidation() throws InterruptedException{
		Thread.sleep(2000);
		return driver.getTitle();
	}
		
	public void categoryPageLablesValidation() {	
	   
	 
	    System.out.println(wallcalendar.getText());
	    Assert.assertEquals(wallcalendar.getText(),"8.5x11 Wall Calendar");
	    System.out.println(premimumwallcalendar.getText());
	    Assert.assertEquals(premimumwallcalendar.getText(),"Premium Stationery Wall Calendar");
	    System.out.println(wallcalendar12x12.getText());
	    Assert.assertEquals(wallcalendar12x12.getText(),"12x12 Wall Calendar");
	}
	public void clickOnpremimumwallcalendarlink() throws InterruptedException
	{
	    //Thread.sleep(2000);
	    premimumwallcalendar.click();
	}
	public String validatePdpPageTitle() throws InterruptedException {
		
	    Thread.sleep(2000);
	    return driver.getTitle();
	 
	
	}
}
