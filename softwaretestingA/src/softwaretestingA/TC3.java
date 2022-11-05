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
			///given test case
		System.out.println("Test case");
		System.out.println("Given I have added  products in the Shopping Cart WHEN I click on check out from Home page THEN It take me to check out page");
		Actions s=new Actions(driver);
		///finding path to the cart button icon and then press it
		WebElement mytarget1 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div[3]/div/div[2]/button")));
		System.out.println("Performing the cart icon clicking");
		//moving to the element define in xpath and clicking on it automatically
		s.moveToElement(mytarget1);
		s.click(mytarget1);
		s.build();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));
		s.perform();
		/////goinfg to checkout page from icon cart
		WebElement mytarget2 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/a[2]")));
		System.out.println("Performing the checkout clicking");
		//moving to the element define in xpath and clicking on it automatically
		s.moveToElement(mytarget2);
		s.click(mytarget2);
		s.build();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		//driver control is switched to new tab or new window
		String newUrl = driver.getCurrentUrl();
		    ///comparing current url with checkout page url 
	    if(newUrl.equalsIgnoreCase("http://localhost/checkout"))
	    {
	        System.out.println("Successfully direct to checkout page");	
	        driver.quit();
	        
	    }
	    else {
	        System.out.println("Failed");
			
	    }


	}
		@AfterMethod
		public void tearDown()
		{ 
			driver.quit();
		}


}
