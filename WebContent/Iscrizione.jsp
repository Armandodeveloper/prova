<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="resurces/index.css" type="text/css" />
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="sfondo">
<fieldset>
<center>
<p><h2>Inserisci e-mail e password per registrarti al sito</h2></p>
<form action="${pageContext.request.contextPath}/insert.htm" method="POST">
  <form action="/action_page.php">
  <div class="form-group">
    <label for="email">Email:</label> <br>
    <input type="email" class="form-control" name="email" id="email" required><br>
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label> <br>
    <input type="password" class="form-control" id="password" name="password" required> <br>
  </div>
  <br>
  <button type="submit" class="btn btn-primary">Iscriviti</button>
</form>
</center>
</fieldset>

</body>
</html>