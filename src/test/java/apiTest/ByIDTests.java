package apiTest;
import io.restassured.response.Response;
import static apiTest.TestList.*;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ByIDTests {

        public static void getBookByID() {

        Response response = given().log().all()
                .header("Content-type", "application/json")
                .when()
                .get(BASEURL + BOOKID)
                .then().log().all()
                .extract().response();
        assertEquals(200, response.statusCode());
    }

    public static void getByWrongID() {

        Response response = given().log().all()
                .header("Content-type", "application/json")
                .when()
                .get(BASEURL + BOOKWRONGID)
                .then().log().all()
                .extract().response();
        assertEquals(404, response.statusCode());
    }

    public static void deleteBookByID() {

        given().baseUri(BASEURL)
                .log().all()
                .when()
                .delete(IDFORDELETE)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

    public static void deleteBookByWrongID() {

        given().baseUri(BASEURL)
                .log().all()
                .when()
                .delete(BOOKWRONGID)
                .then()
                .assertThat()
                .statusCode(404)
                .log().all();
    }

    public static void putNewInfoByWrongID(Booking BookInfo) {

        assertEquals(404, addBook1(BookInfo).statusCode());
    }
    public static void putNewInfoByID(Booking BookInfo) {

        assertEquals(200, addBook2(BookInfo).statusCode());
    }

    public static void putNewBadInfoByID(Booking BookInfo) {

        assertEquals(400, addBook2(BookInfo).statusCode());
    }

        public static Response addBook1(Object booking){
            return given().log().all()
                    .header("Content-type", "application/json")
                    .body(booking)
                    .when()
                    .put(BASEURL + BOOKWRONGID)
                    .then().log().all()
                    .extract().response();
        }
    public static Response addBook2(Object booking){
        return given().log().all()
                .header("Content-type", "application/json")
                .body(booking)
                .when()
                .put(BASEURL + BOOKID)
                .then().log().all()
                .extract().response();
    }

}