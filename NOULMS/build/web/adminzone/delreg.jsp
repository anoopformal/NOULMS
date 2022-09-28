
<%@page import="connect.Dbmanager"%>
<%
    String id=request.getParameter("id");
    
    String cmd="delete from studentinfo where enrollmentno='"+id+"'";
    
    Dbmanager db=new Dbmanager();
    db.insertUpdateDelete(cmd);
    response.sendRedirect("studentlist.jsp");
    %>