        <%@page import="connect.Dbmanager"%>
<!-- headline start-->
            <div class="row bg-danger text-white p-3">
                <div class=" col-sm-4 text-center">
                    Welcome To Admin Zone
                </div>
                <div class="col-sm-4 text-center">
                    <%=new Dbmanager().getDate() %>
                </div>
                <div class="col-sm-4 text-center">
                    Admin
                </div>
            </div>
         <!-- headline close-->
         
         <!-- header start-->
            <div class="row s1">
                <div class="col-sm-1 mt-3 text-center">
                    <img src="images/logo.png" class="logo w-100 "/>
                </div>
                <div class="col-sm-7 text-center fs-4 pt-3">
                    <h3 class="title fw-bold" > Nalanda eGyan Portal</h3>
                    <p>(An Initiative Taken By Nlanda Open Unversity)</p>
                </div>
                <div class="col-sm-4 mt-5 ps-4">
                </div>
            </div>
            <!-- header close-->
            
             <!-- nav-bar start-->
            
            <div class="row s2">
                <div class="col-sm-12 p-0">
                    <nav class="navbar navbar-expand-lg">
                        <div class="container-fluid bg-danger py-2 fs-5 ">
                          <a class="navbar-brand text-white" href="#">NOULMS</a>
                          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                          </button>
                          <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                              <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="adminwelcome.jsp">Dashboard</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="notification.jsp">Notification</a>
                              </li>
                              <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-white" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                  Course
                                </a>
                                <ul class="dropdown-menu  bg-danger">
                                    <li><a class="dropdown-item text-white bg-danger" href="course.jsp">Courses</a></li>
<!--                                    <li><a class="dropdown-item text-white" href="studycenter.jsp">Studycenters</a></li>-->
                                    <li><a href="usm.jsp" class="dropdown-item bg-danger text-white">Upload Study Material</a></li>
                                </ul>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="feedback.jsp">Feedback</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="complaint.jsp">Complaint</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="studentlist.jsp">Student List</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="changepassword.jsp">Change password</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="logout.jsp">Log out</a>
                              </li>
                            </ul>
                          </div>
                        </div>
                     </nav>
                </div>
            </div>
            
            <!-- nav-bar end-->
            