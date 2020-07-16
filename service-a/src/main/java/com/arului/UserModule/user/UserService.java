package com.arului.UserModule.user;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient
@ApplicationScoped
public interface UserService {
    @GET
    @Path ("/{id}")
    String getUserDetail(@PathParam ("id") String id);

}
