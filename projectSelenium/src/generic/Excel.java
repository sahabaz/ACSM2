package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConst
{
	public static String readData(String sheet , int r , int c) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f = new File(PATH);
		Workbook wb = WorkbookFactory.create(f);
		String s=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return s;
	}
}
