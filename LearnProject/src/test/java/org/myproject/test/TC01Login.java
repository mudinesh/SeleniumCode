package org.myproject.test;

import org.myproject.pages.LoginPage;
import org.myproject.seleniumbase.MyprojectBase;
import org.testng.annotations.Test;

public class TC01Login extends MyprojectBase{

	@Test
	public void loginTest() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		
		Thread.sleep(10000);
		
		
		/* new LoginPage()
		.enterUserName("dinesh")
		.enterPassword("pass")
		.clickLogin(); */
	}
}
