package com.arului.UserModule.user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path ("/user/service")
public class UserServiceController {

    @GET
    @Path ("/id/{id}")
    public String getUserDetail( @PathParam  ("id") String userID){
        return "Newwwwwwwwwwwwww user service";
    }
}
