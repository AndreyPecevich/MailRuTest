package edu.mail.services;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.core.DriverManager;
import edu.mail.core.Wait;
import edu.mail.pages.RegistrationPage;
import edu.mail.services.interfeces.IRegistrationService;

public class RegistrationService implements IRegistrationService {
	@Inject
	private Provider<RegistrationPage> provider;

	private RegistrationPage get() {
		return provider.get();
	}

	public void fillFirstName(String firstName) {
		get().getInputFirstName().sendKeys(firstName);
		LogManager.getLogger().info("Input in firstNameField value: " + firstName);
	}

	public void fillLastName(String lastName) {
		get().getInputLastName().sendKeys(lastName);
		LogManager.getLogger().info("Input in LastNameField value: " + lastName);

	}

	public void fillBirthday(String day, String month, String year) {
		new Select(get().getInputDay()).selectByVisibleText(day);
		LogManager.getLogger().info("Input in DayField value: " + day);
		new Select(get().getInputMonth()).selectByVisibleText(month);
		LogManager.getLogger().info("Input in MonthField value: " + month);
		new Select(get().getInputYear()).selectByVisibleText(year);
		LogManager.getLogger().info("Input in YearField value: " + year);
	}

	public void chooseGender(String gender) {
		if (gender.equals("Муж")) {
			get().getSelectMan().click();
			LogManager.getLogger().info("Click on the Man checkBox");
		} else {
			get().getSelectWoman().click();
			LogManager.getLogger().info("Click on the Woman checkBox");
		}
	}
	public void fillTown(String town) throws InterruptedException {
		get().getInputTown().sendKeys(town);
		Wait.getInstance().waitUntil(1000);
		get().getInputTown().sendKeys(Keys.DOWN);
		get().getInputTown().sendKeys(Keys.ENTER);	
		LogManager.getLogger().info("Input in TownField value: " + town);
	}

	public void fillMailAdresse(String login, String domain) throws InterruptedException {
		get().getInputLogin().sendKeys(login);
		LogManager.getLogger().info("Input in LoginField value: " + login);
		new Select(get().getDomainSelect()).selectByVisibleText(domain);
		LogManager.getLogger().info("Input in DomainField value:" + domain);
		Wait.getInstance().waitUntil(3000);
	}

	public void fillPasswords(String password) {
		get().getInputPassword().sendKeys(password);
		LogManager.getLogger().info("Input in PasswordField value:" + password);
		get().getInputRePassword().sendKeys(password);
		LogManager.getLogger().info("Input in RepeatedPasswordField value:" + password);
	}

	public void clickRegistrationButton() {
		get().getRegistrationButton().click();
		LogManager.getLogger().info("Click on the RegistrationButton");

	}
	public boolean isTextPresent(String text){
		if(DriverManager.get().getDriver().getPageSource().contains(text)){
			LogManager.getLogger().info("Text("+text +") is present");
		}else{
			LogManager.getLogger().info("No text("+text +")");
		}
		return DriverManager.get().getDriver().getPageSource().contains(text);
	}

}
