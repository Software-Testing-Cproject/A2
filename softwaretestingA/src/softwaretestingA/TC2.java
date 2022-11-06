package softwaretestingA;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TC2 {

	  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farwa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	///implicitly wait before going to url
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	///going to respective url
	driver.get("http://localhost/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	///maximizing the window
	driver.manage().window().maximize();

	}
	@Test
	public void verify()
	{
///TES CASE
		System.out.println("Test case");
		System.out.println("When i click on ‘Shop’ <button on Home Page Then  it should <open> the Product Page And do not give any error");
	
	///Finding and clicking on shop now button 
		driver.findElement(By.xpath("//a[text()='Shop Now']")).click();
		///getting the tabs of the window
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1));
		//driver control is switched to new tab or new window

		    String newUrl = driver.getCurrentUrl();
//comparision with the shop Now url
	    if(newUrl.equalsIgnoreCase("http://localhost/ShopNow"))
	    {
	        System.out.println("Successful in proceeding to shopping  page ");	
	        driver.quit();
	        
	    }

	}
		@AfterMethod
		public void tearDown()
		{ 
			driver.quit();
		}
	

}
