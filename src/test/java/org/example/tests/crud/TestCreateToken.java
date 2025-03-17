package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.BookingResponse;
import org.example.pojos.TokenResponse;
import org.testng.annotations.Test;

public class TestCreateToken extends BaseTest {

    @Test(groups = "reg", priority = 1)
    @Owner("Sandhya")
    @Description("TC#2 - Create token and Verify")
    public void testTokenPOST(){

        // preparation part
        requestSpecification.basePath(APIConstants.AUTH_URL);
// Making of request part
        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.setAuthPayload())
                .post();

        // Validation part(Verifiction)
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
     String token = payloadManager.getTokenFromJSON(response.asString());
        assertActions.verifyStringKeyNotNull(token);


    }

}
