import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_POST {
	
	
	//@Test
	public void Test_1_Post() {
		
//		Map<String,Object> map = new HashMap<String ,Object>(); 
//		map.put("name", "sonu sharma");
//		map.put("job", "Devloper");
//		System.out.println(map);
		
		//JSONObject request= new JSONObject(map);
		JSONObject request= new JSONObject();
		
		request.put("name", "sonu sharma");
		request.put("job", "Devloper");
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
		
		
	}
	@Test
	public void Test_2_PUT() {
		

		JSONObject request= new JSONObject();
		
		request.put("name", "sonu sharma");
		request.put("job", "Devloper");
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		given().
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	
	@Test
	public void Test_3_Patch() {
		

		JSONObject request= new JSONObject();
		
		request.put("name", "sonu sharma");
		request.put("job", "Devloper");
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		given().
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	
	@Test
	public void Test_4_Delete() {
		

		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
	}

}
