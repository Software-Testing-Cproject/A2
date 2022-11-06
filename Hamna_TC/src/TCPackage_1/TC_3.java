
package TCPackage_1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_3 {

	  WebDriver driver;
	  @BeforeMethod
	   public void setUp()
	   { 
	   System.setProperty("webdriver.chrome.driver", "E:\\7th sem\\SE\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://localhost:82/#/pages/home");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	   }
       @Test
	   public void verifyquality()
	   {
    	
          WebElement email =  driver.findElement(By.id("inputUsername1"));
          email.clear();
          email.sendKeys("admin@shopizer.com");
          
          WebElement password=  driver.findElement(By.name("password"));
          password.clear();
          password.sendKeys("password");
          WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
          loginButton.click();
    	 WebElement check_dropdown=driver.findElement(By.xpath(" /html/body/ngx-app/div/ngx-pages/ngx-sample-layout/nb-layout/div[1]/div/nb-layout-header/nav/ngx-header/div[2]/nb-actions/nb-action[1]"));  
  		 
  		 if(check_dropdown.isDisplayed())
  		 {
  			 System.out.println("Logo_Image available");
  		 }
  		 
  		 
  		WebElement dropdown_selector = driver.findElement(By.xpath("//nb-action[@class='context-menu-host']"));
  		dropdown_selector.click();
  		WebElement language = driver.findElement(By.xpath("//span[normalize-space()='Anglais']"));
  		language.click(); 
	   }
	  
	   	@AfterMethod
	   	public void tearDown()
	   	{ 
	   		driver.quit();
	   	}
}
