package com.arului.UserModule.user;

import com.arului.UserModule.manager.UserManager;
import com.arului.UserModule.modal.UserModal;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path ("/user/service")
public class UserServiceController {

    @Inject
    private UserManager userManager;

    @GET
    @Path ("/id/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public Response getUserDetail ( @PathParam ("id") String userID ) {
        return Response.ok (userManager.getId (userID)).build ( );
    }

    @GET
    @Path ("/all")
    @Produces ({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getAllUsers () {
        List< UserModal > matched;
        GenericEntity< List< UserModal > > entity;

        matched = userManager.getAllUserDetails ( );
        entity = new GenericEntity< List< UserModal > > (matched) {
        };
        return Response.ok (entity).build ( );
    }
}
