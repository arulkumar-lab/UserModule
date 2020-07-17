package com.arului.UserModule.user;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path ("/user/service")
@ApplicationScoped
public class UserController {

    @Inject
    @RestClient
    private UserService userService;

    @GET
    @Path ("/id/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public String getUserDetail( @PathParam  ("id") String userID){
        return userService.getUserDetail(userID);

    }

    @GET
    @Path ("/all")
    @Produces (MediaType.APPLICATION_JSON)
    public String getAllUsers(){
        return userService.getAllUsers ();
    }
}
