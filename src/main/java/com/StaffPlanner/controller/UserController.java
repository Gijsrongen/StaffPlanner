package com.StaffPlanner.controller;

import com.StaffPlanner.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> getUsers() {

        User user = new User("Gijs Rongen", 1);
        User user2 = new User("Gijs Rongen2", 2);
        users.add(user);
        users.add(user2);
        return users;
    }

    @POST
    /*@Produces({MediaType.APPLICATION_JSON})*/
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response SaveUser(User user) throws URISyntaxException {

        /*users.add(user);


        return Response.ok().build();*/
        if(user == null){
            return Response.status(400).entity("Please add user details").build();
        }

        if(user.getName() == null) {
            return Response.status(400).entity("Please provide the username").build();
        }

        /*return Response.created(new URI("/users"+user.getId())).build();*/
        else{users.add(user);}

        return Response.ok(getUsers()).build();
        /*return Response.created(new URI("/rest/employees/"+e.getId())).build();*/
        //return Response.created().build();
    }
}
