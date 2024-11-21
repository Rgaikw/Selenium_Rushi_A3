package com.ShoppersStack_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {
	
public String readPropertyFile(String key) throws IOException {
	FileInputStream fis = new FileInputStream(FrameworkConstants.propertyFilePath);
	Properties pro= new Properties();
	pro.load(fis); //used to create relation between fileinputstream and properties
	String value = pro.getProperty(key);
	return value;
	
}

public String readExcelFile(String SheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(FrameworkConstants.excelFilePath);
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	return  value;
}
 
	
}
