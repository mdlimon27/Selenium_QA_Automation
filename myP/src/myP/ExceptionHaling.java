package myP;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExceptionHaling {
	//Created by: Md Shahajada Imran

	public static void main(String[] Args) {
		
		WebDriver driver=null; //Declaring driver variable here (Making the driver variable instance variable) so it can be accessed by any block (Try or Catch or finally)
		
		try {
			System.out.println("Try Block Executed"); //Always executes
			
			//Intentionally making runtime error (Run-time error is also called exception in selenium)
		     driver=new EdgeDriver();
		    driver.get("https://www.apple.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		    driver.findElement(By.id("globalnav-menubutton-link-search")).click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		    driver.findElement(By.cssSelector("#globalnav-submenu-search > div > div > form > div.globalnav-searchfield-wrapper > input.globalnav-searchfield-input")).sendKeys("Laptop");
		   // driver.findElement(By.xpath("//*[@id=\"globalnav-submenu-search\"]/div/div/form/div[1]/button[2]")).click(); //Valid xpath used, Commented out
		    driver.findElement(By.xpath("//*[@id=\"globalnav-submenu-search\"]/div/div/form/div[1]/button[21]")).click(); //Invalid xpath used so runtime error appears
		    String vSearchResult=driver.findElement(By.cssSelector("#panel-_r_3_-0 > div > div.rf-serp-resultcount")).getText();
		    System.out.println(vSearchResult);
		    
		
	    }catch (Exception e){
				System.out.println("Catch Block Executed"); //Executes only if Run-Time Errors appear during runtime.
				//Commented out below 4 lines so run-time error (Exceptions) information don't show in the console.
				/*e.printStackTrace(); 
				e.printStackTrace();
				String vMessage=e.getMessage();
				System.out.println(vMessage);*/
		
		}finally {
				System.out.println("finally block executed"); //Always Executes
				
				if(driver !=null) {
					driver.quit(); //Closing the Edge Browser
				}
		
		}
		
		System.out.println("Out side of Try/Catch/Finally blocks Executed");
	}
	
	
}
