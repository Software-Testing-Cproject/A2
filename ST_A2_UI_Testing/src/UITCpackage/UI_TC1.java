package UITCpackage;
import java.time.Duration;

import javax.swing.JButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UI_TC1 {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost/product/chair");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void verify()
	{
	String actualtitle=driver.getTitle();
	String expectedtitle="Shopizer";
	Assert.assertEquals(actualtitle,expectedtitle);
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	

}
