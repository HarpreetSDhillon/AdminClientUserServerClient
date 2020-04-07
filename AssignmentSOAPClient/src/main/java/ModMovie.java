/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignmentsoapclient.client.CrudLibrary;
import com.mycompany.assignmentsoapclient.client.CrudLibrary_Service;
import com.mycompany.assignmentsoapclient.client.Exception_Exception;
import com.mycompany.assignmentsoapclient.client.Library;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;
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

/**
 *
 * @author Harpreet
 */
@WebServlet(name = "ModMovie", urlPatterns = {"/ModMovie"})
@MultipartConfig
public class ModMovie extends HttpServlet {

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
        String delete = request.getParameter("del");
        String update = request.getParameter("update");
        String search = request.getParameter("search");
        String id = request.getParameter("id");
        if(delete!=null){
            try {
                System.out.println("deleting");
                System.out.println(port.delete(Integer.parseInt(id)));
            
                lib = port.getAllLib();
                request.setAttribute("lib", lib);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ModMovie.class.getName()).log(Level.SEVERE, null, ex);
            }

            RequestDispatcher dispacher = request.getRequestDispatcher("/Index.jsp");
            dispacher.forward(request, response);
        }
        if(search!=null){
            try {
                Library l = (Library)port.getLib(Integer.parseInt(id));
                List<Library> libr = new ArrayList<Library>();
                
                if(l!=null){
                libr.add(l);
                request.setAttribute("lib", libr);
                RequestDispatcher dispacher = request.getRequestDispatcher("/Index.jsp");
                dispacher.forward(request, response);}
            } catch (Exception_Exception ex) {
                Logger.getLogger(ModMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(update!=null){
            Library l;
            try {
                l = (Library)port.getLib(Integer.parseInt(id));
                byte[] image = l.getThumbnail();
                if(image!=null){
                    String base64Img = Base64.getEncoder().encodeToString(image);
                    request.setAttribute("img", base64Img);
                }
                request.setAttribute("lib",l);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ModMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            RequestDispatcher dispacher = request.getRequestDispatcher("/AddM.jsp");
            dispacher.forward(request, response);
        }
        try {
            lib = port.getAllLib();
            request.setAttribute("lib", lib);
        } catch (Exception_Exception ex) {
            Logger.getLogger(ModMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
