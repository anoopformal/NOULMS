<%@page import="connect.Dbmanager"%>
<% 
    String subject=request.getParameter("subject");
    String ftext=request.getParameter("ftext");
    
    String enrollmentno=session.getAttribute("studentid").toString();
    
    String cmd="insert into feedback(enrollmentno,subject,feedbacktext,posteddate) values('"+enrollmentno+"','"+subject+"','"+ftext+"',curdate())";
    
    Dbmanager db=new Dbmanager();
    boolean status=db.insertUpdateDelete(cmd);
    
    if(status==true){
        %>
        <script>
            alert("Feedback successfully submited");
            window.location.href="feedback.jsp";
        </script>
        <%
    }
else{
       %>
        <script>
            alert("Feedback is not submited");
            window.location.href="feedback.jsp";
        </script>
   <% 
}
%>