
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO ALTA FUNCION ESPECTACULO -->

<div id="seccionFormulario">
	
	<form onsubmit="return enviar();" id="altaFuncion" name="altaFuncion" style="margin-left: 40px;">
	
		<div class="row"> 
			<div class="col-md-5">
				<select name="plataformas" id="plataformas"  onchange="seleccionarPlataforma();">
				 <!--  <option value="" disabled >Seleccione Plataforma</option> -->
				</select>
				<button type="button" class="btn btn-primary" onclick="taerEspectaculo();">Traer Espectaculos</button>
			</div>
		</div>
		<div class="row"> 
			<div class="col-md-5">
				<select name="Espectaculo" id="espectaculo" onchange="seleccionarEspectaculo();">
				 <!-- <option value="" disabled >Seleccione Eventos</option> -->
				</select>
				<button type="button"  class="btn btn-primary"  onclick="taerArtistas();">Traer Artistas</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Nombre:</label> 
				<input class="form-control" type="text" name="Nombre" placeholder="Ingrese su nickname" required /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">			
	         	<label class="form-label">Fecha de Inicio:</label> 
	            <input  class="form-control" type="date" name="fechaInicio" required /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Hora:</label> 
				<input class="form-control" type="time" name="horaInicio" required /><br/>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<label class="form-label">Artistas invitados:</label><br/>
				<select name="Artistas" id="artistas" >
				 <!-- <option value="" disabled >Seleccione Eventos</option> -->
				</select>
			</div>
			<div class="col-md-2">
				<a  class="btn btn-primary col-md-2" onclick="agregar();" style="width:100%"> Agregar </a>
			</div>
			<div class="col-md-5">
				<ul id="listaArtistas">				
				</ul>
			</div>
		</div>
		<div class="row" style="margin:40px 0 0 30px" id="msg">				
		</div>
		<div class="row" style="margin:40px 0 0 30px">
			<input type="submit" name="btnEnvio" value="Ingresar Función" class="btn btn-primary col-md-2">		
		</div>
	</form>
</div>

<script>

function taerPlataformas(){
	var formParametr = new FormData();
	formParametr.append('getParametro', true);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos.length > 0){
		    	 document.getElementById("plataformas").innerHTML='';
			     var select = document.getElementById("plataformas");
		    	 let bandera = true;
			     for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			         var option = document.createElement('option');
			         option.text = option.value = datos[i];
			         if(bandera){
			        	 option.text="Seleccione Plataforma";
			        	 option.value="";
			        	 option.selected= true;
			        	 option.disabled= true;
			        	 bandera =false;
			         }
			         select.add(option, i);	   
			     }
		    }
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
}

function taerEspectaculo(){
	var formParametr = new FormData();
	formParametr.append('getEspectaculo', true);
	formParametr.append('plataforma', document.getElementById("plataformas").value);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    borrarSelect("artistas");
		    document.getElementById("listaArtistas").innerHTML='';

		    if(datos.length > 0) {
		    	document.getElementById("espectaculo").innerHTML='';
			    var select = document.getElementById("espectaculo");
		    	let bandera = true;
			    for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			         var option = document.createElement('option');
			         option.text = option.value = datos[i];
			         if(bandera){
			        	 option.text="Seleccione Espectaculo";
			        	 option.value="";
			        	 option.selected= true;
			        	 option.disabled= true;
			        	 bandera =false;
			         }
			         select.add(option, i);	     
		     	}
		    }
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
}

function taerArtistas(){
	var formParametr = new FormData();
	formParametr.append('getArtistas', true);
	formParametr.append('espectaculo', document.getElementById("espectaculo").value);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos.length > 0){
	    		document.getElementById("artistas").innerHTML='';
			     var select = document.getElementById("artistas");
		    	 let bandera = true;
			     for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			    	 if( datos[i]!= null){
				         var option = document.createElement('option');
				         option.text = option.value = datos[i];
				         if(bandera ){
				        	 option.text="Seleccione Artistas";
				        	 option.value="";
				        	 option.selected= true;
				        	 option.disabled= true;
				        	 bandera =false;
				         }
				         select.add(option, i);
			    	 }		         
		     	 }         
	     	 }
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
}

