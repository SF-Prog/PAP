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
        String arg0_1id=  request.getParameter("arg026");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtFuncion seleccionaFuncion13mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaFuncion(arg0_1idTemp);
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
        publicadores.ArrayList listarEspectaculos28mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculos();
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
        String arg0_2id=  request.getParameter("arg040");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtPaquete seleccionaPaquete31mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPaquete(arg0_2idTemp);
if(seleccionaPaquete31mtemp == null){
%>
<%=seleccionaPaquete31mtemp %>
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
if(seleccionaPaquete31mtemp != null){
%>
<%=seleccionaPaquete31mtemp.getDescuento()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPaquete31mtemp != null){
java.lang.String typedescripcion36 = seleccionaPaquete31mtemp.getDescripcion();
        String tempResultdescripcion36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion36));
        %>
        <%= tempResultdescripcion36 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPaquete31mtemp != null){
java.lang.String typenombre38 = seleccionaPaquete31mtemp.getNombre();
        String tempResultnombre38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre38));
        %>
        <%= tempResultnombre38 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 42:
        gotMethod = true;
        publicadores.ArrayList listarPaquetes42mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetes();
if(listarPaquetes42mtemp == null){
%>
<%=listarPaquetes42mtemp %>
<%
}else{
        if(listarPaquetes42mtemp!= null){
        String tempreturnp43 = listarPaquetes42mtemp.toString();
        %>
        <%=tempreturnp43%>
        <%
        }}
break;
case 45:
        gotMethod = true;
        publicadores.ArrayList listarFunciones45mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFunciones();
if(listarFunciones45mtemp == null){
%>
<%=listarFunciones45mtemp %>
<%
}else{
        if(listarFunciones45mtemp!= null){
        String tempreturnp46 = listarFunciones45mtemp.toString();
        %>
        <%=tempreturnp46%>
        <%
        }}
break;
case 48:
        gotMethod = true;
        java.lang.String[] listarPlataformasComboBox48mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformasComboBox();
if(listarPlataformasComboBox48mtemp == null){
%>
<%=listarPlataformasComboBox48mtemp %>
<%
}else{
        String tempreturnp49 = null;
        if(listarPlataformasComboBox48mtemp != null){
        java.util.List listreturnp49= java.util.Arrays.asList(listarPlataformasComboBox48mtemp);
        tempreturnp49 = listreturnp49.toString();
        }
        %>
        <%=tempreturnp49%>
        <%
}
break;
case 51:
        gotMethod = true;
        java.lang.String[] listarEspectaculosComboBox51mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculosComboBox();
if(listarEspectaculosComboBox51mtemp == null){
%>
<%=listarEspectaculosComboBox51mtemp %>
<%
}else{
        String tempreturnp52 = null;
        if(listarEspectaculosComboBox51mtemp != null){
        java.util.List listreturnp52= java.util.Arrays.asList(listarEspectaculosComboBox51mtemp);
        tempreturnp52 = listreturnp52.toString();
        }
        %>
        <%=tempreturnp52%>
        <%
}
break;
case 54:
        gotMethod = true;
        java.lang.String[] listarPaquetesComboBox54mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetesComboBox();
if(listarPaquetesComboBox54mtemp == null){
%>
<%=listarPaquetesComboBox54mtemp %>
<%
}else{
        String tempreturnp55 = null;
        if(listarPaquetesComboBox54mtemp != null){
        java.util.List listreturnp55= java.util.Arrays.asList(listarPaquetesComboBox54mtemp);
        tempreturnp55 = listreturnp55.toString();
        }
        %>
        <%=tempreturnp55%>
        <%
}
break;
case 57:
        gotMethod = true;
        java.lang.String[] listarFuncionesComboBox57mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFuncionesComboBox();
if(listarFuncionesComboBox57mtemp == null){
%>
<%=listarFuncionesComboBox57mtemp %>
<%
}else{
        String tempreturnp58 = null;
        if(listarFuncionesComboBox57mtemp != null){
        java.util.List listreturnp58= java.util.Arrays.asList(listarFuncionesComboBox57mtemp);
        tempreturnp58 = listreturnp58.toString();
        }
        %>
        <%=tempreturnp58%>
        <%
}
break;
case 60:
        gotMethod = true;
        publicadores.ArrayList listarPlataformas60mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformas();
