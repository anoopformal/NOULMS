<!--Student Zone caomplain code-->
<%@page import="connect.Dbmanager"%>
<%
    String subject=request.getParameter("subject");
    String ctext=request.getParameter("ctext");
    
    String enrollmentno=session.getAttribute("studentid").toString();
    
    String query=" insert into complaint(enrollmentno,subject,complainttext,posteddate,status,statusdate) values('"+enrollmentno+"','"+ subject+"','"+ctext+"',curdate(),'pending','NA')";
    
    Dbmanager db= new Dbmanager();
    
    boolean b=db.insertUpdateDelete(query);
    
    if(b==true){
        %>
        <script>
            alert("Complaint Successfully Submited");
            window.location.href="complaint.jsp";
            </script>
        <%
    }
    else{
        %>
        <script>
            alert("Complaint is not Submited");
            window.location.href="complaint.jsp";
            </script>
        <%
    }
    
    %>