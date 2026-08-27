
package APIAutomation;
import APIAutomation.constants;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import java.util.HashMap;

public class APIChainingAssignment {
    String token;
  @Test
    public void RegisterUser() {
      RestAssured.baseURI = constants.baseURLQA;
      RequestSpecification spec = RestAssured.given();
      spec.header("Content-type", "Application/json");
      HashMap<String, Object> hm = new HashMap<>();
      hm.put("first_name", "John");
      hm.put("last_name", "Doe");
      hm.put("address", "Street 1");
      hm.put("city", "City");
      hm.put("state", "State");
      hm.put("country", "Country");
      hm.put("postcode", "1234AA");
      hm.put("phone", "0987654321");
      hm.put("dob", "1970-01-01");
      hm.put("email", "john12345@gmail.com");
      hm.put("password", "super-secret");
      Json json = new Json();
      spec.body(json.toJson(hm));
      Response response = spec.post("/users/register");
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody().asString());
  }
  @Test
        public void LoginUser()
       {
            RestAssured.baseURI=constants.baseURLQA;
            RequestSpecification spec1=RestAssured.given();
            spec1.header("content-type","application/json");
            HashMap<String,Object> hm1 =new HashMap<>();
            hm1.put("email","customer@practicesoftwaretesting.com");
            hm1.put("password","welcome01");
            Json json1=new Json();
            spec1.body(json1.toJson(hm1));
            Response response1=spec1.post("users/login");
            System.out.println(response1.getStatusCode());
                System.out.println(response1.getBody().asString());
           token=response1.jsonPath().getString("access_token");
           System.out.println(token);

        }

        @AfterMethod
       public void getuser(){
        RestAssured.baseURI=constants.baseURLQA;
        RequestSpecification spec2=RestAssured.given();
        spec2.header("Authorization","Bearer "+token);
        Response response2=spec2.get("/users/me");
        System.out.println(response2.getStatusCode());
        System.out.println(response2.getBody().asString());



        }





}
