<h1 align=center><ins>JSP | EXPRESSIONS</ins></h1>

<%!
 String name = "Java";
 int age = 20;
 public int addNum(int x, int y){
	 return x+y;
 }
%>
<h2>
My Name is <%=name %>
<br>
My Age is <%=age %>
<hr> 
<%="Sum = "+ addNum(10,34)%>
</h2>
