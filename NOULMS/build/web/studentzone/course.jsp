<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULM</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="studentheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Course List</h3>
                    <br>
                    <table class="table table-bordered  table-hover">
                            <tr class="bg-warning text-center">
                                <th>Sr.No</th>
                                <th>Course Name</th>
                                <th>Course Type</th>
                                <th>Course Duration</th>
                                <th> Course Image</th>
                                
                            </tr>
                            <%
                                    String cmd="select * from courseinfo";
                                    Dbmanager db=new Dbmanager();
                                    ResultSet rs=db.selectQuery(cmd);

                                    int n=1;
                                    while(rs.next()){
                                %>
                    <tr class="text-center">
                        <td><%=n %></td>
                        <td><%=rs.getString("coursename") %></td>
                        <td><%=rs.getString("coursetype") %></td>
                        <td><%=rs.getString("courseduration") %></td>
                        <td>
                            <img src="../upload/<%=rs.getString("courseimage") %>" width="200res"/>
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
            <%@include file="studentfootermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
