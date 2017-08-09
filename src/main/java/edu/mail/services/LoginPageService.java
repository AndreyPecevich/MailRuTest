package edu.mail.services;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.core.DriverManager;
import edu.mail.pages.LoginPage;
import edu.mail.services.interfeces.ILoginPageService;

public class LoginPageService implements ILoginPageService {
	
	
	@Inject
	private Provider<LoginPage> provider;
	
	private LoginPage get(){
		return provider.get();
	}
	public void fillLoginInput(String login){
		get().getLoginInput().sendKeys(login);
		LogManager.getLogger().info("Input in LoginField value: " + login);
		
	}
	public void fillDomainSelect(String domain){
		new Select(get().getDomainSelect()).selectByVisibleText(domain);
		LogManager.getLogger().info("Input in DomainField value:" + domain);
	}
	public void fillPasswordInput(String password){
		get().getPasswordInput().sendKeys(password);
		LogManager.getLogger().info("Input in PasswordField value:" + password);
	}
	public void clickMailboxButton(){
		get().getMailboxButton().click();
		LogManager.getLogger().info("Click on the MailboxButton");
	}

	public void registration() {
		get().getRegistrationButton().click();	
		LogManager.getLogger().info("Click on the RegistrationButton");
	}
	public boolean isErrorLabelShow(){
		if(get().getErrorLabel().isDisplayed()){
			LogManager.getLogger().info("Error label is show");
			return true;
		}else{
			LogManager.getLogger().info("Error label is not show");
			return false;
		}
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
