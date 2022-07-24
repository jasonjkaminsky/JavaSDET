package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        // location of file on computer
        String path = "Files/SDETBatch13TestFile.xlsx";
        // Navigate to this file
        FileInputStream fileInputStream = new FileInputStream(path);
        // Class that understands how Excel files work
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");


        fileInputStream.close();

        int NoOfRows =sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < NoOfRows; i++){
            Row row = sheet.getRow(i);
            int noOfCells = row.getPhysicalNumberOfCells();
            for(int j = 0; j< noOfCells; j++){
                System.out.print(row.getCell(j) + " ")
                ;
            }
            System.out.println();
        }
    }

}
