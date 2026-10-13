package RestAssuredAPI.ResAssuredAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstGetRequest {
//	https://reqres.in/api/collections?project_id=53152
	
@Test
public void testcase() {
	Response res=RestAssured.get("https://reqres.in/api/users/2");
	System.out.println(res.asPrettyString());
	System.out.println(res.getStatusCode());
	System.out.println(res.getTime());
	System.out.println(res.getHeader("Content-Type"));
	System.out.println(res.asPrettyString());
	System.out.println(res.getStatusCode());
	System.out.println(res.getTime());
	System.out.println(res.getTime());
	System.out.println(res.getHeader("Content-Type"));
	System.out.println(res.asPrettyString());
	System.out.println(res.getStatusCode());
	System.out.println(res.getTime());
	
	
}
}
