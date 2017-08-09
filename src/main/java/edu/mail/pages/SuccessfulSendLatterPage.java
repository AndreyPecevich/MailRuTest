package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SuccessfulSendLatterPage extends BasePage{
	@FindBy(xpath = "//div[@class='message-sent__wrap']//div[@class='message-sent__title']")
	private WebElement messageSend;

	public WebElement getMessageSend() {
		return messageSend;
	}
	
}
