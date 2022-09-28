<%@page import="connect.Dbmanager"%>
<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS || Student Zone</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="studentheadermaster.jsp" %>   
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Study Material List</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <table class="table table-bordered table-hover">
                                        <tr class="bg-warning text-center">
                                            <th>Sr.No</th>
                                            <th>Course Name</th>
                                            <th>Year</th>
                                            <th>File Name</th>
                                            <th>Upload Date</th>
                                            <th>Download</th>
                                            
                                        </tr>
                                        <%
                                            String cmd="select b.coursename, a.* from  studymeterial a left join courseinfo b on b.courseid=a.coursename";
                                            Dbmanager db=new Dbmanager();
                                            ResultSet row =db.selectQuery(cmd);
                                            int r=1;
                                            while(row.next()){
                                                %>
                                                <tr class="text-center">
                                                    <td><%=r %></td>
                                                    <td><%=row.getString("coursename")%></td>
                                                     <td><%=row.getString("year")%></td>
                                                      <td><%=row.getString("filename")%></td>
                                                       <td><%=row.getString("uploaddate")%></td>
                                                      <td>
                                                          <a href="../upload/<%=row.getString("filename") %>" width="200rem">Download</a>
                                                      </td>
                                                      
                                                </tr>
                                                
                                               <%
                                               r++;
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
