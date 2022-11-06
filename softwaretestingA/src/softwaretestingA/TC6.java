package softwaretestingA;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TC6 {
	@Test
public void test_delCustomer()//deleting the customer
{
		Response r=
		given()
		 .when()
		  .get("https://rest-api.shopizer.com/api/v1/private/customer/123")//putting url which include ID
		  .then()
		  .statusCode(200)//if successful then code 200
		  .log().body()
	    .extract().response();
		String jsonstr=r.asString();
		Assert.assertEquals(jsonstr.contains("Data Saved Successfully"), true);//matching with the statement which we get after the customer del
	}

}
