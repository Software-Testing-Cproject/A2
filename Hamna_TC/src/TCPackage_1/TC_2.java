
package TCPackage_1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_2 {

	  WebDriver driver;
	  @BeforeMethod
	   public void setUp()
	   { 
	   System.setProperty("webdriver.chrome.driver", "E:\\7th sem\\SE\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://localhost");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	   }
       @Test
	   public void verifyquality()
	   {
		   //verify that quality box is present or not
    	   
    	   String url = "/product/olive-table";
    	   WebElement link = driver.findElement(By.xpath("//a[@href=\"" + url + "\"]"));
    	   link.click();
    	   
		   WebElement strvalue = driver.findElement(By.className("cart-plus-minus-box"));
	        String expected = "1";
	        String actual = strvalue.getText();
	        System.out.println(actual);

	        if(expected.equals(actual))
	         {
	           System.out.println("Pass");
	         }
	         else
	         {
	            System.out.println("Fail");
	          }
	   }
	  
	   	@AfterMethod
	   	public void tearDown()
	   	{ 
	   		driver.quit();
	   	}
}
