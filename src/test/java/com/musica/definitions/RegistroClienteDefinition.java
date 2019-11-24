package com.musica.definitions;

import com.musica.steps.RegistroClienteStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import utils.ClienteJson;

public class RegistroClienteDefinition {

    @Steps
    RegistroClienteStep registroClienteStep;

    @Dado("^creo un usuario$")
    public void creoUnUsuario()  {
        ClienteJson clienteJson = new ClienteJson();
        registroClienteStep.crearCliente(ClienteJson.customerJson());


    }
}
