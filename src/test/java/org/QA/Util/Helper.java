package org.QA.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Helper {
	
	public static Properties prop;
	private static String configpath = "ConfigFolder/Configuration_properties";
	
	public static void ConfigurationInitialization() {
		prop = new Properties();
		try {
			InputStream in = new FileInputStream(configpath);
			prop.load(in);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
