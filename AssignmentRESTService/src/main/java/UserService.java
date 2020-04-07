
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import services.CrudLibrary;
import services.CrudLibrary_Service;
import services.Exception_Exception;
import services.Library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harpreet
 */
@Path("user")
@Produces("text/json")
public class UserService {
    @Path("all")
    @GET
    public Response getAll() throws Exception_Exception{
        CrudLibrary_Service service = new CrudLibrary_Service();
        CrudLibrary port = service.getCrudLibraryPort();
        List<Library> lib = port.getAllLib();
        return Response.ok(lib).build();
    }
    
    @Path("all/{id}")
    @GET
    public Response getMovie(@PathParam("id") int id) throws Exception_Exception{
        CrudLibrary_Service service = new CrudLibrary_Service();
        CrudLibrary port = service.getCrudLibraryPort();
        Library lib = port.getLib(id);
        return Response.ok(lib).build();
    }
    
}
