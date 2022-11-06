package TCPackage_1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_1 {
	   WebDriver driver;
	   @BeforeMethod
	   public void setUp()
	   { 
	   System.setProperty("webdriver.chrome.driver", "E:\\7th sem\\SE\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://localhost/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	   }
	   
	   @Test
	   public void verifylogo()
	   {
		   //verify image is present or not
		 WebElement Logocheck=driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[2]/div[1]/div/div[1]/div/a/img"));  
		 
		 if(Logocheck.isDisplayed())
		 {
			 System.out.println("Logo_Image available");
		 }
		 
		 else
		 {
			 System.out.println("failed");
		 }
	   }
	   
	  
	   	@AfterMethod
	   	public void tearDown()
	   	{ 
	   	     driver.quit();
	   	}
	
}
