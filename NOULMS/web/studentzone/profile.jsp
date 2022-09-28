
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
                    <h3 class="pt-3 ps-3 text-center text-success "  style=font-weight:bold;">My Profile</h3>
                    <hr/>
                    
                    <%
                    String cmd="select * from studentinfo where enrollmentno='"+session.getAttribute("studentid")+"'";
                    
                    Dbmanager db=new Dbmanager();
                    ResultSet rs=db.selectQuery(cmd);
                    if(rs!=null)
                    {
                        if(rs.next())
                        {
                            String img="";
                            String pic=rs.getString("profilepic")+"";
                            if(pic.equals("null")){
                                img="images/1st.jpg";
                            }
                            else{
                                img="../upload/"+pic;
                            }
                    %>
                    
                    <div class="row">
                        <div class="col-sm-8 center">
                            <table class="table table-border table-hover" >
                        <tr>
                            <th>Student Pic</th> 
                            <td>
                                <img src="<%=img %>"  width="100res"/>
                            </td>
                        </tr>
                        <tr>
                            <th>Student Name :</th>
                            <td><%=rs.getString("name") %></td>
                        </tr>
                        <tr>
                            <th>Mobile Number :</th>
                            <td><%=rs.getString("contactno") %></td>
                        </tr>
                        <tr>
                            <th>Email-Id :</th>
                            <td><%=rs.getString("emailaddress") %></td>
                        </tr>
                        <tr>
                            <th>Address :</th>
                            <td><%=rs.getString("address") %></td>
                        </tr>
                        <tr>
                            
                            <td colspan="2" align="center">
                                <a href="editprofile.jsp" class="btn btn-primary">Edit Pofile</a>
                            </td>
                        </tr>
                    </table>
                        </div>
                    </div>
                    <%
                            }
                        }
                    %>
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
