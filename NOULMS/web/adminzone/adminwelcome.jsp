<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS</title>
        <%@include file="adminlinkmaster.jsp" %>
        <style>
            .iconcenter{
                margin: 0px auto;
                background-clip: red;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="adminheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                   <h3 class="pt-3 ps-3 text-center" >Welcome ! to adminzone</h3>
            </div>
            <div class="row py-2">
                <div class="col-sm-4 text-center">
                    <a href="course.jsp"><img src="images/courses.png" width="200rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="studycenter.jsp"><img src="images/stu.png" width="200rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="studentlist.jsp"><img src="images/noti.png" width="200rem"></a>
                </div>
            </div>
            <div class="row py-2">
                <div class="col-sm-4 text-center">
                    <a href="notification.jsp"><img src="images/list.png" width="150rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="feedback.jsp"> <img src="images/R.png" width="200rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="complaint.jsp"><img src="images/comp.png" width="200rem"></a>
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
