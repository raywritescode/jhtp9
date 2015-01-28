/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raywritescode.welcomesoap;

import javax.jws.WebService;  // program uses the annotation @WebService
import javax.jws.WebMethod;   // program uses the annotation @WebMethod
import javax.jws.WebParam;    // program uses the annotation @WebParam

/**
 *
 * @author ray
 */
@WebService( serviceName = "WelcomeSOAP" )  // annotates the class as a web service
public class WelcomeSOAP {

    /**
     * WebMethod that returns a welcome message
     */
    @WebMethod( operationName = "welcome" )
    public String welcome( @WebParam( name = "name" ) String name ) 
    {
        return "Welcome to JAX-WS web services with SOAP, " + name + " !";
    }
}
