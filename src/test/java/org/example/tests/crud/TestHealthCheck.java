package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.testng.annotations.Test;

public class TestHealthCheck  extends BaseTest {
    @Test(groups = "reg", priority = 1)
    @Owner("Sandhya")
    @Description("TC#3 - Verify health")
    public void testGETHealthCheck(){

        // preparation part
        requestSpecification.basePath(APIConstants.PING_URL);
// Making of request part
        response = RestAssured.given(requestSpecification)
                .when()
                .get();

        // Validation part(Verifiction)
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);


    }





}
