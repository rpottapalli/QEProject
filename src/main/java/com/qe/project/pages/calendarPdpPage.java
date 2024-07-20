package com.qe.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class calendarPdpPage extends TestBase {
	
    @FindBy(xpath="//h1[@class='color-02a']")
	WebElement StationeryWallCalendar;
	
	@FindBy(xpath="//*[@id=\"1524820301783\"]/div/div/div/div/app-design-detail/app-dgview/div/div/div[3]/div[2]/div/div/div[2]/app-books-size-dropdown/div[3]/div[1]/label")
	WebElement calendarSize;
	
	//@FindBy(xpath="//div[@class='size-dropdown']")
	//WebElement calendarSize;
	
	
	@FindBy(xpath="//*[@id=\"book-size-pdp\"]/div")
	WebElement changingCalendarSize;
	
	@FindBy(xpath="//*[@id=\"bookTypeDropDown-pdp\"]/li[2]/div[2]/div")
	WebElement StationeryWallCalendarType;
	
	@FindBy(xpath="//*[@id=\"1524820301783\"]/div/div/div/div/app-design-detail/app-dgview/div/div/div[3]/div[2]/div/div/div[2]/app-books-size-dropdown/div[4]/app-calendards-months-dropdown/div[1]/label")
	WebElement calendarMonth;
	
	@FindBy(xpath="//span[@class='dropdown-value dd-active-color' and text()='January 2022']")
	WebElement ChangingCalendarMonth;
	
	@FindBy(xpath="//*[@id=\"startingMonthDropDown-pdp\"]/li[4]")
	WebElement februaryMonth;
	
	@FindBy(xpath="//a[@class='link-active' and @href='javascript:void(0);']")
	WebElement productdetailsBtn;
	
	@FindBy(xpath="//*[@id=\"productDescription\"]/div/section/h2")
	WebElement calendardetails;
	
	@FindBy(xpath="//*[@id=\"buttonId\"]")
	WebElement makeThisCalendarBtn;
	
	
	public calendarPdpPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void  calendarPdpPageTextValidation() 
	{
		System.out.println(StationeryWallCalendar.getText());
		Assert.assertEquals(StationeryWallCalendar.getText(),"Stationery Wall Calendar, 13 Months");
	}	
	
	public void calendarSizetextValidation()
	{
		System.out.println(calendarSize.getText());
	    Assert.assertEquals(calendarSize.getText(),"SIZE AND TYPE");
	    changingCalendarSize.click();
	    StationeryWallCalendarType.click();
	    
	}
	public void calendarMonthtextValidation()  {

        System.out.println(calendarMonth.getText());
		Assert.assertEquals(calendarMonth.getText(),"STARTING MONTH");
		 ChangingCalendarMonth.click();
		 februaryMonth.click();
	}
	public void clickOnProductdetailsBtn()
	{
		
		JavascriptExecutor script  = (JavascriptExecutor)driver;
		script .executeScript("arguments[0].click()",productdetailsBtn);
	 }
	
	public void productdetailsBtnTextValidation() {
		
		Assert.assertEquals(calendardetails.getText(),"Product Details");
	}
	
	public void clickonMakethisCalendarBtn() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor script  = (JavascriptExecutor)driver;
		 script .executeScript("arguments[0].click()", makeThisCalendarBtn);
	}
	}
