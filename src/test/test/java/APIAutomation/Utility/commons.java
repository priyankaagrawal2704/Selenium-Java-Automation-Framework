package APIAutomation.Utility;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;

import static APIAutomation.Constants.constants.baseURLQA;

public class commons {
    public String generateBearerToken(){
        RestAssured.baseURI = baseURLQA;
        RequestSpecification spec = RestAssured.given();
        Response response = spec.post("/auth/token");
        Assertions.assertThat(response.statusCode()).isEqualTo(201);
        JsonPath path = response.jsonPath();
        String token = path.get("token");
        Assertions.assertThat(token.length()).isEqualTo(32);
        return token;
    }
}
