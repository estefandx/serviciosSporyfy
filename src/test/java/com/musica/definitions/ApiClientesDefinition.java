package com.musica.definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ApiClientesDefinition {

    RequestSpecification requestSpecification;
    Response response;

    @Dado("que tengo una autenticacion valida")
    public void que_tengo_una_autenticacion_valida() {
       requestSpecification = given().auth().basic("sk_test_RSsOfZaz6Af0zH0C3ppw6Usa00w1Mtfjje","").baseUri("https://api.stripe.com/v1");

    }

    @Cuando("ingreso un (.*) valido")
    public void ingreso_un_valido(String email) {
        requestSpecification.formParam("email", email);
    }

    @Cuando("ingreso una   (.*) valida")
    public void ingreso_una_valida(String descripcion) {
        requestSpecification.formParam("description", descripcion);

    }

    @Cuando("envio una peticion post para \"([^\"]*)\"$")
    public void envio_una_peticion_pos_para(String endPoint) {
        response=requestSpecification.post(endPoint).then().extract().response();
        System.out.println(response.asString());

    }

    @Entonces("se debe crear un nuevo usuario")
    public void se_debe_crear_un_nuevo_usuario() {
        String id=response.jsonPath().get("id");
        Assert.assertTrue(!id.equals("null"));

    }

    @Entonces("y el estatus de respuesta debe ser (.*)")
    public void y_el_estatus_de_respuesta_debe_ser(int status) {
        Assert.assertEquals(response.getStatusCode(), status);

    }




}
