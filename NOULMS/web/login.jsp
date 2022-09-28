<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOLMS || LOGIN</title>
        <%@include file="linkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!--header section start-->

            <%@include file="headermaster.jsp" %>
            
            <!-- header section end-->
            
            <!-- loginpage start-->
            <div class="row outer py-4 ">
                <div class="col-sm-4 blur">
                       
                    <div class="text-center">
                         <form action="logincode.jsp" method="post">
                            <div class="py-4">
                                <img src="images/1.jpg" class="w-20 profile">
                                <h1 class="fs-1 fw-bold text-success">All Login </h1>
                            </div>
                            <div class="py-2 fs-3">
                                <input type="text" name="userid" class="form-control fs-3 shadowi"  placeholder="Enter User Id" required="true"><br>
                                  <div class="input-group mb-3">
                                    <input type="password" name="pwd" class="form-control fs-3 shadowi" id="pwd" placeholder="Enter password" required="true">
                                    <span class="input-group-text shadowi"><i class="fa-solid fa-eye" onclick="pwd();"></i></span>
                                  </div>
                                <br>
                                <input type="submit" class="btn btn-primary rounded-5 px-5 fs-4 shadowi" value="Login">
                            </div>
                            <div class="pb-5">
                                <a href="#">Forgot password</a><br><br>
                                <h4>OR</h4>
                                <a href="registration.jsp">Registration</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!-- loginpage end-->
            
            <!-- footer section end-->
            
            <%@include file="footermaster.jsp" %>
<script>
function pwd() {
  var x = document.getElementById("pwd");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>
            <!-- footer section end-->
        </div>
    </body>
</html>
