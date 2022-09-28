 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="css/bootstrap.css" rel="stylesheet"/>
        <script src="js/bootstrap.bundle.js"></script> 
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <link rel="shortcut icon" href="images/logo.png" type="image/x-icon"/>
       
        <script>
            window.history.forward();
            function unload(){
                window.history.forward();
            }
        </script>
        <%
            if(session.getAttribute("studentid")==null){
                response.sendRedirect("../login.jsp");
            }
            
            %>
