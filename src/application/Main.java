package application;

import java.util.logging.Level;

public class Main {

	public static void main(String[] args) {
		
		try {
			log my_log = new log("log.txt");
			
			my_log.logger.setLevel(Level.INFO);
			
			//testing log msgs
			my_log.logger.warning("warning msg");
			my_log.logger.severe("warning severe");
			my_log.logger.info("info msg");
			
		} catch (Exception e) {
			
		}
		
	}
}
