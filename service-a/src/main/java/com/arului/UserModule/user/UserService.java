package com.arului.UserModule.user;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient
@ApplicationScoped
public interface UserService {
    @GET
    @Path ("/id/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    String getUserDetail ( @PathParam ("id") String id );

    @GET
    @Path ("/all")
    @Produces (MediaType.APPLICATION_JSON)
    String getAllUsers ();

}
