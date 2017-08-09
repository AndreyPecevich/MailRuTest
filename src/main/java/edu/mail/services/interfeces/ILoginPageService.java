package edu.mail.services.interfeces;

public interface ILoginPageService {
	public void fillLoginInput(String login);
	public void fillDomainSelect(String domain);
	public void fillPasswordInput(String password);
	public void clickMailboxButton();
	void registration();
	public boolean isErrorLabelShow();
	public boolean isTextPresent(String text);
}
