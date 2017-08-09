package edu.mail.services;

import org.apache.logging.log4j.LogManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.pages.SuccessfulSendLatterPage;
import edu.mail.services.interfeces.ISuccessfulSendLatterPageService;

public class SuccessfulSendLatterPageService implements ISuccessfulSendLatterPageService {
	@Inject
	private Provider<SuccessfulSendLatterPage> provider;
	
	private SuccessfulSendLatterPage get(){
		return provider.get();
	}
	public boolean isPageShown() {
        if (get().getMessageSend().isDisplayed()){
        	LogManager.getLogger().info("SuccessfulSendLatterPage is show");
            return true;
        }else {
        	LogManager.getLogger().info("SuccessfulSendLatterPage is not show");
            return false;
        }
    }
}
