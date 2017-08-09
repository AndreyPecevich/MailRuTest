package edu.mail.services.interfeces;

public interface INewLatterPageService {
	public void fillInputWhom(String whom);
	public void fillInputTheme(String theme);
	public void fillInputContentBody(String contentBody);
	public void clickSendButton();
	public boolean isTextPresent(String text);
}
