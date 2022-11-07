package TCPackage_1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class TC_5 {
	@Test
   public void add_new_product()//create option
   {
		
		HashMap data=new HashMap();
		data.put("code", "097");
		data.put("description", "cloth");
		data.put( "friendlyUrl", "hjuu/jj");
		data.put("highlights", "brand");
		 data.put("id", 30);
		 data.put( "keyWords", ")(*");
		 data.put( "language", "English");
		 data.put( "metaDescription", "None");
		data.put(   "name", "Product_clot");
		 data.put(   "title", "J.");
		data.put(  "id", 02);
		data.put(  "order", 04);
		data.put(  "readOnly", true);
		data.put( "type", "blue");
		
		
		Response rspn=
		given()
		    .contentType("application/json")
		   .body(data)
		.when()
		  .post("https://rest-api.shopizer.com/api/v1/private/product/option")
		.then()
		  .statusCode(200)
		  .log().body()
		  .extract().response();//to get the resopnse
		
		String res_json=rspn.asString();
		Assert.assertEquals(res_json.contains("Successfully"), true);
   }
}
