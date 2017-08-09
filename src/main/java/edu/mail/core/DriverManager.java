package edu.mail.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	private static DriverManager instance;
	private WebDriver driver;

	public static DriverManager get() {
		if (instance == null) {
			return instance = new DriverManager();
		} else {
			return instance;
		}
	}


	public WebDriver getDriver() {
		if (driver == null) {
			driver = DriverCreator.getInstance().createDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			return driver;
		} else {
			return driver;
		}
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
