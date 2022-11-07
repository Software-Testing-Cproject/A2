package TCPackage_1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TC_4 {
	@Test
   public void Product_attribute()
   {
		//get the atrribute by checking the existing code
		given()
		
		.when()
		  .get("https://rest-api.shopizer.com/api/v1/private/product/option/unique") 
		.then()
		
		  .statusCode(200);///ok for 200
   }
}