if(listarPlataformas60mtemp == null){
%>
<%=listarPlataformas60mtemp %>
<%
}else{
        if(listarPlataformas60mtemp!= null){
        String tempreturnp61 = listarPlataformas60mtemp.toString();
        %>
        <%=tempreturnp61%>
        <%
        }}
break;
case 63:
        gotMethod = true;
        java.lang.String[] listarArtistasInvitados63mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarArtistasInvitados();
if(listarArtistasInvitados63mtemp == null){
%>
<%=listarArtistasInvitados63mtemp %>
<%
}else{
        String tempreturnp64 = null;
        if(listarArtistasInvitados63mtemp != null){
        java.util.List listreturnp64= java.util.Arrays.asList(listarArtistasInvitados63mtemp);
        tempreturnp64 = listreturnp64.toString();
        }
        %>
        <%=tempreturnp64%>
        <%
}
break;
case 66:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg085");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtPlataforma seleccionaPlataforma66mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPlataforma(arg0_3idTemp);
if(seleccionaPlataforma66mtemp == null){
%>
<%=seleccionaPlataforma66mtemp %>
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
if(seleccionaPlataforma66mtemp != null){
java.lang.String typeespectadoresMax69 = seleccionaPlataforma66mtemp.getEspectadoresMax();
        String tempResultespectadoresMax69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMax69));
        %>
        <%= tempResultespectadoresMax69 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaAlta:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
java.lang.String typefechaAlta71 = seleccionaPlataforma66mtemp.getFechaAlta();
        String tempResultfechaAlta71 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefechaAlta71));
        %>
        <%= tempResultfechaAlta71 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
%>
<%=seleccionaPlataforma66mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
java.lang.String typedescripcion75 = seleccionaPlataforma66mtemp.getDescripcion();
        String tempResultdescripcion75 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion75));
        %>
        <%= tempResultdescripcion75 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
java.lang.String typeespectadoresMin77 = seleccionaPlataforma66mtemp.getEspectadoresMin();
        String tempResultespectadoresMin77 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMin77));
        %>
        <%= tempResultespectadoresMin77 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
%>
<%=seleccionaPlataforma66mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uRLAsociada:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
java.lang.String typeuRLAsociada81 = seleccionaPlataforma66mtemp.getURLAsociada();
        String tempResultuRLAsociada81 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuRLAsociada81));
        %>
        <%= tempResultuRLAsociada81 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPlataforma66mtemp != null){
java.lang.String typenombre83 = seleccionaPlataforma66mtemp.getNombre();
        String tempResultnombre83 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre83));
        %>
        <%= tempResultnombre83 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 87:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg0110");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtEspectaculo seleccionaEspectaculo87mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaEspectaculo(arg0_4idTemp);
if(seleccionaEspectaculo87mtemp == null){
%>
<%=seleccionaEspectaculo87mtemp %>
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
if(seleccionaEspectaculo87mtemp != null){
%>
<%=seleccionaEspectaculo87mtemp.getEspectadoresMax()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
%>
<%=seleccionaEspectaculo87mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.lang.String typeimage94 = seleccionaEspectaculo87mtemp.getImage();
        String tempResultimage94 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage94));
        %>
        <%= tempResultimage94 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.lang.String typedescripcion96 = seleccionaEspectaculo87mtemp.getDescripcion();
        String tempResultdescripcion96 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion96));
        %>
        <%= tempResultdescripcion96 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">artista:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.lang.String typeartista98 = seleccionaEspectaculo87mtemp.getArtista();
        String tempResultartista98 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeartista98));
        %>
        <%= tempResultartista98 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.util.Calendar typefechaRegistro100 = seleccionaEspectaculo87mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro100 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro100 = typefechaRegistro100.getTime();
        String tempResultfechaRegistro100 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro100.format(datefechaRegistro100));
        %>
        <%= tempResultfechaRegistro100 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
%>
<%=seleccionaEspectaculo87mtemp.getEspectadoresMin()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">urlAsociada:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.lang.String typeurlAsociada104 = seleccionaEspectaculo87mtemp.getUrlAsociada();
        String tempResulturlAsociada104 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurlAsociada104));
        %>
        <%= tempResulturlAsociada104 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
%>
<%=seleccionaEspectaculo87mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaEspectaculo87mtemp != null){
java.lang.String typenombre108 = seleccionaEspectaculo87mtemp.getNombre();
        String tempResultnombre108 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre108));
        %>
        <%= tempResultnombre108 %>
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