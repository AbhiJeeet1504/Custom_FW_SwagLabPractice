package dataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static FileInputStream inputstream;
	public static String getPropertyValue(String File, String Key) throws IOException
	{
		Properties prop= new Properties();
		inputstream = new FileInputStream(File);
		prop.load(inputstream);
		
		return prop.getProperty(Key);
	}

}
