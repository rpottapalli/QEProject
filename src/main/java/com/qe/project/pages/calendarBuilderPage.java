package com.qe.project.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class calendarBuilderPage  extends TestBase {
	
	@FindBy(xpath="//a[@id='guest-anchor-uploadphotssec']")
	WebElement getPhotosBtn;
	
	@FindBy(xpath="//*[@id=\"po-fdropdown\"]/li[1]/a/span[2]")
	WebElement mysnapfishAccount;
	
	
	@FindBy(xpath="//*[@id=\"po-fdropdown\"]/li[3]/a/span[1]/span[2]")
	WebElement myComputer;
	
	@FindBy(xpath="//*[@id=\"po-fdropdown\"]/li[4]/a/span[3]")
	WebElement googlePhotos;
	
	@FindBy(xpath="//*[@id=\"po-fdropdown\"]/li[5]/a")
	WebElement facebookPhotos;
	
	@FindBy(xpath="//*[@id=\"po-fdropdown\"]/li[6]/a/span/span[3]")
	WebElement instagramPhotos;
	
	@FindBy(css="#pickerHeader")
	WebElement photopicker;
	
	@FindBy(xpath="//a[@name='delete_layer_cancel_icon' and @class='close-reveal-modal onboard' ]")
	WebElement crossIcon;
	
	@FindBy(xpath="//*[@id=\"sub_header_container\"]/div[1]/div[1]/ul/li[2]/a")
	WebElement albumsLink;
	
	
	@FindBy(xpath="//*[@id=\"122958325317060\"]/div[2]")
	WebElement album;
	

	@FindBy(xpath="//*[@id=\"show-sav-titles\"]/li/a")
	WebElement showTitles;
	
	@FindBy(xpath="//*[@id=\"show-sav-titles\"]/li/a")
	WebElement hideTitles;
	
	@FindBy(xpath="//*[@id=\"album_assets\"]/div/div/div[3]/div/a/figure")
	WebElement selectAll;
	
	@FindBy(xpath="//*[@id=\"picker-add-to-project\"]/span")
	WebElement addSelectedPhotosBtn;
	
	@FindBy(xpath="//*[@id=\"autofill_title\"]")
	WebElement autofillTitle;
	
	@FindBy(xpath="//*[@id=\"confirm_autofill\"]")
	WebElement autofillBtn;
	
	@FindBy(xpath="//*[@id=\"globalSizeChange\"]/div[3]/button[1]")
	WebElement manually;
	
	@FindBy(xpath="//*[@id=\"add-photos-text\"]/span[2]")
	WebElement getPhotos;
	
	@FindBy(xpath="//*[@id=\"sort\"]")
	WebElement sortOption;
	
	
	@FindBy(xpath="//*[@id=\"autofill\"]/span")
	WebElement autofillOption;
	
	@FindBy(xpath="//*[@id=\"confirm_autofill\"]")
	WebElement autofill;
	
	@FindBy(xpath="//*[@id=\"options\"]/span")
	WebElement options;
	
	@FindBy(xpath="//div[@class='allmonths-text']")
	WebElement allmonth;
	
	@FindBy(xpath="//div[@class='topbottom-text']")
	WebElement topToBottomMonth;
	
	@FindBy(xpath="//div[@class='fullmonth-text']")
	WebElement fullMonth;
	
	
	@FindBy(xpath="//*[@id=\"selectedMonthName\"]")
	WebElement coverDropdown;
	
	
	@FindBy(xpath="//*[@id=\"opt_1\"]")
	WebElement selectMonth;
	
	@FindBy(css="#embellishmentTab")
	WebElement embellishment;
	
	@FindBy(xpath="//*[@id='usedembellishmentPanelCategory']")
	WebElement recentembellishments;

	@FindBy(xpath="//*[@id=\"emb-well-category-header_Basics\"]")
	WebElement basics;
	
	@FindBy(xpath="//*[@id=\"emb-well-category-header_Phrases\"]")
	WebElement phrases;
	
	@FindBy(xpath="//*[@id=\"emb-well-category-header_Alphabets\"]")
	WebElement alphabets;
	
	@FindBy(xpath="//*[@id=\"emb-well-category-header_Numbers\"]")
	WebElement numbers;
	
	@FindBy(xpath="//*[@id=\"well-category-select-header_shapes_1207_1476480102_snapfish_us\"]/span")
	WebElement shapes;
	
	@FindBy(xpath="//*[@id=\"well-category-select-header_brackets_1207_snapfish_us\"]/span")
	WebElement brackets;
	
	
	@FindBy(xpath="//*[@id=\"well-category-select-header_emojis_1207_1492628514_snapfish_us\"]/span")
	WebElement emoji;
	
	@FindBy(xpath="//*[@id=\"well-category-select-header_phrases_1207_snapfish_us\"]")
	WebElement basiccategory;
	
	@FindBy(xpath="//*[@id=\"emb_eb3c1fd400eb49d6b56cd71d8a84b6bc\"]")
	WebElement embellishmentSrc;
	
	@FindBy(xpath="//*[@id=\"imgEditCanvas-canvas-container\"]/canvas[2]")
	WebElement embellishmentDest;
	
	@FindBy(xpath="//*[@id=\"backgroundTab\"]")
	WebElement backgrounds;
	
	@FindBy(xpath="//*[@id=\"usedbackgroundsPanelCategory\"]")
	WebElement recentbackgrounds;
	
	@FindBy(xpath="//*[@id=\"bcg-well-category-header_Colors\"]")
	WebElement colours;
	
	@FindBy(xpath="//*[@id=\"bcg-well-category-header_Textures\"]")
	WebElement textures;
	

	@FindBy(xpath="//*[@id=\"bcg-well-category-header_Patterns\"]")
	WebElement patterns;
	
	@FindBy(xpath="//*[@id=\"well-category-select-header_all_colors_93919_snapfish_us\"]/span")
	WebElement colorsCategory;
	
	
	@FindBy(xpath="//*[@id=\"color_07cd0c716d3e4f6c994118cf9ebe572e\"]")
	WebElement colorsSrc;
	
	@FindBy(xpath="//*[@id=\"imgEditCanvas-canvas-container\"]/canvas[2]")
	WebElement colorsDest;
	
	@FindBy(xpath="//*[@id=\"layoutTab\"]")
	WebElement layouts;
	
	@FindBy(xpath="//*[@id=\"lay-well-category-header_1_Photo\"]")
	WebElement OneLayout;
	
	@FindBy(xpath="//*[@id=\"lay-well-category-header_3_Photos\"]")
	WebElement thirdLayout;
	
	@FindBy(xpath="//*[@id=\"lay-well-category-header_2_Photos\"]")
	WebElement twoLayout;
	
	@FindBy(xpath="//*[@id=\"design_86c7add0c37c45c6b32cacf61b62f913\"]")
	WebElement layoutCategory;
	
	@FindBy(xpath="//*[@id=\"ideaPageTab\"]")
	WebElement designs;
	
	@FindBy(xpath="//*[@id=\"designgroup-well-category-header_Simple\"]")
	WebElement simpledesignCategory;
	
	@FindBy(xpath="//*[@id=\"design_group_name_ele_c3b47c7eda564155a9233cc92331c68e_desktop\"]/span")
	WebElement rusticWoodDesign;
	
	@FindBy(xpath="//*[@id=\"design_group_name_ele_207eec18ef024c4287b766ccdf78dc79_desktop\"]/span")
	WebElement waterColorDesign;
	
	@FindBy(xpath="//*[@id=\"caldesign_30bcdffce57545a0a3cba668a2cb122d\"]")
	WebElement calendarDesign;
	
	@FindBy(xpath="//*[@id=\"globalSizeChange\"]/div[2]/button[1]")
	WebElement applyBtn;
	
	@FindBy(xpath="//*[@id=\"calendarOptionTab\"]")
	WebElement dateOptions;
	
	@FindBy(xpath="//*[@id=\"monthSwitch\"]")
	WebElement startingMonth;
	
	@FindBy(xpath="//*[@id=\"monthChange\"]/div[1]")
	WebElement startingMonthDropdown;
	
	@FindBy(xpath="//*[@id=\"start-month-drop-down\"]/li[19]")
	WebElement julyMonth;
	
	@FindBy(xpath="//*[@id=\"save-icon-wrapper\"]/li/div[1]")
	WebElement saveOption;
	
	@FindBy(xpath="//*[@id=\"saveBtnItem\"]")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[@id=\"saveAsBtnItem\"]")
	WebElement saveASBtn;
	
	@FindBy(xpath="//*[@id=\"project-save-modal-template\"]/div[3]/button[2]")
	WebElement cancelBtn;
	
	@FindBy(xpath="//*[@id=\"project-save-modal-template\"]/div[3]/button[1]")
	WebElement saveoptionBtn;
	
	@FindBy(xpath="//*[@id=\"NextView\"]")
	WebElement multisurfaceIcon;
	
	@FindBy(xpath="//div[@class='create-icon-undo icon'and @title='Undo']")
	WebElement undo;
	
	@FindBy(xpath="//div[@class='create-icon-redo icon' and @title='Redo']")
	WebElement redo;
	
	@FindBy(xpath="//*[@id=\"left-shuffleLayout\"]")
	WebElement shuffleIcon;
	
	@FindBy(xpath="//*[@id=\"zoom_in_icon\"]")
	WebElement zoomIn;
	
	@FindBy(xpath="//*[@id=\"zoom_out_icon\"]")
	WebElement zoomOut;
	
	@FindBy(xpath="//*[@id=\"opt_5\"]")
	WebElement septemberMonth;
	
	@FindBy(xpath="//*[@id=\"review_buy\"]/span[1]")
	WebElement reviewBtn;
	
	public calendarBuilderPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String calendarBuilderPageTitleValidation() throws InterruptedException
	{
	 
	Thread.sleep(5000);
	return driver.getTitle();
	}
	
	public void addPhotosValidation() throws InterruptedException {
		
	Thread.sleep(7000);
	 JavascriptExecutor script  = (JavascriptExecutor)driver;
	 script .executeScript("arguments[0].click()",getPhotosBtn);
	 
	//Thread.sleep(3000);   
	System.out.println(mysnapfishAccount.getText());
	Assert.assertEquals( mysnapfishAccount.getText(),"MY SNAPFISH ACCOUNT");
	
	System.out.println(myComputer.getText());
	Assert.assertEquals(myComputer.getText(),"MY COMPUTER");
	
	System.out.println(googlePhotos.getText());
	Assert.assertEquals(googlePhotos.getText(),"GOOGLE PHOTOS");
	
	System.out.println(facebookPhotos.getText());
	Assert.assertEquals(facebookPhotos.getText(),"FACEBOOK");
	
	System.out.println(instagramPhotos.getText());
	Assert.assertEquals(instagramPhotos.getText(),"INSTAGRAM");
	
	}
	
	public void clickOnMySnapfishAccountOption(){
		
	mysnapfishAccount.click();
	
	}
	
	public void photoPickerLablesValidations() throws InterruptedException
	{
  
  try {
	  
	Thread.sleep(3000);
	JavascriptExecutor script  = (JavascriptExecutor)driver;
	script .executeScript("arguments[0].click()",crossIcon);
	String photopickerText = photopicker.getText();
	System.out.println(photopickerText);
	Assert.assertEquals(photopickerText ,"Select photos for your project");
    albumsLink.click();
    Thread.sleep(5000);
    album.click();
  }
    catch(NoSuchElementException e){
	Thread.sleep(5000);
	album.click();
  }
  
    Thread.sleep(3000);
	System.out.println(showTitles.getText());
	Assert.assertEquals(showTitles.getText(),"SHOW TITLES");
	showTitles.click();
 
    System.out.println(hideTitles.getText());
    Assert.assertEquals(hideTitles.getText(),"HIDE TITLES");
   // Thread.sleep(3000);
    selectAll.click();
	
    System.out.println(addSelectedPhotosBtn.getText());
    Assert.assertEquals(addSelectedPhotosBtn.getText(),"ADD SELECTED PHOTOS");
    addSelectedPhotosBtn.click();
    Thread.sleep(2000);


    System.out.println(autofillTitle.getText());
    Assert.assertEquals(autofillTitle.getText(),"Your shortcut to a beautiful calendar");
    Thread.sleep(2000);

     System.out.println( manually.getText());
     Assert.assertEquals( manually.getText(),"I'LL PLACE MY PHOTOS MANUALLY");
     autofillBtn.click();
}
	
public void BuilderPageValidations() throws InterruptedException
{
	
Thread.sleep(3000);
System.out.println( getPhotos.getText());
Assert.assertEquals( getPhotos.getText(),"GET MORE PHOTOS");


System.out.println(sortOption.getText());
Assert.assertEquals(sortOption.getText(),"SORT");


System.out.println(autofillOption.getText());
Assert.assertEquals(autofillOption.getText(),"AUTOFILL");


//Thread.sleep(2000);
System.out.println(options.getText());
Assert.assertEquals(options.getText(),"OPTIONS");

Thread.sleep(2000);
System.out.println(allmonth.getText());
Assert.assertEquals(allmonth.getText(),"ALL MONTHS");

Thread.sleep(2000);
topToBottomMonth.click();
System.out.println(topToBottomMonth.getText());
Assert.assertEquals(topToBottomMonth.getText(),"TOP/BOTTOM");

Thread.sleep(2000);
fullMonth.click();
System.out.println(fullMonth.getText());
Assert.assertEquals(fullMonth.getText(),"FULL MONTH");
coverDropdown.click();
selectMonth.click();

}

public void addEmbellishmentsTOCalendar() throws InterruptedException
{
	
System.out.println(embellishment.getText());
Assert.assertEquals(embellishment.getText(),"Embellishments");

//@SuppressWarnings("deprecation")
//WebDriverWait Wait=new WebDriverWait(driver,30);
//Wait.until(ExpectedConditions.elementToBeClickable(embellishment));

JavascriptExecutor script=(JavascriptExecutor)driver;
script.executeScript("arguments[0].click()",embellishment);
recentembellishments.click();

System.out.println(basics.getText());
Assert.assertEquals(basics.getText(),"Basics");
System.out.println(phrases.getText());
Assert.assertEquals( phrases.getText(),"Phrases");
System.out.println(alphabets.getText());
Assert.assertEquals(alphabets.getText(),"Alphabets");
System.out.println (numbers.getText());
Assert.assertEquals(numbers.getText(),"Numbers");
basics.click();
Thread.sleep(2000);
System.out.println(shapes.getText());
Assert.assertEquals(shapes.getText(),"Shapes");
System.out.println(brackets.getText());
Assert.assertEquals(brackets.getText(),"Brackets");
System.out.println( emoji.getText());
Assert.assertEquals(emoji.getText(),"Emojis");
basiccategory.click();
Thread.sleep(3000);
Actions action =new Actions(driver);
action.dragAndDrop(embellishmentSrc,embellishmentDest).perform();

}

public void applyBackgroundsToCalendar() throws InterruptedException {

System.out.println(backgrounds.getText());
Assert.assertEquals(backgrounds.getText(),"Backgrounds");
//Thread.sleep(3000);	
backgrounds.click();
recentbackgrounds.click();

System.out.println(colours.getText());
Assert.assertEquals(colours.getText(),"Colors");
System.out.println(textures.getText());
Assert.assertEquals( textures.getText(),"Textures");
System.out.println(patterns.getText());
Assert.assertEquals(patterns.getText(),"Patterns");
colours.click();
Thread.sleep(3000);
colorsCategory.click();
Thread.sleep(3000);
Actions action =new Actions(driver);
action.dragAndDrop(colorsSrc,colorsDest).perform();
   
} 
public void applyLayoutsToCalendar() throws InterruptedException {
  
   System.out.println(layouts.getText());
   Assert.assertEquals(layouts.getText(),"Layouts");
   layouts.click();
   System.out.println(OneLayout.getText());
   Assert.assertEquals(OneLayout.getText(),"1 Photo");
   System.out.println(thirdLayout.getText());
   Assert.assertEquals(thirdLayout.getText(),"3 Photos");
   System.out.println(twoLayout.getText());
   Assert.assertEquals(twoLayout.getText(),"2 Photos");
   twoLayout.click();
   Thread.sleep(3000);
   layoutCategory.click();
}  

public void changingDesignToCalendar() throws InterruptedException {
	
   Thread.sleep(3000);
   
   
   System.out.println(designs.getText());
   Assert.assertEquals(designs.getText(),"Designs");
   designs.click();
   Thread.sleep(3000);
   simpledesignCategory.click();
   Thread.sleep(3000);
   System.out.println( rusticWoodDesign.getText());
   Assert.assertEquals( rusticWoodDesign.getText(),"Rustic Wood");
   System.out.println(waterColorDesign.getText());
   Assert.assertEquals(waterColorDesign.getText(),"Watercolor Sketc...");
   waterColorDesign.click();
   calendarDesign.click();
   Thread.sleep(3000);
   applyBtn.click();
}

public void changingDateOptionsToCalendar() throws InterruptedException {
   Thread.sleep(5000);
   System.out.println( dateOptions.getText());
   Assert.assertEquals( dateOptions.getText(),"Date Options");
   dateOptions.click();
   
   
   System.out.println(startingMonth.getText());
   Assert.assertEquals(startingMonth.getText(),"Starting month");
   startingMonthDropdown.click();
 
   System.out.println(julyMonth.getText());
   Assert.assertEquals(julyMonth.getText(),"July 2022");
   julyMonth.click();
} 

public void saveOptionValidation() throws InterruptedException{
	
   Thread.sleep(8000);
   saveOption.click();
   System.out.println(saveBtn.getText());
   Assert.assertEquals(saveBtn.getText(),"Save");
   System.out.println(saveASBtn.getText());
   Assert.assertEquals(saveASBtn.getText(),"Save As...");
   saveASBtn.click();
   Thread.sleep(2000);
   String  cancelBtnText = cancelBtn.getText();
   System.out.println(cancelBtnText);
   Assert.assertEquals(cancelBtnText,"CANCEL");
   Thread.sleep(2000);
   saveoptionBtn.click();
   Thread.sleep(5000);
   multisurfaceIcon.click();
   
}
 
  public void undoRedoBtnsValidations() throws InterruptedException {
	  
  Thread.sleep(5000);
  JavascriptExecutor script  = (JavascriptExecutor)driver;
  script .executeScript("arguments[0].click()",undo);
  boolean redoBtn = redo.isEnabled();
  Assert.assertTrue(redoBtn,"true");
  script .executeScript("arguments[0].click()",redo);
  boolean undoBtn = undo.isEnabled();
  Assert.assertTrue(undoBtn,"true");
  Thread.sleep(2000);
  multisurfaceIcon.click();
  shuffleIcon.click();
  }
  
public void zoominZoomOutBtnsValidation() throws InterruptedException {
 zoomIn.click();
 boolean zoomOutIcon = zoomOut.isEnabled();
 Assert.assertTrue(zoomOutIcon,"true");
 
 zoomOut.click();
 boolean zoomInIcon = zoomIn.isEnabled();
 Assert.assertTrue(zoomInIcon,"true");
 Thread.sleep(2000);
 coverDropdown.click();
 septemberMonth.click();
 
  }
  
 public void clickOnReviewBtn() {
 String reviewBtnText = reviewBtn.getText();
 System.out.println(reviewBtnText);
 JavascriptExecutor script  = (JavascriptExecutor)driver;
 script .executeScript("arguments[0].click()",reviewBtn);

 }
 }
