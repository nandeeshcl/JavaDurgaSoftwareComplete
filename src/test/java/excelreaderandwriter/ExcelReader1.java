package excelreaderandwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File f=new File(".\\src\\test\\resources\\fileWriter\\excelDataFile.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		
		//to read
		/*Sheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(0);  //0th row  0th cell value will be readed
		Cell cell=row.getCell(0);
		
		System.out.println(cell);
		
		System.out.println();*/
		
		//reade all data from sheet 0
		Sheet sheet=workbook.getSheetAt(0);
		
		//read sheet and store in row
		for(Row row0:sheet)
		{
		    //read row data and store in cell
			for(Cell cell0:row0)
			{
				System.out.print(cell0+"\t");
			}
			System.out.println();
		}
		
		fis.close();
		
		
		//System.out.println("finished reading");
		

	}

}
