package org.myproject.pages;

import org.myproject.seleniumbase.MyprojectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends MyprojectBase {
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	

	
	//Actions
	
	public LoginPage enterUserName(String username){
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		return this;
		
		
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		return this;
		
	}
	
	public LoginPage clickLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return this;
	}
	

}
