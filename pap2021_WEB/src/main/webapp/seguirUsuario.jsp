
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<!--  CONTENIDO SEGUIR USUARIO -->
<!-- <ul id="listaUsuarios"></ul> -->
<ul class="list-group" id="listaUsuarios">

</ul>
<script>

function traerUsuarios() {
	 var respuesta = null;
	var formParametr = new FormData();
	formParametr.append("traerUsuarios","traerUsuarios");
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     //console.log(xhttp.responseText);
	      respuesta =JSON.parse(xhttp.responseText);
	      let listaArtistas = document.getElementById('listaUsuarios');
	      
	      if(respuesta != null){
	      	for (var usuario in respuesta) {
	      		  if (respuesta.hasOwnProperty(usuario)) {
				
	      			  var li  = document.createElement("li");
	      			  
	      			  let contenido = '<p>nickName '+respuesta[usuario].nickName+' nombre '+respuesta[usuario].nombre+'apellido '+respuesta[usuario].apellido+'email '+respuesta[usuario].email+'</p><span class="badge badge-primary badge-pill"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"/><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"/></svg></span>';
	      				contenido += ' <button type="button"  onlclick="seguirUsuario("'+respuesta[usuario].nickName+'")" class="btn btn-primary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"></path><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"></path></svg>Seguir</button><button type="button"  onlclick="dejarSeguir("'+respuesta[usuario].nickName+'")" class="btn btn-success"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"></path><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"></path></svg>Dejar Seguir</button>';
	      			  li.innerHTML =contenido ;
	      	          li.setAttribute("data-value", respuesta[usuario].nombre); 

	      	        li.setAttribute("class", "list-group-item d-flex justify-content-between align-items-center");
	      	         listaArtistas.appendChild(li);

	      		  }
	      		}
	      }
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}

function seguirUsuario(nickName){
	var formParametr = new FormData();
	formParametr.append("traerUsuarios","traerUsuarios");
	formParametr.append("nickName",nickName);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp.responseText);
	      
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}

function dejarSeguir(nickName){
	var formParametr = new FormData();
	formParametr.append("dejarSeguir","dejarSeguir");
	formParametr.append("nickName",nickName);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp.responseText);
	      
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}
traerUsuarios();
</script>
<!-- FIN  CONTENIDO SEGUIR USUARIO -->
<%@ include file="/footer.jsp"%>

