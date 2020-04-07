/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignmentsoapclient.client.CrudLibrary;
import com.mycompany.assignmentsoapclient.client.CrudLibrary_Service;
import com.mycompany.assignmentsoapclient.client.Exception_Exception;
import com.mycompany.assignmentsoapclient.client.Library;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;

/**
 *
 * @author Harpreet
 */
@WebServlet(name = "AddMovie", urlPatterns = {"/AddMovie"})
@MultipartConfig
public class AddMovie extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CrudLibrary_Service service = new CrudLibrary_Service();
        CrudLibrary port = service.getCrudLibraryPort();
        List<Library> lib;

        
            String id = request.getParameter("id");
            String title = request.getParameter("title");
            String desc = request.getParameter("description");
            String cast = request.getParameter("cast");
            String director = request.getParameter("director");
            String type = request.getParameter("type");
            String category = request.getParameter("category");
            Date d = new Date();
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(d);
            System.out.println("ID="+id);
            XMLGregorianCalendar date2;
            Library l = new Library();
            try {
                if(!(id.isEmpty())){
                    System.out.println(id.isEmpty());
//                    System.out.println(id!="");
//                    System.out.println(id!=null);
                    l.setId(BigDecimal.valueOf(Integer.parseInt(id)));
                }
                date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
                l.setCast(cast);
                l.setCategory(category);
                l.setDescription(desc);
                l.setTitle(title);
                l.setType(type);
                l.setDirector(director);
                l.setReleasedon(date2);
                Part part = request.getPart("thumbnail");
                
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                InputStream filecontent = part.getInputStream();
                if(part.getSize()>0){
                    byte[] buffer = new byte[(int) part.getSize()];
                    int read = 0;
                    while ((read = filecontent.read(buffer)) != -1) {
                        bytes.write(buffer, 0, read);
                    }
                    l.setThumbnail(buffer);
                }else{
                    l.setThumbnail(Base64.getDecoder().decode(request.getParameter("img")));
                    System.out.println(request.getParameter("img"));
                }
                System.out.print("ID: " + l.getId());
                port.addMovie(l);
                
               
            lib = port.getAllLib();
            request.setAttribute("lib", lib);
        
            RequestDispatcher dispacher = request.getRequestDispatcher("/Index.jsp");
            dispacher.forward(request, response);
            } catch (SOAPFaultException ex) {
                request.setAttribute("error", ex.getMessage());
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddM.jsp");
                dispacher.forward(request, response);
            } catch (DatatypeConfigurationException ex) {
                request.setAttribute("error", ex.getMessage());
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddM.jsp");
                dispacher.forward(request, response);
            } catch (Exception_Exception ex) {
                request.setAttribute("error", ex.getMessage());
                RequestDispatcher dispacher = request.getRequestDispatcher("/AddM.jsp");
                dispacher.forward(request, response);
            }
    }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

