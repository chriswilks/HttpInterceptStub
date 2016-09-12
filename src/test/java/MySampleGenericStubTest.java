import net.chriswilkinson.httpinterceptstub.GenericStubTest;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * @Author chriswilks
 */
public class MySampleGenericStubTest extends GenericStubTest {

    @Test
    public void SimpleStubTest() {
        given().
                header("Content-Type", "application/json").
        when().
                get("http://127.0.0.1:8080/test").
        then().
                statusCode(200).body(containsString("OK"));
    }
}
