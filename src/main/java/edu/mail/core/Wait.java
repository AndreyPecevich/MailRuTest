package edu.mail.core;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;

public class Wait {
	private static Wait instance;
	public static Wait getInstance() {
		if (instance == null) {
			return instance = new Wait();
		} else {
			return instance;
		}
	}
	public void waitUntil(int timeOut){
        int i=0;
        try {
            while (i<=10000 && i<timeOut){
                Thread.sleep(100);
                i+=100;
            }
        } catch (InterruptedException e) {
        	LogManager.getLogger().warn("Timeout expired!");
            e.printStackTrace();
        }
    }
	public void waitUntil(int timeOut, WebElement element){
        int i=0;
        boolean flag = element.isDisplayed();
        try {
            while (!flag && i<=10000 && i<timeOut){
                Thread.sleep(100);
                i+=100;
                flag = element.isDisplayed();
            }
        } catch (InterruptedException e) {
        	LogManager.getLogger().warn("Timeout expired or element not found!");
            e.printStackTrace();
        }
    }
}
