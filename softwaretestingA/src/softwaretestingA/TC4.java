package softwaretestingA;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class TC4 {
 @Test
	public void verify()
	{
			 System.out.println("API testing for Shop Now Page HTTP code");
	 ////putting the url 
		Response res=RestAssured.get("http://localhost/!#");
		//getting http code
int actualcode=res.getStatusCode();
System.out.println("Actual code of the shop Now page");
System.out.println(actualcode);
System.out.println("Expected code of the shop Now page");
System.out.println("200");
//comparision done
Assert.assertEquals(actualcode, 200);

	}

}
