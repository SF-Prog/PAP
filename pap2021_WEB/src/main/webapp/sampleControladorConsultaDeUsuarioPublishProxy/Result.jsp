<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaDeUsuarioPublishProxyid" scope="session" class="publicadores.ControladorConsultaDeUsuarioPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaDeUsuarioPublishProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleControladorConsultaDeUsuarioPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaDeUsuarioPublish getControladorConsultaDeUsuarioPublish10mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.getControladorConsultaDeUsuarioPublish();
if(getControladorConsultaDeUsuarioPublish10mtemp == null){
%>
<%=getControladorConsultaDeUsuarioPublish10mtemp %>
<%
}else{
        if(getControladorConsultaDeUsuarioPublish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaDeUsuarioPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg016");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.ArrayList seleccionaUsuario13mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.seleccionaUsuario(arg0_1idTemp);
if(seleccionaUsuario13mtemp == null){
%>
<%=seleccionaUsuario13mtemp %>
<%
}else{
        if(seleccionaUsuario13mtemp!= null){
        String tempreturnp14 = seleccionaUsuario13mtemp.toString();
        %>
        <%=tempreturnp14%>
        <%
        }}
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.ArrayList listaInfoFunciones18mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoFunciones(arg0_2idTemp);
if(listaInfoFunciones18mtemp == null){
%>
<%=listaInfoFunciones18mtemp %>
<%
}else{
        if(listaInfoFunciones18mtemp!= null){
        String tempreturnp19 = listaInfoFunciones18mtemp.toString();
        %>
        <%=tempreturnp19%>
        <%
        }}
break;
case 23:
        gotMethod = true;
        publicadores.ArrayList listarUsuarios23mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listarUsuarios();
if(listarUsuarios23mtemp == null){
%>
<%=listarUsuarios23mtemp %>
<%
}else{
        if(listarUsuarios23mtemp!= null){
        String tempreturnp24 = listarUsuarios23mtemp.toString();
        %>
        <%=tempreturnp24%>
        <%
        }}
break;
case 26:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg029");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.ArrayList listaInfoEspectaculos26mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoEspectaculos(arg0_3idTemp);
if(listaInfoEspectaculos26mtemp == null){
%>
<%=listaInfoEspectaculos26mtemp %>
<%
}else{
        if(listaInfoEspectaculos26mtemp!= null){
        String tempreturnp27 = listaInfoEspectaculos26mtemp.toString();
        %>
        <%=tempreturnp27%>
        <%
        }}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>