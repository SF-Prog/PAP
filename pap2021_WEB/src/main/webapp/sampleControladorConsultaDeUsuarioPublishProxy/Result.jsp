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
        publicadores.DtEspectaculo[] listaInfoEspectaculos13mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoEspectaculos(arg0_1idTemp);
if(listaInfoEspectaculos13mtemp == null){
%>
<%=listaInfoEspectaculos13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listaInfoEspectaculos13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listaInfoEspectaculos13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 18:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg021");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtUsuario[] seleccionaUsuario18mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.seleccionaUsuario(arg0_2idTemp);
if(seleccionaUsuario18mtemp == null){
%>
<%=seleccionaUsuario18mtemp %>
<%
}else{
        String tempreturnp19 = null;
        if(seleccionaUsuario18mtemp != null){
        java.util.List listreturnp19= java.util.Arrays.asList(seleccionaUsuario18mtemp);
        tempreturnp19 = listreturnp19.toString();
        }
        %>
        <%=tempreturnp19%>
        <%
}
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
        publicadores.DtUsuario[] listarUsuariosDt26mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listarUsuariosDt();
if(listarUsuariosDt26mtemp == null){
%>
<%=listarUsuariosDt26mtemp %>
<%
}else{
        String tempreturnp27 = null;
        if(listarUsuariosDt26mtemp != null){
        java.util.List listreturnp27= java.util.Arrays.asList(listarUsuariosDt26mtemp);
        tempreturnp27 = listreturnp27.toString();
        }
        %>
        <%=tempreturnp27%>
        <%
}
break;
case 29:
        gotMethod = true;
        publicadores.DtEspectador dte29mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dte();
if(dte29mtemp == null){
%>
<%=dte29mtemp %>
<%
}else{
        if(dte29mtemp!= null){
        String tempreturnp30 = dte29mtemp.toString();
        %>
        <%=tempreturnp30%>
        <%
        }}
break;
case 32:
        gotMethod = true;
        publicadores.DtUsuario dtu32mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dtu();
if(dtu32mtemp == null){
%>
<%=dtu32mtemp %>
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
if(dtu32mtemp != null){
java.util.Calendar typefechaNac35 = dtu32mtemp.getFechaNac();
        java.text.DateFormat dateFormatfechaNac35 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaNac35 = typefechaNac35.getTime();
        String tempResultfechaNac35 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaNac35.format(datefechaNac35));
        %>
        <%= tempResultfechaNac35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typepassword37 = dtu32mtemp.getPassword();
        String tempResultpassword37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword37));
        %>
        <%= tempResultpassword37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typeemail39 = dtu32mtemp.getEmail();
        String tempResultemail39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail39));
        %>
        <%= tempResultemail39 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typeimage41 = dtu32mtemp.getImage();
        String tempResultimage41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage41));
        %>
        <%= tempResultimage41 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellido:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typeapellido43 = dtu32mtemp.getApellido();
        String tempResultapellido43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellido43));
        %>
        <%= tempResultapellido43 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typenombre45 = dtu32mtemp.getNombre();
        String tempResultnombre45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre45));
        %>
        <%= tempResultnombre45 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nickName:</TD>
<TD>
<%
if(dtu32mtemp != null){
java.lang.String typenickName47 = dtu32mtemp.getNickName();
        String tempResultnickName47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenickName47));
        %>
        <%= tempResultnickName47 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 49:
        gotMethod = true;
        publicadores.DtArtista dta49mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.dta();
if(dta49mtemp == null){
%>
<%=dta49mtemp %>
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
if(dta49mtemp != null){
java.lang.String typedescGeneral52 = dta49mtemp.getDescGeneral();
        String tempResultdescGeneral52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescGeneral52));
        %>
        <%= tempResultdescGeneral52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">link:</TD>
<TD>
<%
if(dta49mtemp != null){
java.lang.String typelink54 = dta49mtemp.getLink();
        String tempResultlink54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelink54));
        %>
        <%= tempResultlink54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">biografia:</TD>
<TD>
<%
if(dta49mtemp != null){
java.lang.String typebiografia56 = dta49mtemp.getBiografia();
        String tempResultbiografia56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebiografia56));
        %>
        <%= tempResultbiografia56 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 58:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg061");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtFuncion[] listaInfoFunciones58mtemp = sampleControladorConsultaDeUsuarioPublishProxyid.listaInfoFunciones(arg0_3idTemp);
if(listaInfoFunciones58mtemp == null){
%>
<%=listaInfoFunciones58mtemp %>
<%
}else{
        String tempreturnp59 = null;
        if(listaInfoFunciones58mtemp != null){
        java.util.List listreturnp59= java.util.Arrays.asList(listaInfoFunciones58mtemp);
        tempreturnp59 = listreturnp59.toString();
        }
        %>
        <%=tempreturnp59%>
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