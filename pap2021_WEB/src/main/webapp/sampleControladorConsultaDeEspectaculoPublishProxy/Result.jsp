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
        java.lang.String[] listarPlataformasComboBox13mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformasComboBox();
if(listarPlataformasComboBox13mtemp == null){
%>
<%=listarPlataformasComboBox13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarPlataformasComboBox13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarPlataformasComboBox13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String[] listarEspectaculosComboBox16mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculosComboBox();
if(listarEspectaculosComboBox16mtemp == null){
%>
<%=listarEspectaculosComboBox16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarEspectaculosComboBox16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarEspectaculosComboBox16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
case 19:
        gotMethod = true;
        java.lang.String[] listarPaquetesComboBox19mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetesComboBox();
if(listarPaquetesComboBox19mtemp == null){
%>
<%=listarPaquetesComboBox19mtemp %>
<%
}else{
        String tempreturnp20 = null;
        if(listarPaquetesComboBox19mtemp != null){
        java.util.List listreturnp20= java.util.Arrays.asList(listarPaquetesComboBox19mtemp);
        tempreturnp20 = listreturnp20.toString();
        }
        %>
        <%=tempreturnp20%>
        <%
}
break;
case 22:
        gotMethod = true;
        java.lang.String[] listarFuncionesComboBox22mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFuncionesComboBox();
if(listarFuncionesComboBox22mtemp == null){
%>
<%=listarFuncionesComboBox22mtemp %>
<%
}else{
        String tempreturnp23 = null;
        if(listarFuncionesComboBox22mtemp != null){
        java.util.List listreturnp23= java.util.Arrays.asList(listarFuncionesComboBox22mtemp);
        tempreturnp23 = listreturnp23.toString();
        }
        %>
        <%=tempreturnp23%>
        <%
}
break;
case 25:
        gotMethod = true;
        publicadores.DtPlataforma[] listarPlataformas25mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformas();
if(listarPlataformas25mtemp == null){
%>
<%=listarPlataformas25mtemp %>
<%
}else{
        String tempreturnp26 = null;
        if(listarPlataformas25mtemp != null){
        java.util.List listreturnp26= java.util.Arrays.asList(listarPlataformas25mtemp);
        tempreturnp26 = listreturnp26.toString();
        }
        %>
        <%=tempreturnp26%>
        <%
}
break;
case 28:
        gotMethod = true;
        java.lang.String[] listarArtistasInvitados28mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarArtistasInvitados();
if(listarArtistasInvitados28mtemp == null){
%>
<%=listarArtistasInvitados28mtemp %>
<%
}else{
        String tempreturnp29 = null;
        if(listarArtistasInvitados28mtemp != null){
        java.util.List listreturnp29= java.util.Arrays.asList(listarArtistasInvitados28mtemp);
        tempreturnp29 = listreturnp29.toString();
        }
        %>
        <%=tempreturnp29%>
        <%
}
break;
case 31:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg050");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtPlataforma seleccionaPlataforma31mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPlataforma(arg0_1idTemp);
if(seleccionaPlataforma31mtemp == null){
%>
<%=seleccionaPlataforma31mtemp %>
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
if(seleccionaPlataforma31mtemp != null){
java.lang.String typeespectadoresMax34 = seleccionaPlataforma31mtemp.getEspectadoresMax();
        String tempResultespectadoresMax34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMax34));
        %>
        <%= tempResultespectadoresMax34 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaAlta:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
java.lang.String typefechaAlta36 = seleccionaPlataforma31mtemp.getFechaAlta();
        String tempResultfechaAlta36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefechaAlta36));
        %>
        <%= tempResultfechaAlta36 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
%>
<%=seleccionaPlataforma31mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
java.lang.String typedescripcion40 = seleccionaPlataforma31mtemp.getDescripcion();
        String tempResultdescripcion40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion40));
        %>
        <%= tempResultdescripcion40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
java.lang.String typeespectadoresMin42 = seleccionaPlataforma31mtemp.getEspectadoresMin();
        String tempResultespectadoresMin42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMin42));
        %>
        <%= tempResultespectadoresMin42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
%>
<%=seleccionaPlataforma31mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uRLAsociada:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
java.lang.String typeuRLAsociada46 = seleccionaPlataforma31mtemp.getURLAsociada();
        String tempResultuRLAsociada46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuRLAsociada46));
        %>
        <%= tempResultuRLAsociada46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPlataforma31mtemp != null){
java.lang.String typenombre48 = seleccionaPlataforma31mtemp.getNombre();
        String tempResultnombre48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre48));
        %>
        <%= tempResultnombre48 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 52:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg075");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtEspectaculo seleccionaEspectaculo52mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaEspectaculo(arg0_2idTemp);
