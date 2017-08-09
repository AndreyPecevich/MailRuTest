package edu.mail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	@FindBy(xpath = "//div[contains(@class,'firstname')]//input[@class='inPut']")
	private WebElement inputFirstName;

	@FindBy(xpath = "//div[contains(@class,'lastname')]//input[@class='inPut']")
	private WebElement inputLastName;

	@FindBy(xpath = "//div[contains(@class,'birthday')]//select[contains(@class,'day')]")
	private WebElement inputDay;

	@FindBy(xpath = "//div[contains(@class,'birthday')]//select[contains(@class,'month')]")
	private WebElement inputMonth;

	@FindBy(xpath = "//div[contains(@class,'birthday')]//select[contains(@class,'year')]")
	private WebElement inputYear;

	@FindBy(id="your_town")
	private WebElement inputTown;

	@FindBy(id = "man1")
	private WebElement selectMan;

	@FindBy(id = "man2")
	private WebElement selectWoman;

	@FindBy(xpath = "//div[@id='loginField']//input[contains(@class,'inPut fll')]")
	private WebElement inputLogin;

	@FindBy(xpath = "//div[@id='loginField']//select[contains(@class,'js_select_domains')]")
	private WebElement domainSelect;

	@FindBy(xpath = "//div[contains(@class,'qc-pass-row')]//input[@type='password']")
	private WebElement inputPassword;

	@FindBy(xpath = "//*[@id='signRePassword']//input[@type='password']")
	private WebElement inputRePassword;

	@FindBy (xpath = "//button[contains(@class,'signup')]")
	private WebElement registrationButton;

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getInputDay() {
		return inputDay;
	}

	public WebElement getInputMonth() {
		return inputMonth;
	}

	public WebElement getInputYear() {
		return inputYear;
	}

	public WebElement getInputTown() {
		return inputTown;
	}

	public WebElement getSelectMan() {
		return selectMan;
	}

	public WebElement getSelectWoman() {
		return selectWoman;
	}

	public WebElement getInputLogin() {
		return inputLogin;
	}

	public WebElement getDomainSelect() {
		return domainSelect;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getInputRePassword() {
		return inputRePassword;
	}

	public WebElement getRegistrationButton() {
		return registrationButton;
	}

}
