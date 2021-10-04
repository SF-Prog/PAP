<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO ALTA USUARIO -->
<div id="seccionFormulario">
	
	<form action="Usuario" method="post" id="altaUsuarioForm" name="altaUsuarioForm" style="margin-left: 40px;">
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">NickName:</label> 
				<input class="form-control" type="text" name="nicknameU" placeholder="Ingrese su nickname" required /><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Email:</label> 
				<input class="form-control" type="email" name="emailU" placeholder="Ingrese su email" required /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Nombre:</label> 
				<input class="form-control" type="text" name="nombreU" placeholder="Ingrese su nombre" required /><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Apellido:</label> 
				<input class="form-control" type="text" name="apellidoU" placeholder="Ingrese su apellido" required /><br/>
			</div>
		</div>
		<div class="row">
			<div class="btn-group col-md-2" role="group" aria-label="Basic example" style="height: 79px;">
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="TipoUsuario"  id="Espectador" value="Espectador" checked>
				  <label class="form-check-label" for="Espectador">
				    Espectador
				  </label>
				</div>
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="TipoUsuario"  id="Artista"  value="Artista" >
				  <label class="form-check-label" for="Artista">
				    Artista
				  </label>
				</div>
			</div>

		    <div class='col-md-3'>
	         	<label class="form-label">Fecha:</label> 
	            <input  class="form-control" type="date" name="fecchaU" id="birthday" name="birthday">
		     </div>
			<div class="col-md-5">
				<label class="form-label">Link:</label> 
				<input class="form-control" type="text" name="linkU" placeholder="Ingrese un link de referencia" /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<label class="form-label" for="descripcionGeneralU">Descricpion General:</label> 
				<textarea class="form-control" type="text" id="descripcionGeneralU" rows="3" placeholder="Ingrese una descripcion general" ></textarea>
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

<script>
function enviar(){
	var formParametr = new FormData(document.getElementById("altaUsuarioForm"));
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp);
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);

}
</script>
<!-- FIN  CONTENIDO ALTA USUARIO -->
<%@ include file="/footer.jsp"%>

