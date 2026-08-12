package myP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCase102 {
	public static void main(String[] Args) {
		System.out.println("md shahajada imran");
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.Amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("Study Guide for OCP 829 exam");
		driver.findElement(By.cssSelector("#nav-search-bar-form > div.nav-right > div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.findElement(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div")).click();
		
		//WebElement oDepType=driver.findElement(By.cssSelector("#searchDropdownBox"));
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement oDepType1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDropdownBox")));
		WebElement oDepType1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("searchDropdownBox")));
		
		WebElement oDepType=driver.findElement(By.id("searchDropdownBox"));			
		Select select=new Select(oDepType);
		select.selectByVisibleText("Books");
		
	//	driver.quit();
	}

}
