<%@page import="connect.Dbmanager"%>
<%
    String id=request.getParameter("id");
    
    String cmd="delete from complaint where id='"+id+"'";
    
    Dbmanager db=new Dbmanager();
    
    db.insertUpdateDelete(cmd);
    response.sendRedirect("complaint.jsp");
    
    %>