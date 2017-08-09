package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulRegistrationPage extends BasePage {
	@FindBy(xpath = "//div[@class='popup__box']//div[@class='popup__head']")
	private WebElement headLabel;

	@FindBy(xpath = "//div[@class='form__row__subwidget_inline']//input[@name='code']")
	private WebElement inputCode;

	@FindBy(xpath = "//div[@class='popup__controls']//button[@class,'btn btn_stylish btn_main confirm-ok']")
	private WebElement readyButton;

	public WebElement getHeadLabel() {
		return headLabel;
	}

	public WebElement getInputCode() {
		return inputCode;
	}

	public WebElement getReadyButton() {
		return readyButton;
	}
	

}
