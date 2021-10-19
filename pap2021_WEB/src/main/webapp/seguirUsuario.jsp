<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>
<style>
.tags {
	font-weight: 600;
}
</style>

<!--  CONTENIDO SEGUIR USUARIO -->
<!-- <ul id="listaUsuarios"></ul> -->
<div class="row">
	<div class="col-sm-12  col-md-offset-3 col-md-6">
		<ul class="list-group" id="listaUsuarios">
		</ul>
	</div>
</div>

<div id="msg">
	
</div>
<script>

function traerUsuarios() {
	<%if (session != null){
		String username = (String)session.getValue("uNickName");
		 out.print("var miSesion ='"+username+"'");

	}else{
		out.print("var miSesion =''");
	}%>
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
					if(miSesion != respuesta[usuario].nickName ){
						
	      			  var li  = document.createElement("li");
	      			  
	      			  let contenido = '<p><span class="tags">NickName:</span> '+respuesta[usuario].nickName+' <br> <span class="tags">Nombre:</span> '+respuesta[usuario].nombre+' <br><span class="tags">Apellido</span> '+respuesta[usuario].apellido+'<br> <span class="tags">Email:</span> '+respuesta[usuario].email+'</p><span class="badge badge-primary badge-pill"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"/><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"/></svg></span>';
	      				contenido += ' <button type="button" name="btnSe'+respuesta[usuario].nickName+'"    onclick="seguirUsuario(\''+respuesta[usuario].nickName+'\')" class="btn btn-primary"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"></path><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"></path></svg>Seguir</button><button type="button" name="btnDj'+respuesta[usuario].nickName+'"  onclick="dejarSeguir(\''+respuesta[usuario].nickName+'\')" style="display : none;" class="btn btn-success"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bookmark-heart" viewBox="0 0 16 16"><path fill-rule="evenodd" d="M8 4.41c1.387-1.425 4.854 1.07 0 4.277C3.146 5.48 6.613 2.986 8 4.412z"></path><path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v13.5a.5.5 0 0 1-.777.416L8 13.101l-5.223 2.815A.5.5 0 0 1 2 15.5V2zm2-1a1 1 0 0 0-1 1v12.566l4.723-2.482a.5.5 0 0 1 .554 0L13 14.566V2a1 1 0 0 0-1-1H4z"></path></svg>Dejar Seguir</button>';
	      			  li.innerHTML =contenido ;
	      	          li.setAttribute("data-value", respuesta[usuario].nombre); 

	      	          li.setAttribute("class", "list-group-item d-flex justify-content-between align-items-center");
	      	          listaArtistas.appendChild(li);
					}
	      		  }
	      		}
	      	traerFavoritos();
	      }
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}

function seguirUsuario(nickName){
	<%if (session != null){
		String username = (String)session.getValue("uNickName");
		 out.print("var miSesion ='"+username+"'");

	}%>


	var formParametr = new FormData();
	formParametr.append("seguirUsuario","seguirUsuario");
	formParametr.append("nickNameSeguido",nickName);
	formParametr.append("nickNameSeguidor",miSesion);

	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp.responseText);
	    	if(xhttp.responseText == 'Usuario seguido correctamente'){
	    		document.getElementsByName('btnSe'+nickName)[0].style.display = 'none';
	    		document.getElementsByName('btnDj'+nickName)[0].style.display = '';
	    		msg(xhttp.responseText,true);
	    	}else{
	    		msg(xhttp.responseText,false);
	    	}
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}

function dejarSeguir(nickName){
	<%if (session != null){
		String username = (String)session.getValue("uNickName");
		 out.print("var miSesion ='"+username+"'");

	}%>
	var formParametr = new FormData();
	formParametr.append("dejarSeguir","dejarSeguir");
	formParametr.append("nickNameSeguido",nickName);
	formParametr.append("nickNameSeguidor",miSesion);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	     console.log(xhttp.responseText);
	     if(xhttp.responseText == 'Usuario dejado de seguir correctamente'){
	    		document.getElementsByName('btnSe'+nickName)[0].style.display = '';
	    		document.getElementsByName('btnDj'+nickName)[0].style.display = 'none';
	    		msg(xhttp.responseText,true);
	    	}else{
	    		msg(xhttp.responseText,false);
	    	}
	    }
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);
    return false;
}

function traerFavoritos(){
	<%if (session != null){
		String username = (String)session.getValue("uNickName");
		 out.print("var miSesion ='"+username+"'");
	}%>
	
	var formParametr = new FormData();
	formParametr.append("listarSeguidores","listarSeguidores");
	formParametr.append("nickNameSeguidor",miSesion);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:    	
	     let res = JSON.parse(xhttp.responseText);
	    
		    if(res.length >0){
		    	for(let i =0 ; i<=res.length-1 ; i++){
		    		console.log(i+'-'+res[i]);
		    		document.getElementsByName('btnSe'+res[i])[0].style.display = 'none';
		    		document.getElementsByName('btnDj'+res[i])[0].style.display = '';
		    	}
		    }
	    }
	   
	};
	xhttp.open("POST", "Usuario", true);
	xhttp.send(formParametr);

}

function msg(msg,estado){
    if(estado){
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-success" role="alert">'+msg+'</div>';
    }else{    
        document.getElementById('msg').innerHTML ='<div class="col-sm-12  col-md-offset-3 col-md-6 alert alert-danger" role="alert">'+msg+'</div>';
    }
    
    setTimeout(function(){   document.getElementById('msg').innerHTML =''; }, 2000);
}
traerUsuarios();

</script>
<!-- FIN  CONTENIDO SEGUIR USUARIO -->
<%@ include file="/footer.jsp"%>

