package myP;

import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase105 {
	
	public static void main(String[] Args) throws IOException, Throwable {
    
	System.out.println("Md Shahajada Imran");	
	
	//Close Edge Browser Opened by previous script run
	Runtime.getRuntime().exec("taskkill /F /IM msedge.exe");
		
	//Creating an Instance of EdgeDriber Class	
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.yahoo.com/"); 
	driver.findElement(By.cssSelector("#uh-sbq")).sendKeys("Md Shahajada Imran");
	Thread.sleep(7);
	try {
		driver.findElement(By.xpath("//*[@id=\"push-sdk-prompt-41805\"]/div/div/div[2]/div[2]/button[2]")).click(); //Pop-up handling if appears during runtime
		
	} catch (Exception e) {
	}	
	driver.findElement(By.cssSelector("#module-uh > div > div.inline-flex.items-center.justify-around > div.z-10.h-10.w-full.backdrop-blur-0.md\\:block.md\\:h-\\[46px\\].md\\:mr-8.lg\\:mr-10.relative.hidden.max-w-\\[702px\\] > form > div.rounded-tr-\\[26px\\].bg-transparent.-mr-px > button > svg")).click();
	
	//Closing the 1st tab out of 2 tabs
	var tabs=driver.getWindowHandles().toArray();
	driver.switchTo().window(tabs[0].toString());
	driver.close();
	
	
	Thread.sleep(5);
	//Pointing to the leftover tab
	tabs=driver.getWindowHandles().toArray();
	driver.switchTo().window(tabs[0].toString());
	driver.findElement(By.linkText("Yahoo Scout")).click();
	driver.manage().window().maximize();
	
	
	}

}
