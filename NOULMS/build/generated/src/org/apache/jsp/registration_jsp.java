package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/linkmaster.jsp");
    _jspx_dependants.add("/headermaster.jsp");
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

      out.write("<!-- courses page -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOLMS || REGISTRATION</title>\n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\" type=\"image/x-icon\"/>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write(" //home page css strat\n");
      out.write("*{\n");
      out.write("    padding: 0px;\n");
      out.write("    margin: 0px;\n");
      out.write("    font-family: vardana;\n");
      out.write("}\n");
      out.write(".logo{\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-facebook:hover,.fa-twitter:hover{\n");
      out.write("    color: blue;\n");
      out.write("    transform: scale(1.5);\n");
      out.write("}\n");
      out.write(".fa-instagram:hover{\n");
      out.write("    background-image:linear-gradient(30deg,blue,red,yellow);\n");
      out.write("    width:fit-content;\n");
      out.write("    border-radius: 20%;\n");
      out.write("    transform: scale(1.5);\n");
      out.write("}\n");
      out.write(".fa-square-whatsapp:hover{\n");
      out.write("    transform: scale(1.5);\n");
      out.write("    color:springgreen;\n");
      out.write("}\n");
      out.write(".notice_board{\n");
      out.write("    height:400px;\n");
      out.write("}\n");
      out.write(".title:first-letter{\n");
      out.write("    color:red;\n");
      out.write("    font-size: 40px;\n");
      out.write("}\n");
      out.write(".ntp{\n");
      out.write("    font-size: 20px;\n");
      out.write("    line-height: 30px;\n");
      out.write("    text-align:justify;\n");
      out.write("}\n");
      out.write("marquee{\n");
      out.write("    line-height:30px;\n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("//about page start\n");
      out.write("           .aboutimage{\n");
      out.write("    background-image: url(images/background.jfif);\n");
      out.write("    background-size:cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position:center;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("}\n");
      out.write(".aboutp{\n");
      out.write("    font-size: 20px;\n");
      out.write("    text-align: justify;\n");
      out.write("    padding: 20px 100px 20px 100px;\n");
      out.write("    line-height:30px;\n");
      out.write("}\n");
      out.write("     .aboutbg{\n");
      out.write("          background-color:rgba(0,0,0,0.6);\n");
      out.write("          }\n");
      out.write("hr{\n");
      out.write("    color:darkred;\n");
      out.write("}\n");
      out.write(".aboutp::first-letter{\n");
      out.write("    color: red;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".card:hover{\n");
      out.write("    transform: scaleX(1.2);\n");
      out.write("    background:lightskyblue;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("//media qurey start\n");
      out.write("@media  screen and (max-width:550px) {\n");
      out.write("    .ntp{\n");
      out.write("        font-size: 20px;\n");
      out.write("        line-height: 30px;\n");
      out.write("        text-align:center;\n");
      out.write("    }\n");
      out.write("    .logo{\n");
      out.write("        width:50%;\n");
      out.write("    }\n");
      out.write("    .d-block{\n");
      out.write("        height: 300px;\n");
      out.write("    }\n");
      out.write("    .aboutp{\n");
      out.write("    padding:0px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("//home page end\n");
      out.write("\n");
      out.write("//welcome page start\n");
      out.write("\n");
      out.write("\n");
      out.write("    .wimage{\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .gradient{\n");
      out.write("            background-image: linear-gradient(rgb(250, 252, 249),80%,rgba(244, 96, 51, 0.625));\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("//login form css\n");
      out.write("\n");
      out.write("        .outer{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: left;\n");
      out.write("}\n");
      out.write("       .outer{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: left;\n");
      out.write("}\n");
      out.write(".blur{\n");
      out.write("    margin: 0px auto;\n");
      out.write("    background-image: linear-gradient(60deg,rgba(250, 200, 255, 0.7),rgba(0, 0, 255, 0.6),rgba(255, 255, 0, 0.6));\n");
      out.write("    box-shadow: inset 1px 1px  0px rgb(125, 238, 73),-1px 1px 10px rgb(139, 233, 67),2px 1px 1px rgb(166, 233, 58),inset 2px -2px 0px greenyellow;\n");
      out.write("    border-radius:0% 10% 0% 10%; \n");
      out.write("}\n");
      out.write("#logininput{\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: none;\n");
      out.write("    border-bottom: 2px solid greenyellow;\n");
      out.write("}\n");
      out.write("input[type=\"submit\"]:hover{\n");
      out.write("    background-color: green;\n");
      out.write("    transform: scale(1.1);\n");
      out.write("}\n");
      out.write(".outer a{\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: rgb(128, 28, 0);\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(".profile{\n");
      out.write("    width: 20%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("//registration css start\n");
      out.write("\n");
      out.write(".regformouter{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: left;\n");
      out.write("    height:100%;\n");
      out.write("}\n");
      out.write(".regformouter{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: left;\n");
      out.write("}\n");
      out.write(".regforminner{\n");
      out.write("    margin: 0px auto;\n");
      out.write("}\n");
      out.write(".regforminner input{\n");
      out.write("    box-shadow: 2px 2px 1px 1px rgb(14, 14, 13),inset -2px -2px 10px 0px rgb(158, 156, 156);\n");
      out.write("    padding:3px 4px;\n");
      out.write("    font-size: 23px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".regforminner input[type=\"radio\"]{\n");
      out.write("    width: 20px;\n");
      out.write("    height: 20px;\n");
      out.write("    box-shadow: 0px 0px 3px rgb(250,250,250);\n");
      out.write("}\n");
      out.write(".regforminner select{\n");
      out.write("    box-shadow: 2px 2px 1px 1px rgb(14, 14, 13),inset -2px -2px 10px 0px rgb(158, 156, 156);\n");
      out.write("    padding:5px 4px;\n");
      out.write("    font-size: 23px;\n");
      out.write("}\n");
      out.write(".regforminner label{\n");
      out.write("    font-size: 25px;\n");
      out.write("}\n");
      out.write("sup{\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- outer start--> \n");
      out.write("            ");
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
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- form open-->\n");
      out.write("            <div class=\"row regformouter py-5 \">\n");
      out.write("                <div class=\"col-sm-8 regforminner\">\n");
      out.write("                    <h1 class=\"text-center pb-5 text-danger\">Student Registration Form</h1>\n");
      out.write("                    <form  method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"enrollmentno\" class=\"form-label\">Enrollment No<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"enrollmentno\" name=\"enrollmentno\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\" col-sm-6\">\n");
      out.write("                                <label for=\"name\" class=\"form-label\">Name<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"fname\" class=\"form-label\">Father Name<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fname\" name=\"fname\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"mname\" class=\"form-label\">Mother Name<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"mname\" name=\"mname\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 pt-4\">\n");
      out.write("                                <label for=\"gender\" class=\"form-label\">Gender<sup>*</sup></label>\n");
      out.write("                                <input type=\"radio\"  id=\"gender\" name=\"gender\" value=\"Male\" required> Male\n");
      out.write("                                <input type=\"radio\"  id=\"gender\" name=\"gender\" Value=\"Female\"required> Female\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"address\" class=\"form-label\">Address<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"contactno\" class=\"form-label\">Contact No<sup >*</sup></label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"contactno\" name=\"contactno\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"email\" class=\"form-label\">E-mail<sup >*</sup></label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"dob\" class=\"form-label \">Date Of Birth<sup >*</sup></label>\n");
      out.write("                                <input type=\"date\" class=\"form-control \" id=\"dob\" name=\"dob\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"aadharno\" class=\"form-label\">Aadhar No<sup>*</sup></label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" maxlength=\"12\" id=\"aadharno\" name=\"aadharno\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"course\" class=\"form-label\">Course<sup>*</sup></label>\n");
      out.write("                                <select class=\"form-control\" name=\"course\" id=\"course\" required=\"true\">\n");
      out.write("                                    <option value=\"\">Select Course</option>\n");
      out.write("                                    <option>MCA</option>\n");
      out.write("                                    <option>BCA</option>\n");
      out.write("                                    <option>B-Tech</option>\n");
      out.write("                                    <option>Diploma</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"year\" class=\"form-label\">Year<sup>*</sup></label>\n");
      out.write("                                <select class=\"form-control\" name=\"year\" id=\"year\" required=\"true\">\n");
      out.write("                                    <option value=\"\">Select Course</option>\n");
      out.write("                                    <option>First Year</option>\n");
      out.write("                                    <option>Second Year</option>\n");
      out.write("                                    <option>Third Year</option>\n");
      out.write("                                    <option>Fourth Year</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"centername\" class=\"form-label\">Center Name<sup>*</sup></label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"centername\" name=\"centername\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\" col-sm-6 mb-3\">\n");
      out.write("                                <label for=\"password\" class=\"form-label\">password<sup>*</sup></label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("             \n");
      out.write("                        <div class=\"col-sm-12 text-center my-3\">\n");
      out.write("                            <input type=\"submit\" value=\"SUBMIT\" class=\"btn fs-5 btn-primary px-5\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- form end-->\n");
      out.write("            \n");
      out.write("            <!-- footer start-->\n");
      out.write("            ");
      out.write("<!--footer start-->\n");
      out.write("            <div class=\"row bg-danger py-4\">\n");
      out.write("                <div class=\"col-sm-3 text-center\">\n");
      out.write("                        <iframe  frameborder=\"0\" src=\"https://www.bing.com/maps/embed?h=400&w=500&cp=25.61954854173497~85.14929073139422&lvl=15.88664758656865&typ=d&sty=r&src=SHELL&FORM=MBEDV8\" scrolling=\"no\">\n");
      out.write("                        </iframe>\n");
      out.write("                        <div style=\"white-space: nowrap; text-align: center; padding: 6px 0;\">\n");
      out.write("                           <a id=\"largeMapLink\" target=\"_blank\" class=\"text-white\" href=\"https://www.bing.com/maps?cp=25.61954854173497~85.14929073139422&amp;sty=r&amp;lvl=15.88664758656865&amp;FORM=MBEDLD\">View Larger Map</a> &nbsp; | &nbsp;\n");
      out.write("                           <a id=\"dirMapLink\" target=\"_blank\"class=\"text-white\" href=\"https://www.bing.com/maps/directions?cp=25.61954854173497~85.14929073139422&amp;sty=r&amp;lvl=15.88664758656865&amp;rtp=~pos.25.61954854173497_85.14929073139422____&amp;FORM=MBEDLD\">Get Directions</a>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 fimage text-white\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 text-white text-center\">\n");
      out.write("                    <h4 class=\"p-4\">\n");
      out.write("                        Social Media Links\n");
      out.write("                    </h4>\n");
      out.write("                    <div class=\"fs-1\">\n");
      out.write("                        <a href=\"https://www.facebook.com\" class=\"text-white\"><i class=\"fa-brands fa-facebook p-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.twitter.com\" class=\"text-white\"><i class=\"fa-brands fa-twitter p-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.whatsapp.com\" class=\"text-white\"><i class=\"fa-brands fa-square-whatsapp p-2\"></i></a>\n");
      out.write("                        <a href=\"https://www.instagram.com\" class=\"text-white\"><i class=\"fa-brands fa-instagram \"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 text-white\">\n");
      out.write("                    <h5>\n");
      out.write("                        Contect Detail \n");
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
      out.write("<div class=\"row bg-danger\">\n");
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
