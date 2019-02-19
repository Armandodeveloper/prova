<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" href="resurces/index.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sito</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script src="resurces/modal.js"></script>
</head>

<body>
	<div align="center">
		<h2>Benvenuto utente</h2>

		<fieldset>
			<form class="form-inline" id="myform">
				<input type="email" class="form-control" name="email" id="email"
					placeholder="Email" required> <br> <br> <input
					type="password" class="form-control" name="password" id="passowrd"
					placeholder="Password" required> <br> <br>
				<button type="submit" class="btn btn-default">Login</button>
			</form>

		</fieldset>

		<div class="form-group">
			<div class="col-sm-5 col-lg-5 col-sm-offset-2">
				<div class="checkbox">
					<br>
					<div id="myModal" class="modal fade" role="dialog">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Avvertenza</h4>
								</div>
								<div class="modal-body">
									<p>Utente non trovato</p>
								</div>
								<div class="modal-footer">
									<a href="${pageContext.request.contextPath}/Iscrizione.jsp"
										class="btn btn-default" " data-mission="modal" type="submit"
										aria-pressed="true" role="button">Iscriviti</a>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Chiudi</button>
								</div>
							</div>

						</div>
					</div>

				</div>
				<div class="form-group">
					<div class="col-sm-5 col-lg-5 col-sm-offset-2">
						<div class="checkbox">
							<br>

							<!--  <center>
								<label> <input type="checkbox"> <font
									color="white">Ricorda i miei dati</font>
								</label>
							</center>-->
						</div>
					</div>
				</div>

			</div>
</body>
</html>