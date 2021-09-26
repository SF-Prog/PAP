<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO INICIO SESION -->
<div id="seccionFormulario">
	<form action="ServletReferencia" method="post" name="nombreForm" style="mergin-left: 40px;">
		<div class="row">
		  <div class="col-md-3">
		    <label for="nomSocio" class="form-label">Nombre Socio</label>
		    <input type="text" class="form-control" id="nomSocio" aria-describedby="Nombre">
		  </div>
		</div>
		<div class="row">
		  <div class="col-md-3">
		    <label for="cedSocio" class="form-label">Cédula Socio </label>
		    <input type="number" class="form-control" id="cedSocio">
		  </div>
		</div>
		<div class="row" style="margin: 30px 0 0 0;">
		  <input type="submit" name="btnEnvio" value="Ingresar" class="btn btn-primary">		
		</div>
	</form>
</div>

<!-- FIN  CONTENIDO INICIO SESION -->
<%@ include file="/footer.jsp"%>

