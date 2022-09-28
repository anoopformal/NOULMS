package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headermaster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("        <!-- headline start-->\n");
      out.write("            <div class=\"row bg-danger text-white p-3\">\n");
      out.write("                <div class=\"col-sm-3 text-center \">\n");
      out.write("                    <i class=\"fa-solid fa-phone\"></i>\n");
      out.write("                    Call Us : +91 7985012870\n");
      out.write("                </div>\n");
      out.write("                <div class=\" col-sm-4 text-center\">\n");
      out.write("                    <i class=\"fa-solid fa-envelope\"></i>\n");
      out.write("                    Email : anoopkumar81188@gmail.com\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-5 text-center\">\n");
      out.write("                    <i class=\"fa-solid fa-location-dot\"></i>\n");
      out.write("                    Address:Locknow,Utter-Predesh, India\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         <!-- headline close-->\n");
      out.write("         \n");
      out.write("         <!-- header start-->\n");
      out.write("            <div class=\"row s1\">\n");
      out.write("                <div class=\"col-sm-1 mt-3 text-center\">\n");
      out.write("                    <img src=\"images/logo.png\" class=\"logo w-100 \"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7 text-center fs-4 pt-3\">\n");
      out.write("                    <h3 class=\"title\"> Nalanda eGyan Portal</h3>\n");
      out.write("                    <p>(An Initiative Taken By Nlanda Open Unversity)</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 mt-5 ps-4\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header close-->\n");
      out.write("            \n");
      out.write("             <!-- nav-bar start-->\n");
      out.write("            \n");
      out.write("            <div class=\"row s2\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                        <div class=\"container-fluid bg-danger py-2 fs-5 \">\n");
      out.write("                          <a class=\"navbar-brand text-white\" href=\"#\">NOULMS</a>\n");
      out.write("                          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                          </button>\n");
      out.write("                          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"index.jsp\">Home</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-white\" href=\"about.jsp\">About Us</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                  Course\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu  bg-danger\">\n");
      out.write("                                    <li><a class=\"dropdown-item text-white bg-danger\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item text-white\" href=\"study.jsp\">Studycenters</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"registraion.jsp\">Registration</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"login.jsp\">Login</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"contactus.jsp\">Contact Us</a>\n");
      out.write("                              </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <form class=\"d-flex\" role=\"search\">\n");
      out.write("                              <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                              <button class=\"btn btn-outline-success text-white\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                     </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- nav-bar end-->\n");
      out.write("            <!-- slider start-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 px-0\">\n");
      out.write("                    <div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                      <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"images\\slider1.png\"  class=\"d-block w-100 \" alt=\"Image not found\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"images\\slider2.jpg\" class=\"d-block w-100\" alt=\"Image not found\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"images\\slider2.jpg\" class=\"d-block w-100\" alt=\"Image not found\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- slider end-->\n");
      out.write("           ");
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
