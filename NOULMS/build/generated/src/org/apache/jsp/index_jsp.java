package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.Dbmanager;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/linkmaster.jsp");
    _jspx_dependants.add("/headermaster.jsp");
    _jspx_dependants.add("/welcome.jsp");
    _jspx_dependants.add("/notice.jsp");
    _jspx_dependants.add("/footermaster.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOUMS || HOME</title>\n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\" type=\"image/x-icon\"/>\n");
      out.write("       <style>\n");
      out.write("           .red{\n");
      out.write("    background-color: darkred;\n");
      out.write("}\n");
      out.write(".welcomep:first-letter{\n");
      out.write("    font-size: 30px;\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("         <script>\n");
      out.write("            window.history.forward();/* forward back nahi hone deta ak page se dusre page par*/\n");
      out.write("            function unload(){\n");
      out.write("                window.history.forward();\n");
      out.write("            }\n");
      out.write("        </script>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- outer start--> \n");
      out.write("            ");
      out.write("        <!-- headline start-->\n");
      out.write("            <div class=\"row red text-white p-3\">\n");
      out.write("                <div class=\"col-sm-3 text-center \">\n");
      out.write("                    <i class=\"fa-solid fa-phone round\"></i>\n");
      out.write("                    Call Us : +91 79850128Em\n");
      out.write("                </div>\n");
      out.write("                <div class=\" col-sm-4 text-center\">\n");
      out.write("                    <i class=\"fa-solid fa-envelope\"></i>\n");
      out.write("                    Email : Email@gmail.com\n");
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
      out.write("                <div class=\"col-sm-2 mt-3 text-center\">\n");
      out.write("                    <img src=\"images/logo.png\" class=\"logo w-100 \"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 text-center fs-4 pt-3\">\n");
      out.write("                    <h3 class=\"title fw-bold\" style=\"font-family: vardana; text-align: center;\"> Nalanda  e-Gyan Portal</h3>\n");
      out.write("                    <p>(An Initiative Taken By Nalanda Open Unversity)</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2 mt-5 ps-4 fs-2\">\n");
      out.write("                    <a href=\"https://www.facebook.com\"><i class=\"fa-brands fa-facebook p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.whatsapp.com\"><i class=\"fa-brands fa-whatsapp p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.twitter.com\"><i class=\"fa-brands fa-twitter p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.linkedin.com\"><i class=\"fa-brands fa-linkedin p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.instagram.com\"><i class=\"fa-brands fa-instagram p-1 m-2\"></i></a>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header close-->\n");
      out.write("            \n");
      out.write("             <!-- nav-bar start-->\n");
      out.write("            \n");
      out.write("            <div class=\"row s2\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                        <div class=\"container-fluid red py-2 fs-5 \">\n");
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
      out.write("                                <ul class=\"dropdown-menu bg-danger\">\n");
      out.write("                                    <li><a class=\"dropdown-item text-white bg-danger\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item text-white bg-danger\" href=\"study.jsp\">Studycenters</a></li>\n");
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
      out.write("                           \n");
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
      out.write("            <!--welcome strat-->\n");
      out.write("            ");
      out.write("        <div class=\"row gradient\">\n");
      out.write("            <div class=\"col-sm-12\" >\n");
      out.write("                     <h2 style=\"color:darkgreen;font-weight: bold; text-align:center;\">Welcome !</h2>\n");
      out.write("                <h5 class=\"text-warning fs-4 fw-bold  text-center\">Nalanda Open University</h5>\n");
      out.write("                <p class=\"p-2 welcomep\" style=\"text-align:justify; font-size: 20px;\">The Nalanda Open University is the only University in the State of Bihar meant for imparting learning exclusively through the system \n");
      out.write("                    of distance education. The University was established in March, 1987 by an ordinance, \n");
      out.write("                    promulgated by the Government of Bihar. Later, Nalanda Open University Act, 1995 was passes\n");
      out.write("                    by the Bihar Legislature, replacing the Ordinance, and the University came under the \n");
      out.write("                    authority and jurisdiction of the new Act automatically.\n");
      out.write("                    <img src=\"images/background.jfif\" style=\"float:right; margin: 5px;\"><br>\n");
      out.write("                                                             The University is named after\n");
      out.write("                    the famous Nalanda University of Ancient India. At present, the University is functioning\n");
      out.write("                    from its camp office at Biscomaun Bhawan, 2nd, 3rd, 4th and 12th Floors, Patna 800 001.\n");
      out.write("                    The University has established at its camp office at Patna a well equipped and fully \n");
      out.write("                    automated modern office in an area of approximately 60,000 sq. feet, which houses an\n");
      out.write("                    examination centre for about 1000 students, a state of the art Library with about 50,000\n");
      out.write("                    titles and a computer laboratory of about 300 IBM Pentium-4 computers, apart from \n");
      out.write("                    administrative offices and other infra-structures. The University is recognised by the \n");
      out.write("                    Distance Education Council (DEC), University Grants Commission, and Ministry of HRD, \n");
      out.write("                    Government of India for imparting education through distance mode.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("            <!--welcome end-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4 border notice_board p-0\">\n");
      out.write("                    <div class=\" text-warning py-2 fs-2 text-center \" style=\"font-weight: bold; background-color:darkred\">\n");
      out.write("                         Notice Board  \n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write(" \n");
      out.write("\n");
      out.write("<marquee direction=\"up\" onmouseover=\"this.stop()\" height=\"240px\" onmouseout=\"this.start()\" scrollamount=\"2\"  >\n");
      out.write("     <ul class=\"text-dark\">\n");
      out.write("         ");

             String cmd="select * from notification ";
             Dbmanager db=new Dbmanager();
             ResultSet rs=db.selectQuery(cmd);
             while(rs.next()){
                 
      out.write("\n");
      out.write("                 <li><a href=\"#\">");
      out.print(rs.getString("ntext") );
      out.write("<sup><img src=\"images/gif.gif\" width=\"50res\"></sup></a> </li>\n");
      out.write("                 ");

             }
             
      out.write("\n");
      out.write("     </ul>              \n");
      out.write("  </marquee>");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 py-3\"  >\n");
      out.write("                    <h6>ABOUT __________</h6>\n");
      out.write("                    <h3 class=\"text-danger fw-bold\">NOU e-GYAN PORTAL</h3>\n");
      out.write("                    <p class=\"fs-5\">\n");
      out.write("                        Nalanda Open University welcomes all our students, faculties & study centres to the very new & innovative online study portal NOU e-Gyan.\n");
      out.write("                        The portal is a unique initiative by Hon'ble Vice-Chancellor Prof.\n");
      out.write("                        (Dr.) K C Sinha, which aims at providing online study material to the \n");
      out.write("                        students of NOU.<br><br>\n");
      out.write("                        The portal is accessible from any hook and corner of the world if the system\n");
      out.write("                        allows the permission to its users. It is also fully secured and accessible\n");
      out.write("                        24 x 7 to its authorised users. It will resolve the academic issues such as \n");
      out.write("                        E-content Distribution, Delivery, Tracking, Assessment, Progress Monitoring \n");
      out.write("                        & Controlling of all stakeholders of the system i.e. students, teachers, \n");
      out.write("                        study centre administrators as well as Nalanda Open University Admins when\n");
      out.write("                        they are at a distance.\n");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <hr>\n");
      out.write("                <!--Student our services start-->\n");
      out.write("                <div class=\"row py-5\">\n");
      out.write("                    <div class=\"col-sm-10 col_center\">\n");
      out.write("                        <h6>FEATURE________</h6>\n");
      out.write("                        <h3 class=\"text-danger fw-bold\">STUDENT SERVICES</h3>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/registration.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"login.jsp\" class=\"red form-control  fs-2 nav-link\">Login</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/dashboard.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"#\" class=\"red form-control  fs-2 nav-link\">Dashboard</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/online-courses.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"#\" class=\"red form-control  fs-2 nav-link\" style=\"font-size: 40px\">Self Learning Materials</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/e-lectures.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"#\" class=\"red form-control  fs-2 nav-link\">e-Book</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/performance.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"#\" class=\"red form-control  fs-2 nav-link\">Performance</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/feedback.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"#\" class=\"red form-control  fs-2 nav-link\">feedback</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/course-catlog.jpg\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"login.jsp\" class=\"red form-control  fs-2 nav-link\">Course-Cataloag</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/self-assessment.svg\"  class=\"mt-5 pt-5 w-50\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a href=\"login.jsp\" class=\"red form-control  fs-2 nav-link\">Self-assessment Tools</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!--Student our services end-->\n");
      out.write("                <hr>\n");
      out.write("                <!--Study material open-->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-10 col_center\">\n");
      out.write("                        <h6>COURSES________</h6>\n");
      out.write("                        <h3 class=\"text-danger fw-bold\">OUR COURSES</h3>\n");
      out.write("                        <div class=\"row py-5 m-2\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-sm-4 shadowi\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/bba.png\"  class=\" w-100\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <h4 class=\"fw-bold text-dark\">Bachelor In Bussiness Administration</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4 shadowi\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/bag.png\"  class=\" w-100\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <h4 class=\"fw-bold text-dark\">Bachelor Of Arts(Geography)</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4 shadowi\">\n");
      out.write("                                <div class=\"text-center text-white col_center\">\n");
      out.write("                                    <img src=\"images/bca.png\"  class=\" w-100\" alt=\"image not found\"/>\n");
      out.write("                                    <br>\n");
      out.write("                                    <h4 class=\"fw-bold text-dark\">Bachelor in Computer Application</h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button  class=\"btn btn-success text-white mb-3\" onclick=\"window.location.href='course.jsp'\">View All Course</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!--Study material end-->\n");
      out.write("                \n");
      out.write("            <!-- section end-->\n");
      out.write("            <!-- footer start-->\n");
      out.write("            ");
      out.write("<!--footer start-->\n");
      out.write("            <div class=\"row red py-4\">\n");
      out.write("                <div class=\"col-sm-3 text-center text-white\">\n");
      out.write("                    <img src=\"images/logo.png\" class=\"rounded-5\" width=\"200res\"/>\n");
      out.write("                    <div class=\"fs-3\">\n");
      out.write("                        <a href=\"https://www.facebook.com\"><i class=\"fa-brands fa-facebook p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.whatsapp.com\"><i class=\"fa-brands fa-whatsapp p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.twitter.com\"><i class=\"fa-brands fa-twitter p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.linkedin.com\"><i class=\"fa-brands fa-linkedin p-1 m-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.instagram.com\"><i class=\"fa-brands fa-instagram p-1 m-2\"></i></a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 fimage text-white\">\n");
      out.write("                    <h4>\n");
      out.write("                        Useful Links \n");
      out.write("                    </h4>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>   <a href=\"index.jsp\" class=\"text-white\">Home</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>  <a href=\"about.jsp\" class=\"text-white\">About us</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>  <a href=\"contactus.jsp\" class=\"text-white\">Contect us</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>  <a href=\"login.jsp\" class=\"text-white\">login</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup> <a href=\"study.jsp\" class=\"text-white\">Study</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>  <a href=\"course.jsp\" class=\"text-white\">Course</a><br>\n");
      out.write("                    <sup><i class=\"fa-solid fa-arrow-right\"></i></sup>  <a href=\"registration.jsp\" class=\"text-white\">Registration</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 text-white \">\n");
      out.write("                    <h4 class=\"pb-4\">\n");
      out.write("                        Contact info\n");
      out.write("                    </h4>\n");
      out.write("                    <p>\n");
      out.write("                        <i class=\"fa-solid fa-location-dot pb-4\">  NOU</i><br>\n");
      out.write("                        2nd/3rd Floor, Biscomaun<br> Bhawan,\n");
      out.write("                        Gandhi Maidan,<br>\n");
      out.write("                        Patna 800 001 (BIHAR).\n");
      out.write("                        </p>\n");
      out.write("                        \n");
      out.write("                      <i class=\"fa-solid fa-phone pb-4 round\">  +91 7080102007</i><br> \n");
      out.write("                      Give use a call\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3  text-white\">\n");
      out.write("                    <h4>\n");
      out.write("                        Subscribe \n");
      out.write("                    </h4>\n");
      out.write("                    <p>\n");
      out.write("                        Fill the detail below to receive the<br> manual of the NOU e-Gyan Portal\n");
      out.write("                    </p> \n");
      out.write("                    <input type=\"email\" placeholder=\"Email Address\" class=\"rounded-5 px-2\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("<div class=\"row bg-dark text-white\">\n");
      out.write("    <div class=\"col-sm-12 pt-2 text-center \">\n");
      out.write("        <p> copyright-2022 &copy; Nalanda Open University | This WebPage Developed and Designed By (ANOOP SHARMA)</p>\n");
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
