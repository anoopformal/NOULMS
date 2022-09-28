<!--Student zone feedback.jsp-->
<%@page import="java.sql.ResultSet"%>
<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> NOULM || Student Zone </title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="studentheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center fw-bold"  > Feedback form</h3>
                    <hr/>
                    <div class="row">
                        <div class="col-sm-5 center ">
                            <form action="feedbackcode.jsp" method="post">
                            <table class="table rounded-2 m-5">
                                <tr >
                                    <th>Enter Subject : </th>
                                    <td><input type="text" class="form-control" placeholder="Enter Subject Text" name="subject" required="true"/></td>
                                </tr>
                                <tr>
                                    <th>Enter Feedback :</th>
                                    <td><textarea name="ftext" class="form-control" required="true" placeholder="Enter Feedback Text"></textarea></td>
                                </tr>
                                <tr>
                                    <th colspan="2"><input type="Submit" class="btn btn-success " value="feedback submit"></th>
                                </tr>
                            </table>
                            </form>
                        </div>
                    </div>
                    <br>
                    
                    <table class="table table-border table-hover">
                        <h4 class="text-center red text-white py-2">
                            Feedback list
                        </h4>
                        <tr class="text-center bg-warning fs-5">
                            <th>Sr No.</th>
                            <th>Enrollment No.</th>
                            <th>Student Name</th>
                            <th>Subject</th>
                            <th>Feedback Text</th>
                            <th>Post Date</th>
                        </tr>
                        <%
                            String cmd="Select * from feedback a left join studentinfo b on a.enrollmentno=b.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"'";
                            
                            Dbmanager db=new Dbmanager();
                            ResultSet rs=db.selectQuery(cmd);
                            int n=1;
                            while(rs.next()){
                                %>
                                <tr class="text-center">
                                    <td>
                                        <%=n %>
                                    </td>
                                    <td><%=rs.getString("enrollmentno") %></td>
                                    <td><%=rs.getString("name") %></td>
                                    <td><%=rs.getString("subject") %></td>
                                    <td><%=rs.getString("feedbacktext") %></td>
                                    <td><%=rs.getString("posteddate") %></td>
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
