package UITCpackage;

import java.time.Duration;
import java.time.temporal.TemporalUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class UI_TC2NavBar {
	
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
	public void verifyNavbar()
	{

		Actions s=new Actions(driver);

		
		WebElement check1= driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div[1]/div/a/img"));
		s.moveToElement(check1);
		s.click(check1);
s.build();
	s.perform();

	System.out.println("NavBAr shopizer logo have successfully caused refresh");
	}
	@Test
	public void NavbarHomebtn()
	{
Actions s=new Actions(driver);

		
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/div[1]/div/div[2]/div/nav/ul/li[1]/a"));
		s.moveToElement(check1);
		s.click(check1);
s.build();

	s.perform();

	
	System.out.println("NavBAr Home btn have successfully caused refresh");
	}
	@Test
	public void Navbartablebtn()
	{
		String href="http://localhost/category/tables";


driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/div[1]/div/div[2]/div/nav/ul/li[2]/a")).click();
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	    driver.navigate().to(href);
	    driver.navigate().forward();  
	    driver.navigate().refresh();
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	System.out.println("NavBAr table btn have successfully opened");
	}
	
	@Test
	public void Navbarchairbtn()
	{
		String href="http://localhost/category/chairs";


driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/div[1]/div/div[2]/div/nav/ul/li[3]")).click();
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	    driver.navigate().to(href);
	    driver.navigate().forward();  
	    driver.navigate().refresh();
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	System.out.println("NavBAr chair btn have successfully opened");
	}
	@AfterMethod
	public void tearDown()
	{
		 
	driver.quit();
	}
	

}
