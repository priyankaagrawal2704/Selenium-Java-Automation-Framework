package APIAutomation.TestCases;

import APIAutomation.Constants.constants;
import APIAutomation.Utility.commons;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class optionsRequest {
    public String token="";
    @Test
    public void options(){
        RestAssured.baseURI = constants.baseURLQA;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer ".concat(token));
        Response response = spec.options("/items");
        Assertions.assertThat(response.statusCode()).isEqualTo(204);
        System.out.println(response.headers());
//        Assertions.assertThat(response.getHeader("allow")).contains("GET");
        Assertions.assertThat(response.getHeader("allow")).containsAnyOf("GET","POST","PUT","PATCH");
    }

    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }
}
