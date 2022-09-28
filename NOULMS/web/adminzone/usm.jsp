<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS</title>
        <%@include file="adminlinkmaster.jsp" %>
        <% 
                if(request.getParameter("f")!=null){
                    if(request.getParameter("f").equals("1")){
                        %>
                        <script>
                            alert('Study Material successfully updated');
                            window.location.href="usm.jsp";
                        </script>
                        <%  
                    }
                    else{
                        %>
                        <script>
                            alert('Study Material is not updated');
                            window.location.href="usm.jsp";
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
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Upload Study Material</h3>
                    <br>
                    <form action="../uploadmaterial" method="post" enctype="multipart/form-data">
                        <table class="table table-bordered table-hover">
                            <tr>
                                <th>Course Name</th>
                                <td>
                                    <select name="course" class="form-control" required="">
                                        <option value="">Select Course</option>
                                        <%
                                            String q="select * from courseinfo";
                                            Dbmanager db=new Dbmanager();
                                            ResultSet rs=db.selectQuery(q);
                                            
                                            while(rs.next()){
                                                %>
                                                <option>
                                                    <%=rs.getString("courseid")%><%=rs.getString("coursename")%>
                                                </option>     
                                            <%
                                            
                                            }
                                            %>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <th>Year</th>
                                <td>
                                    <select name="year" required="" class="form-control">
                                        <option value=""> Select Year</option>
                                        <option>First Year</option>
                                        <option>Second Year</option>
                                        <option>Third Year</option>
                                        <option>Fourth Year</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <th>Upload File :</th>
                                <td>
                                    <input type="file" name="file" required="" class="form-control"/>
                                </td>
                            </tr>
                            <tr>
                                <th colspan="2" align="center">
                                    <input type="submit" value="Submit" class="btn btn-primary"/>
                                </th>
                            </tr>
                        </table>
                                    <br>
                                    <table class="table table-bordered table-hover">
                                        <tr>
                                            <th>Sr.No</th>
                                            <th>Course Name</th>
                                            <th>Year</th>
                                            <th>File Name</th>
                                            
                                            <th>Upload Date</th>
                                            <th>Download</th>
                                            <th>Delete</th>
                                        </tr>
                                        <%
                                            String cmd="select b.coursename, a.* from studymeterial a left join courseinfo b on b.courseid=a.coursename";
                                            ResultSet row=db.selectQuery(cmd);
                                            int r=1;
                                            while(row.next()){
                                                %>
                                                <tr>
                                                    <td><%=r %></td>
                                                    <td><%=row.getString("coursename")%></td>
                                                     <td><%=row.getString("year")%></td>
                                                      <td><%=row.getString("filename")%></td>
                                                       <td><%=row.getString("uploaddate")%></td>
                                                      <td>
                                                          <a href="../upload/<%=row.getString("filename") %>" width="200rem">Download</a>
                                                      </td>
                                                      <td>
                                                          <a onclick="return confirm('Are you sure do you want to delete this record ?')" href="delusm.jsp?id=<%=row.getString("id")%>">Delete</a>
                                                      </td>
                                                </tr>
                                                
                                               <%
                                               r++;
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
