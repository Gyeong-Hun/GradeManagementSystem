package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;

	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {//writer가 아니고 filehandler사용
			logmanager = LogManager.getLogManager();//값을 넣어준다.
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			
			logger.addHandler(filehandler);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void log(String logMessage) {
		logger.info(logMessage);	
	}
}
