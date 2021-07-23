/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            String name = request.getParameter("uname");
            String bhu = request.getParameter("bhu");
            String pass = request.getParameter("pass");
            name = name.trim();
            pass = pass.trim();
            
            MyDb db = new MyDb();
            Connection con = db.getCon();
            Statement stmt = con.createStatement();
            if(bhu.equals("user")){
                ResultSet rs = stmt.executeQuery("select * from uregister where uid = '"+name+"'"); 
                if(rs.next() && rs.getString("password").equals(pass)){
                    HttpSession session=request.getSession(true);
                    session.setAttribute("name", name);
                    session.setAttribute("bhu",bhu);
                    response.sendRedirect("uwelcome.jsp");
                }
                else
                    response.sendRedirect("index.html");
            }
            if(bhu.equals("h")){
                ResultSet rs1 = stmt.executeQuery("select * from hregister where hid = '"+name+"'"); 
                if(rs1.next() && rs1.getString("pass").equals(pass)){
                    HttpSession session=request.getSession(true);
                    session.setAttribute("name", name);
                    session.setAttribute("bhu",bhu);
                    response.sendRedirect("hwelcome.jsp");
                }
                else
                    response.sendRedirect("index.html");
            }
            if(bhu.equals("b")){
               ResultSet rs2 = stmt.executeQuery("select * from bregister where bid = '"+name+"'"); 
                if(rs2.next() && rs2.getString("password").equals(pass)){
                    HttpSession session=request.getSession(true);
                    session.setAttribute("name", name);
                    session.setAttribute("bhu",bhu);
                    response.sendRedirect("bwelcome.jsp");
                }
                else
                    response.sendRedirect("index.html");
            } 
        } 
        catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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