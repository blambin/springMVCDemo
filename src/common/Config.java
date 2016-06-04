package common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	private Properties properties = new Properties();
	private InputStream fis;

	public Config() {
		try {
			
			fis =  Config.class.getClassLoader().getResourceAsStream("misc.properties");
			properties.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public  Properties getProperties() {
		return properties;
	}

	
	
}
