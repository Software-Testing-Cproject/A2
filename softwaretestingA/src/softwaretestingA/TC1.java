package softwaretestingA;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
driver.get("http://localhost:82/#/auth");
driver.manage().window().maximize();

}
@Test
public void verify()
{
	////define test case
System.out.println("Test case");
System.out.println("Given I am in the store management section\r\n"
		+ "\r\n"
		+ "When I click on the store list page\r\n"
		+ "\r\n"
		+ "Then the System displays the every store information list.");
System.out.println("Login Button Pressing\\r\\n");
///after putting user name and password then pressing login button
driver.findElement(By.xpath("/html/body/ngx-app/div/ngx-auth/nb-layout/div/div/div/div/div/nb-layout-column/ngx-login/div[1]/div/div/div/form/div[4]/button"));
//moving to the element define in xpath and clicking on it automatically
///reference of home page after directing to the 
String href="http://localhost:82/#/pages/home";	
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
///moving to the home page refernce
driver.navigate().to(href);
driver.navigate().forward();  
driver.navigate().refresh();
	///Finding and clicking on store management button 
System.out.println("Finding and clicking on Store Management Button\\r\\n");
driver.findElement(By.xpath("/html/body/ngx-app/div/ngx-pages/ngx-sample-layout/nb-layout/div[1]/div/div/nb-sidebar[1]/div/div/nb-menu/ul/li[3]/a/span"));
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
driver.navigate().refresh();
//finding and clicking on store list button
System.out.println("Finding and clicking on Store List Button");
driver.findElement(By.xpath("/html/body/ngx-app/div/ngx-pages/ngx-sample-layout/nb-layout/div[1]/div/div/nb-sidebar[1]/div/div/nb-menu/ul/li[3]/ul/li[2]/a/span"));		
//moving to the element define in xpath and clicking on it automatically
String href1="http://localhost:82/#/pages/store-management/stores-list";	
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
//moving to the store list page
driver.navigate().to(href1);
driver.navigate().forward();  
driver.navigate().refresh();
driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));

			
}
	@AfterMethod
	public void tearDown()
	{ 
		}
}
