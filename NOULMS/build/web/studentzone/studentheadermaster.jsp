        <%@page import="connect.Dbmanager"%>
<!-- headline start-->
            <div class="row red text-white p-3">
                <div class=" col-sm-4 text-center">
                    Welcome to Student Zone
                </div>
                <div class="col-sm-4 text-center">
                    <%=new Dbmanager().getDate()%>
                </div>
                <div class="col-sm-4 text-center">
                    <%=session.getAttribute("studentid")%>
                </div>
            </div>
         <!-- headline close-->
         
         <!-- header start-->
            <div class="row s1">
                <div class="col-sm-1 mt-3 text-center">
                    <img src="images/logo.png" class="logo w-100 "/>
                </div>
                <div class="col-sm-7 text-center fs-4 pt-3">
                    <h3 class="title fw-bold" style="font-family:Algerian;"> Nalanda eGyan Portal</h3>
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
                        <div class="container-fluid red py-2 fs-5 ">
                          <a class="navbar-brand text-white" href="#">NOULMS</a>
                          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                          </button>
                          <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                              <li class="nav-item">
                                  <a class="nav-link active text-white" aria-current="page" href="studentwelcome.jsp">Dashboard</a>
                              </li>
                              <li class="nav-item">
                                <a class="nav-link text-white" href="feedback.jsp">Feedback</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="course.jsp">Courses</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="studymaterial.jsp">Study Material</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="complaint.jsp">Complain</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="profile.jsp">Profile</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="changepassword.jsp">Change Password</a>
                              </li>
                              <li class="nav-item">
                                  <a class="nav-link text-white" href="logout.jsp">Logout</a>
                              </li>
                            </ul>
                          </div>
                        </div>
                     </nav>
                </div>
            </div>
            
            <!-- nav-bar end-->
            