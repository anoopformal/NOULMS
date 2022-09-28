<!--Student Zone  change password-->
<%@page import="connect.Dbmanager"%>
<%
    String oldpass=request.getParameter("oldpass");
    String newpass=request.getParameter("newpass");
    String repass=request.getParameter("repass");
    
    String enrollmentno=session.getAttribute("studentid").toString();
    
    boolean status=false;
    if(newpass.equals(repass)){
        status=true;
         boolean b=false;
    if(status==true){
        String q="update studentinfo set pwd='"+newpass+"' where enrollmentno='"+enrollmentno+"' and pwd='"+oldpass+"' ";
        Dbmanager db=new Dbmanager();
        
        b=db.insertUpdateDelete(q);
        
        if(b==true){
        %>
        <script>
            alert("New Password Susccessfully Update");
            window.location.href="../login.jsp";
        </script>
        <%
    }
    else{
       %>
        <script>
            alert("New Password is not Update");
            window.location.href="../login.jsp";
        </script>
        <%
    }
    } 
    }
   
    
    else{
        %>
        <script>
            alert("New password is not confirm");
            window.location.href="changepassword.jsp";
        </script>
        <%
    }
    
    %>