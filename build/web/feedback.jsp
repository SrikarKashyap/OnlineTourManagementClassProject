<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="org.apache.derby.jdbc.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String overall = request.getParameter("overall");
    String clean = request.getParameter("clean");
    String number = request.getParameter("number");
    String quality = request.getParameter("quality");
    String other = request.getParameter("other");
  
    

      Class.forName("org.apache.derby.jdbc.ClientDriver");
        //out.println("updated successfully");
        java.sql.Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/App","root","root");
        java.sql.Statement st=con.createStatement();
       try{ 
       int i = st.executeUpdate("INSERT INTO ROOT.FEEDBACK(overall,clean,number,quality,other) values('"+overall+"','"+clean+"','"+number+"','"+quality+"','"+other+"')");
       out.println("Feedback submitted succesfully! Thank you!");
 }
catch(Exception e){
    out.println(e);
}
        
%>