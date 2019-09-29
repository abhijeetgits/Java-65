import java.io.*;
import javax.servlet.*;
public class LifecycleServlet extends GenericServlet
{
 public void init(ServletConfig config) throws ServletException{
	 super.init(config);
	 System.out.println("** Inside init method");
 }

 public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
	 System.out.println("** Inside service method");
 }
 
 public void destroy(){
	 System.out.println("** Inside destroy method");
 }
}

/*
D:\Tomcat 9.0\webapps\edureka\WEB-INF\classes>javac -cp "D:\Tomcat 9.0\lib\servlet-api.jar" LifecycleServlet.java
*/