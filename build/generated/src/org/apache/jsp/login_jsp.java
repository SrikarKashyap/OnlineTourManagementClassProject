package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import org.apache.derby.jdbc.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String username=request.getParameter("username");
    String password=request.getParameter("password");
    
      Class.forName("org.apache.derby.jdbc.ClientDriver");
        //out.println("updated successfully");
        java.sql.Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/App","root","root");
        java.sql.Statement st=con.createStatement();
       // out.println("updated successfully");
       
        ResultSet rs= st.executeQuery("Select * from Root.users where username = '" +username+ "' and password= '"+password+"'");
    
        if(!rs.next())
        {
            out.println("Couldn't find the user! :( ");
        }
        else
        {
           
      out.write("\r\n");
      out.write("           <html>\r\n");
      out.write("               <body>\r\n");
      out.write("                   <table border=\"1\">\r\n");
      out.write("<tr>\r\n");
      out.write("    <th>username</th>\r\n");
      out.write("     <th>password</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr><td>\r\n");
      out.write("                ");
      out.print(rs.getString(1));
      out.write("</td>\r\n");
      out.write("            <td>\r\n");
      out.write("                ");
      out.print(rs.getString(2));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </table>");
        
   // New location to be redirected
   String site = new String("tours.html");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); }
      out.write("\r\n");
      out.write("            \r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("        \r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
