package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("        <div class=\"row gradient pt-3\">\n");
      out.write("            <div class=\"col-sm-4 \">\n");
      out.write("                <h3 class=\"text-center text-white bg-danger\">NALANDA OPEN UNIVERSITY</h3>\n");
      out.write("                <img src=\"images/nalanda.jfif\" alt=\"Image not found\"  class=\"w-100 wimage\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <h2 style=\"color:green ;\">Welcome To</h2>\n");
      out.write("                <h5 class=\"text-success\">Nalanda Open University</h5>\n");
      out.write("                <p class=\"p-2 \" style=\"text-align:justify;\">The Nalanda Open University is the only University in the State of Bihar meant for imparting learning exclusively through the system \n");
      out.write("                    of distance education. The University was established in March, 1987 by an ordinance, \n");
      out.write("                    promulgated by the Government of Bihar. Later, Nalanda Open University Act, 1995 was passes\n");
      out.write("                    by the Bihar Legislature, replacing the Ordinance, and the University came under the \n");
      out.write("                    authority and jurisdiction of the new Act automatically. The University is named after\n");
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
