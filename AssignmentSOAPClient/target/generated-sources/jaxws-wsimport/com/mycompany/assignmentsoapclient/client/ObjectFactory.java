
package com.mycompany.assignmentsoapclient.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.assignmentsoapclient.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMovie_QNAME = new QName("http://Services/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://Services/", "addMovieResponse");
    private final static QName _GetAllLibResponse_QNAME = new QName("http://Services/", "getAllLibResponse");
    private final static QName _GetAllLib_QNAME = new QName("http://Services/", "getAllLib");
    private final static QName _Update_QNAME = new QName("http://Services/", "Update");
    private final static QName _Delete_QNAME = new QName("http://Services/", "delete");
    private final static QName _Exception_QNAME = new QName("http://Services/", "Exception");
    private final static QName _UpdateResponse_QNAME = new QName("http://Services/", "UpdateResponse");
    private final static QName _Library_QNAME = new QName("http://Services/", "library");
    private final static QName _DeleteResponse_QNAME = new QName("http://Services/", "deleteResponse");
    private final static QName _GetLibResponse_QNAME = new QName("http://Services/", "getLibResponse");
    private final static QName _GetLib_QNAME = new QName("http://Services/", "getLib");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.assignmentsoapclient.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetLibResponse }
     * 
     */
    public GetLibResponse createGetLibResponse() {
        return new GetLibResponse();
    }

    /**
     * Create an instance of {@link GetLib }
     * 
     */
    public GetLib createGetLib() {
        return new GetLib();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link GetAllLibResponse }
     * 
     */
    public GetAllLibResponse createGetAllLibResponse() {
        return new GetAllLibResponse();
    }

    /**
     * Create an instance of {@link GetAllLib }
     * 
     */
    public GetAllLib createGetAllLib() {
        return new GetAllLib();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLibResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "getAllLibResponse")
    public JAXBElement<GetAllLibResponse> createGetAllLibResponse(GetAllLibResponse value) {
        return new JAXBElement<GetAllLibResponse>(_GetAllLibResponse_QNAME, GetAllLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLib }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "getAllLib")
    public JAXBElement<GetAllLib> createGetAllLib(GetAllLib value) {
        return new JAXBElement<GetAllLib>(_GetAllLib_QNAME, GetAllLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "Update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "UpdateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Library }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "library")
    public JAXBElement<Library> createLibrary(Library value) {
        return new JAXBElement<Library>(_Library_QNAME, Library.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "getLibResponse")
    public JAXBElement<GetLibResponse> createGetLibResponse(GetLibResponse value) {
        return new JAXBElement<GetLibResponse>(_GetLibResponse_QNAME, GetLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLib }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "getLib")
    public JAXBElement<GetLib> createGetLib(GetLib value) {
        return new JAXBElement<GetLib>(_GetLib_QNAME, GetLib.class, null, value);
    }

}
