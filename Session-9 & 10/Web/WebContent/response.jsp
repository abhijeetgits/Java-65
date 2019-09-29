<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("uid");
 pwd = request.getParameter("pwd");
 if(uid.equals("admin") && pwd.equals("123")) {
	 response.sendRedirect("https://www.edureka.co");
 }
 else{
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid username/ password");
 }
%>
</h2>