<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %> 
<%@ include file="/head.jsp"%>
<%@ include file="/navBar.jsp"%>

<!--  CONTENIDO INICIO -->


<c:if test="${mensaje!= null}">
<div class="alert alert-success" style="text-align: center; font-size: 32px; width: 300px; margin-right: auto;  margin-left: auto;"><p>${mensaje} </p></div>
</c:if>



<%
out.print(session.isNew());
/*if(null == session.getAttribute("nicknameU")){
	  out.print("no");
	}else{
		 out.print("si");
	}*/ 
	
	if (session == null)
{
  // the user *does not* have a valid session; handle this however you need to.
		out.print("no");
}
else
{
  // the user *does* have a valid session.
  // do whatever you need to for logged in users.
 String username = (String)session.getValue("USERNAME");
 out.print(username);
}
	%>


<!-- FIN  CONTENIDO INICIO -->
<%@ include file="/footer.jsp"%>

