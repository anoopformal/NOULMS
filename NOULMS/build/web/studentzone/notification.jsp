<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Welcome Student || Student Zone</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="studentheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Welcome! To Studentt Zone</h3>
                   
                </div>
            </div>
            <div class="row py-2 px-5"><h4 style="font-family: fantasy">Notifications</h4>
                <%@page import="java.sql.ResultSet"%>
<%@page import="connect.Dbmanager"%>
<marquee direction="up" onmouseover="this.stop()" height="240px" onmouseout="this.start()" scrollamount="2"  >
     <ul class="text-dark">
         <%
             String cmd="select * from notification ";
             Dbmanager db=new Dbmanager();
             ResultSet rs=db.selectQuery(cmd);
             while(rs.next()){
                 %>
                 <li><a href="#"><%=rs.getString("ntext") %><sup><img src="../images/gif.gif" width="50res"></sup></a> </li>
                 <%
             }
             %>
     </ul>              
  </marquee>
            </div>
            <!-- section end-->
            
            <!-- footer start-->
            <%@include file="studentfootermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
