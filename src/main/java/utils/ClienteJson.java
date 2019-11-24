package utils;

import com.musica.models.customer.Customer;

public class  ClienteJson {


    public static Customer customerJson(){

        Customer customer = new Customer();
        customer.setName("meidoas");
        customer.setEmail("estefandx@hotmail.com");
        customer.setDescription("prueba");
        return  customer;


    }
}
