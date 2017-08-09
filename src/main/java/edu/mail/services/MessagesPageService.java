package edu.mail.services;

import org.apache.logging.log4j.LogManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.pages.MessagesPage;
import edu.mail.services.interfeces.IMessagesPageService;

public class MessagesPageService implements IMessagesPageService {
	@Inject
	private Provider<MessagesPage> provider;
	
	private MessagesPage get(){
		return provider.get();
	}
	public void writeLetter() {
		get().getWriteLetterButton().click();
		LogManager.getLogger().info("Click on the WriteLetterButton");
	}
	public void incomingLetterButtonclick() {
		get().getWriteLetterButton().click();
		LogManager.getLogger().info("Click on the incomingLetterButton");
	}
	public void outgoingLetterButtonClick() {
		get().getWriteLetterButton().click();
		LogManager.getLogger().info("Click on the outgoingLetterButton");
	}
	public boolean isPageShown() {
        if (get().getWriteLetterButton().isDisplayed() &
        	get().getIncomingLetterButton().isDisplayed()&
        	get().getOutgoingLetterButton().isDisplayed()){
        	LogManager.getLogger().info("Page is show");
            return true;
        }else {
        	LogManager.getLogger().info("Page is not show");
            return false;
        }
    }


}
