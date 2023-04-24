package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	 public String  FetchDatafrompropertyfile(String key) throws IOException  {
		 FileInputStream fis = new FileInputStream("./src/test/resources/propertyData.properties");
		 Properties properties = new Properties();
		 properties.load(fis);
		 return properties.getProperty(key);
		 
	 }

}
