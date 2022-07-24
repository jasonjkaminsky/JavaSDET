package com.syntax.class30;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
    // 1. Read Workbook   >  for .xlsx file use XSSF class
    XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("/Users/jasonkaminsky/documents/Test.xlsx"));
    // 2. Read Sheet
        XSSFSheet sh = wb.getSheet("Sheet1");
        String data = sh.getRow(2).getCell(1).toString();
        System.out.println(data);

        sh.getRow(2).getCell(1).setCellValue("Jay");
        sh.getRow(2).createCell(2).setCellValue("Hello");
        sh.createRow(4).createCell(2).setCellValue("Goodbye");

        wb.write(new FileOutputStream("/Users/jasonkaminsky/documents/Test.xlsx"));
    }
}
