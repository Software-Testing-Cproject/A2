package softwaretestingA;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class TC5 {
	@Test
public void test_getAllCustomerList()///getting all the customer list
{
		given()
		 .when()
		  .get("https://rest-api.shopizer.com/api/v1/private/customers")///putting url of the respective page
		  .then()
		  .statusCode(200);///ok for 200
	}

}
