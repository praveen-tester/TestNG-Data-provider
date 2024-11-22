package DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven {

	String path="/Users/apple/Desktop/datadriven.xlsx";

	@Test
	public String[][] dd1() throws IOException {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook w1=new XSSFWorkbook(fi);
		XSSFSheet s1=w1.getSheetAt(0);
		int lastrowno=s1.getLastRowNum();
		int lastcellno=s1.getRow(lastrowno).getLastCellNum();
		System.out.println(lastrowno);
		System.out.println(lastcellno);
		for(int i=1;i<=lastrowno;i++) {
			for(int j=0;j<lastcellno;j++) {
				//DataFormatter f1=new DataFormatter();
				//data[i][j]=f1.formatCellValue(s1.getRow(i).getCell(j));

			}
		}
		return null;






	}

}
