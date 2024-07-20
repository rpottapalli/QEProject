package com.qe.project.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.Sign_In;

public class Sign_InTest extends TestBase {

	Sign_In login;

	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();

	}

	@BeforeTest
	public void SignIn() {

		login = new Sign_In();

	}

	@Test
	public void loginTest() throws InterruptedException {
		login.loginApplication(prop.getProperty("Email"), prop.getProperty("Password"));
	}

	@AfterSuite
	public void tearDown() {
		// driver.quit();
	}
}
