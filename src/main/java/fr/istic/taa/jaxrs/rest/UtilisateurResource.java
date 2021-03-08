package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Utilisateur;
import io.swagger.v3.oas.annotations.Parameter;

import java.util.ArrayList;
import java.util.List;

@Path("/utilisateur")
@Produces({"application/json", "application/xml"})
public class UtilisateurResource<Int> {

    List<Utilisateur> mylist = new ArrayList<Utilisateur>();

    @GET
    @Path("/get/{utilisateurId}")
    public Utilisateur getTableauById(@PathParam("utilisateurId") Long utilisateurId)  {
        return mylist.get(utilisateurId.intValue());
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUtilisateur(
            @Parameter(description = "User object that needs to be added to the store", required = true) Utilisateur utilisateur) {
        mylist.add(utilisateur);
        return Response.ok().entity("SUCCESS").build();
    }
}