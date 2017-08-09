package edu.mail.services.interfeces;

public interface IRegistrationService {
	public void fillFirstName(String firstName);

	public void fillLastName(String lastName);

	public void fillBirthday(String day, String month, String year);

	public void chooseGender(String gender);

	public void fillMailAdresse(String login, String domain) throws InterruptedException;

	public void fillPasswords(String password);
	
	public void fillTown(String town)throws InterruptedException;

	public void clickRegistrationButton();
	
	public boolean isTextPresent(String text);

}
