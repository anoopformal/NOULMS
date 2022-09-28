package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class linkmaster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
