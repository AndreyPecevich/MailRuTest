package edu.mail.services;

import org.apache.logging.log4j.LogManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.core.DriverManager;
import edu.mail.pages.NewLatterPage;
import edu.mail.services.interfeces.INewLatterPageService;

public class NewLatterPageService implements INewLatterPageService {
	@Inject
	private Provider<NewLatterPage> provider;
	
	private NewLatterPage get(){
		return provider.get();
	}
	public void fillInputWhom(String whom){
		get().getInputWhom().sendKeys(whom);
		LogManager.getLogger().info("Input in WhomField value: " + whom);
	}
	public void fillInputTheme(String theme){
		get().getInputTheme().sendKeys(theme);
		LogManager.getLogger().info("Input in ThemeField value: " + theme);
	}
	public void fillInputContentBody(String contentBody){
		get().getInputContentBody().sendKeys(contentBody);
		LogManager.getLogger().info("Input in ContentBodyField value: " + contentBody);
	}
	public void clickSendButton(){
		get().getSendButton().click();
		LogManager.getLogger().info("Click on the SendButton");
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
