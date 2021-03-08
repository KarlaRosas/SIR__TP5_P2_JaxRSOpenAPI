package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Employee;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/employee")
@Produces({"application/json", "application/xml"})
public class EmployeeResource {

    @GET
    @Path("/{employeeId}")
    public Employee getEmployeeById(@PathParam("employeeId") Long employeeId)  {

        return new Employee();
    }

    @POST
    @Consumes("application/json")
    public Response addEmployee(
            @Parameter(description = "Employee object that needs to be added to the store", required = true) Employee employee) {
        return Response.ok().entity("SUCCESS").build();
    }
}