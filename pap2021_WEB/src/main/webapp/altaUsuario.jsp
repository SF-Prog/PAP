<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO ALTA USUARIO -->
<div id="seccionFormulario">
	
	<form action="ServletReferencia" method="post" name="altaUsuarioForm" style="margin-left: 40px;">
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">NickName:</label> 
				<input class="form-control" type="text" name="nicknameU" placeholder="Ingrese su nickname"/><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Email:</label> 
				<input class="form-control" type="email" name="emailU" placeholder="Ingrese su email"/><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Nombre:</label> 
				<input class="form-control" type="text" name="nombreU" placeholder="Ingrese su nombre"/><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Apellido:</label> 
				<input class="form-control" type="text" name="apellidoU" placeholder="Ingrese su apellido"/><br/>
			</div>
		</div>
		<div class="row">
			<div class="btn-group col-md-3" role="group" aria-label="Basic example" style="height: 79px;">
 				<button type="button" class="btn btn-primary">Artista</button>
 				<button type="button" class="btn btn-primary">Espectador</button>
			</div>
			<div class="col-md-6">
				<label class="form-label">Link:</label> 
				<input class="form-control" type="text" name="linkU" placeholder="Ingrese un link de referencia"/><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<label class="form-label" for="descripcionGeneralU">Descricpion General:</label> 
				<textarea class="form-control" type="text" id="descripcionGeneralU" rows="3" placeholder="Ingrese una descripcion general"></textarea>
			</div>
			<div class="col-md-4">
				<label class="form-label" for="biografiaU">Biografia:</label> 
				<textarea class="form-control"  id="biografiaU" rows="3" placeholder="Ingrese su biografia"></textarea>
			</div>
		</div>
		<div class="row" style="margin:40px 0 0 30px">
			<input type="submit" name="btnEnvio" value="Ingresar Usuario" class="btn btn-primary col-md-2">		
		</div>
	</form>
</div>

<!-- FIN  CONTENIDO ALTA USUARIO -->
<%@ include file="/footer.jsp"%>