if(seleccionaEspectaculo52mtemp == null){
%>
<%=seleccionaEspectaculo52mtemp %>
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
if(seleccionaEspectaculo52mtemp != null){
%>
<%=seleccionaEspectaculo52mtemp.getEspectadoresMax()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
%>
<%=seleccionaEspectaculo52mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.lang.String typeimage59 = seleccionaEspectaculo52mtemp.getImage();
        String tempResultimage59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage59));
        %>
        <%= tempResultimage59 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.lang.String typedescripcion61 = seleccionaEspectaculo52mtemp.getDescripcion();
        String tempResultdescripcion61 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion61));
        %>
        <%= tempResultdescripcion61 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">artista:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.lang.String typeartista63 = seleccionaEspectaculo52mtemp.getArtista();
        String tempResultartista63 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeartista63));
        %>
        <%= tempResultartista63 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.util.Calendar typefechaRegistro65 = seleccionaEspectaculo52mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro65 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro65 = typefechaRegistro65.getTime();
        String tempResultfechaRegistro65 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro65.format(datefechaRegistro65));
        %>
        <%= tempResultfechaRegistro65 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
%>
<%=seleccionaEspectaculo52mtemp.getEspectadoresMin()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">urlAsociada:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.lang.String typeurlAsociada69 = seleccionaEspectaculo52mtemp.getUrlAsociada();
        String tempResulturlAsociada69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurlAsociada69));
        %>
        <%= tempResulturlAsociada69 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
%>
<%=seleccionaEspectaculo52mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaEspectaculo52mtemp != null){
java.lang.String typenombre73 = seleccionaEspectaculo52mtemp.getNombre();
        String tempResultnombre73 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre73));
        %>
        <%= tempResultnombre73 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 77:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg086");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtPaquete seleccionaPaquete77mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPaquete(arg0_3idTemp);
if(seleccionaPaquete77mtemp == null){
%>
<%=seleccionaPaquete77mtemp %>
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
if(seleccionaPaquete77mtemp != null){
%>
<%=seleccionaPaquete77mtemp.getDescuento()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPaquete77mtemp != null){
java.lang.String typedescripcion82 = seleccionaPaquete77mtemp.getDescripcion();
        String tempResultdescripcion82 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion82));
        %>
        <%= tempResultdescripcion82 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPaquete77mtemp != null){
java.lang.String typenombre84 = seleccionaPaquete77mtemp.getNombre();
        String tempResultnombre84 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre84));
        %>
        <%= tempResultnombre84 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 88:
        gotMethod = true;
        publicadores.DtEspectaculo[] listarEspectaculos88mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculos();
if(listarEspectaculos88mtemp == null){
%>
<%=listarEspectaculos88mtemp %>
<%
}else{
        String tempreturnp89 = null;
        if(listarEspectaculos88mtemp != null){
        java.util.List listreturnp89= java.util.Arrays.asList(listarEspectaculos88mtemp);
        tempreturnp89 = listreturnp89.toString();
        }
        %>
        <%=tempreturnp89%>
        <%
}
break;
case 91:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg0104");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtFuncion seleccionaFuncion91mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaFuncion(arg0_4idTemp);
if(seleccionaFuncion91mtemp == null){
%>
<%=seleccionaFuncion91mtemp %>
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
if(seleccionaFuncion91mtemp != null){
java.util.Calendar typefechaRegistro94 = seleccionaFuncion91mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro94 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro94 = typefechaRegistro94.getTime();
        String tempResultfechaRegistro94 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro94.format(datefechaRegistro94));
        %>
        <%= tempResultfechaRegistro94 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fecha:</TD>
<TD>
<%
if(seleccionaFuncion91mtemp != null){
java.util.Calendar typefecha96 = seleccionaFuncion91mtemp.getFecha();
        java.text.DateFormat dateFormatfecha96 = java.text.DateFormat.getDateInstance();
        java.util.Date datefecha96 = typefecha96.getTime();
        String tempResultfecha96 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfecha96.format(datefecha96));
        %>
        <%= tempResultfecha96 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">horaInicio:</TD>
<TD>
<%
if(seleccionaFuncion91mtemp != null){
java.lang.String typehoraInicio98 = seleccionaFuncion91mtemp.getHoraInicio();
        String tempResulthoraInicio98 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehoraInicio98));
        %>
        <%= tempResulthoraInicio98 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaFuncion91mtemp != null){
java.lang.String typeimage100 = seleccionaFuncion91mtemp.getImage();
        String tempResultimage100 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage100));
        %>
        <%= tempResultimage100 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaFuncion91mtemp != null){
java.lang.String typenombre102 = seleccionaFuncion91mtemp.getNombre();
        String tempResultnombre102 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre102));
        %>
        <%= tempResultnombre102 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 106:
        gotMethod = true;
        publicadores.DtPaquete[] listarPaquetes106mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetes();
if(listarPaquetes106mtemp == null){
%>
<%=listarPaquetes106mtemp %>
<%
}else{
        String tempreturnp107 = null;
        if(listarPaquetes106mtemp != null){
        java.util.List listreturnp107= java.util.Arrays.asList(listarPaquetes106mtemp);
        tempreturnp107 = listreturnp107.toString();
        }
        %>
        <%=tempreturnp107%>
        <%
}
break;
case 109:
        gotMethod = true;
        publicadores.DtFuncion[] listarFunciones109mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFunciones();
if(listarFunciones109mtemp == null){
%>
<%=listarFunciones109mtemp %>
<%
}else{
        String tempreturnp110 = null;
        if(listarFunciones109mtemp != null){
        java.util.List listreturnp110= java.util.Arrays.asList(listarFunciones109mtemp);
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