<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %> 
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>

<!--  CONTENIDO INICIO -->

<div style="height:800px; width: 100%; background-image: url(https://i.pinimg.com/originals/f2/48/63/f24863b5225434c5f3c77627005809cf.jpg); background-size: cover; background-repeat: no-repeat; display: flex; align-itmes: flex-start; justify-content: flex-start; overflow: hidden;">
	<c:if test="${mensaje!= null}">
		<div class="alert alert-success" style="text-align: center; font-size: 32px; width: 300px; margin-right: auto;  margin-left: auto; height: 150px;"><p>${mensaje} </p></div>
	</c:if>
	<div style="font-size: 3rem; color: #EEE; margin: 300px 0 0 200px; position: fixed;">
		<p>CORONATICKETS UY</p>
	</div>
</div>

<!-- FIN  CONTENIDO INICIO -->
<%@ include file="/footer.jsp"%>