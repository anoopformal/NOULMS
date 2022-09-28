<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS || REGISTRATION</title>
        <%@include file="linkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="headermaster.jsp" %>
            
            <!-- form open-->
            <div class="row regformouter py-5 ">
                <div class="col-sm-8 regforminner">
                    <h1 class="text-center pb-5 text-danger">Student Registration Form</h1>
                    <form action="regcode.jsp" method="post">
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="enrollmentno" class="form-label">Enrollment No<sup>*</sup></label>
                                <input type="text" class="form-control" id="enrollmentno" name="enrollmentno" required>
                            </div>
                            <div class=" col-sm-6">
                                <label for="name" class="form-label">Name<sup>*</sup></label>
                                <input type="text" class="form-control" id="name" name="name" required>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="fname" class="form-label">Father Name<sup>*</sup></label>
                                <input type="text" class="form-control" id="fname" name="fname" required>
                            </div>
                            
                            <div class=" col-sm-6 mb-3">
                                <label for="mname" class="form-label">Mother Name<sup>*</sup></label>
                                <input type="text" class="form-control" id="mname" name="mname" required>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class=" col-sm-6 pt-4">
                                <label for="gender" class="form-label">Gender<sup>*</sup></label>
                                <input type="radio"  id="gender" name="gender" value="Male" required> Male
                                <input type="radio"  id="gender" name="gender" Value="Female"required> Female
                            </div>
                            
                            <div class=" col-sm-6 mb-3">
                                <label for="address" class="form-label">Address<sup>*</sup></label>
                                <input type="text" class="form-control" id="address" name="address" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="contactno" class="form-label">Contact No<sup >*</sup></label>
                                <input type="number" class="form-control" id="contactno" name="contactno" required>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <label for="email" class="form-label">E-mail<sup >*</sup></label>
                                <input type="email" class="form-control" id="email" name="email" required>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="dob" class="form-label ">Date Of Birth<sup >*</sup></label>
                                <input type="date" class="form-control " id="dob" name="dob" required>
                            </div>
                            
                            <div class=" col-sm-6 mb-3">
                                <label for="aadharno" class="form-label">Aadhar No<sup>*</sup></label>
                                <input type="number" class="form-control" maxlength="12" id="aadharno" name="aadharno" required>
                            </div>
                        </div>
                        
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="course" class="form-label">Course<sup>*</sup></label>
                                <select class="form-control" name="course" id="course" required="true">
                                    <option value="">Select Course</option>
                                    <option>MCA</option>
                                    <option>BCA</option>
                                    <option>B-Tech</option>
                                    <option>Diploma</option>
                                </select>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <label for="year" class="form-label">Year<sup>*</sup></label>
                                <select class="form-control" name="year" id="year" required="true">
                                    <option value="">Select Course</option>
                                    <option>First Year</option>
                                    <option>Second Year</option>
                                    <option>Third Year</option>
                                    <option>Fourth Year</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class=" col-sm-6 mb-3">
                                <label for="centername" class="form-label">Center Name<sup>*</sup></label>
                                <input type="text" class="form-control" id="centername" name="centername" required>
                            </div>
                            <div class=" col-sm-6 mb-3">
                                <label for="password" class="form-label">password<sup>*</sup></label>
                                <input type="password" class="form-control" id="password" name="password" required>
                            </div>
                        </div>
             
                        <div class="col-sm-12 text-center my-3">
                            <input type="submit" value="SUBMIT" class="btn fs-5 btn-primary px-5">
                        </div>
                    </form>
                </div>
            </div>
            <!-- form end-->
            
            <!-- footer start-->
            
            <%@include file="footermaster.jsp" %>
            <!-- footer end -->
             
            <!-- outer close-->
        </div>
    </body>
</html>
