<%@page import="connect.Dbmanager"%>
<%
    String id=request.getParameter("id");
    
    String cmd="update complaint set status='Approved',statusdate=curdate() where id='"+id+"'";
    
    Dbmanager db=new Dbmanager();
    db.insertUpdateDelete(cmd);
    response.sendRedirect("complaint.jsp");
    
    %>