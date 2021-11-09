<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid" scope="session" class="publicadores.ControladorConsultaDeFuncionDeEspectaculoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.getEndpoint();
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
        sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaDeFuncionDeEspectaculoPublish getControladorConsultaDeFuncionDeEspectaculoPublish10mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.getControladorConsultaDeFuncionDeEspectaculoPublish();
if(getControladorConsultaDeFuncionDeEspectaculoPublish10mtemp == null){
%>
<%=getControladorConsultaDeFuncionDeEspectaculoPublish10mtemp %>
<%
}else{
        if(getControladorConsultaDeFuncionDeEspectaculoPublish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaDeFuncionDeEspectaculoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg026");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtFuncion seleccionaFuncion13mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.seleccionaFuncion(arg0_1idTemp);
if(seleccionaFuncion13mtemp == null){
%>
<%=seleccionaFuncion13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaFuncion13mtemp != null){
java.util.Calendar typefechaRegistro16 = seleccionaFuncion13mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro16 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro16 = typefechaRegistro16.getTime();
        String tempResultfechaRegistro16 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro16.format(datefechaRegistro16));
        %>
        <%= tempResultfechaRegistro16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fecha:</TD>
<TD>
<%
if(seleccionaFuncion13mtemp != null){
java.util.Calendar typefecha18 = seleccionaFuncion13mtemp.getFecha();
        java.text.DateFormat dateFormatfecha18 = java.text.DateFormat.getDateInstance();
        java.util.Date datefecha18 = typefecha18.getTime();
        String tempResultfecha18 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfecha18.format(datefecha18));
        %>
        <%= tempResultfecha18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">horaInicio:</TD>
<TD>
<%
if(seleccionaFuncion13mtemp != null){
java.lang.String typehoraInicio20 = seleccionaFuncion13mtemp.getHoraInicio();
        String tempResulthoraInicio20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehoraInicio20));
        %>
        <%= tempResulthoraInicio20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaFuncion13mtemp != null){
java.lang.String typeimage22 = seleccionaFuncion13mtemp.getImage();
        String tempResultimage22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage22));
        %>
        <%= tempResultimage22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaFuncion13mtemp != null){
java.lang.String typenombre24 = seleccionaFuncion13mtemp.getNombre();
        String tempResultnombre24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre24));
        %>
        <%= tempResultnombre24 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        publicadores.ArrayList listarEspectaculos28mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarEspectaculos();
if(listarEspectaculos28mtemp == null){
%>
<%=listarEspectaculos28mtemp %>
<%
}else{
        if(listarEspectaculos28mtemp!= null){
        String tempreturnp29 = listarEspectaculos28mtemp.toString();
        %>
        <%=tempreturnp29%>
        <%
        }}
break;
case 31:
        gotMethod = true;
        publicadores.ArrayList listarFunciones31mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarFunciones();
if(listarFunciones31mtemp == null){
%>
<%=listarFunciones31mtemp %>
<%
}else{
        if(listarFunciones31mtemp!= null){
        String tempreturnp32 = listarFunciones31mtemp.toString();
        %>
        <%=tempreturnp32%>
        <%
        }}
break;
case 34:
        gotMethod = true;
        java.lang.String[] listarPlataformasComboBox34mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarPlataformasComboBox();
