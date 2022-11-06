<%@page import="org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
	table,th,td{
		border: solid black 1px;
		box-shadow: 1px 1px 1px grey;
		}
</style>
<% 
	String a= request.getParameter("a");
	String b= request.getParameter("b");
	String[] c= request.getParameterValues("acesstories");
%>
	<h1>Order Summary:</h1>
	<table>
		<tr>
			<td>
			 	Processor:
			</td>
			<td>
				<%= a %>
			</td>
		</tr>
		<tr>
			<td>
				Acesstories:	
			</td>
			<td>
				<% if(b!=null){ %><%= b %><br><%  }%>
				<% if(c!=null){ for(int i=0;i<c.length;i++){ if(c[i]!=null){%><%= c[i] %><br><%} }  }%>
			</td>
		</tr>
	</table>
</body>
</html>