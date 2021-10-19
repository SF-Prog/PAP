<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO INICIO SESION -->
<div id="seccionFormulario">
	<form action="Usuario" method="post" name="nombreForm" style="mergin-left: 40px;">
		<div class="row">
		  <div class="col-md-3">
		    <label for="user" class="form-label">Usuario</label>
		    <input type="text" class="form-control" name="user" id="user" required>
		  </div>
		</div>
		<div class="row">
		  <div class="col-md-3">
		    <label for="password" class="form-label">Contraseña</label>
		    <input type="password" class="form-control" name="password" id="password" required>
		  </div>
		</div>
		<c:if test="${mensaje!= null}">
			<div class="alert alert-danger" style="text-align: center;"><p>${mensaje}</p></div>
		</c:if>
		<div class="row" style="margin: 30px 0 0 0;">
		  <input type="submit" name="btnEnvio" value="Ingresar" class="btn btn-primary">		
		</div>
	</form>
</div>

<!-- FIN  CONTENIDO INICIO SESION -->
<%@ include file="/footer.jsp"%>

