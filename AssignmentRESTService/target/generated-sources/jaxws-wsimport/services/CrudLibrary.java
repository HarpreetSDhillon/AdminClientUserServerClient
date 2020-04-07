
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CrudLibrary", targetNamespace = "http://Services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CrudLibrary {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://Services/", className = "services.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://Services/", className = "services.DeleteResponse")
    @Action(input = "http://Services/CrudLibrary/deleteRequest", output = "http://Services/CrudLibrary/deleteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Services/CrudLibrary/delete/Fault/Exception")
    })
    public String delete(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<services.Library>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllLib", targetNamespace = "http://Services/", className = "services.GetAllLib")
    @ResponseWrapper(localName = "getAllLibResponse", targetNamespace = "http://Services/", className = "services.GetAllLibResponse")
    @Action(input = "http://Services/CrudLibrary/getAllLibRequest", output = "http://Services/CrudLibrary/getAllLibResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Services/CrudLibrary/getAllLib/Fault/Exception")
    })
    public List<Library> getAllLib()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns services.Library
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLib", targetNamespace = "http://Services/", className = "services.GetLib")
    @ResponseWrapper(localName = "getLibResponse", targetNamespace = "http://Services/", className = "services.GetLibResponse")
    @Action(input = "http://Services/CrudLibrary/getLibRequest", output = "http://Services/CrudLibrary/getLibResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Services/CrudLibrary/getLib/Fault/Exception")
    })
    public Library getLib(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://Services/", className = "services.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://Services/", className = "services.AddMovieResponse")
    @Action(input = "http://Services/CrudLibrary/addMovieRequest", output = "http://Services/CrudLibrary/addMovieResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Services/CrudLibrary/addMovie/Fault/Exception")
    })
    public String addMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        Library arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "Update")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Update", targetNamespace = "http://Services/", className = "services.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://Services/", className = "services.UpdateResponse")
    @Action(input = "http://Services/CrudLibrary/UpdateRequest", output = "http://Services/CrudLibrary/UpdateResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Services/CrudLibrary/Update/Fault/Exception")
    })
    public String update(
        @WebParam(name = "arg0", targetNamespace = "")
        Library arg0)
        throws Exception_Exception
    ;

}
