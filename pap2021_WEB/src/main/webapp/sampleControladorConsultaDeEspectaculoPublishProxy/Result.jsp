<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleControladorConsultaDeEspectaculoPublishProxyid" scope="session" class="publicadores.ControladorConsultaDeEspectaculoPublishProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleControladorConsultaDeEspectaculoPublishProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.getEndpoint();
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
        sampleControladorConsultaDeEspectaculoPublishProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        publicadores.ControladorConsultaDeEspectaculoPublish getControladorConsultaDeEspectaculoPublish10mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.getControladorConsultaDeEspectaculoPublish();
if(getControladorConsultaDeEspectaculoPublish10mtemp == null){
%>
<%=getControladorConsultaDeEspectaculoPublish10mtemp %>
<%
}else{
        if(getControladorConsultaDeEspectaculoPublish10mtemp!= null){
        String tempreturnp11 = getControladorConsultaDeEspectaculoPublish10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String[] listarArtistasInvitados13mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarArtistasInvitados();
if(listarArtistasInvitados13mtemp == null){
%>
<%=listarArtistasInvitados13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarArtistasInvitados13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarArtistasInvitados13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        publicadores.ArrayList listarPaquetes16mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetes();
if(listarPaquetes16mtemp == null){
%>
<%=listarPaquetes16mtemp %>
<%
}else{
        if(listarPaquetes16mtemp!= null){
        String tempreturnp17 = listarPaquetes16mtemp.toString();
        %>
        <%=tempreturnp17%>
        <%
        }}
break;
case 19:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg028");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtPaquete seleccionaPaquete19mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPaquete(arg0_1idTemp);
if(seleccionaPaquete19mtemp == null){
%>
<%=seleccionaPaquete19mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descuento:</TD>
<TD>
<%
if(seleccionaPaquete19mtemp != null){
%>
<%=seleccionaPaquete19mtemp.getDescuento()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPaquete19mtemp != null){
java.lang.String typedescripcion24 = seleccionaPaquete19mtemp.getDescripcion();
        String tempResultdescripcion24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion24));
        %>
        <%= tempResultdescripcion24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPaquete19mtemp != null){
java.lang.String typenombre26 = seleccionaPaquete19mtemp.getNombre();
        String tempResultnombre26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre26));
        %>
        <%= tempResultnombre26 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 30:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg043");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtFuncion seleccionaFuncion30mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaFuncion(arg0_2idTemp);
if(seleccionaFuncion30mtemp == null){
%>
<%=seleccionaFuncion30mtemp %>
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
if(seleccionaFuncion30mtemp != null){
java.util.Calendar typefechaRegistro33 = seleccionaFuncion30mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro33 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro33 = typefechaRegistro33.getTime();
        String tempResultfechaRegistro33 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro33.format(datefechaRegistro33));
        %>
        <%= tempResultfechaRegistro33 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fecha:</TD>
<TD>
<%
if(seleccionaFuncion30mtemp != null){
java.util.Calendar typefecha35 = seleccionaFuncion30mtemp.getFecha();
        java.text.DateFormat dateFormatfecha35 = java.text.DateFormat.getDateInstance();
        java.util.Date datefecha35 = typefecha35.getTime();
        String tempResultfecha35 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfecha35.format(datefecha35));
        %>
        <%= tempResultfecha35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">horaInicio:</TD>
<TD>
<%
if(seleccionaFuncion30mtemp != null){
java.lang.String typehoraInicio37 = seleccionaFuncion30mtemp.getHoraInicio();
        String tempResulthoraInicio37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehoraInicio37));
        %>
        <%= tempResulthoraInicio37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaFuncion30mtemp != null){
java.lang.String typeimage39 = seleccionaFuncion30mtemp.getImage();
        String tempResultimage39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage39));
        %>
        <%= tempResultimage39 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaFuncion30mtemp != null){
java.lang.String typenombre41 = seleccionaFuncion30mtemp.getNombre();
        String tempResultnombre41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre41));
        %>
        <%= tempResultnombre41 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 45:
        gotMethod = true;
        publicadores.ArrayList listarEspectaculos45mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculos();
if(listarEspectaculos45mtemp == null){
%>
<%=listarEspectaculos45mtemp %>
<%
}else{
        if(listarEspectaculos45mtemp!= null){
        String tempreturnp46 = listarEspectaculos45mtemp.toString();
        %>
        <%=tempreturnp46%>
        <%
        }}
break;
case 48:
        gotMethod = true;
        publicadores.ArrayList listarFunciones48mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFunciones();
if(listarFunciones48mtemp == null){
%>
<%=listarFunciones48mtemp %>
<%
}else{
        if(listarFunciones48mtemp!= null){
        String tempreturnp49 = listarFunciones48mtemp.toString();
        %>
        <%=tempreturnp49%>
        <%
        }}
break;
case 51:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg070");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtPlataforma seleccionaPlataforma51mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPlataforma(arg0_3idTemp);
if(seleccionaPlataforma51mtemp == null){
%>
<%=seleccionaPlataforma51mtemp %>
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
if(seleccionaPlataforma51mtemp != null){
java.lang.String typeespectadoresMax54 = seleccionaPlataforma51mtemp.getEspectadoresMax();
        String tempResultespectadoresMax54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMax54));
        %>
        <%= tempResultespectadoresMax54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaAlta:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
java.lang.String typefechaAlta56 = seleccionaPlataforma51mtemp.getFechaAlta();
        String tempResultfechaAlta56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefechaAlta56));
        %>
        <%= tempResultfechaAlta56 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
