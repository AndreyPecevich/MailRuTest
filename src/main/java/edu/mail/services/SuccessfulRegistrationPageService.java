package edu.mail.services;

import org.apache.logging.log4j.LogManager;

import com.google.inject.Inject;
import com.google.inject.Provider;

import edu.mail.pages.SuccessfulRegistrationPage;
import edu.mail.services.interfeces.ISuccessfulRegistrationPageService;

public class SuccessfulRegistrationPageService implements ISuccessfulRegistrationPageService {
	@Inject
	private Provider<SuccessfulRegistrationPage> provider;
	
	private SuccessfulRegistrationPage get(){
		return provider.get();
	}
	
	public boolean isPageShown() {
        if (get().getHeadLabel().isDisplayed() &
        	get().getInputCode().isDisplayed()&
        	get().getReadyButton().isDisplayed()){
        	LogManager.getLogger().info("SuccessfulRegistrationPage is show");
            return true;
        }else {
        	LogManager.getLogger().info("SuccessfulRegistrationPage is not show");
            return false;
        }
    }
}
