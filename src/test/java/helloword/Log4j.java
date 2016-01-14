package helloword;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	static final Logger logger = Logger.getLogger(Log4j.class);
	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("D:/workspaceJ2EE/twobytes/src/test/java/helloword/log4j.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
	}
}
