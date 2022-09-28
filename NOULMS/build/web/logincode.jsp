<%@page import="java.sql.ResultSet"%>
<%@page import="connect.Dbmanager"%>
<%
    String userid=request.getParameter("userid");
    String pwd=request.getParameter("pwd");
    //This query is used to select record from database
    String q="select * from studentinfo where enrollmentno='"+userid+"' ";
    
    Dbmanager db=new Dbmanager();
    
    boolean status=false;
    
    ResultSet rs=db.selectQuery(q);
    if(rs!=null){
        if(rs.next()==true){
            String pass=rs.getString("pwd");
            if(pass.equals(pwd)==true){
                status=true;
            }
        }
        else{
            
        }
    }
    else{
        
    }
    
    if(status==true){
        
        if(userid.equals("admin")==true){
            session.setAttribute("adminid", userid);
            response.sendRedirect("adminzone/adminwelcome.jsp");
        }
        else{
            session.setAttribute("studentid", userid);
            response.sendRedirect("studentzone/studentwelcome.jsp");
        }
    }
    else{
        %>
        
        <script>
            alert("Login Detail Invalid");
            window.location.href="login.jsp";
        </script>
        
        <%
    }
    
    %>