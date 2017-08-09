package edu.mail.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

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

public class MailRuModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(ILoginPageService.class).to(LoginPageService.class).in(Scopes.SINGLETON);		
		bind(IRegistrationService.class).to(RegistrationService.class).in(Scopes.SINGLETON);
		bind(IMessagesPageService.class).to(MessagesPageService.class).in(Scopes.SINGLETON);
		bind(INewLatterPageService.class).to(NewLatterPageService.class).in(Scopes.SINGLETON);
		bind(ISuccessfulRegistrationPageService.class).to(SuccessfulRegistrationPageService.class).in(Scopes.SINGLETON);
		bind(ISuccessfulSendLatterPageService.class).to(SuccessfulSendLatterPageService.class).in(Scopes.SINGLETON);
	}

}
