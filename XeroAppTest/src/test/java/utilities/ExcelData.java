package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {

	/* 
	 * Name of the Method  : readExcelData()
	 * Description         : reading data from excel sheet
	 * Arguments           : String dataTablePath 
	 * 						 String sheetName
	 * Created 			   : 03/21/19
	 * Last Modified       : 03/21/19
	 */
	public static String[][] readExcelData(String dataTablepath, String
			sheetName) throws IOException {
		
		File xlFile = new File(dataTablepath);
		FileInputStream xlDoc = new FileInputStream(xlFile);
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		HSSFSheet sheet = wb.getSheet(sheetName);
		
		String val;
		
		int iRowCount = sheet.getLastRowNum()+1;
		int iColumnCount = sheet.getRow(0).getLastCellNum();

		String[][] xldata = new String[iRowCount][iColumnCount];
		
		for(int i = 0; i <iRowCount; i++) {
			for(int j = 0; j<iColumnCount; j++) {
				xldata[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return xldata;
	}
}
