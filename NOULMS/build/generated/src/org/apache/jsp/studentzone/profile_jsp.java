package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.Dbmanager;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!-- courses page -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> NOULM </title>\n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\" type=\"image/x-icon\"/>\n");
      out.write("        <style>\n");
      out.write("            /* all page*/\n");
      out.write(" h1,h2,h3,h4,h5,h6{\n");
      out.write("     text-transform:uppercase;\n");
      out.write("     color:purple;\n");
      out.write(" }\n");
      out.write(".title:first-letter{\n");
      out.write("    color:red;\n");
      out.write("    font-size: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".center{\n");
      out.write("    margin: 0px auto;\n");
      out.write("}\n");
      out.write(".center input,textarea,table{\n");
      out.write("    font-size: 20px;\n");
      out.write("    box-shadow: -4px -4px 10px rgba(255, 255, 255, 1),inset 4px 4px 10px rgba(0, 0, 0, 0.5),inset -4px -4px 10px rgba(255, 255, 255,1),4px 4px 10px rgba(0, 0, 0, 0.5);\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            window.history.forward();\n");
      out.write("            function unload(){\n");
      out.write("                window.history.forward();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            if(session.getAttribute("studentid")==null){
                response.sendRedirect("../login.jsp");
            }
            
            
      out.write("\n");
      out.write("<!--        <form action=\"feedbackcode.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"subject\" required=\"true\"/>\n");
      out.write("            <textarea name=\"ftext\" required=\"true\" placeholder=\"Enter Feedback Text\"></textarea>\n");
      out.write("            <input type=\"Submit\" class=\"btn btn-success\" value=\"feedback submit\">-->");
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
      out.write("                    <h3 class=\"title fw-bold\" style=\"font-family:Algerian;\"> Nalanda eGyan Portal</h3>\n");
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
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"course.jsp\">Courses</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"studymaterial.jsp\">Study Material</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"complaint.jsp\">Complain</a>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"nav-item\">\n");
      out.write("                                  <a class=\"nav-link text-white\" href=\"profile.jsp\">Profile</a>\n");
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
      out.write("                    <h3 class=\"pt-3 ps-3 text-center\"  style=font-weight:bold;\">My Profile</h3>\n");
      out.write("                    <hr/>\n");
      out.write("                    \n");
      out.write("                    ");

                    String cmd="select * from studentinfo where enrollmentno='"+session.getAttribute("studentid")+"'";
                    
                    Dbmanager db=new Dbmanager();
                    ResultSet rs=db.selectQuery(cmd);
                    if(rs!=null)
                    {
                        if(rs.next())
                        {
                            String img="";
                            String pic=rs.getString("profilepic")+"";
                            if(pic.equals("NULL")){
                                img="image name path";
                            }
                            else{
                                img=pic;
                            }
                            
                        
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <table class=\"table table-border table-hover\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Student Pic</th> \n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(img);
      out.write("\"  width=\"100res\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Student Name :</th>\n");
      out.write("                            <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Mobile Number :</th>\n");
      out.write("                            <td>");
      out.print(rs.getString("contactno") );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Email-Id :</th>\n");
      out.write("                            <td>");
      out.print(rs.getString("emailaddress") );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Address :</th>\n");
      out.write("                            <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <a href=\"editprofile.jsp\" class=\"btn btn-primary\">Edit Pofile</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\n");
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
      out.write("            \n");
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
