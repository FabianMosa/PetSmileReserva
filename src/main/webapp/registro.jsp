<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="/WebContent/WEB-INF/css/style.css"/>
</head>
<body>
	<div class="container" style="width:35%">
		<div class="row justify-content-md-center">
			<div class="col" style="textalign:center">
				<h2 style="text-align:center">Agenda a tu mascota</h2>
				<h1 style="text-align:center">Aquí</h1>
			</div>
			<form  action="registroServlet" class="row" novalidate method="post">
			<div class="col">
			    <label  class="form-label">Rut</label>
			    <input type="number" class="form-control"  required name="intRut">			    
			  </div>
		  	  <div class="col">
			    <label  class="form-label">Nombre</label>
			    <input type="text" class="form-control"  required name="txtNombre">			    
			  </div>
			  <div class="col">
			    <label class="form-label" >Apellido</label>
			    <input type="text" class="form-control"  required name="txtApellido">	
			  </div>  		    
			  <div class="col">
			    <label  class="form-label" >Dirección</label>
			    <input type="text" class="form-control" required name="txtDireccion">			    
			  </div>			      
			  <div class="col">
				  <label for="correo" class="form-label">Correo</label>
				  <input type="email" name="txtCorreo" class="form-control" id="correo" placeholder="name@example.com" required>
			  </div>	
			  <div class="col">  
			    <label class="form-label" >Telefono</label>    
			     <input type="number" name="intTelefono" class="form-control" placeholder="Ingrese 9 digitos" required>      
			  </div>		
			  <div class="col">  
			    <label class="form-label" >Nombre de la Mascota</label>    
			     <input type="text" name="txtNombreMascota"class="form-control" placeholder="" required>      
			  </div>  
			  <div class="col">  
			    <label class="form-label" >Raza de la Mascota</label>    
			     <input type="text"  name="txtTipoMascota" class="form-control" placeholder="" required>      
			  </div> 
			  <div class="col">  
			    <label class="form-label" >Edad de la mascota</label>    
			     <input type="number" name="intEdad" class="form-control" placeholder="" required>      
			  </div> 
			  <br>
			  <div class="col-md-6">
			    <button class="btn btn-success btn-block" type="submit">Registrar</button>			    
			  </div>			  
			  <div class="col-md-6">			    
			    <button class="btn btn-info btn-block" type="reset">Limpiar</button>
			  </div>	  		  
		</form>
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