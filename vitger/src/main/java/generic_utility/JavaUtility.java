package generic_utility;


import java.time.LocalDateTime;
import java.util.Date;

public class JavaUtility {
 
	public String DateAndTime() {
		Date date = new Date();
		return date.toString().replace(" ", "_");
	}
	public String generateDateinYYYY_MM_DD() {
		LocalDateTime date = LocalDateTime.now();
		String Month = "0"+  date.getMonthValue();
		int day =  date.getDayOfMonth();
		int year = date.getYear();
		return year +"-" + Month +"-" +day ;
		
	}
}
