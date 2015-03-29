package com.pack.mail;

import java.io.File;
import java.io.IOException;

import com.pack.files.LogDemo;

public class SelectFile {
	public static File logFilePath;
static void getName()
{
	 File logFilePath = new File(LogDemo.logfileName);
     try {
    	 		//getting log file full path & we will add this to email program as attachment
				System.out.println(logFilePath.getCanonicalPath());
			
		 } catch (IOException e) {
				e.printStackTrace();
			}
	    

	}	
public static void main(String args[])
{
	new SelectFile().getName();
}
}

