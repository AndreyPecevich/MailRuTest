package edu.mail.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import edu.mail.enums.BrowserName;


public class DriverCreator {
	private static DriverCreator instance;
	public BrowserName browserName = BrowserName.FIREFOX;
	
	public static DriverCreator getInstance() {
		if (instance == null) {
			return instance = new DriverCreator();
		} else {
			return instance;
		}
	}
	public WebDriver createDriver(){
		switch (browserName) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
        }
        return null;
	}
	public void setBrowserName(BrowserName broName){
		browserName = broName;
	}

}
