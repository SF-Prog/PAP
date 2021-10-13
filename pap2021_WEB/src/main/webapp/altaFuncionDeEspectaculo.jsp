
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO ALTA FUNCION ESPECTACULO -->

<div id="seccionFormulario">
	
	<form onsubmit="return enviar();" id="altaFuncion" name="altaFuncion" style="margin-left: 40px;">
	
		<div class="row"> 
			<div class="col-md-5">
				<select name="plataformas" id="plataformas"  onchange="seleccionarPlataforma();taerEspectaculo();">
				 <!--  <option value="" disabled >Seleccione Plataforma</option> -->
				</select>
			</div>
			<div class="col-md-5">
				<select name="Espectaculo" id="espectaculo" onchange="seleccionarEspectaculo();taerArtistas();">
				 <!-- <option value="" disabled >Seleccione Eventos</option> -->
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Nombre:</label> 
				<input class="form-control" type="text" name="Nombre" placeholder="Ingrese su nickname" required /><br/>
			</div>
			<div class="col-md-5">
			
	         	<label class="form-label">Fecha de Inicio:</label> 
	            <input  class="form-control" type="date" name="fechaAlta" id="birthday" name="birthday">
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<label class="form-label">Hora:</label> 
				<input class="form-control" type="time" name="horaInicio" required /><br/>
			</div>
			<div class="col-md-5">
			
	         	<label class="form-label">Fecha de alta:</label> 
	            <input  class="form-control" type="date" name="fechaInicio" id="birthday" name="birthday">
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<select name="Artistas" id="artistas" >
				 <!-- <option value="" disabled >Seleccione Eventos</option> -->
				</select>
			</div>
			<div class="col-md-2">
				<a  class="btn btn-primary col-md-2" onclick="agregar();" style="width:100%"> Agregar </a>
			</div>
			<div class="col-md-5">
				<ul id="listaArtistas">
				  <li ><data value="21053">Cherry Tomato</data></li>
				
				</ul>
			</div>
			<input  class="form-control" type="date" name="fecchaU" id="birthday" name="birthday">
		</div>
		
		<div class="row" style="margin:40px 0 0 30px">
			<input type="submit" name="btnEnvio" value="Ingresar Usuario" class="btn btn-primary col-md-2">		
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
	    if(datos.length > 0)
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
	    if(datos.length > 0)
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
	    if(datos.length > 0)
	    	document.getElementById("artistas").innerHTML='';
		     var select = document.getElementById("artistas");
	    	 let bandera = true;
		     for(var i = 0 ; i  <= datos.length-1 ; i++) {
		    	 console.log(datos[i],i);
		         var option = document.createElement('option');
		         option.text = option.value = datos[i];
		         if(bandera){
		        	 option.text="Seleccione Artistas";
		        	 option.value="";
		        	 option.selected= true;
		        	 option.disabled= true;
		        	 bandera =false;
		         }
		         select.add(option, i);
		         
		         
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
	    if(datos.length > 0)
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
	    console.log(datos.length);
	    if(datos.length > 0)
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
	

	listaArtistas = JSON.stringify(listaArtistas) ;
	formParametr.append("listaArtistas",listaArtistas);
	formParametr.append("altaFuncion",altaFuncion);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp);
	    }
	};
	xhttp.open("POST", "Funciones", true);
	xhttp.send(formParametr);
	return false;
}
taerPlataformas();
</script>
<!-- FIN  CONTENIDO ALTA FUNCION ESPECTACULO -->
<%@ include file="/footer.jsp"%>

