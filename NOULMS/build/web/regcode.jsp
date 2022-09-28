<%@page import="connect.Dbmanager"%>
<% 
    String enroolmentno=request.getParameter("enrollmentno");
    String name=request.getParameter("name");
    String fname=request.getParameter("fname");
    String mname=request.getParameter("mname");
    String gender=request.getParameter("gender");
    String address=request.getParameter("address");
    String contactno=request.getParameter("contactno");
    String email=request.getParameter("email");
    String dob=request.getParameter("dob");
    String aadharno=request.getParameter("aadharno");
    String course=request.getParameter("course");
    String year=request.getParameter("year");
    String centername=request.getParameter("centername");
    String password=request.getParameter("password");
    
    //this is query in used to insert record you database
    String cmd= "insert into studentinfo(enrollmentno,name,fname,mname,gender,address,contactno,emailaddress,dob,aadharno,course,year,centername,pwd,registrationdate)  value('"+enroolmentno+"','"+name+"','"+fname+"','"+mname+"','"+gender+"','"+address+"','"+contactno+"','"+email+"','"+dob+"','"+aadharno+"','"+course+"','"+year+"','"+centername+"','"+password+"',curdate())";
    Dbmanager db=new Dbmanager();
    out.print(cmd);
    boolean status=db.insertUpdateDelete(cmd);
    if(status==true){
        out.print("Registration success");
        %>
        <script>
            alert('Registration successfully submitted');
            window.location.href="registration.jsp";
        </script>
     <%
    }
    else{
        
        %>
        <script>
            alert('Registration is not success');
            window.location.href="registration.jsp";
        </script>
        
    <%
    }
%>