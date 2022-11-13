package softwaretestingA;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class TC6 {
	@Test
public void test_delCustomer()
{
		///for delete the customer we need following categories
		//1. Id of the customer
		//2. Respective Store
		//Hashmap Data contain id and store of the customer which we want to delete
		HashMap data=new HashMap();
		data.put("id", "45");
		data.put("store", "SuperNew");
			Response r=
		given()
		.contentType("application/json")
		   .body(data)
		 .when()
		 //here putting the url
		  .post("https://rest-api.shopizer.com/api/v1/private/customer")
		  .then()
		//All the codes description that describe each return code result
			//200  OK
                        //201	 Created
			//401	 Unauthorized
			//403	Forbidden
			//404	Not Found
		  .statusCode(200)//expected code
		  .log().body()
	    .extract().response();///extract the response
	String jsonstr=r.asString();
	Assert.assertEquals(jsonstr.contains("Customer deleted Successfully"), true);
	}

}
