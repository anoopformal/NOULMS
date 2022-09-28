<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULM || Student Zone</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="studentheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 ">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Complaint Form</h3>
                    <div class="row py-4">
                        <div class="col-sm-6 center">
                            <form action="complaincode.jsp" method="post">
                        <table class="table rounded-2">
                            <tr>
                                <th>Enter Subject:</th>
                                <td>
                                    <input type="text" name="subject" class="form-control" required="">
                                </td>
                            </tr>
                            <tr>
                                <th>Enter Complaint text:</th>
                                <td>
                                    <textarea name="ctext" class="form-control" required=""></textarea>
                                </td>
                            </tr>
                            <tr>
                              
                                <td colspan="2">
                                    <input type="submit" align="center" class=" px-5 btn btn-primary">
                                </td>
                            </tr>
                        </table>
                        </div>
                    </div>
                        <br>
                        <h4 class="text-center red text-white py-2">
                            Complaint list
                        </h4>
                        <table class="table table-bordered">
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
                            </tr>
                            <%
                                String q="select * from complaint a left join studentinfo b on a.enrollmentno=b.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"'";
                                Dbmanager db=new Dbmanager();
                                ResultSet rs=db.selectQuery(q);
                                int n=1;
                                while(rs.next()){
                                  %>
                                  <tr class="text-center">
                                      <td><%=n %></td>
                                      <td><%=rs.getString("enrollmentno") %></td>
                                      <td><%=rs.getString("name") %></td>
                                      <td><%=rs.getString("subject") %></td>
                                      <td><%=rs.getString("complainttext") %></td>
                                      <td><%=rs.getString("posteddate") %></td>
                                      <td><%=rs.getString("status") %></td>
                                      <td><%=rs.getString("statusdate") %></td>
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
            <%@include file="studentfootermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
