<!-- courses page -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS </title>
        <%@include file="adminlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <!-- outer start--> 
            <%@include file="adminheadermaster.jsp" %>  
            <!-- section open-->
            
            <div class="row pb-3">
                <div class="col-sm-12 p-0">
                    <h3 class="pt-3 ps-3 text-center" style="font-weight:bold;">Change Password</h3>
                    <br>
                    <div class="row">
                        <div class="col-sm-6 center">
                            <form action="passcode.jsp" method="post">
                        <table class="table rounded-2">
                            <tr>
                            <th>Enter Old Pssword :</th>
                            <td><input type="text" placeholder="Enter old password"name="oldpass" class="form-control" required=""></td>
                            </tr>
                            <tr>
                            <th>Enter New Password</th>
                            <td><input type="password"placeholder="Enter new password" name="newpass" class="form-control" required=""></td>
                            </tr>
                            <tr>
                                <th>Re-Enter New Password</th>
                                <td><input type="password" placeholder="Enter re-new password" name="repass" class="form-control" required=""></td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center"><input type="submit" class="btn btn-primary" value="Change Password"> </td>
                            </tr>
                        </table>
                    </form>
                        </div>
                    </div>
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
