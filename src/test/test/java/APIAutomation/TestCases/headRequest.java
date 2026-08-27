package APIAutomation.TestCases;

import APIAutomation.Constants.constants;
import APIAutomation.Utility.commons;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static APIAutomation.Constants.constants.baseURLQA;

public class headRequest {
    String bearerToken="";
    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        bearerToken = com.generateBearerToken();
    }

    @Parameters("env")
    @Test
    public void headReq(String x) {
        String baseURL = "";
        if(x.equalsIgnoreCase("qa")){
            baseURL = baseURLQA;
        }
        else{
            baseURL = constants.baseURLDev;
        }
        System.out.println("Environment: "+x);
        System.out.println(baseURL);

        RestAssured.baseURI = baseURL;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer "+bearerToken);
        Response response = spec.head("/items");
        System.out.println(response.asPrettyString());
        Assertions.assertThat(response.statusCode()).isEqualTo(200);
        System.out.println(response.headers());
    }
}
