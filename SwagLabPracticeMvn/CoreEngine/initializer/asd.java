package initializer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class asd {

	public static FileInputStream fis;
	public static void main(String[] args) throws IOException {
		
		String propertyFilePath = System.getProperty("user.dir")+"/src/test/resources/TestData/config.properties";
		
		System.out.println(propertyFilePath);

		System.out.println(proReader(propertyFilePath, "browser"));
		System.out.println(proReader(propertyFilePath, "url"));
		System.out.println(proReader(propertyFilePath, "userName"));
		System.out.println(proReader(propertyFilePath, "Password"));
	}
	
	public static String proReader(String file, String key) throws IOException
	{
		Properties prop= new Properties();
		fis = new FileInputStream(file);
		prop.load(fis);
		
		return prop.getProperty(key);
	}

}
