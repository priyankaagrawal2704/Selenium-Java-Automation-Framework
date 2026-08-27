package APIAutomation.TestCases;

import APIAutomation.Constants.constants;
import APIAutomation.Utility.commons;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.json.Json;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class postRequest {
    public String token="";
    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }

    @Test
    public void postReq(){
        RestAssured.baseURI = constants.baseURLQA;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization", "Bearer "+token);
        spec.header("Content-Type","application/json");
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("name","Test123");
        hm.put("price",123);
        hm.put("quantity",12);
        hm.put("category","Misc");
        Json json = new Json();
//        json.toJson(hm);
        spec.body(json.toJson(hm));
        Response response = spec.post("/items");
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        Assertions.assertThat(response.getStatusCode()).isEqualTo(201);
    }

}
