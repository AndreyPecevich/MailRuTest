package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagesPage extends BasePage {
	@FindBy(xpath = "//div[@class='b-toolbar__item']//a[@class='b-toolbar__btn js-shortcut']")
	private WebElement writeLetterButton;
	
	@FindBy(xpath = "//*[@id='b-nav_folders']/div/div[1]/a")
	private WebElement incomingLetterButton;
	
	@FindBy(xpath = "//*[@id='b-nav_folders']/div/div[2]/a")
	private WebElement outgoingLetterButton;
	
	public WebElement getWriteLetterButton() {
		return writeLetterButton;
	}

	public WebElement getIncomingLetterButton() {
		return incomingLetterButton;
	}

	public WebElement getOutgoingLetterButton() {
		return outgoingLetterButton;
	}	
	
}
