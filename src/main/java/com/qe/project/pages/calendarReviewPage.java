package com.qe.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class calendarReviewPage extends TestBase{
	@FindBy(xpath="//*[@id=\"previewBackToEdit\"]")
	WebElement backtoEditBtn;
	
	@FindBy(xpath="//*[@id=\"price-summary-label\"]/span/span")
	WebElement reviewPagePrice;
	
	@FindBy(xpath="//*[@id=\"inputQty\"]")
	WebElement reviewQuantity;
	
	@FindBy(xpath="//*[@id=\"price-summary-label\"]/span/span")
	WebElement updatedPrice;
	
	@FindBy(xpath="//*[@id=\"topBottomView\"]/div[1]")
	WebElement topToBottom;
	
	@FindBy(xpath="//*[@id=\"NextView\"]")
	WebElement nextIcon;
	
	@FindBy(xpath="//*[@id=\"PreviousView\"]/span[1]")
	WebElement previousIcon;
	
	@FindBy(xpath="//*[@id=\"checkBox_view9657\"]")
	WebElement checkBox;

	@FindBy(xpath="//*[@id=\"product-summary\"]/ul/li")
	WebElement projectName;
	
	@FindBy(xpath="//*[@id=\"previewAddToCart\"]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement orderAnywayBtn;
	
	@FindBy(xpath="//*[@id=\"no-thanks\"]")
	WebElement noThanksBtn;
	
	public calendarReviewPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void  backtoEditBtnValidation() throws InterruptedException
	{
		
		
		System.out.println(backtoEditBtn.getText());
		Assert.assertEquals(backtoEditBtn.getText(),"BACK TO EDIT");
	}
	public void reviewPagepriceValidation() throws InterruptedException {
		
		
	 	 String reviewPagePriceText= reviewPagePrice.getText().substring(1,6);
		 System.out.println(reviewPagePriceText);
	     float actualPrice=Float.parseFloat(reviewPagePriceText);
	    
	     JavascriptExecutor script=(JavascriptExecutor)driver;
	     script.executeScript("arguments[0].value='';",reviewQuantity);
	     reviewQuantity.sendKeys("2");
	     
	     String quantity = reviewQuantity.getAttribute("Value");
	     float updatedQuantity=Float.parseFloat(quantity);
	     
	     float priceValidation =actualPrice*updatedQuantity;
	     System.out.println(priceValidation);
	     
	     String updatedPriceText = updatedPrice.getText().substring(1,6);
	     float actualUpdatedPrice=Float.parseFloat(updatedPriceText);
	     System.out.println(actualUpdatedPrice);
	     Assert.assertEquals(priceValidation,actualUpdatedPrice);
		 
		
	     Thread.sleep(3000);
	     topToBottom.click();
	     Thread.sleep(3000);
	     nextIcon.click();
	     previousIcon.click();
	}
	
	     public void projectNameTextValidation() throws InterruptedException {
	    	 
	     Thread.sleep(3000);
	     System.out.println(projectName.getText());
	     Assert.assertEquals(projectName.getText(),"Stationery Wall Calendar, 13 Months");
	     Thread.sleep(5000);
	    
	     System.out.println(addToCartBtn.getText());
	     Assert.assertEquals(addToCartBtn.getText(),"ADD TO CART");
	     
	     }
	     public void clickOnAddToCartBtn() throws InterruptedException {
	    	 
	    JavascriptExecutor script=(JavascriptExecutor)driver;
	     script.executeScript("arguments[0].click()", addToCartBtn);
	     Thread.sleep(2000);
	     orderAnywayBtn.click();
	     Thread.sleep(2000);
	     script.executeScript("arguments[0].click()",noThanksBtn);
	     
	     }
	     
	     public String cartPageTitleValidation() throws InterruptedException {
	     Thread.sleep(5000);
	     return driver.getTitle();
	   }
	     }
