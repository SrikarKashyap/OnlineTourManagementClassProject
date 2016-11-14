<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="org.apache.derby.jdbc.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String username=request.getParameter("name");
    String password=request.getParameter("password");

      Class.forName("org.apache.derby.jdbc.ClientDriver");
        //out.println("updated successfully");
        java.sql.Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/App","root","root");
        java.sql.Statement st=con.createStatement();
       try{ 
       int i = st.executeUpdate("INSERT INTO ROOT.USERS(username,password) values('"+username+"','"+password+"')");
       out.println("Registered Succesfully");
 }
catch(Exception e){
    out.println("User already exists!");
}
        
%>