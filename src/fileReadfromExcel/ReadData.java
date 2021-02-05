package fileReadfromExcel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//read the data and get it to console in table format
public class ReadData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\downloads\\ABC.xlsx");//path of excel file
		Workbook wb=WorkbookFactory.create(fis);//loading the excel file
		Sheet sh=wb.getSheet("Login");//loaded sheet also
		int rowCount=sh.getPhysicalNumberOfRows(); //how many rows
		Row firstRow=sh.getRow(0);
		for(int row=0;row<rowCount;row++)
		{
			for(int col=0;col<firstRow.getLastCellNum();col++)
			{
				Cell cl=sh.getRow(row).getCell(col);
				System.out.print(cl.toString() + "   ");
			}
			System.out.println();
		}
		
	}

}
