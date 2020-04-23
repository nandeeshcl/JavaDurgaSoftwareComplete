package excelreaderandwriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	public static void main(String[] args) throws IOException {
		
		
		//create new workbook
		XSSFWorkbook  workbook=new XSSFWorkbook();
		
		
		//create new sheet in workbook: with sheet name
		XSSFSheet sheet=workbook.createSheet("testData");
		
		
		//create rows--cells--set value in the cells
		for(int rows=0;rows<10;rows++)  //from 10 rows
		{
			//create rows in a sheet
			Row row=sheet.createRow(rows);  
			
			for(int cols=0;cols<5;cols++)   //create 5 columns
			{
				Cell cell=row.createCell(cols);  //create 10*5 cells in each rows
				
				//set random value in created cell
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		
		//Crete file and write workbook to file
		File f=new File(".\\src\\test\\resources\\fileWriter\\excelDataFile.xlsx");
		FileOutputStream file=new FileOutputStream(f);
		workbook.write(file);
		
		
		//close the file
		file.close();
		
		System.out.println("FIle created!!!");
		
	}

}
