<%@page import="connect.Dbmanager"%>
<%
    String ntext=request.getParameter("ntext");
    
    String cmd=" insert into notification(ntext,posteddate) values('"+ntext+"',curdate())";
    
    Dbmanager db=new Dbmanager();
    
     boolean b= db.insertUpdateDelete(cmd);
    if(b==true){
        %>
        <script>
            alert('Notification successfully added');
            window.location.href="notification.jsp";
        </script>
        <%
    }
    else{
        %>
        <script>
            alert('Notification is not added');
            window.location.href="notification.jsp";
        </script>
        <%
    }
    %>