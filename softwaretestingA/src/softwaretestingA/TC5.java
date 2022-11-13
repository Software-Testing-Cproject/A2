package softwaretestingA;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import java.util.HashMap;
public class TC5 {
	@Test
public void test_updatePasswordCustomer()
{
		///for reset password we need following categories
		//1. current password
		//2. new password
		//3. repeat password
		//4. username
		//5. store name
		//6. token
		//creating Hash Func in which data for updation of password is stored
		HashMap data=new HashMap();
		data.put("current", "Fb1234567");
		data.put("password", "Xyz123456789");
		data.put( "repeatPassword", "Xyz123456789");
		data.put("username", "farwa");
			Response r=
		given()
		.contentType("application/json")
		   .body(data)
		 .when()
		 //here putting the url in which xyz is store and 122 is token
		  .post("https://rest-api.shopizer.com/api/v1/customer/xyz/password/122")
		  .then()
				//All the codes description that describe each return code result
				//200  OK
                                //201	 Created
				//401	 Unauthorized
				//403	Forbidden
				//404	Not Found
		  .statusCode(200)////expected status code 200 for ok
		  .log().body()
	    .extract().response();//extract response
	String jsonstr=r.asString();
	Assert.assertEquals(jsonstr.contains("password updated Successfully"), true);
	}

}
