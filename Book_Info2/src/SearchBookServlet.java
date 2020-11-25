import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBookServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException,IOException{
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
      
		
		    
		        String id=request.getParameter("ID");
		    try
		    {
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
		         Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","Ramu");
		         Statement st=con.createStatement();
		        ResultSet rs=st.executeQuery("select * from bookapplication where ID='" + id + "'");
		        if(!rs.next())
		        { 
		        	out.println("plz enter valid id");
		        	}
		        else
		        {   HttpSession session=request.getSession();
		            session.setAttribute("id", rs.getString(1));
		        	session.setAttribute("name",rs.getString(2));
		        	session.setAttribute("author",rs.getString(3));
		        	session.setAttribute("published",rs.getString(4));
		        	session.setAttribute("pages",rs.getString(5));
		         
		         response.sendRedirect("SearchBook.jsp");
		         }
		    }
			catch(Exception e)
			{
			System.out.print(e);
			e.printStackTrace();
			}
	}
}