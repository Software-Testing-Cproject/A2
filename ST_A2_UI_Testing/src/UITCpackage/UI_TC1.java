package UITCpackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UI_TC1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost");
	driver.manage().window().maximize();
   
	}
	@Test
	public void verifydropdown()
	{

		Actions s=new Actions(driver);

		
		WebElement check1= driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[1]/div[1]/span/i"));
		s.moveToElement(check1);
		s.click(check1);
s.build().perform();
		 
	WebElement check=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[1]/div[1]/div/ul/li/button"));
	
	s.moveToElement(check);
	s.click(check);

	s.build();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));
	s.perform();
	

	
	
	}
	@AfterMethod
	public void tearDown()
	{
		 
	driver.quit();
	}
	

}
