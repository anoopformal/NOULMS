
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
                    <h3 class="pt-3 ps-3 text-center"  style=font-weight:bold;">My Profile</h3>
                    <hr/>
                    <form action="../updateprofile" method="post" enctype="multipart/form-data">
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
                                img=pic;
                            }
                            
                        
                    %>
                    
                    <table class="table table-border table-hover" >
                        <tr>
                            <th>Student Pic</th> 
                            <td>
                                <input type="file" name="filepic" class="form-control"  required=""/>
                            </td>
                        </tr>
                        <tr>
                            <th>Student Name :</th>
                            <td><input type="text" name="name" value="<%=rs.getString("name") %>" class="form" required="" /></td>
                        </tr>
                        <tr>
                            <th>Mobile Number :</th>
                            <td><input type="text" name="contactno" value="<%=rs.getString("contactno") %>" class="form" required=""/></td>
                        </tr>
                        <tr>
                            <th>Email-Id :</th>
                            <td><input type="email" name="emailaddress"value="<%=rs.getString("emailaddress") %>" class="form-control" required="" /></td>
                        </tr>
                        <tr>
                            <th>Address :</th>
                            <td>
                                <textarea name="address" class="form-control" required="">
                                    <%=rs.getString("address") %>
                                </textarea>
                            </td>
                        </tr>
                        <tr>
                            
                            <td colspan="2" align="center">
                                <input type="submit" value="Update Profile" class="btn btn-primary "/>
                            </td>
                        </tr>
                    </table>
                </form>
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