%>
<%=seleccionaPlataforma51mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
java.lang.String typedescripcion60 = seleccionaPlataforma51mtemp.getDescripcion();
        String tempResultdescripcion60 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion60));
        %>
        <%= tempResultdescripcion60 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
java.lang.String typeespectadoresMin62 = seleccionaPlataforma51mtemp.getEspectadoresMin();
        String tempResultespectadoresMin62 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMin62));
        %>
        <%= tempResultespectadoresMin62 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
%>
<%=seleccionaPlataforma51mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uRLAsociada:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
java.lang.String typeuRLAsociada66 = seleccionaPlataforma51mtemp.getURLAsociada();
        String tempResultuRLAsociada66 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuRLAsociada66));
        %>
        <%= tempResultuRLAsociada66 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPlataforma51mtemp != null){
java.lang.String typenombre68 = seleccionaPlataforma51mtemp.getNombre();
        String tempResultnombre68 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre68));
        %>
        <%= tempResultnombre68 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 72:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg095");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtEspectaculo seleccionaEspectaculo72mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaEspectaculo(arg0_4idTemp);
if(seleccionaEspectaculo72mtemp == null){
%>
<%=seleccionaEspectaculo72mtemp %>
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
if(seleccionaEspectaculo72mtemp != null){
%>
<%=seleccionaEspectaculo72mtemp.getEspectadoresMax()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
%>
<%=seleccionaEspectaculo72mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.lang.String typeimage79 = seleccionaEspectaculo72mtemp.getImage();
        String tempResultimage79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage79));
        %>
        <%= tempResultimage79 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.lang.String typedescripcion81 = seleccionaEspectaculo72mtemp.getDescripcion();
        String tempResultdescripcion81 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion81));
        %>
        <%= tempResultdescripcion81 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">artista:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.lang.String typeartista83 = seleccionaEspectaculo72mtemp.getArtista();
        String tempResultartista83 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeartista83));
        %>
        <%= tempResultartista83 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.util.Calendar typefechaRegistro85 = seleccionaEspectaculo72mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro85 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro85 = typefechaRegistro85.getTime();
        String tempResultfechaRegistro85 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro85.format(datefechaRegistro85));
        %>
        <%= tempResultfechaRegistro85 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
%>
<%=seleccionaEspectaculo72mtemp.getEspectadoresMin()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">urlAsociada:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.lang.String typeurlAsociada89 = seleccionaEspectaculo72mtemp.getUrlAsociada();
        String tempResulturlAsociada89 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurlAsociada89));
        %>
        <%= tempResulturlAsociada89 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
%>
<%=seleccionaEspectaculo72mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaEspectaculo72mtemp != null){
java.lang.String typenombre93 = seleccionaEspectaculo72mtemp.getNombre();
        String tempResultnombre93 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre93));
        %>
        <%= tempResultnombre93 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 97:
        gotMethod = true;
        publicadores.ArrayList listarPlataformas97mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformas();
if(listarPlataformas97mtemp == null){
%>
<%=listarPlataformas97mtemp %>
<%
}else{
        if(listarPlataformas97mtemp!= null){
        String tempreturnp98 = listarPlataformas97mtemp.toString();
        %>
        <%=tempreturnp98%>
        <%
        }}
break;
case 100:
        gotMethod = true;
        java.lang.String[] listarPlataformasComboBox100mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformasComboBox();
if(listarPlataformasComboBox100mtemp == null){
%>
<%=listarPlataformasComboBox100mtemp %>
<%
}else{
        String tempreturnp101 = null;
        if(listarPlataformasComboBox100mtemp != null){
        java.util.List listreturnp101= java.util.Arrays.asList(listarPlataformasComboBox100mtemp);
        tempreturnp101 = listreturnp101.toString();
        }
        %>
        <%=tempreturnp101%>
        <%
}
break;
case 103:
        gotMethod = true;
        java.lang.String[] listarEspectaculosComboBox103mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculosComboBox();
if(listarEspectaculosComboBox103mtemp == null){
%>
<%=listarEspectaculosComboBox103mtemp %>
<%
}else{
        String tempreturnp104 = null;
        if(listarEspectaculosComboBox103mtemp != null){
        java.util.List listreturnp104= java.util.Arrays.asList(listarEspectaculosComboBox103mtemp);
        tempreturnp104 = listreturnp104.toString();
        }
        %>
        <%=tempreturnp104%>
        <%
}
break;
case 106:
        gotMethod = true;
        java.lang.String[] listarPaquetesComboBox106mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetesComboBox();
if(listarPaquetesComboBox106mtemp == null){
%>
<%=listarPaquetesComboBox106mtemp %>
<%
}else{
        String tempreturnp107 = null;
        if(listarPaquetesComboBox106mtemp != null){
        java.util.List listreturnp107= java.util.Arrays.asList(listarPaquetesComboBox106mtemp);
        tempreturnp107 = listreturnp107.toString();
        }
        %>
        <%=tempreturnp107%>
        <%
}
break;
case 109:
        gotMethod = true;
        java.lang.String[] listarFuncionesComboBox109mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFuncionesComboBox();
if(listarFuncionesComboBox109mtemp == null){
%>
<%=listarFuncionesComboBox109mtemp %>
<%
}else{
        String tempreturnp110 = null;
        if(listarFuncionesComboBox109mtemp != null){
        java.util.List listreturnp110= java.util.Arrays.asList(listarFuncionesComboBox109mtemp);
        tempreturnp110 = listreturnp110.toString();
        }
        %>
        <%=tempreturnp110%>
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