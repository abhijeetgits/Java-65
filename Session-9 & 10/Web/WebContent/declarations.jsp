<%!
 String name = "Java";
 int age = 20;
 public int addNum(int x, int y){
	 return x+y;
 }
%>
<h2>
<%
 out.println("My Name is "+ name+"<br>");
 out.println("My Age is "+ age+"<hr>");
 
 out.println("Sum = "+ addNum(10,34));
%>
</h2>
