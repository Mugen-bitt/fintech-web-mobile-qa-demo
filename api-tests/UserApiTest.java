import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest extends BaseApiTest {
    // baseURI и Content-Type уже подтягиваются автоматически
}

    @Test
    void getUser_shouldReturnUserData() {
        // 🔍 Проверка: GET-запрос к /users/1 должен вернуть статус 200
        // и содержать id=1 и непустое имя пользователя
        given()
            .when()
            .get("/users/1")
            .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("username", notNullValue());
    }

    @Test
    void createUser_shouldReturn201() {
        // Проверка: POST-запрос на создание пользователя должен вернуть 201
        // и в ответе должно быть имя, которое мы передали
        String requestBody = """
                {
                  "name": "Pavel QA",
                  "username": "mugen_bitt",
                  "email": "qa@example.com"
                }
                """;

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
            .when()
            .post("/users")
            .then()
            .statusCode(201)
            .body("name", equalTo("Pavel QA"));
    }
}
