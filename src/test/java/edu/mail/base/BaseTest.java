package edu.mail.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.mail.core.DriverManager;
import edu.mail.module.MailRuModule;
import edu.mail.services.LoginPageService;
import edu.mail.services.MessagesPageService;
import edu.mail.services.NewLatterPageService;
import edu.mail.services.RegistrationService;
import edu.mail.services.SuccessfulRegistrationPageService;
import edu.mail.services.SuccessfulSendLatterPageService;
import edu.mail.services.interfeces.ILoginPageService;
import edu.mail.services.interfeces.IMessagesPageService;
import edu.mail.services.interfeces.INewLatterPageService;
import edu.mail.services.interfeces.IRegistrationService;
import edu.mail.services.interfeces.ISuccessfulRegistrationPageService;
import edu.mail.services.interfeces.ISuccessfulSendLatterPageService;



public abstract class BaseTest {
	protected Injector injector = Guice.createInjector(new MailRuModule());
	protected ILoginPageService loginPageService = injector.getInstance(LoginPageService.class);
	protected IRegistrationService registrationService = injector.getInstance(RegistrationService.class);
	protected IMessagesPageService messagesPageService = injector.getInstance(MessagesPageService.class);
	protected INewLatterPageService newLatterPageService = injector.getInstance(NewLatterPageService.class);
	protected ISuccessfulRegistrationPageService successfulRegistration = injector.getInstance(SuccessfulRegistrationPageService.class);
	protected ISuccessfulSendLatterPageService successfulSendLatter = injector.getInstance(SuccessfulSendLatterPageService.class);
	@BeforeMethod
	public void initialization (){
	  	DriverManager.get().getDriver().get("https://mail.ru/");
	}
	@AfterMethod
    public void afterMethod(){
		DriverManager.get().getDriver().manage().deleteAllCookies();
    }
	
    @AfterClass
    public void afterClass() throws InterruptedException {
    	DriverManager.get().getDriver().quit();
    }

}
