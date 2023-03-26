package apiTest;
import io.restassured.response.Response;

import static apiTest.ConstsAndValues.BASEURL;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BaseURLTests {

    public static void getBookList() {

        Response response = given().log().all()
                .header("Content-type", "application/json")
                .when()
                .get(BASEURL)
                .then().log().all()
                .extract().response();
        assertEquals(200, response.statusCode());
    }

    public static void postBookByName(Booking BookInfo) {

        assertEquals(201, addBook(BookInfo).statusCode());
           }
    public static void postBookByEverything(Booking BookInfo) {

        assertEquals(201, addBook(BookInfo).statusCode());
    }

    public static void postWithoutName(Booking BookInfo) {

        assertEquals(400, addBook(BookInfo).statusCode());
    }

    public static Response addBook(Object dataAboutBook) {
        return given().log().all()
                .header("Content-type", "application/json")
                .body(dataAboutBook)
                .when()
                .post(BASEURL)
                .then().log().all()
                .extract().response();
    }

}