function seleccionarPlataforma(){
	var formParametr = new FormData();
	formParametr.append('selectPlataforma', true);
	formParametr.append('plataforma', document.getElementById("plataformas").value);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    borrarSelect("espectaculo");
		    borrarSelect("artistas");
	    	document.getElementById("listaArtistas").innerHTML='';
		    /*
		    if(datos.length > 0){
			     var select = document.getElementById("espectaculo");
		    	 let bandera = true;
			     for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			         var option = document.createElement('option');
			         option.text = option.value = datos[i];
			         if(bandera){
			        	 option.text="Seleccione Espectaculo";
			        	 option.value="";
			        	 option.selected= true;
			        	 option.disabled= true;
			        	 bandera =false;
			         }
			         select.add(option, i);	
	     		  }
 			}*/
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
}


function seleccionarEspectaculo(){
	var formParametr = new FormData();
	formParametr.append('selectEspectaculos', true);
	formParametr.append('espectaculos', document.getElementById("espectaculo").value);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);/*
		    if(datos.length > 0){
		    	borrarSelect("artistas");
		    	borrarSelect("listaArtistas");
			     var select = document.getElementById("espectaculo");
		    	 let bandera = true;
			     for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			         var option = document.createElement('option');
			         option.text = option.value = datos[i];
			         if(bandera){
			        	 option.text="Seleccione Espectaculo";
			        	 option.value="";
			        	 option.selected= true;
			        	 option.disabled= true;
			        	 bandera =false;
			         }
			         select.add(option, i);		 
			     }
	     	}*/
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
}

function agregar() {
    let artista = document.getElementById('artistas').value;  
    let listaArtistas = document.getElementById('listaArtistas');
    if(artista!=''){
      var existe = false;
      let i = 0;
      while(listaArtistas.getElementsByTagName('li').length > i && !existe ){
    	
        if(listaArtistas.getElementsByTagName('li')[i].dataset.value==artista){
           existe = true
        }
        
        i++;
      }
        if(!existe){
          var li = document.createElement("li");
          li.innerHTML = artista;
          li.setAttribute("data-value", artista); 
         listaArtistas.appendChild(li);
        }
    }
}


function enviar(){
	var formParametr = new FormData(document.getElementById("altaFuncion"));
	var listaArtistas=[];
	
	for (var i = 0; i < document.getElementById('listaArtistas').getElementsByTagName('li').length; i++) {
		listaArtistas[i]=document.getElementById('listaArtistas').getElementsByTagName('li')[i].dataset.value;
	}	
	if(formParametr.get('Espectaculo')!=null && formParametr.get('plataformas')!=null && formParametr.get('Espectaculo')!="" && formParametr.get('plataformas')!=""){
		listaArtistas = JSON.stringify(listaArtistas) ;
		formParametr.append("listaArtistas",listaArtistas);
		formParametr.append("altaFuncion","altaFuncion");
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready

		    	if(xhttp.responseText =="Funcion dada de alta"){
		    		 document.getElementById("altaFuncion").reset();
		    		 document.getElementById('artistas').value='';
		    		 msg(xhttp.responseText,true);
		    	}else{
		    		 msg(xhttp.responseText,false);
		    	}		
		    }
		};
		xhttp.open("POST", "Funciones", true);
		xhttp.send(formParametr);
	} else if(formParametr.get('plataformas')=="" || formParametr.get('plataformas')==null) {
		 msg("Debe seleccionar una plataforma",false);
	} else{
		 msg("Debe seleccionar un espectaculo",false);
	}
	return false;
}
taerPlataformas();

function msg(msg,estado){
    if(estado){
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-success" role="alert">'+msg+'</div>';
    }else{    
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-danger" role="alert">'+msg+'</div>';
    }
    
    setTimeout(function(){   document.getElementById('msg').innerHTML =''; }, 2000);
}

function borrarSelect(elemento){
    var select = document.getElementById(elemento);
    var length = select.options.length;
    for (i = length-1; i >= 0; i--) {
      select.options[i] = null;
    }
}
</script>
<!-- FIN  CONTENIDO ALTA FUNCION ESPECTACULO -->
<%@ include file="/footer.jsp"%>

