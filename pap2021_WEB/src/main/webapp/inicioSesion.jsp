<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO INICIO SESION -->
<div id="seccionFormulario" style="margin-left: 40px; height: 100%; width:100%; display: flex; justify-content: center; align-items: center;">
	<form action="Usuario" method="post" name="nombreForm" style="height: 350px; width: 300px; padding: 20px; border: 1px solid #EEE; border-radius: 15px; margin-top: 50px; display: flex; flex-flow: row wrap; align-items: center; justify-content: center;">
		<div class="row">
		    <label for="user" class="form-label">Usuario</label>
		    <input type="text" class="form-control" name="user" id="user" required>
		</div>
		<div class="row">
		    <label for="password" class="form-label">Contraseña</label>
		    <input type="password" class="form-control" name="password" id="password" required>
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

