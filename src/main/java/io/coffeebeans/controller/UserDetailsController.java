package io.coffeebeans.controller;

import io.coffeebeans.entity.tenant.UserDetails;
import io.coffeebeans.repository.UserDetailsRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/user")
public class UserDetailsController {

    @Inject
    UserDetailsRepository userDetailsRepository;

    @GET
    @Path("/all")
    public Response getAllUsers() {
        List<UserDetails> userDetailsList = userDetailsRepository.listAll();
        return Response.ok(userDetailsList).build();
    }
}
