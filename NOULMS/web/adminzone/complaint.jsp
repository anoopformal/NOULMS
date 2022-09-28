
<!--admin Zone-->
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
                     <h3 class="text-center py-3">
                            Complaint list
                        </h3>
                        <table class="table table-bordered table-hover">
                            <tr class="text-center bg-warning">
                                <th>
                                    Sr.No.
                                </th>
                                <th>Enrollmentno</th>
                                <th> Student Name</th>
                                <th>Subject</th>
                                <th>Compalint Text</th>
                                <th>Status</th>
                                <th>Approve Date</th>
                                <th>Statusdate</th>
                                <th>Update Status</th>
                                <th>Delete</th>
                            </tr>
                            <%
                                String q="select * from complaint a left join studentinfo b on a.enrollmentno=b.enrollmentno";
                                Dbmanager db=new Dbmanager();
                                ResultSet rs=db.selectQuery(q);
                                int n=1;
                                while(rs.next()){
                                  %>
                                  <tr class="text-center tabd">
                                      <td><%=n %></td>
                                      <td><%=rs.getString("enrollmentno") %></td>
                                      <td><%=rs.getString("name") %></td>
                                      <td><%=rs.getString("subject") %></td>
                                      <td><%=rs.getString("complainttext") %></td>
                                      <td><%=rs.getString("posteddate") %></td>
                                      <td><%=rs.getString("status") %></td>
                                      <td><%=rs.getString("statusdate") %></td>
                                      <td><a onclick="return confirm('Are you upadate complete status ?')" href="updatestatus.jsp?id=<%=rs.getString("id") %>">Updete status</a></td>
                                      <td><a  onclick="return confirm('Are you sure do you want to delete ?')" href="delcomplaint.jsp?id=<%=rs.getString("id")%>">Delete</a></td>
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
