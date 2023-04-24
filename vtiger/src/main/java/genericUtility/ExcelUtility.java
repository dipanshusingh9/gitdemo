package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public String FetchDatafromExcelUtility(String SheetName ,int rowNo ,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPATHCONSTANT.EXCELPATH);
		return WorkbookFactory.create(fis).getSheet(SheetName).getRow(rowNo).getCell(cellNo).toString();
	}
	
}
