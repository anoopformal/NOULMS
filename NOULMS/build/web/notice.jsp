 <%@page import="java.sql.ResultSet"%>
<%@page import="connect.Dbmanager"%>
<marquee direction="up" onmouseover="this.stop()" height="240px" onmouseout="this.start()" scrollamount="2"  >
     <ul class="text-dark">
         <%
             String cmd="select * from notification ";
             Dbmanager db=new Dbmanager();
             ResultSet rs=db.selectQuery(cmd);
             while(rs.next()){
                 %>
                 <li><a href="#"><%=rs.getString("ntext") %><sup><img src="images/gif.gif" width="50res"></sup></a> </li>
                 <%
             }
             %>
     </ul>              
  </marquee>