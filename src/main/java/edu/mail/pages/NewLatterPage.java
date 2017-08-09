package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLatterPage extends BasePage {
	@FindBy(xpath = "//div[@class='label-input']//textarea[@class='js-input compose__labels__input']")
	private WebElement inputWhom;

	@FindBy(xpath = "//div[@class='compose-head__field']//input[@class='b-input']")
	private WebElement inputTheme;
	
	@FindBy(xpath = "//body[@id='tinymce']")
	private WebElement inputContentBody;
	
	@FindBy(xpath = "//div[contains(@class,'b-toolbar__item')]//div[@class='b-toolbar__btn b-toolbar__btn_ b-toolbar__btn_false js-shortcut']")
	private WebElement sendButton;

	public WebElement getInputWhom() {
		return inputWhom;
	}

	public WebElement getInputTheme() {
		return inputTheme;
	}

	public WebElement getInputContentBody() {
		return inputContentBody;
	}

	public WebElement getSendButton() {
		return sendButton;
	}
	
	
}
