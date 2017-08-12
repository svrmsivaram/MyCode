package wrappers;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String excelFileName) throws InvalidFormatException, IOException {
		
		File fis = new File("./testdata/"+excelFileName+".xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount]; 
		for (int i = 1; i <= rowCount ; i++) {
			for(int j=0;j<columnCount;j++){
				
			  data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();			
			}
		}
		return data;
	}
	
	
}
