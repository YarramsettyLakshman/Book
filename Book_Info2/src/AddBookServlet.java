import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class AddBookServlet extends HttpServlet 
{
	public void  service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{    PrintWriter out=response.getWriter();
		String id=request.getParameter("ID");
		String name=request.getParameter("NAME");
		String author=request.getParameter("AUTHOR");
		String published=request.getParameter("PUBLISHED");
		String pages=request.getParameter("PAGES");
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "Ramu");
		PreparedStatement ps=con.prepareStatement("insert into bookapplication(ID,NAME,AUTHOR,PUBLISHED,PAGES) values('"+id+"','"+name+"','"+author+"','"+published+"','"+pages+"')");

		ps.executeUpdate();
		
		out.print("Data is successfully inserted!");
		}

		catch(Exception e)
		{
		System.out.print(e);
		e.printStackTrace();
		}
	}
}
		

