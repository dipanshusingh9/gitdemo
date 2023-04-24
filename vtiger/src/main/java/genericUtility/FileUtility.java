package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String  FetchDatafrompropertyfile(String key) throws IOException  {
		 FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\vtiger\\src\\test\\resources\\propertiesfiles.properties");
		 Properties properties = new Properties();
		 properties.load(fis);
		 return properties.getProperty(key);
		 
	 }
}
