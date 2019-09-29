<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("uid");
 pwd = request.getParameter("pwd");
 out.println("User Name = "+ uid+"<br>");
 out.println("Password = "+ pwd);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Method = <%=request.getMethod() %> <br>
Application Name = <%=request.getContextPath() %> <br>
Content Type = <%=request.getContentType() %>
</h2>