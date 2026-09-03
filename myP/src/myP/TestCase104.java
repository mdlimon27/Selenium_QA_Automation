package myP;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase104 {
	
	public static void main(String[] Args) {
		String Result, vExpectedCity, vZipcode;
		
		String[] aZipcode= {"11732","11372","11436","11765"};
		String[] aExpectedCity= {"EAST NORWICH NY","JACKSON HEIGHTS NY","JAMAICA NY","MILL NECK NY"};
		
		//vZipcode="11732";
		//vExpectedCity="EAST NORWICH NY";
		int count=aZipcode.length;
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			
			try {
				Result=testcase104(aZipcode[i],aExpectedCity[i]);
			} catch (Exception e) {	}
		}
		
		
		
		
		}
		
	
	
	
	public static String testcase104(String pZipcode,String pExpectedCity) {
		
		try {
			Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://tools.usps.com/zip-code-lookup.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.linkText("Find Cities by ZIP")).click();
		//driver.findElement(By.id("tZip")).sendKeys("11372");
		driver.findElement(By.id("tZip")).sendKeys(pZipcode);
		driver.findElement(By.linkText("Find")).click();
		String output=driver.findElement(By.cssSelector("#cityByZipDiv > div.row.col-md-5.col-sm-12.col-xs-12.recommended-cities > p.row-detail-wrapper")).getText();
		System.out.println(output);
		//checkpoint using ternary operation
		String CP1=output.equals(pExpectedCity) ? "Passed" : "Failed";
		System.out.println(CP1);		
		driver.quit();
		return CP1;
	}

}
