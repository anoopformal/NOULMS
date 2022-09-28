<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS</title>
        <%@include file="adminlinkmaster.jsp" %>
        
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="adminheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Student List</h3>
                    
                    <div id="scroll">
                        <table class="table table-bordered table-hover">
                        <tr class="bg-warning">
                            <th>Sr.No</th>
                            <th>Enrollment No</th>
                            <th>Name</th>
                            <th>Father Name</th>
                            <th>Mother Name</th>
                            <th>Gender</th>
                            <th>Address</th>
                            <th> Contact No</th>
                            <th>E-mail</th>
                            <th>DOB</th>
                            <th>Aadhar No</th>
                            <th>Course</th>
                            <th> Year</th>
                            <th>Center Name</th>
                            <th>Registration Date</th>
                            <th>Password</th>
                            <th>Delete</th>
                        </tr>
                        <tr>
                            <%
                                String cmd="select * from studentinfo where enrollmentno<>'admin'";
                                Dbmanager db=new Dbmanager();
                                ResultSet rs=db.selectQuery(cmd);
                                int n=1;
                                while(rs.next()){
                                    %>
                                    <tr class="tabd">
                                        <td><%=n %></td>
                                        <td><%=rs.getString("enrollmentno") %></td>
                                        <td><%=rs.getString("name") %></td>
                                        <td><%=rs.getString("fname") %></td>
                                        <td><%=rs.getString("mname") %></td>
                                        <td><%=rs.getString("gender") %></td>
                                        <td><%=rs.getString("address") %></td>
                                        <td><%=rs.getString("contactno") %></td>
                                        <td><%=rs.getString("emailaddress") %></td>
                                        <td><%=rs.getString("dob") %></td>
                                        <td><%=rs.getString("aadharno") %></td>
                                        <td><%=rs.getString("course") %></td>
                                        <td><%=rs.getString("year") %></td>
                                        <td><%=rs.getString("centername") %></td>
                                        <td><%=rs.getString("registrationdate") %></td>
                                        <td><%=rs.getString("pwd") %></td>
                                        <td><a href="delreg.jsp?id=<%=rs.getString("enrollmentno") %>" onclick="return confirm('Are you sure want to delete this record ?')">Delete</a></td>
                                    </tr>
                                    
                                 <%
                                 n++;
                                }
                                %>
                        </tr>
                    </table>
                    </div>
                </div>
            </div>
            <!-- section end-->
            
            <!-- footer start-->
            <%@include file="adminfootermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
