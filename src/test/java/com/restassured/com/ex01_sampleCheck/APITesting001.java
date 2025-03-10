package com.restassured.com.ex01_sampleCheck;

import io.restassured.RestAssured;

public class APITesting001 {
    public static void main(String[] args)
    {
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us/")
                    .basePath("IN/560016")
                .when()
                    .get()
                .then().statusCode(200);
    }
}
