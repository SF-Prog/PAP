<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO ALTA USUARIO -->
<div id="seccionFormulario">
	
	<form id="altaUsuarioForm"onsubmit="enviar()" name="altaUsuarioForm" style="margin-left: 40px;">
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
				<input class="form-control" type="text" name="nombreU" placeholder="Ingrese su nombre" /><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Apellido:</label> 
				<input class="form-control" type="text" name="apellidoU" placeholder="Ingrese su apellido" /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Password:</label> 
				<input class="form-control" type="password" name="password" placeholder="Ingrese su contraseña" required /><br/>
			</div>
			<div class="col-md-5">
				<label class="form-label">Verificar Password:</label> 
				<input class="form-control" type="password" name="vpassword" placeholder="Reingrese su contraseña" required /><br/>
			</div>
		</div> 
		<div class="row">
			<div class="btn-group col-md-2" role="group" aria-label="Basic example" style="height: 79px;">
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="TipoUsuario"  id="Espectador" value="Espectador"  onchange="ocultarCampos()" checked>
				  <label class="form-check-label" for="Espectador">
				    Espectador
				  </label>
				</div>
				<div class="form-check">
				  <input class="form-check-input" type="radio" name="TipoUsuario"  id="Artista"  onchange="ocultarCampos()"  value="Artista" >
				  <label class="form-check-label" for="Artista">
				    Artista
				  </label>
				</div>
			</div>

		    <div class='col-md-3'>
	         	<label class="form-label">Fecha:</label> 
	            <input  class="form-control" type="date" name="fecchaU" id="birthday" name="birthday">
		     </div>
			<div class="col-md-5"  id="linkU">
				<label class="form-label"  >Link:</label> 
				<input class="form-control" type="text" name="linkU"   placeholder="Ingrese un link de referencia" /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4" id="descripcionGeneralU" >
				<label class="form-label" for="descripcionGeneralU">Descripcion General:</label> 
				<textarea class="form-control" type="text" name="descripcionGeneralU" rows="3" placeholder="Ingrese una descripcion general" ></textarea>
			</div>
			<div class="col-md-4"  id="biografiaU">
				<label class="form-label" for="biografiaU">Biografia:</label> 
				<textarea class="form-control"  rows="3"  name="biografiaU"  placeholder="Ingrese su biografia"></textarea>
			</div>
		</div>
		<div class="row" style="margin:40px 0 0 30px" id="msg">
				
		</div>
		
	</form>
	<div class="row" style="margin:40px 0 0 30px">
			<button  name="btnEnvio" onclick="enviar()" class="btn btn-primary col-md-2" >Ingresar Usuario</button>
			<!-- <input type="submit" name="btnEnvio" value="Ingresar Usuario" class="btn btn-primary col-md-2"> -->		
		</div>
</div>

<script>

function enviar(){
	var formParametr = new FormData(document.getElementById("altaUsuarioForm"));
	if(formParametr.get('nicknameU')==""){
		msg("Debe ingresar un nickname",false);
	} else if(formParametr.get('emailU')==""){
		msg("Debe ingresar un email",false);
	} else if(formParametr.get('password')==""){
		msg("Debe ingresar una contraseña",false);
	} else if(formParametr.get('vpassword')==""){
		msg("Debe reingresar la contraseña",false);
	} else if(formParametr.get('vpassword') == formParametr.get('password')){		
		//document.getElementById("altaUsuarioForm").submit();		
		
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready:
		   
		    	if(xhttp.responseText =="Usuario creado correctamente"){
		    		 document.getElementById("altaUsuarioForm").reset();
		    		msg(xhttp.responseText,true);
		    	}else{
		    		msg(xhttp.responseText,false);
		    	}		    
		    }
		};
		xhttp.open("POST", "Usuario", true);
		xhttp.send(formParametr);
	}else{
		msg("Contraseñas distintas",false);
	}
}

function ocultarCampos(){
	 var tipoUsuario = document.querySelector('input[name="TipoUsuario"]:checked').value;
	if(tipoUsuario== 'Espectador'){
		document.getElementById('biografiaU').style.display='none';
		document.getElementById('descripcionGeneralU').style.display='none';
		document.getElementById('linkU').style.display='none';
	}else{
		document.getElementById('biografiaU').style.display='';
		document.getElementById('descripcionGeneralU').style.display='';
		document.getElementById('linkU').style.display='';
	}
	
}
ocultarCampos();

function msg(msg,estado){
    if(estado){
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-success" role="alert">'+msg+'</div>';
    }else{    
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-danger" role="alert">'+msg+'</div>';
    }
    
    setTimeout(function(){   document.getElementById('msg').innerHTML =''; }, 2000);
}
</script>
<!-- FIN  CONTENIDO ALTA USUARIO -->
<%@ include file="/footer.jsp"%>

