

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PreparedStatement pst=null;
	
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java65", "password");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*get form data*/
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		try {
			pst.setString(1, uid);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("admin");
				rd.forward(request, response);
			}
			else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<p style=font-size:20px;color:red;text-align:center>Invalid Username/ Password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);				
			}
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
