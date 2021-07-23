package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDb;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"register.css\"/>\n");
      out.write("<title>demo</title>\n");
      out.write("<meta name=\"keywords\" content=\"ddddd\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"css/demo.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"tooplate_body_wrapper\">\n");
      out.write("<div id=\"tooplate_wrapper\">\n");
      out.write("\t<div id=\"tooplate_top_bar\">\n");
      out.write("    \t<a class=\"social_btn twitter\">&nbsp;</a>\n");
      out.write("        <a class=\"social_btn facebook\">&nbsp;</a>\n");
      out.write("    </div>\t\n");
      out.write("    \n");
      out.write("    <div id=\"tooplate_header\">\n");
      out.write("        <div id=\"site_title\"><h1> BLOOD BANK</h1></div>\n");
      out.write("        \n");
      out.write("\t     <div id=\"tooplate_menu\">\n");
      out.write("            <ul>\n");
      out.write("               <li><a href=\"index.html\" class=\"current\">Home</a></li>\n");
      out.write("               <li><a href=rselectp.html>Join Us</a></li>\n");
      out.write("       \n");
      out.write("                <li><a href=\"bloodbank.html\">Blood bank</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"viewhospital.jsp\">Hospital</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"hospital.html\">Search Donor</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                \n");
      out.write("            </ul>    \t\n");
      out.write("        </div> <!-- end of tooplate_menu -->\n");
      out.write("    </div> <!-- end of forever header -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"tooplate_middle_subpage\">\n");
      out.write("    \t\t\n");
      out.write("</div> <!-- end of middle -->\n");
      out.write("\n");

try{

String n =(String)session.getAttribute("uname");

  MyDb db = new MyDb();
         Connection con = db.getCon();
         Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select name,email,mobile,gender,age,bld,location from uregister where uid = '"+n+"'");
  rs.next();
  String name = rs.getString("name");
  String email = rs.getString("email");
  String mobile= rs.getString("mobile");
  String gender = rs.getString("gender");
  String age = rs.getString("age");
  String bld = rs.getString("bld");
  String location = rs.getString("location");
  
   
    
    
    
    
     
      out.write("\n");
      out.write("     <div style=\"margin-left: 1200px;\">\n");
      out.write("         <a href=\"logout.jsp\">Logout</a>\n");
      out.write("         \n");
      out.write("     </div>\n");
      out.write("           <div style=\"background-color: #330D0D; color: #ffffff; margin-top: 20px;\">\n");
      out.write("               <div style=\"margin-left: 200px; padding-top: 50px; padding-bottom: 20px;\">\n");
      out.write("                   <label style=\"margin-left: -100PX;\">WELCOME       :</label> ");
out.println(name);
      out.write("\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("               <label>NAME       :</label> ");
out.println(name);
      out.write("\n");
      out.write("               <br/>\n");
      out.write("           <label>EMAIL          :</label>");
out.println(email);
      out.write("\n");
      out.write("              <br/>\n");
      out.write("          <label>GENDER          :</label> ");
out.println(gender);
      out.write("\n");
      out.write("           <br/>\n");
      out.write("         <label>AGE              :</label> ");
out.println(age);
      out.write("\n");
      out.write("          <br/>\n");
      out.write("         <label>BLOOD GROUP      :</label> ");
out.println(bld);
      out.write("\n");
      out.write("          <br/>\n");
      out.write("         <label>LOCATION         :</label> ");
out.println(location);
      out.write("\n");
      out.write("             </div>\n");
      out.write("           </div>");




}catch(Exception e){}


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"tooplate_footer_wrapper\">\n");
      out.write("\t<div id=\"tooplate_footer\">\n");
      out.write("    \t<div class=\"col_w200 float_l\">\n");
      out.write("        \t<h4>Pages</h4>\n");
      out.write("            <ul class=\"tooplate_list\">\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col_w200 float_l\">\n");
      out.write("        \t<h4>DEVELOPED BY</h4>\n");
      out.write("            <ul class=\"tooplate_list\"> \n");
      out.write("                <li><a href=\"#\"> javatoandroid.com </a></li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"col_w200 float_l\">\n");
      out.write("        \t<h4>Partners</h4>\n");
      out.write("            <ul class=\"tooplate_list\">\n");
      out.write("\t            <li><a href=\"https://www.facebook.com/SmileyWellFairGroupMultai/?ref=br_rs\">\"SMILEY WELL FAIR GROUP MULTAI\"</a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>                \n");
      out.write("                <li><a href=\"#\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col_w200 float_r col_last\">\n");
      out.write("        \t<h4>Contact Us</h4>\n");
      out.write("            SGSITS COLLEGE <br />\n");
      out.write("            23 Sir M. Visvesvaraya Marg, <br />\n");
      out.write("             Indore 452003 (MP) India<br /><br />\n");
      out.write("            Mobile Number: +91 888888888  <br />\n");
      out.write("            Email: <a href=\"https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fwww.google.co.in%2Fwebhp%3Fsourceid%3Dchrome-instant%26ion%3D1%26espv%3D2%26es_th%3D1%26ie%3DUTF-8&hl=en#identifier\">bloodbank@gmail.com</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"cleaner\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"tooplate_copyright_wrapper\">\n");
      out.write("\t<div id=\"tooplate_copyright\">\n");
      out.write("\t\n");
      out.write("    \tCopyright � 2016 <a href=\"#\">javatoandroid</a>\n");
      out.write("\t\t\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
