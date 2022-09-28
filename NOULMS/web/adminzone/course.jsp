<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin</title>
        <%@include file="adminlinkmaster.jsp" %>
        <%
                if(request.getParameter("f")!=null){
                    if(request.getParameter("f").equals("1")){
                        %>
                        <script>
                            alert('Course successfully updated');
                            window.location.href="course.jsp";
                        </script>
                        <%
                        
                    }
                    else{
                        %>
                        <script>
                            alert('Course is not updated');
                            window.location.href="course.jsp";
                        </script>
                        <%
                    }
                }
                %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="adminheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Uplode Course</h3>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <form action="../coursecode" enctype="multipart/form-data" method="post">
                        <table class="table table-bordered table-hover">
                            <tr>
                                <th>Enter Course Name : </th>
                                <td><input type="text" name="coursename" class="form-control" required=""></td>
                            </tr>
                            <tr>
                                <th>Enter Course Type : </th>
                                <td>
                                    <select name="coursetype" class="form-control" required="">
                                        <option value="">Select Course</option>
                                        <option>Diploma</option>
                                        <option>B.Tech</option>
                                        <option>MCA</option>
                                        <option>BCA</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <th>Enter Course Duration :</th>
                                <td><input type="text" name="cd" class="form-control" required=""></td>
                            </tr>
                            <tr>
                                <th>Upload Image : </th>
                                <td><input type="file" name="img" class="form-control" required=""></td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Submit" class="btn btn-primary"></td>
                            </tr>
                        </table>
                        <tr>
                        <h4 class=" text-center">
                            Course list</h4>
                        <br>
                        <table class="table table-bordered table-hover">
                            <tr class="bg-warning text-center">
                                <th>Sr.No</th>
                                <th>Course Name</th>
                                <th>Course Type</th>
                                <th>Course Duration</th>
                                <th> Course Image</th>
                                <th>Delete</th>
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
                        <td><a href="delcourse.jsp?id=<%=rs.getString("courseid")%>" onclick="return confirm('Are you sure do you want to delete this record ?')">Delete</a></td>
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
