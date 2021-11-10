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
        publicadores.DtFuncion[] listaInfoFunciones13mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoFunciones(arg0_1idTemp);
if(listaInfoFunciones13mtemp == null){
%>
<%=listaInfoFunciones13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listaInfoFunciones13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listaInfoFunciones13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 18:
        gotMethod = true;
        publicadores.DtUsuario dtu18mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dtu();
if(dtu18mtemp == null){
%>
<%=dtu18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaNac:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.util.Calendar typefechaNac21 = dtu18mtemp.getFechaNac();
        java.text.DateFormat dateFormatfechaNac21 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaNac21 = typefechaNac21.getTime();
        String tempResultfechaNac21 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaNac21.format(datefechaNac21));
        %>
        <%= tempResultfechaNac21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typepassword23 = dtu18mtemp.getPassword();
        String tempResultpassword23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword23));
        %>
        <%= tempResultpassword23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typeemail25 = dtu18mtemp.getEmail();
        String tempResultemail25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail25));
        %>
        <%= tempResultemail25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typeimage27 = dtu18mtemp.getImage();
        String tempResultimage27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage27));
        %>
        <%= tempResultimage27 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellido:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typeapellido29 = dtu18mtemp.getApellido();
        String tempResultapellido29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellido29));
        %>
        <%= tempResultapellido29 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typenombre31 = dtu18mtemp.getNombre();
        String tempResultnombre31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre31));
        %>
        <%= tempResultnombre31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nickName:</TD>
<TD>
<%
if(dtu18mtemp != null){
java.lang.String typenickName33 = dtu18mtemp.getNickName();
        String tempResultnickName33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenickName33));
        %>
        <%= tempResultnickName33 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 35:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg038");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtUsuario[] seleccionaUsuario35mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.seleccionaUsuario(arg0_2idTemp);
if(seleccionaUsuario35mtemp == null){
%>
<%=seleccionaUsuario35mtemp %>
<%
}else{
        String tempreturnp36 = null;
        if(seleccionaUsuario35mtemp != null){
        java.util.List listreturnp36= java.util.Arrays.asList(seleccionaUsuario35mtemp);
        tempreturnp36 = listreturnp36.toString();
        }
        %>
        <%=tempreturnp36%>
        <%
}
break;
case 40:
        gotMethod = true;
        publicadores.DtEspectador dte40mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dte();
if(dte40mtemp == null){
%>
<%=dte40mtemp %>
<%
}else{
        if(dte40mtemp!= null){
        String tempreturnp41 = dte40mtemp.toString();
        %>
        <%=tempreturnp41%>
        <%
        }}
break;
case 43:
        gotMethod = true;
        publicadores.DtArtista dta43mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dta();
if(dta43mtemp == null){
%>
<%=dta43mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descGeneral:</TD>
<TD>
<%
if(dta43mtemp != null){
java.lang.String typedescGeneral46 = dta43mtemp.getDescGeneral();
        String tempResultdescGeneral46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescGeneral46));
        %>
        <%= tempResultdescGeneral46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">link:</TD>
<TD>
<%
if(dta43mtemp != null){
java.lang.String typelink48 = dta43mtemp.getLink();
        String tempResultlink48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelink48));
        %>
        <%= tempResultlink48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">biografia:</TD>
<TD>
<%
if(dta43mtemp != null){
java.lang.String typebiografia50 = dta43mtemp.getBiografia();
        String tempResultbiografia50 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebiografia50));
        %>
        <%= tempResultbiografia50 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 52:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg055");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtEspectaculo[] listaInfoEspectaculos52mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoEspectaculos(arg0_3idTemp);
if(listaInfoEspectaculos52mtemp == null){
%>
<%=listaInfoEspectaculos52mtemp %>
<%
}else{
        String tempreturnp53 = null;
        if(listaInfoEspectaculos52mtemp != null){
        java.util.List listreturnp53= java.util.Arrays.asList(listaInfoEspectaculos52mtemp);
        tempreturnp53 = listreturnp53.toString();
        }
        %>
        <%=tempreturnp53%>
        <%
}
break;
case 57:
        gotMethod = true;
        publicadores.DtEspectador[] listarUsuariosEspectador57mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listarUsuariosEspectador();
if(listarUsuariosEspectador57mtemp == null){
%>
<%=listarUsuariosEspectador57mtemp %>
<%
}else{
        String tempreturnp58 = null;
        if(listarUsuariosEspectador57mtemp != null){
        java.util.List listreturnp58= java.util.Arrays.asList(listarUsuariosEspectador57mtemp);
        tempreturnp58 = listreturnp58.toString();
        }
        %>
        <%=tempreturnp58%>
        <%
}
break;
case 60:
        gotMethod = true;
        publicadores.DtArtista[] listarUsuariosArtista60mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listarUsuariosArtista();
if(listarUsuariosArtista60mtemp == null){
%>
<%=listarUsuariosArtista60mtemp %>
<%
}else{
        String tempreturnp61 = null;
        if(listarUsuariosArtista60mtemp != null){
        java.util.List listreturnp61= java.util.Arrays.asList(listarUsuariosArtista60mtemp);
        tempreturnp61 = listreturnp61.toString();
        }
        %>
        <%=tempreturnp61%>
        <%
}
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