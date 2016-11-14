<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="org.apache.derby.jdbc.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        //out.println("updated successfully");
        java.sql.Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/App","root","root");
        java.sql.Statement st=con.createStatement();
       // out.println("updated successfully");
       
        ResultSet rs= st.executeQuery("Select * from Root.tours");
    
        if(!rs.next())
        {
            out.println("Couldn't find the user! :( ");
        }
        else
        {
           %>
           <html>
               <body>
                   <table border="1">
<tr>
    <th>Name</th>
     <th>Description</th>
     <th>Price</th>
     <th>No of Days</th>
        </tr>
        <tr><td>
                <%=rs.getString(1)%></td>
            <td>
                <%=rs.getString(2)%></td>
            </tr>
            </table><%        
   // New location to be redirected
  // String site = new String("tours.html");
   //response.setStatus(response.SC_MOVED_TEMPORARILY);
   //response.setHeader("Location", site); }%>
            
     

</body>
</html>
        
