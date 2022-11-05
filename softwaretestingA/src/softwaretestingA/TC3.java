package softwaretestingA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TC3 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farwa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://localhost/product/chair");
	driver.manage().window().maximize();

	}
	@Test
	public void verify()
	{
		System.out.println("Test case");
		System.out.println("Given I have added products in the Shopping Cart When I click on check out from Home page Then It take me to check out page");
		driver.findElement(By.className("active")).click(); //ADD THE prdocut to cart
		driver.findElement(By.className("icon-cart")).click(); //press the cart icon
		 driver.findElement(By.name("Checkout")).click(); //using Selenium click button method, click on checkout button
		System.out.println("Successful in proceeding to Checkout Page");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));//jumping to next window
		//driver control is switched to new tab or new window
		    String newUrl = driver.getCurrentUrl();//getting url of new windo

	    if(newUrl.equalsIgnoreCase("http://localhost/checkout"))//comparing the URL
	    {
	        System.out.println("Successful in proceeding to Checkout page ");	
	        
	    }
	    else {
	        System.out.println("Failed in proceeding to Checkout page");
			
	    }


	}
		@AfterMethod
		public void tearDown()
		{ 
			driver.quit();
		}


}
