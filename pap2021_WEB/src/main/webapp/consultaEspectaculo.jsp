<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO CONSULTA ESPECTACULO -->
<div id="seccionFormulario">
	<form action="ServletReferencia" method="post" name="nombreForm">
		Nombre Socio: <input type="text" name="nomSocio"/><br/>
		Cédula Socio: <input type="text" name="cedSocio"/><br/>
		<input type="submit" name="btnEnvio" value="Ingresar">
	</form>
</div>

<!-- FIN  CONTENIDO CONSULTA ESPECTACULO  -->
<%@ include file="/footer.jsp"%>

