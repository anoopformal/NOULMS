<!-- courses page -->
<%@page import="java.sql.ResultSet"%>
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
                    <h3 class="pt-3 ps-3 text-center">Feedback List</h3><br>
                   <table class="table table-border  table-hover">
                        <tr class="bg-warning">
                            <th>Sr No.</th>
                            <th>Enrollment No.</th>
                            <th>Student Name</th>
                            <th>Subject</th>
                            <th>Feedback Text</th>
                            <th>Post Date</th>
                            <th>Delete</th>
                        </tr>
                        <%
                            String cmd="Select * from feedback a left join studentinfo b on a.enrollmentno=b.enrollmentno ";
                            
                            Dbmanager db=new Dbmanager();
                            ResultSet rs=db.selectQuery(cmd);
                            int n=1;
                            while(rs.next()){
                                %>
                                <tr class="text-center tabd">
                                    <td>
                                        <%=n %>
                                    </td>
                                    <td><%=rs.getString("enrollmentno") %></td>
                                    <td><%=rs.getString("name") %></td>
                                    <td><%=rs.getString("subject") %></td>
                                    <td><%=rs.getString("feedbacktext") %></td>
                                    <td><%=rs.getString("posteddate") %></td>
                                    
                                    <td>
                                        <a onclick="return confirm('Are you sure  to want to delete this record ?')" href="delfeedback.jsp?id=<%=rs.getString("id") %>">Delete</a>
                                    </td>
                                </tr>
                                
                                <%
                                n++;
                            }
                            %>
                    </table>
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
