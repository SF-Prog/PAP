<%HttpSession sesion = request.getSession();%>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">CoronaTickets.uy</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.jsp">Home</a></li>
	  <%
	  if (sesion.getAttribute("conectado") != null) {
		if (sesion.getAttribute("tipo") != "artista") {%>
      	  <li><a href="consultaEspectaculo.jsp">Consulta Espect�culo</a></li>
          <li><a href="consultaFuncionDeEspectaculo.jsp">Consulta Funci�n de Espect�culo</a></li>
		  <li><a href="seguirUsuario.jsp">Seguimiento de Usuarios</a></li>

		  <li><form action="Usuario" method="POST" name="nombreForm" style="mergin-left: 40px;">
		      <input type="hidden"  name="close" value="close" class="btn btn-primary">
		      <input type="submit"  value="Cierre Sesi�n" class="btn btn-primary">
		      </form>
	      </li>

	  <%}else if(sesion.getAttribute("tipo") != "espectador"){%>
	      <li><a href="altaFuncionDeEspectaculo.jsp">Alta Funci�n de Espect�culo</a></li>
      	  <li><a href="consultaEspectaculo.jsp">Consulta Espect�culo</a></li>
          <li><a href="consultaFuncionDeEspectaculo.jsp">Consulta Funci�n de Espect�culo</a></li>
		  <li><a href="seguirUsuario.jsp">Seguimiento de Usuarios</a></li>

		  <li><form action="Usuario" method="POST" name="nombreForm" style="mergin-left: 40px;">
		       <input type="hidden" name="close" value="close" class="btn btn-primary">
		      <input type="submit"  value="Cierre Sesi�n" class="btn btn-primary">
		      </form>
	     </li>
	<%}}else {%>
      	 <li><a href="inicioSesion.jsp">Inicio Sesi�n</a></li>  
	     <li><a href="altaUsuario.jsp">Alta usuario</a></li>
      	 <li><a href="consultaEspectaculo.jsp">Consulta Espect�culo</a></li>
      	 <li><a href="consultaFuncionDeEspectaculo.jsp">Consulta Funci�n de Espect�culo</a></li> 
	<%}%>
       <!-- NO MINIMOS -->
       <!--  <li><a href="#">Consulta de Usuario</a></li>
       <li><a href="#">Modificar Datos de Usuario</a></li>
       <li><a href="#">Crear Paquete de Espect�culos</a></li>
       <li><a href="#">Agregar Espect�culo a Paquete de Espect�culos</a></li>
       <li><a href="#">Consulta de Paquete de Espect�culos</a></li>
       <li><a href="#">Registro a funci�n de Espect�culo</a></li>
       <li><a href="#">Alta Espect�culo</a></li>
       <li><a href="#">Consulta de Paquete de Espect�culos</a></li>
       <li><a href="#">Manejo de im�genes en Estaci�n de Trabajo</a></li>
       <li><a href="#">Manejo de im�genes en Servidor Web</a></li>
       <li><a href="#">Utilizaci�n de Pesta�as</a></li>-->
    </ul>
  </div>
</nav>


<script>
function cerrarSesion(){
	var formParametr = new FormData();
	formParametr.append("cerrarSesion","close");
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp.responseText);
	      
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}
</script>