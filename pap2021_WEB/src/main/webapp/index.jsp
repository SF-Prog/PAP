<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %> 
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>

<!--  CONTENIDO INICIO -->


<c:if test="${mensaje!= null}">
<div class="alert alert-success" style="text-align: center; font-size: 32px; width: 300px; margin-right: auto;  margin-left: auto;"><p>${mensaje} </p></div>
</c:if>



<%

if (session == null){
		out.print("no");
}else{

 String username = (String)session.getValue("uNickName");
 out.print(username);
}%>


<!-- FIN  CONTENIDO INICIO -->
<%@ include file="/footer.jsp"%>

