package application;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class log {

	public Logger logger;
	FileHandler fh;
	
	public log(String file_name) throws SecurityException, IOException {
		File f =  new File(file_name);
			
		//check to see if file exsists.
		//if not then create a file
		// file will be created based on pathname and 
		//will show in the folder found in worksapce/Logging
		
		if( !f.exists())
		{
			f.createNewFile();
			
		}
		
		fh = new FileHandler(file_name, true);
		
		logger = Logger.getLogger("test");
		
		logger.addHandler(fh); //this is where filehandler is being used
		
		SimpleFormatter formatter = new SimpleFormatter(); //simpleformatter already exsists
		
		fh.setFormatter(formatter);
	}
}
