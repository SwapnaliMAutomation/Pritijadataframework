package Excelpritija;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelReaderpritija
{
	
		public Object[][] gettestdata() throws IOException
		{
			FileInputStream File=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Dataframework exel sheet\\Pritijapgm.xlsx");
			Sheet SH= WorkbookFactory.create(File).getSheet("LoginData");
			Object [][] data = new Object [SH.getLastRowNum()][SH.getRow(0).getLastCellNum()];
			for(int i=0;i<SH.getLastRowNum();i++) {
				for(int j=0;j<SH.getRow(0).getLastCellNum();j++) {
					data[i][j] = SH.getRow(i+1).getCell(j).toString();
					System.out.println(data[i][j]);
				}
			}
			return data;
			
		}
		
		
		
		
		

	}

	

