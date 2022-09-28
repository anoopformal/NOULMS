package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connect.Dbmanager;

public final class complain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>NOULM</title>\n");
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
      out.write("        \n");
      out.write("<!-- headline start-->\n");
      out.write("            <div class=\"row bg-danger text-white p-3\">\n");
      out.write("                <div class=\" col-sm-4 text-center\">\n");
      out.write("                    Welcome to Student Zone\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 text-center\">\n");
      out.write("                    ");
      out.print(new Dbmanager().getDate());
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 text-center\">\n");
      out.write("                    ");
      out.print(session.getAttribute("studentid"));
      out.write("\n");
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
      out.write("                        <div class=\"container-fluid bg-danger py-2 fs-5 \">\n");
      out.write("                          <a class=\"navbar-brand text-white\" href=\"#\">NOULMS</a>\n");
      out.write("                          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                          </button>\n");
      out.write("                          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link active text-white\" aria-current=\"page\" href=\"studentwelcome.jsp\">Dashboard</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-white\" href=\"feedback.jsp\">Feedback</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                  Course\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu  bg-danger\">\n");
      out.write("                                    <li><a class=\"dropdown-item text-white bg-danger\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item text-white\" href=\"studycenter.jsp\">Studycenters</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"complain.jsp\">Complain</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"changepassword.jsp\">Change Password</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                              </li>\n");
      out.write("                            </ul>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                     </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- nav-bar end-->\n");
      out.write("            ");
      out.write("  \n");
      out.write("            <!-- section open-->\n");
      out.write("            \n");
      out.write("            <div class=\"row pb-3\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <h3 class=\"pt-3 ps-3 text-center\" style=\"font-weight:bold;\">Complaint Form</h3>\n");
      out.write("                    <form action=\"complaincode\" method=\"post\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Enter Subject:</th>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"subject\" class=\"form-control\" required=\"\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Enter Complaint text:</th>\n");
      out.write("                                <td>\n");
      out.write("                                    <textarea name=\"ctext\" class=\"form-control\" required=\"\"></textarea>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                              \n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"submit\" align=\"center\" class=\"btn btn-primary\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- section end-->\n");
      out.write("            \n");
      out.write("            <!-- footer start-->\n");
      out.write("            ");
      out.write("\n");
      out.write("<div class=\"row bg-dark\">\n");
      out.write("    <div class=\"col-sm-12 text-white text-center \">\n");
      out.write("        <p> copyright-2022 &copy; Nalanda Open University | This Page Developed By<span class=\"fs-5\"> (Anoop kumar)</span> Softpro India Pvt.LTD</p>\n");
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
