package com.restassured.com.ex02_RestassuredBasics.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting005_GetBDDStyle_Testng {

   @Test
    public void test_GET_Positive_Request()
    {
        String pincode="560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);


    }

    @Test
    public void test_GET_Negative_Request()
    {
        String pincode="-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(404);


    }

}


