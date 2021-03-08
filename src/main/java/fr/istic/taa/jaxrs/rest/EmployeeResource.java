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

import java.util.ArrayList;
import java.util.List;

@Path("/employee")
@Produces({"application/json", "application/xml"})
public class EmployeeResource {

    List<Employee> listEmployee = new ArrayList<Employee>();

    @GET
    @Path("/get/{employeeId}")
    public Employee getEmployeeById(@PathParam("employeeId") Long employeeId)  {
        listEmployee.add(new Employee("Didier",null));
        listEmployee.add(new Employee("Marc",null));
        listEmployee.add(new Employee("Caroline",null));
        if(listEmployee.isEmpty()){
            return new Employee();
        }
        else {
            return listEmployee.get(employeeId.intValue());
        }
    }

    @POST
    @Path("/post")
    @Consumes("application/json")
    public Response addEmployee(
            @Parameter(description = "Employee object that needs to be added to the store", required = true) Employee employee) {
        listEmployee.add(employee);
        System.out.print(listEmployee);
        return Response.ok().entity("SUCCESS").build();
    }
}