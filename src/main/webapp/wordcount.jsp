<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">


body {
	border: 2px solid black;
	display: inline-block;
	margin: 10px;
	border-radius: 20px;
	text-align: center;
}
</style>

</head>
<body>

<form action="" method="post">
<pre>
<textarea rows="10" cols="100" name="s" placeholder="Enter your text"></textarea>

 <h1> ${result }
 </h1> 
<input type="submit" onclick="form.action='word'">
</pre>
</form>


</body>
</html>