package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Tableau;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/tableau")
@Produces({"application/json", "application/xml"})
public class TableauResource {

    @GET
    @Path("/{tableauId}")
    public Tableau getTableauById(@PathParam("tableauId") Long tableauId)  {
        return new Tableau();
    }

    @POST
    @Consumes("application/json")
    public Response addTableau(
            @Parameter(description = "Tableau object that needs to be added to the store", required = true) Tableau tableau) {
        return Response.ok().entity("SUCCESS").build();
    }
}