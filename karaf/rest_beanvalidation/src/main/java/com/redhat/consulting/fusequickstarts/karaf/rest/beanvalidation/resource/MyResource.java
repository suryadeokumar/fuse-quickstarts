package com.redhat.consulting.fusequickstarts.karaf.rest.beanvalidation.resource;

import javax.validation.constraints.Pattern;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public interface MyResource {

    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response getSampleUser(@PathParam("id") @Pattern(regexp = "^1[0-9]*$") String id);

}
