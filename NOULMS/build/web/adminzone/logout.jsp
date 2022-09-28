<%
    session.invalidate();//session clear ,kill, close
    response.sendRedirect("../login.jsp");
    
    %>