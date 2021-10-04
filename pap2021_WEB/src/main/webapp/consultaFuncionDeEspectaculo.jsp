<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO CONSULTA DE FUNCION DE ESPECTACULO -->

<select name="plataformas" id="plataformas"  onchange="taerEspectaculo();detallePlataformas();">
 <!--  <option value="" disabled >Seleccione Plataforma</option> -->
  
</select>


<select name="Espectaculo" id="espectaculo" onchange="taerFunciones();detalleEspectaculo();">
 <!-- <option value="" disabled >Seleccione Eventos</option> -->
</select>
<select name="funciones" id="funciones" onchange="detalleFuncion();">
 <!--  <option value="" disabled >Seleccione funciones</option> -->
</select>


<!--<select name="paquetes" id="Paquetes">
  <option value="" disabled >Seleccione Paquetes</option>
</select>-->

<div class="row">
	 <div  class="col-md-3" id="divPlataforma"></div>
	 <div  class="col-md-3" id="divEspectaculo"></div>
	 <div  class="col-md-3" id="divFuncion"></div>
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
		xhttp.open("POST", "Espectaculo", true);
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
		xhttp.open("POST", "Espectaculo", true);
		xhttp.send(formParametr);
	}
	
	function taerFunciones(){
		var formParametr = new FormData();
		formParametr.append('getFunciones', true);
		formParametr.append('espectaculo', document.getElementById("espectaculo").value);
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos.length > 0)
		    	document.getElementById("funciones").innerHTML='';
			     var select = document.getElementById("funciones");
		    	 let bandera = true;
			     for(var i = 0 ; i  <= datos.length-1 ; i++) {
			    	 console.log(datos[i],i);
			         var option = document.createElement('option');
			         option.text = option.value = datos[i];
			         if(bandera){
			        	 option.text="Seleccione Funciones";
			        	 option.value="";
			        	 option.selected= true;
			        	 option.disabled= true;
			        	 bandera =false;
			         }
			         select.add(option, i);
			         
			         
			     }
		    }
		};
		xhttp.open("POST", "Espectaculo", true);
		xhttp.send(formParametr);
	}
	
	function detallePlataformas(){
		var formParametr = new FormData();
		formParametr.append('detallePlataforma', true);
		formParametr.append('plataforma', document.getElementById("plataformas").value);
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos)
		    	console.log(datos)
		    	document.getElementById("divPlataforma").innerHTML='<h3>'+datos.nombre+'</h3><p>'+datos.descripcion+'<br/><a href="'+datos.urlasociada+'" target="_blank">Ver mas</a></p>';
			    
		    }
		};
		xhttp.open("POST", "Espectaculo", true);
		xhttp.send(formParametr);
	
	}
	
	function detalleEspectaculo(){
		var formParametr = new FormData();
		formParametr.append('detalleEspectaculo', true);
		formParametr.append('espectaculo', document.getElementById("espectaculo").value);
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos)
		    	console.log(datos)
		    	document.getElementById("divEspectaculo").innerHTML='<h3>'+datos.nombre+'</h3><p>'+datos.descripcion+'<br/><b><em>Costo: </em></b>'+datos.costo+'<br/><b><em>Duracion: </em></b>'+datos.duracion+'<br/><b><em>Fecha de registro: </em></b>'+datos.fechaRegistro+'<br/><b><em>Maximo de espectadores: </em></b>'+datos.espectadoresMax+'<br/><b><em>Minimo de espectadores: </em></b>'+datos.espectadoresMin+'</p>';
			    
		    }
		};
		xhttp.open("POST", "Espectaculo", true);
		xhttp.send(formParametr);
	
	}
	
	function detalleFuncion(){
		var formParametr = new FormData();
		formParametr.append('detalleFuncion', true);
		formParametr.append('funcion', document.getElementById("funciones").value);
		var xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		       // Typical action to be performed when the document is ready:
		    let datos = JSON.parse(xhttp.response); 	
		    console.log(datos.length);
		    if(datos)
		    	console.log(datos)
		    	document.getElementById("divFuncion").innerHTML='<h3>'+datos.nombre+'</h3><p><b><em>Fecha: </em></b>'+datos.fecha+'<br/><b><em>Hora inicio: </em></b>'+datos.horaInicio+'</p>';
			    
		    }
		};
		xhttp.open("POST", "Espectaculo", true);
		xhttp.send(formParametr);
	
	}
	taerPlataformas();
</script>
<!-- FIN  CONTENIDO CONSULTA DE FUNCION DE ESPECTACULO  -->
<%@ include file="/footer.jsp"%>

