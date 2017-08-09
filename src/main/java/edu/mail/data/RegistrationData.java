package edu.mail.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class RegistrationData {
	private HSSFWorkbook myExcelBook;
	private HSSFSheet myExcelSheet;
	private Object[][] registrationData;
	
	public Object[][] getRegistrationData(){
		try {
			myExcelBook = new HSSFWorkbook(new FileInputStream("DataForRegistration.xls"));
			myExcelSheet = myExcelBook.getSheet("data");
			registrationData = new Object[myExcelSheet.getLastRowNum()][10];
			for(int i=0; i<myExcelSheet.getLastRowNum();i++){
				HSSFRow row = myExcelSheet.getRow(i+1);
                for (int j=0;j<10;j++){
                    registrationData[i][j] = row.getCell(j).getStringCellValue();
                }
			}
			myExcelBook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return registrationData;
	}
}
