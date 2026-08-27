package APIPractice;
import static io.restassured.RestAssured.given;


public class Practice {
    public static void main(String[] args) {
        String token=
                given()
                        .header("Content-type","application/json")
                         .body("{\"email\":\"customer@practicesoftwaretesting.com\",\"password\":\"welcome01\"}")
                        .when()
                        .post("https://api-with-bugs.practicesoftwaretesting.com/users/login")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .extract()
                        .path("access_token");

        given()
                .header("Authorization","Bearer " +token)
                .when()
                .get("https://api-with-bugs.practicesoftwaretesting.com/users/me")
                .then()
                .log().all()
                .statusCode(200);


    }
}
