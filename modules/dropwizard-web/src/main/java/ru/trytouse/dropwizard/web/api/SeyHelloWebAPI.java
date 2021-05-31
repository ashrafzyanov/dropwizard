package ru.trytouse.dropwizard.web.api;

import ru.trytouse.dropwizard.api.representation.HelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api/hello")
@Produces(MediaType.APPLICATION_JSON)
public interface SeyHelloWebAPI {

    @GET
    @Path("/world")
    HelloWorld sey(@QueryParam("name") String name);
}
