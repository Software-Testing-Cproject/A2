package UITCpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UI_TC3_Footer {

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
	public void verifyfooter()
	{

		String href="http://localhost/contact";

		driver.findElement(By.xpath("//*[@id=\"root\"]/footer"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(4));	
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(4));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[1]/h3"));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[2]/ul/li[1]/a")).click();
		
		driver.navigate().to(href);
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(4));
	System.out.print("The contact page is opened");
	
	
	
	}
	@Test
	public void verifyloginbtnfooter()
	{

	
		String href1="http://localhost/login";
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div"));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));			

		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[1]/h3"));
		
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[2]/ul/li[2]/a"));
		check1.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		driver.navigate().to(href1);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
	driver.navigate().forward();	 
	System.out.print("The login page is opened");
	
	
	
	}
	@Test
	public void verifyregisterbtnfooter()
	{

	
		String href1="http://localhost/register";
		driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div"));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));			

		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[1]/h3"));
		
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[3]/div/div[2]/ul/li[3]/a"));
		check1.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		driver.navigate().to(href1);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
	driver.navigate().forward();	 
	System.out.print("The Register page is opened");
	
	
	
	}
	@Test
	public void subscribefooter()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[4]/div"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[4]/div/div[1]/h3"));
		
		String ipvalue="javeriazulfiqarjz@gmail.com";
		String locator="//*[@id=\"root\"]/footer/div/div/div[4]/div/div[2]/div/div/form/div/div[1]/input";
		
		WebElement field = driver.findElement(By.xpath(locator));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		field.clear();
		field.sendKeys(ipvalue);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[4]/div/div[2]/div/div/form/div/div[2]/button"));
		check1.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));	
			
	driver.navigate().refresh();	 
	System.out.print("The  Subscribe click is done");
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		 
	driver.quit();
	}
	
	
	
	
}
