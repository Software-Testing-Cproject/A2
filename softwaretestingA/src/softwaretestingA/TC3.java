package softwaretestingA;
import java.time.Duration;
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
public class TC3 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farwa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	//wait for 10 seconds
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("http://localhost/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
		//click on target button
		s.click(mytarget1);
		driver.navigate().refresh();
		s.build();

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));
		s.perform();
		/////goinfg to checkout page from icon cart
		WebElement mytarget2 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div[3]/div/div[2]/div/div[2]/a[2]")));
		System.out.println("Performing the checkout clicking");
		//moving to the element define in xpath and clicking on it automatically
		String href1="http://localhost/checkout";	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		//moving to the checkout page
		driver.navigate().to(href1);
		driver.navigate().forward();  
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		//getting Current URL of the curren page
		String newUrl = driver.getCurrentUrl();
		System.out.println(newUrl);
		 if(newUrl.equalsIgnoreCase("http://localhost/checkout"))//matching with the checkout page url
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
		
		}


}
