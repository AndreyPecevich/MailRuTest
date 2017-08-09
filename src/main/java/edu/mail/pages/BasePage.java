package edu.mail.pages;

import org.openqa.selenium.support.PageFactory;

import edu.mail.core.DriverManager;

public abstract class BasePage {
	public BasePage(){
		PageFactory.initElements(DriverManager.get().getDriver(), this);
	}
}
