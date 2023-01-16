<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
	<div class="container" style="width:35% ;hight:50%">
		<div class="row">
			<div class="col">
				<h1 style="text-align:center">Bienvenido a Pet Smile</h1>		
				<h3 style="text-align:center"> Ingreso </h3>
			</div>			
			<div class="col" style="width:80%">
				<form  action="LoginServlet" method="post" > 
					<div>
						<label class="col-lg-5">Usuario:</label>						
						<input class="col-lg-7" id="nombreUsuario" type="text" name="nombreUsuario"/>
					</div>
					
					<div class="col">
						<label class="col-lg-5">Contraseña:</label>						
						<input class="col-lg-7" id="password" type="password" name="password"/>					
					</div>				
					<div class="col-md-6">
					    <button class="btn btn-success btn-block" type="submit">Registrar</button>			    
					</div>			  
					<div class="col-md-6">			    
					    <button class="btn btn-info btn-block" type="reset">Limpiar</button>
			  </div>		  
				</form>
			</div>
		</div>		  
	</div>
</body>
<footer>
	<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</footer>
</html>