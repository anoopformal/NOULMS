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
            <div class="row py-2">
                <div class="col-sm-4 text-center">
                    <a href="course.jsp"><img src="images/courses.png" width="200rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="studycenter.jsp"><img src="images/stu.png" width="200rem"></a>
                </div>
                <div class="col-sm-4 text-center">
                    <a href="notification.jsp"><img src="images/noti.png" width="200rem"></a>
                </div>
            </div>
            <div class="row py-2">
                <div class="col-sm-4 text-center">
                    <a href="studymaterial.jsp"><img src="images/list.png" width="150rem"></a>
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
            <%@include file="studentfootermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
