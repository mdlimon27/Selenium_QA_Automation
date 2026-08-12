package myP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase103 {
	static WebDriver driver=null;

	public static void main(String... Args) {
		System.out.println("Md Shahajda Imran");
		driver=new EdgeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/a[1]/div/div/div[3]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement obj1=wait.until(ExpectedConditions.elementToBeClickable(obj));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",obj1);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",obj1);
		//obj.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		//dealing with the unexpected pop-ups
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		try {
			js.executeScript("document.querySelectorAll('iframe').forEach(e => e.romove());");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.print("Error on All iFrame Handled");
		}
		
		try {
			List<WebElement> imgs=driver.findElements(By.tagName("img"));
			if(!imgs.isEmpty()) {
				js.executeScript("document.querySelectorAll('img').forEach(e => e.romove());");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("img pop-ups did not handled");
		}
		
		

		driver.findElement(By.cssSelector("#item-0 > a > span")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("userName")).sendKeys("Wrong Name");
		driver.findElement(By.id("userEmail")).sendKeys("WrongEmail@rong.com");
		driver.findElement(By.id("currentAddress")).sendKeys("USA");
		driver.findElement(By.id("permanentAddress")).sendKeys("Heaven");
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}
	
	
}
