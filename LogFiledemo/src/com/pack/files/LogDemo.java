package com.pack.files;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.pack.mail.EmailMessage;

public class LogDemo {
	
	static SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
	static String logfolderName=sdf1.format(Calendar.getInstance().getTime())+".log";
	static  SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yyyy HH-mm-ss");
	public static String logfileName=sdf2.format(Calendar.getInstance().getTime())+"-LOG.log";
   
	static void getValueForLogFile()
	{
		//Assign runtime names for log folder and file.
       //hello by kamlesh
        System.setProperty("logfoldername",logfolderName);
		System.setProperty("logfilename", logfileName);
	}
	static void display()
	{  final Logger logger = Logger.getLogger(LogDemo.class);
		logger.error("start");
		logger.debug("----");
		logger.warn("----");
		logger.info("-----");
		System.out.println(System.getProperty("java.io.tmpdir"));
		System.out.println("log file demo class"+logfileName);
		logger.error("end");
		
	
	}
	public static void main(String[] args) {

		getValueForLogFile();
		display();
		EmailMessage.sendMail(logfileName);
	}

}
