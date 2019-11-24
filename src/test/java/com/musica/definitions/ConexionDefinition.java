package com.musica.definitions;



import static io.restassured.RestAssured.given;

public class ConexionDefinition {

//    final  String BASE_URL = "https://api.spotify.com";
//    final  String CLIENTE_ID = "865241eaa6bd44d0a6b9a9017444b969";
//    final  String ClIENTE_SECRET = "8ee697bbaeff4f8ebc51d7e7fe948a0d";
//
//    @Dado("me conecto a spotify exitosamente")
//    public void conexionSpotify() {
//
//        Response spoty = given().contentType(ContentType.TEXT).auth().oauth2(CLIENTE_ID + ClIENTE_SECRET).log().all().get(BASE_URL + "/v1/playlists/3cEYpjA9oz9GiPac4AsH4n");
//        System.out.print(spoty.statusCode());
//
//        Response response = given().auth().basic("sk_test_8Ek0AIAk0fyvUyJiDbG5ZOIN", "").formParams("limit", 3).formParam("email", "trainer@way2automation.com")
//                .get("https://api.stripe.com/v1/customers");
//
//
//        //response.prettyPrint();
//        String jsonResponse = response.asString();
//        System.out.println(jsonResponse);
////
////        System.out.println("Response code --> "+response.statusCode());




//        given().
//                contentType("application/json").
//                body(jsonAsMap).
//                when().
//                post("/login")
//    .then().statusCode(200).log().all();





}