if(listarPlataformasComboBox34mtemp == null){
%>
<%=listarPlataformasComboBox34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(listarPlataformasComboBox34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(listarPlataformasComboBox34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
case 37:
        gotMethod = true;
        java.lang.String[] listarEspectaculosComboBox37mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarEspectaculosComboBox();
if(listarEspectaculosComboBox37mtemp == null){
%>
<%=listarEspectaculosComboBox37mtemp %>
<%
}else{
        String tempreturnp38 = null;
        if(listarEspectaculosComboBox37mtemp != null){
        java.util.List listreturnp38= java.util.Arrays.asList(listarEspectaculosComboBox37mtemp);
        tempreturnp38 = listreturnp38.toString();
        }
        %>
        <%=tempreturnp38%>
        <%
}
break;
case 40:
        gotMethod = true;
        java.lang.String[] listarFuncionesComboBox40mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarFuncionesComboBox();
if(listarFuncionesComboBox40mtemp == null){
%>
<%=listarFuncionesComboBox40mtemp %>
<%
}else{
        String tempreturnp41 = null;
        if(listarFuncionesComboBox40mtemp != null){
        java.util.List listreturnp41= java.util.Arrays.asList(listarFuncionesComboBox40mtemp);
        tempreturnp41 = listreturnp41.toString();
        }
        %>
        <%=tempreturnp41%>
        <%
}
break;
case 43:
        gotMethod = true;
        publicadores.ArrayList listarPlataformas43mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarPlataformas();
if(listarPlataformas43mtemp == null){
%>
<%=listarPlataformas43mtemp %>
<%
}else{
        if(listarPlataformas43mtemp!= null){
        String tempreturnp44 = listarPlataformas43mtemp.toString();
        %>
        <%=tempreturnp44%>
        <%
        }}
break;
case 46:
        gotMethod = true;
        java.lang.String[] listarArtistasInvitados46mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.listarArtistasInvitados();
if(listarArtistasInvitados46mtemp == null){
%>
<%=listarArtistasInvitados46mtemp %>
<%
}else{
        String tempreturnp47 = null;
        if(listarArtistasInvitados46mtemp != null){
        java.util.List listreturnp47= java.util.Arrays.asList(listarArtistasInvitados46mtemp);
        tempreturnp47 = listreturnp47.toString();
        }
        %>
        <%=tempreturnp47%>
        <%
}
break;
case 49:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg068");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtPlataforma seleccionaPlataforma49mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.seleccionaPlataforma(arg0_2idTemp);
if(seleccionaPlataforma49mtemp == null){
%>
<%=seleccionaPlataforma49mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMax:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typeespectadoresMax52 = seleccionaPlataforma49mtemp.getEspectadoresMax();
        String tempResultespectadoresMax52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMax52));
        %>
        <%= tempResultespectadoresMax52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaAlta:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typefechaAlta54 = seleccionaPlataforma49mtemp.getFechaAlta();
        String tempResultfechaAlta54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefechaAlta54));
        %>
        <%= tempResultfechaAlta54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
%>
<%=seleccionaPlataforma49mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typedescripcion58 = seleccionaPlataforma49mtemp.getDescripcion();
        String tempResultdescripcion58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion58));
        %>
        <%= tempResultdescripcion58 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typeespectadoresMin60 = seleccionaPlataforma49mtemp.getEspectadoresMin();
        String tempResultespectadoresMin60 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMin60));
        %>
        <%= tempResultespectadoresMin60 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
%>
<%=seleccionaPlataforma49mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uRLAsociada:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typeuRLAsociada64 = seleccionaPlataforma49mtemp.getURLAsociada();
        String tempResultuRLAsociada64 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuRLAsociada64));
        %>
        <%= tempResultuRLAsociada64 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPlataforma49mtemp != null){
java.lang.String typenombre66 = seleccionaPlataforma49mtemp.getNombre();
        String tempResultnombre66 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre66));
        %>
        <%= tempResultnombre66 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 70:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg093");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtEspectaculo seleccionaEspectaculo70mtemp = sampleControladorConsultaDeFuncionDeEspectaculoPublishProxyid.seleccionaEspectaculo(arg0_3idTemp);
if(seleccionaEspectaculo70mtemp == null){
%>
<%=seleccionaEspectaculo70mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMax:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
%>
<%=seleccionaEspectaculo70mtemp.getEspectadoresMax()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
%>
<%=seleccionaEspectaculo70mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.lang.String typeimage77 = seleccionaEspectaculo70mtemp.getImage();
        String tempResultimage77 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage77));
        %>
        <%= tempResultimage77 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.lang.String typedescripcion79 = seleccionaEspectaculo70mtemp.getDescripcion();
        String tempResultdescripcion79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion79));
        %>
        <%= tempResultdescripcion79 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">artista:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.lang.String typeartista81 = seleccionaEspectaculo70mtemp.getArtista();
        String tempResultartista81 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeartista81));
        %>
        <%= tempResultartista81 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.util.Calendar typefechaRegistro83 = seleccionaEspectaculo70mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro83 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro83 = typefechaRegistro83.getTime();
        String tempResultfechaRegistro83 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro83.format(datefechaRegistro83));
        %>
        <%= tempResultfechaRegistro83 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
%>
<%=seleccionaEspectaculo70mtemp.getEspectadoresMin()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">urlAsociada:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.lang.String typeurlAsociada87 = seleccionaEspectaculo70mtemp.getUrlAsociada();
        String tempResulturlAsociada87 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurlAsociada87));
        %>
        <%= tempResulturlAsociada87 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
%>
<%=seleccionaEspectaculo70mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaEspectaculo70mtemp != null){
java.lang.String typenombre91 = seleccionaEspectaculo70mtemp.getNombre();
        String tempResultnombre91 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre91));
        %>
        <%= tempResultnombre91 %>
        <%
}%>
</TD>
</TABLE>
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