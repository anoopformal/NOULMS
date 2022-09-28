
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || HOME</title>
        <%@include file="linkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="headermaster.jsp" %>  
            <!-- section open-->
            <!--welcome strat-->
            <%@include file="welcome.jsp" %>
            <!--welcome end-->
            <div class="row">
                <div class="col-sm-4 border notice_board p-0">
                    <div class=" text-warning py-2 fs-2 text-center " style="font-weight: bold; background-color:darkred">
                         Notice Board  
                    </div>
                    <%@include file="notice.jsp" %>
                </div>
                <div class="col-sm-8 py-3"  >
                    <h6>ABOUT __________</h6>
                    <h3 class="text-danger fw-bold">NOU e-GYAN PORTAL</h3>
                    <p class="fs-5">
                        Nalanda Open University welcomes all our students, faculties & study centres to the very new & innovative online study portal NOU e-Gyan.
                        The portal is a unique initiative by Hon'ble Vice-Chancellor Prof.
                        (Dr.) K C Sinha, which aims at providing online study material to the 
                        students of NOU.<br><br>
                        The portal is accessible from any hook and corner of the world if the system
                        allows the permission to its users. It is also fully secured and accessible
                        24 x 7 to its authorised users. It will resolve the academic issues such as 
                        E-content Distribution, Delivery, Tracking, Assessment, Progress Monitoring 
                        & Controlling of all stakeholders of the system i.e. students, teachers, 
                        study centre administrators as well as Nalanda Open University Admins when
                        they are at a distance.

                    </p>
                    </div>  
                </div>
            </div>
                <hr>
                <!--Student our services start-->
                <div class="row py-5">
                    <div class="col-sm-10 col_center">
                        <h6>FEATURE________</h6>
                        <h3 class="text-danger fw-bold">STUDENT SERVICES</h3>
                        <div class="row">
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/registration.jpg" alt="image not found"/>
                                    <br>
                                    <a href="login.jsp" class="red form-control  fs-2 nav-link">Login</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/dashboard.jpg" alt="image not found"/>
                                    <br>
                                    <a href="#" class="red form-control  fs-2 nav-link">Dashboard</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/online-courses.jpg" alt="image not found"/>
                                    <br>
                                    <a href="#" class="red form-control  fs-2 nav-link" style="font-size: 40px">Self Learning Materials</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/e-lectures.jpg" alt="image not found"/>
                                    <br>
                                    <a href="#" class="red form-control  fs-2 nav-link">e-Book</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/performance.jpg" alt="image not found"/>
                                    <br>
                                    <a href="#" class="red form-control  fs-2 nav-link">Performance</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/feedback.jpg" alt="image not found"/>
                                    <br>
                                    <a href="#" class="red form-control  fs-2 nav-link">feedback</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/course-catlog.jpg" alt="image not found"/>
                                    <br>
                                    <a href="login.jsp" class="red form-control  fs-2 nav-link">Course-Cataloag</a>
                                </div>
                            </div>
                            <div class="col-sm-3">
                                <div class="text-center text-white col_center">
                                    <img src="images/self-assessment.svg"  class="mt-5 pt-5 w-50" alt="image not found"/>
                                    <br>
                                    <a href="login.jsp" class="red form-control  fs-2 nav-link">Self-assessment Tools</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
                <!--Student our services end-->
                <hr>
                <!--Study material open-->
                <div class="row">
                    <div class="col-sm-10 col_center">
                        <h6>COURSES________</h6>
                        <h3 class="text-danger fw-bold">OUR COURSES</h3>
                        <div class="row py-5 m-2">
                            
                            <div class="col-sm-4 shadowi">
                                <div class="text-center text-white col_center">
                                    <img src="images/bba.png"  class=" w-100" alt="image not found"/>
                                    <br>
                                    <h4 class="fw-bold text-dark">Bachelor In Bussiness Administration</h4>
                                </div>
                            </div>
                            <div class="col-sm-4 shadowi">
                                <div class="text-center text-white col_center">
                                    <img src="images/bag.png"  class=" w-100" alt="image not found"/>
                                    <br>
                                    <h4 class="fw-bold text-dark">Bachelor Of Arts(Geography)</h4>
                                </div>
                            </div>
                            <div class="col-sm-4 shadowi">
                                <div class="text-center text-white col_center">
                                    <img src="images/bca.png"  class=" w-100" alt="image not found"/>
                                    <br>
                                    <h4 class="fw-bold text-dark">Bachelor in Computer Application</h4>
                                </div>
                            </div>
                        </div>
                        <button  class="btn btn-success text-white mb-3" onclick="window.location.href='course.jsp'">View All Course</button>
                    </div>
                </div>
                
                <!--Study material end-->
                
            <!-- section end-->
            <!-- footer start-->
            <%@include file="footermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
