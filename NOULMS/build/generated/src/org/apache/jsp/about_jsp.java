package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOLMS || ABOUT US</title>\n");
      out.write("        ");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/logo.png\" type=\"image/x-icon\"/>\n");
      out.write("        <style>\n");
      out.write("/*            *{\n");
      out.write("                font-family: vardana;\n");
      out.write("            }\n");
      out.write("            //about page\n");
      out.write("            .aboutimage{\n");
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
      out.write("          background-color:rgba(100,100,200,0.5);\n");
      out.write("          }\n");
      out.write("          //login page\n");
      out.write("          .blur{\n");
      out.write("    margin: 0px auto;\n");
      out.write("    background-image: linear-gradient(60deg,rgba(250, 200, 255, 0.683),rgba(0, 0, 255, 0.733),rgba(255, 255, 0, 0.725));\n");
      out.write("    box-shadow: inset 1px 1px  0px rgb(125, 238, 73),-1px 1px 10px rgb(139, 233, 67),2px 1px 1px rgb(166, 233, 58),inset 2px -2px 0px greenyellow;\n");
      out.write("    border-radius:0% 10% 0% 10%; \n");
      out.write("}*/\n");
      out.write(" //home page css strat\n");
      out.write("*{\n");
      out.write("    padding: 0px;\n");
      out.write("    margin: 0px;\n");
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
      out.write("\n");
      out.write(".outer{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size: cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position: left;\n");
      out.write("}\n");
      out.write(".blur{\n");
      out.write("    margin: 0px auto;\n");
      out.write("    background-image: linear-gradient(60deg,rgba(250, 200, 255, 0.683),rgba(0, 0, 255, 0.733),rgba(255, 255, 0, 0.725));\n");
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
      out.write("         .outer{\n");
      out.write("    background-image: url(images/buble.jpg);\n");
      out.write("    background-size:cover;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-position:left;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("            <!-- About section open-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 p-0\">\n");
      out.write("                    <div class=\"aboutimage text-white\">\n");
      out.write("                        <div class=\"ps-5 aboutbg\">\n");
      out.write("                            <div >\n");
      out.write("                                <h2 class=\"text-center py-4 fw-bold\" style=\"text-decoration: underline red;\">About Nalanda Open University</h2>\n");
      out.write("                            </div>\n");
      out.write("                                <p class=\"aboutp\">\n");
      out.write("                                    Nalanda is inspired by the academic excellence and global vision of its historic predecessor\n");
      out.write("                                    and aspires to meet and set global standards of academic excellence and research and enable\n");
      out.write("                                    capacity building in all areas of higher learning. The University is being supported by all\n");
      out.write("                                    the Member States of the East Asia Summit and Intergovernmental Memorandums of Understanding\n");
      out.write("                                    to that effect have been signed by 17 countries.\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <p class=\"aboutp\">\n");
      out.write("                                    Nalanda is inspired by the academic excellence and global vision of its historic predecessor\n");
      out.write("                                    and aspires to meet and set global standards of academic excellence and research and enable\n");
      out.write("                                    capacity building in all areas of higher learning. The University is being supported by all\n");
      out.write("                                    the Member States of the East Asia Summit and Intergovernmental Memorandums of Understanding\n");
      out.write("                                    to that effect have been signed by 17 countries.\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <p class=\"aboutp\">\n");
      out.write("                                    The University seeks to recover the lost connections and partnerships that existed in the region\n");
      out.write("                                    called Asia, before the onset of historical forces that led to their dissolution.\n");
      out.write("                                    Asian cultures have multiple links that go deep into the past and are reflected in a \n");
      out.write("                                    variety of common cultural features. The re-discovery of inter-Asian linkages in recent \n");
      out.write("                                    times has led to a resurgence in discovering and building upon a shared history. Nalanda\n");
      out.write("                                    University is envisaged as an icon of this new Asian renaissance: a creative space that \n");
      out.write("                                    will be for future generations a center of inter-civilizational dialogue.\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <div class=\"card\" style=\"width: 15rem;\">\n");
      out.write("                                                    <img src=\"images/1st.jpg\" class=\"card-img-top\" alt=\"Image not found\">\n");
      out.write("                                                   <div class=\"card-body text-center\">\n");
      out.write("                                                    <h5 class=\"card-title text-success\">Shri Phagu Chauhan</h5>\n");
      out.write("                                                    <p class=\"card-text text-dark\">Chancellor & Hon'ble Governor Of Bhihar</p>\n");
      out.write("                                                   </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <div class=\"card pb-4\" style=\"width: 15rem;\">\n");
      out.write("                                                    <img src=\"images/2nd.jpg\" class=\"card-img-top\" alt=\"Image not found\">\n");
      out.write("                                                   <div class=\"card-body text-center\">\n");
      out.write("                                                    <h5 class=\"card-title text-success \">Prof.(Dr)H.N.Prasad</h5>\n");
      out.write("                                                    <p class=\"card-text text-dark\">Vice Chancellor</p>\n");
      out.write("                                                   </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <div class=\"card\" style=\"width: 15rem;\">\n");
      out.write("                                                    <img src=\"images/3rd.jpg\" class=\"card-img-top\" alt=\"Image not found\">\n");
      out.write("                                                   <div class=\"card-body text-center\">\n");
      out.write("                                                    <h5 class=\"card-title text-success\">Prof.(Dr).Kriteshwar Prasad</h5>\n");
      out.write("                                                    <p class=\"card-text text-dark\">Pro vice chancellor</p>\n");
      out.write("                                                   </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-3\">\n");
      out.write("                                                <div class=\"card pb-4\" style=\"width: 15rem;\">\n");
      out.write("                                                    <img src=\"images/4th.jpg\" class=\"card-img-top\" alt=\"Image not found\">\n");
      out.write("                                                   <div class=\"card-body text-center\">\n");
      out.write("                                                    <h5 class=\"card-title text-success\">Prof.Vijay Shankar Rai</h5>\n");
      out.write("                                                    <p class=\"card-text text-dark\">Register</p>\n");
      out.write("                                                   </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <div class=\"card pb-4\" style=\"width: 15rem;\">\n");
      out.write("                                             <img src=\"images/5th.jpg\" class=\"card-img-top\" alt=\"Image not found\">\n");
      out.write("                                            <div class=\"card-body text-center\">\n");
      out.write("                                             <h5 class=\"card-title text-success\">Dr.Sanjay Kumar</h5>\n");
      out.write("                                             <p class=\"card-text text-dark\">Register</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            <div >\n");
      out.write("                                <h2 class=\"text-center py-4 fw-bold\" style=\"text-decoration: underline red;\">Historical Background</h2>\n");
      out.write("                            </div>\n");
      out.write("                                <p class=\"aboutp\">\n");
      out.write("                                    Towards the Southeast of Patna, the Capital City of Bihar State in India, is a village called the ‘Bada Gaon’, in the vicinity of which, are the world famous ruins of Nalanda University.<br>\n");
      out.write("                                    Founded in the 5th Century A.D., Nalanda is known as the ancient seat of learning. 2,000 Teachers and 10,000 Students from all over the Buddhist world lived and studied at Nalanda, the first Residential International University of the World. A walk in the ruins of the university, takes you to an era, that saw India leading in imparting knowledge, to the world – the era when India was a coveted place for studies. The University flourished during the 5th and 12th century.<br>\n");
      out.write("                                    Although Nalanda is one of the places distinguished as having been blessed by the presence of the Buddha, it later became particularly renowned as the site of the great monastic university of the same name , which was to become the crown jewel of the development of Buddhism in India. The name may derive from one of Shakyamuni’s former births , when hewas a king whose capital was here. Nalanda was one of his epithets meaning “insatiable in giving.”\n");
      out.write("                                    The Gupta kings patronised these monasteries, built in old Kushan architectural style, in a row of cells around a courtyard. Ashoka and Harshavardhana were some of its most celebrated patrons who built temples and monasteries here.<br> Recent excavations have unearthed elaborate structures here. Hiuen Tsang had left ecstatic accounts of both the ambiance and architectureof this unique university of ancient times.<br> Modern historians have tentatively \n");
      out.write("                                    dated the founding of a monastery at Nalanda as being in the fifth century.However, this may not be accurate. For example,the standard biographiesof the teacher Nagarjuna, believed by most historians to have been born around 150 AD, are quite specific about his having received ordination at Nalanda monastery when he was seven years old. Further, his teacher Rahulabhadra is said to have lived there for some time before that. We may infer that there were a monastery or monasteries at Nalanda long before the foundation of the later Great Mahavihara.\n");
      out.write("                                </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--About section end-->\n");
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
