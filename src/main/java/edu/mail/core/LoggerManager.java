package edu.mail.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerManager {
	private static Logger log;
  
    public static Logger getLoger() {
		if (log == null) {
			return log = LogManager.getLogger();
		} else {
			return log;
		}
	
	}
}
