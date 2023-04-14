package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PageObjectModel.BaseClass;

public class ExcelSheet extends BaseClass {
	
	public  Object[][] getTestData(String sheetName) throws IOException  {
		String path = System.getProperty("user.dir") + "/src/test/java/testDataDsAlgo/testDataDsAlgo.xlsx";
		File file = new File(path);
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = null;
			workbook = new XSSFWorkbook(fis);
		// Using Fis in the existing workbook

		XSSFSheet sheet = workbook.getSheet("Data");
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i + 1).getLastCellNum(); j++) {
				String cellVal = null;
				XSSFCell cell = sheet.getRow(i + 1).getCell(j);
				if (cell != null) {
					cellVal = cell.toString();
				}
				data[i][j] = cellVal;
			}
		}
			workbook.close();
				return data;
	}
}
