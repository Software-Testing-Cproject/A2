package softwaretestingA;
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
driver.get("http://localhost/product/chair");
driver.manage().window().maximize();

}
@Test
public void verify()
{	//getting the title of the website
	String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
	//expected title
	String expectedTitle = "Default store";
	if(actualTitle.equalsIgnoreCase(expectedTitle))//if actual matched
		System.out.println("Title Matched as the expected one");
	else
		System.out.println("Title didn't match");
	

}
	@AfterMethod
	public void tearDown()
	{ 
		driver.quit();
	}
}
