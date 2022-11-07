package TCPackage_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class TC_6 {

	
	@Test
	   public void delete_product()//remove option value image
	   {
		Response rspn=
			given()
			
			.when()
			  .get("https://rest-api.shopizer.com/api/v1/private/product/option/value/345/image") 
			.then()
			
			  .statusCode(200)
			  .log().body()
			  .extract().response();//for verifyion
			  
			  
		String res_json=rspn.asString();
		Assert.assertEquals(res_json.contains("Successfully"), true);
	   }
}
