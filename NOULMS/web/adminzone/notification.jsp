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
                    <h3 class="py-3 ps-3 text-center ">Add Notification</h3>
                    <hr>
                    <form action="noticecode.jsp" method="post">
                        <div class="row">
                            <div class="col-sm-6 center">
                                <table class="table table-bordered ">
                                    <tr  >
                                <th>Enter Notifiaction</th>
                                <td>
                                    <textarea name="ntext" class="form-control" required=""></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="Submit" class="btn btn-primary">
                                </td>
                            </tr>
                        </table>
                    
                            </div>
                        </div>
                        <hr>
                        <h4 class="text-center">Notification List</h4>
                        <hr>
                        <table class="table table-hover table-bordered">
                            <tr class="bg-warning">
                                <th>Sr.No</th>
                                <th>Notifiaction Text</th>
                                <th>Posted Date</th>
                                <th>Delete</th>
                            </tr>
                            <%
                                String cmd="select * from notification";
                                Dbmanager db=new Dbmanager();
                                ResultSet rs=db.selectQuery(cmd);
                                int n=1;
                                while(rs.next()){
                                    %>
                                    <tr class="tabd">
                                    
                                        <td><%=n %></td>
                                        <td><%=rs.getString("ntext") %></td>
                                        <td><%=rs.getString("posteddate") %></td>
                                        <td>
                                            <a href="delnotice.jsp?id=<%=rs.getString("nid") %>" onclick="return confirm('Are you sure do yiu want to delete record ?')">Delete</a>
                                        </td>
                                    </tr>
                                    <%
                                    n++;
                                }
                                %>
                        </table>
                    </form>
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
