<%@page import="connect.Dbmanager"%>
<%
    
    String id=request.getParameter("id");
    String cmd="delete from courseinfo where courseid='"+id+"'";
    
    Dbmanager db=new Dbmanager();
    db.insertUpdateDelete(cmd);
    
    response.sendRedirect("course.jsp");
    %>