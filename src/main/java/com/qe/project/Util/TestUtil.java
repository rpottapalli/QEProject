package com.qe.project.Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qe.project.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 50;
	
	public static  void mousehoveronElement(WebElement ele) {
		
		Actions ac =new Actions(driver);
		ac.moveToElement(ele).build().perform();
		
	}

}

