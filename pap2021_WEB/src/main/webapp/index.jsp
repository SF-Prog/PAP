<%@ page isELIgnored ="false" %> 
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>

<!--  CONTENIDO INICIO -->
<div class="alert alert-success" style="text-align: center; font-size: 32px; width: 300px; margin-right: auto;  margin-left: auto;"><p>${mensaje}</p></div>

<c:if test="${mensaje!= null}">
123
</c:if>


<c:if test="${mensaje == null}">
456
</c:if>


<c:if test="${!empty mensaje}">
789
</c:if>


<c:if test="${empty mensaje}">
asdas
</c:if>

<!-- FIN  CONTENIDO INICIO -->
<%@ include file="/footer.jsp"%>

