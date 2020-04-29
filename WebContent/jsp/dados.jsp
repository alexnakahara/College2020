<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Boas Vindas</title>
</head>
<body>

<h2>Olá <%= request.getParameter("nome") %></h2>

	<% for(int i = 0; i < 100; i++) { 
	
		if(i % 2 == 0){
		%>
		
		
			<p style="background: blue;"> <%= i %> </p>
			
		<%} else {%>
		
			<p style="background: red;"> <%= i %> </p>
		
		<% }
		
		} %>
		
<%-- 		<% 
		for(int i = 0; i < 100; i++) {
	%>
			<p class="<%= (i % 2 == 0 ? "par" : "impar") %>"><%= i %></p>
	<%
	 	} 
	%>
 --%>	
</body>
</html>