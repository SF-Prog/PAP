
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO CONSULTA FUNCION DE ESPECTACULO -->
<div id="seccionFormulario">
	<form action="ServletReferencia" method="post" name="nombreForm">
		Nombre Socio: <input type="text" name="nomSocio"/><br/>
		C�dula Socio: <input type="text" name="cedSocio"/><br/>
		<input type="submit" name="btnEnvio" value="Ingresar">
	</form>
</div>

<!-- FIN  CONTENIDO CONSULTA FUNCION DE ESPECTACULO -->
<%@ include file="/footer.jsp"%>

