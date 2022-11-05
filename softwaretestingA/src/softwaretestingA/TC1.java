package softwaretestingA;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TC1 
{   WebDriver driver;
@BeforeMethod
public void setUp()
{ 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farwa\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("http://localhost:82/#/pages/home");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();

}
@Test
public void verify()
{Actions s=new Actions(driver);
System.out.println("Test case");
System.out.println("Given I am in the home page\r\n"
		+ "\r\n"
		+ "When I click on the store management section and on the store list page\r\n"
		+ "\r\n"
		+ "Then the System displays the every store information list.");
	///Finding and clicking on store management button 
System.out.println("Finding and clicking on Store Management Button\\r\\n");
WebElement storemanagement= driver.findElement(By.xpath("/html/body/ngx-app/div/ngx-pages/ngx-sample-layout/nb-layout/div[1]/div/div/nb-sidebar[1]/div/div/nb-menu/ul/li[3]/a/span"));
		//moving to the element define in xpath and clicking on it automatically
				s.moveToElement(storemanagement);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				s.click(storemanagement);
				s.build();

				//finding and clicking on store list button
				System.out.println("Finding and clicking on Store List Button");
				WebElement storelist= driver.findElement(By.xpath("/html/body/ngx-app/div/ngx-pages/ngx-sample-layout/nb-layout/div[1]/div/div/nb-sidebar[1]/div/div/nb-menu/ul/li[3]/ul/li[2]/a/span"));
				//moving to the element define in xpath and clicking on it automatically
				s.moveToElement(storelist);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				s.click(storelist);
				s.build();
}
	@AfterMethod
	public void tearDown()
	{ 
		driver.quit();
	}
}
