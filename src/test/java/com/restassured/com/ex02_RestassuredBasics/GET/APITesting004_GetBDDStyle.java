package com.restassured.com.ex02_RestassuredBasics.GET;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class APITesting004_GetBDDStyle {
    public static void main(String[] args)
    {
String pincode="560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
        pincode="-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(404);

    }

}

