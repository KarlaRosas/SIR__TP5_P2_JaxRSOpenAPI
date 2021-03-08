package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Tars;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/tars")
@Produces({"application/json", "application/xml"})
public class TarsResource {

    @GET
    @Path("/{tarsId}")
    public Tars getTableauById(@PathParam("tarsId") Long tarsId)  {
        return new Tars();
    }

    @POST
    @Consumes("application/json")
    public Response addTars(
            @Parameter(description = "Tags object that needs to be added to the store", required = true) Tars tars) {
        return Response.ok().entity("SUCCESS").build();
    }
}