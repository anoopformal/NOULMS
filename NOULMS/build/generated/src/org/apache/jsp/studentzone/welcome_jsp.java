package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/studentzone/studentlinkmaster.jsp");
    _jspx_dependants.add("/studentzone/studentheadermaster.jsp");
    _jspx_dependants.add("/studentzone/studentfootermaster.jsp");
  }

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

      out.write("<!-- courses page -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Welcome Student</title>\n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\" type=\"image/x-icon\"/>\n");
      out.write("       ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- outer start--> \n");
      out.write("            ");
      out.write("        <!-- headline start-->\n");
      out.write("            <div class=\"row bg-dark text-white p-3\">\n");
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
      out.write("                    <h3 class=\"title fw-bold\"> Nalanda eGyan Portal</h3>\n");
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
      out.write("                        <div class=\"container-fluid bg-dark py-2 fs-5 \">\n");
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
      out.write("                                  <a class=\"nav-link text-white\" href=\"registration.jsp\">Registration</a>\n");
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
      out.write("            \n");
      out.write("            \n");
      out.write("           ");
      out.write("  \n");
      out.write("            <!-- section open-->\n");
      out.write("            \n");
      out.write("            <div class=\"row pb-3\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <h3 class=\"pt-3 ps-3 text-center\" style=\"font-weight:bold;\">COURSE DETALES</h3>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- section end-->\n");
      out.write("            \n");
      out.write("            <!-- footer start-->\n");
      out.write("            ");
      out.write("<!--footer start-->\n");
      out.write("            <div class=\"row bg-dark py-4\">\n");
      out.write("                <div class=\"col-sm-3 text-center\">\n");
      out.write("                        <iframe  frameborder=\"0\" src=\"https://www.bing.com/maps/embed?h=400&w=500&cp=25.61954854173497~85.14929073139422&lvl=15.88664758656865&typ=d&sty=r&src=SHELL&FORM=MBEDV8\" scrolling=\"no\">\n");
      out.write("                        </iframe>\n");
      out.write("                        <div style=\"white-space: nowrap; text-align: center; padding: 6px 0;\">\n");
      out.write("                           <a id=\"largeMapLink\" target=\"_blank\" href=\"https://www.bing.com/maps?cp=25.61954854173497~85.14929073139422&amp;sty=r&amp;lvl=15.88664758656865&amp;FORM=MBEDLD\">View Larger Map</a> &nbsp; | &nbsp;\n");
      out.write("                           <a id=\"dirMapLink\" target=\"_blank\" href=\"https://www.bing.com/maps/directions?cp=25.61954854173497~85.14929073139422&amp;sty=r&amp;lvl=15.88664758656865&amp;rtp=~pos.25.61954854173497_85.14929073139422____&amp;FORM=MBEDLD\">Get Directions</a>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 fimage text-white\">\n");
      out.write("                    <h4>Nalanda Open University</h4>\n");
      out.write("                    <p class=\"text-center\">\n");
      out.write("                        The Nalanda Open University is the only University in the\n");
      out.write("                         State of Bihar meant for imparting learning exclusively through the system of distance education\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 text-white\">\n");
      out.write("                    <h5 class=\"p-4\">\n");
      out.write("                        Social Media \n");
      out.write("                    </h5>\n");
      out.write("                    <span class=\"p-3 fs-2\"><i class=\"fa-brands fa-facebook\"></i></span>\n");
      out.write("                    <span class=\"p-3 fs-2\"><i class=\"fa-brands fa-twitter\"></i></span>\n");
      out.write("                    <span class=\"p-3 fs-2\"><i class=\"fa-brands fa-square-whatsapp\"></i></span>\n");
      out.write("                    <span class=\"p-3 fs-2\"><i class=\"fa-brands fa-instagram\"></i></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 text-white\">\n");
      out.write("                    <h5>\n");
      out.write("                        Contect Detail\n");
      out.write("                    </h5>\n");
      out.write("                        <p>\n");
      out.write("                        2nd/3rd Floor, Biscomaun Bhawan,\n");
      out.write("                        Gandhi Maidan,\n");
      out.write("                        Patna 800 001 (BIHAR)\n");
      out.write("                        \n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"#\" class=\"text-white\">\n");
      out.write("                            <i class=\"fa-solid fa-envelope\"></i>\n");
      out.write("                            nou@nou.ac.in\n");
      out.write("                        </a><br/><br/>\n");
      out.write("                        <i class=\"fa-solid fa-clock\"></i>\n");
      out.write("                        Mon - Sat 8.00 - 18.00 \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<div class=\"row bg-dark\">\n");
      out.write("    <div class=\"col-sm-12 text-white text-center \">\n");
      out.write("        <p> copyright-2022 &copy; Nalanda Open University | This Page Developed By ANOOP KUMAR</p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--footer end-->");
      out.write("\n");
      out.write("            <!-- footer end -->\n");
      out.write("             \n");
      out.write("            <!-- outer close-->\n");
      out.write("        </div>\n");
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
