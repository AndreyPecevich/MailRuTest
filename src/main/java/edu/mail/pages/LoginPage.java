package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id = "mailbox__login")
	private WebElement loginInput;

	@FindBy(id = "mailbox__login__domain")
	private WebElement domainSelect;

	@FindBy(id = "mailbox__password")
	private WebElement passwordInput;

	@FindBy(className = "mailbox__register__link")
	private WebElement registrationButton;

	@FindBy(id = "mailbox__auth__button")
	private WebElement mailboxButton;
	
	@FindBy(id = "mailbox:authfail")
	private WebElement errorLabel;

	public WebElement getLoginInput() {
		return loginInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getDomainSelect() {
		return domainSelect;
	}

	public WebElement getRegistrationButton() {
		return registrationButton;
	}

	public WebElement getMailboxButton() {
		return mailboxButton;
	}

	public WebElement getErrorLabel() {
		return errorLabel;
	}
	
	
}
