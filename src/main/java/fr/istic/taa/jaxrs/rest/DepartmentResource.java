package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Department;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/department")
@Produces({"application/json", "application/xml"})
public class DepartmentResource {

    @GET
    @Path("/{departmentId}")
    public Department getDepartmentById(@PathParam("departmentId") Long departmentId)  {
        return new Department();
    }

    @POST
    @Consumes("application/json")
    public Response addDepartment(
            @Parameter(description = "Department object that needs to be added to the store", required = true) Department department) {
        return Response.ok().entity("SUCCESS").build();
    }
}