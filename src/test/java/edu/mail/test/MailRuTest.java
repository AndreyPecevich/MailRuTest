package edu.mail.test;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.mail.base.BaseTest;
import edu.mail.core.Wait;
import edu.mail.data.RegistrationData;

public class MailRuTest extends BaseTest {

    @Test(description="login positive")
    public void login() throws InterruptedException{
    	LogManager.getLogger().info("Start login positive test");
    	loginPageService.fillLoginInput("ap_smersh");
    	loginPageService.fillDomainSelect("@mail.ru");
    	loginPageService.fillPasswordInput("787625653ap");
    	loginPageService.clickMailboxButton();
    	assertTrue(messagesPageService.isPageShown(),"Failed the login positive test!");
    }
    @Test(description="login negative")
    public void negativeLogin() throws InterruptedException{
    	LogManager.getLogger().info("Start login negative test");
    	loginPageService.fillLoginInput("ap_smersh");
    	loginPageService.fillDomainSelect("@mail.ru");
    	loginPageService.fillPasswordInput("787625653");
    	loginPageService.clickMailboxButton();
    	Wait.getInstance().waitUntil(3000);
    	assertTrue(loginPageService.isErrorLabelShow(),"Failed the negativeLogin test!");
    }
    
	@DataProvider
	   public Object[][] getRegistrationData(){
	       return new RegistrationData().getRegistrationData();
	   }
	
	@Test(description="registration run", dataProvider = "getRegistrationData")
	public void registration(String firstName, String lastName, String day,	String month, String year,String town, String gender, String login,String domain, String password) throws InterruptedException{
		LogManager.getLogger().info("Start registration test");
		loginPageService.registration();
		registrationService.fillFirstName(firstName);
		registrationService.fillLastName(lastName);
		registrationService.fillBirthday(day, month, year);
		registrationService.chooseGender(gender);
		registrationService.fillTown(town);
		registrationService.fillMailAdresse(login, domain);
		registrationService.fillPasswords(password);
		registrationService.clickRegistrationButton();
		assertTrue(successfulRegistration.isPageShown(),"Failed the registration test");
	}
	@Test(description="send a latter")
	public void sendLetter() throws InterruptedException{
		LogManager.getLogger().info("Start sendLetter test");
    	loginPageService.fillLoginInput("ap_smersh");
    	loginPageService.fillDomainSelect("@mail.ru");
    	loginPageService.fillPasswordInput("787625653ap");
    	loginPageService.clickMailboxButton();
		messagesPageService.writeLetter();
		newLatterPageService.fillInputWhom("ap_smersh@mail.ru");
		newLatterPageService.fillInputTheme("test");
		newLatterPageService.fillInputContentBody("Hello!");
		newLatterPageService.clickSendButton();
		assertTrue(successfulSendLatter.isPageShown(),"Failed the sendLetter test");
	}
}
