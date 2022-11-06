<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	body{
	display:flex;
	justify-content: center;
	align-items: center;
	}
	select{
	heigh:100%;
	width:100%;
	overflow: hidden; /* Hide scrollbars */
	border:none;
	}
</style>

</head>
<body>
	<form action="Responsepost" method="post">
	<table>
		<tr>
			<th>
				Procesor
			</th>
			<th>	
				Acesstories
			</th>
		</tr>
		<tr>
			<td>
				<input type="radio" name="a" value="Celeron D" checked>Celeron D<br>
				<input type="radio" name="a" value="Pentinum IV" checked>Pentinum IV<br>
				<input type="radio" name="a" value="Pentinum D" checked>Pentinum D<br>
			</td>
			<td>
				<input type="checkbox" name="b" value="Monitor">Monitor<br>
				<select name="acesstories" multiple>
					<option value="Camera">Camera</option>
					<option value="Printer">Printer</option>
					<option value="Scanner">Scanner</option>
				</select>
			</td>
		</tr>
	</table>
	<button type="submit">PURCHASE</button>
	</form>
</body>
</html>