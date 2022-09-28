<%@page import="connect.Dbmanager"%>
<%
    
    String id=request.getParameter("id");
    String cmd="delete from notification where nid='"+id+"'";
    
    Dbmanager db=new Dbmanager();
    db.insertUpdateDelete(cmd);
    
    response.sendRedirect("notification.jsp");
    %>