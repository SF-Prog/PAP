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
        java.lang.String[] listarEspectaculosComboBox13mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculosComboBox();
if(listarEspectaculosComboBox13mtemp == null){
%>
<%=listarEspectaculosComboBox13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarEspectaculosComboBox13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarEspectaculosComboBox13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        java.lang.String[] listarPlataformasComboBox16mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPlataformasComboBox();
if(listarPlataformasComboBox16mtemp == null){
%>
<%=listarPlataformasComboBox16mtemp %>
<%
}else{
        String tempreturnp17 = null;
        if(listarPlataformasComboBox16mtemp != null){
        java.util.List listreturnp17= java.util.Arrays.asList(listarPlataformasComboBox16mtemp);
        tempreturnp17 = listreturnp17.toString();
        }
        %>
        <%=tempreturnp17%>
        <%
}
break;
case 19:
        gotMethod = true;
        java.lang.String[] listarFuncionesComboBox19mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFuncionesComboBox();
if(listarFuncionesComboBox19mtemp == null){
%>
<%=listarFuncionesComboBox19mtemp %>
<%
}else{
        String tempreturnp20 = null;
        if(listarFuncionesComboBox19mtemp != null){
        java.util.List listreturnp20= java.util.Arrays.asList(listarFuncionesComboBox19mtemp);
        tempreturnp20 = listreturnp20.toString();
        }
        %>
        <%=tempreturnp20%>
        <%
}
break;
case 22:
        gotMethod = true;
        java.lang.String[] listarPaquetesComboBox22mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetesComboBox();
if(listarPaquetesComboBox22mtemp == null){
%>
<%=listarPaquetesComboBox22mtemp %>
<%
}else{
        String tempreturnp23 = null;
        if(listarPaquetesComboBox22mtemp != null){
        java.util.List listreturnp23= java.util.Arrays.asList(listarPaquetesComboBox22mtemp);
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
        String arg0_1id=  request.getParameter("arg051");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        publicadores.DtEspectaculo seleccionaEspectaculo28mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaEspectaculo(arg0_1idTemp);
if(seleccionaEspectaculo28mtemp == null){
%>
<%=seleccionaEspectaculo28mtemp %>
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
if(seleccionaEspectaculo28mtemp != null){
%>
<%=seleccionaEspectaculo28mtemp.getEspectadoresMax()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
%>
<%=seleccionaEspectaculo28mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.lang.String typeimage35 = seleccionaEspectaculo28mtemp.getImage();
        String tempResultimage35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage35));
        %>
        <%= tempResultimage35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.lang.String typedescripcion37 = seleccionaEspectaculo28mtemp.getDescripcion();
        String tempResultdescripcion37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion37));
        %>
        <%= tempResultdescripcion37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">artista:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.lang.String typeartista39 = seleccionaEspectaculo28mtemp.getArtista();
        String tempResultartista39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeartista39));
        %>
        <%= tempResultartista39 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaRegistro:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.util.Calendar typefechaRegistro41 = seleccionaEspectaculo28mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro41 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro41 = typefechaRegistro41.getTime();
        String tempResultfechaRegistro41 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro41.format(datefechaRegistro41));
        %>
        <%= tempResultfechaRegistro41 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
%>
<%=seleccionaEspectaculo28mtemp.getEspectadoresMin()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">urlAsociada:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.lang.String typeurlAsociada45 = seleccionaEspectaculo28mtemp.getUrlAsociada();
        String tempResulturlAsociada45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeurlAsociada45));
        %>
        <%= tempResulturlAsociada45 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
%>
<%=seleccionaEspectaculo28mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaEspectaculo28mtemp != null){
java.lang.String typenombre49 = seleccionaEspectaculo28mtemp.getNombre();
        String tempResultnombre49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre49));
        %>
        <%= tempResultnombre49 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 53:
        gotMethod = true;
        String arg0_2id=  request.getParameter("arg072");
            java.lang.String arg0_2idTemp = null;
        if(!arg0_2id.equals("")){
         arg0_2idTemp  = arg0_2id;
        }
        publicadores.DtPlataforma seleccionaPlataforma53mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPlataforma(arg0_2idTemp);
if(seleccionaPlataforma53mtemp == null){
%>
<%=seleccionaPlataforma53mtemp %>
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
if(seleccionaPlataforma53mtemp != null){
java.lang.String typeespectadoresMax56 = seleccionaPlataforma53mtemp.getEspectadoresMax();
        String tempResultespectadoresMax56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMax56));
        %>
        <%= tempResultespectadoresMax56 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fechaAlta:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
java.lang.String typefechaAlta58 = seleccionaPlataforma53mtemp.getFechaAlta();
        String tempResultfechaAlta58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefechaAlta58));
        %>
        <%= tempResultfechaAlta58 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">costo:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
%>
<%=seleccionaPlataforma53mtemp.getCosto()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
java.lang.String typedescripcion62 = seleccionaPlataforma53mtemp.getDescripcion();
        String tempResultdescripcion62 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion62));
        %>
        <%= tempResultdescripcion62 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">espectadoresMin:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
java.lang.String typeespectadoresMin64 = seleccionaPlataforma53mtemp.getEspectadoresMin();
        String tempResultespectadoresMin64 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeespectadoresMin64));
        %>
        <%= tempResultespectadoresMin64 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">duracion:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
%>
<%=seleccionaPlataforma53mtemp.getDuracion()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">uRLAsociada:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
java.lang.String typeuRLAsociada68 = seleccionaPlataforma53mtemp.getURLAsociada();
        String tempResultuRLAsociada68 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuRLAsociada68));
        %>
        <%= tempResultuRLAsociada68 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPlataforma53mtemp != null){
java.lang.String typenombre70 = seleccionaPlataforma53mtemp.getNombre();
        String tempResultnombre70 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre70));
        %>
        <%= tempResultnombre70 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 74:
        gotMethod = true;
        java.lang.String[] listarArtistasInvitados74mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarArtistasInvitados();
if(listarArtistasInvitados74mtemp == null){
%>
<%=listarArtistasInvitados74mtemp %>
<%
}else{
        String tempreturnp75 = null;
        if(listarArtistasInvitados74mtemp != null){
        java.util.List listreturnp75= java.util.Arrays.asList(listarArtistasInvitados74mtemp);
        tempreturnp75 = listreturnp75.toString();
        }
        %>
        <%=tempreturnp75%>
        <%
}
break;
case 77:
        gotMethod = true;
        publicadores.DtEspectaculo[] listarEspectaculos77mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarEspectaculos();
if(listarEspectaculos77mtemp == null){
%>
<%=listarEspectaculos77mtemp %>
<%
}else{
        String tempreturnp78 = null;
        if(listarEspectaculos77mtemp != null){
        java.util.List listreturnp78= java.util.Arrays.asList(listarEspectaculos77mtemp);
        tempreturnp78 = listreturnp78.toString();
        }
        %>
        <%=tempreturnp78%>
        <%
}
break;
case 80:
        gotMethod = true;
        publicadores.DtPaquete[] listarPaquetes80mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarPaquetes();
if(listarPaquetes80mtemp == null){
%>
<%=listarPaquetes80mtemp %>
<%
}else{
        String tempreturnp81 = null;
        if(listarPaquetes80mtemp != null){
        java.util.List listreturnp81= java.util.Arrays.asList(listarPaquetes80mtemp);
        tempreturnp81 = listreturnp81.toString();
        }
        %>
        <%=tempreturnp81%>
        <%
}
break;
case 83:
        gotMethod = true;
        publicadores.DtFuncion[] listarFunciones83mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.listarFunciones();
if(listarFunciones83mtemp == null){
%>
<%=listarFunciones83mtemp %>
<%
}else{
        String tempreturnp84 = null;
        if(listarFunciones83mtemp != null){
        java.util.List listreturnp84= java.util.Arrays.asList(listarFunciones83mtemp);
        tempreturnp84 = listreturnp84.toString();
        }
        %>
        <%=tempreturnp84%>
        <%
}
break;
case 86:
        gotMethod = true;
        String arg0_3id=  request.getParameter("arg099");
            java.lang.String arg0_3idTemp = null;
        if(!arg0_3id.equals("")){
         arg0_3idTemp  = arg0_3id;
        }
        publicadores.DtFuncion seleccionaFuncion86mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaFuncion(arg0_3idTemp);
if(seleccionaFuncion86mtemp == null){
%>
<%=seleccionaFuncion86mtemp %>
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
if(seleccionaFuncion86mtemp != null){
java.util.Calendar typefechaRegistro89 = seleccionaFuncion86mtemp.getFechaRegistro();
        java.text.DateFormat dateFormatfechaRegistro89 = java.text.DateFormat.getDateInstance();
        java.util.Date datefechaRegistro89 = typefechaRegistro89.getTime();
        String tempResultfechaRegistro89 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfechaRegistro89.format(datefechaRegistro89));
        %>
        <%= tempResultfechaRegistro89 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fecha:</TD>
<TD>
<%
if(seleccionaFuncion86mtemp != null){
java.util.Calendar typefecha91 = seleccionaFuncion86mtemp.getFecha();
        java.text.DateFormat dateFormatfecha91 = java.text.DateFormat.getDateInstance();
        java.util.Date datefecha91 = typefecha91.getTime();
        String tempResultfecha91 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatfecha91.format(datefecha91));
        %>
        <%= tempResultfecha91 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">horaInicio:</TD>
<TD>
<%
if(seleccionaFuncion86mtemp != null){
java.lang.String typehoraInicio93 = seleccionaFuncion86mtemp.getHoraInicio();
        String tempResulthoraInicio93 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typehoraInicio93));
        %>
        <%= tempResulthoraInicio93 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">image:</TD>
<TD>
<%
if(seleccionaFuncion86mtemp != null){
java.lang.String typeimage95 = seleccionaFuncion86mtemp.getImage();
        String tempResultimage95 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeimage95));
        %>
        <%= tempResultimage95 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaFuncion86mtemp != null){
java.lang.String typenombre97 = seleccionaFuncion86mtemp.getNombre();
        String tempResultnombre97 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre97));
        %>
        <%= tempResultnombre97 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 101:
        gotMethod = true;
        String arg0_4id=  request.getParameter("arg0110");
            java.lang.String arg0_4idTemp = null;
        if(!arg0_4id.equals("")){
         arg0_4idTemp  = arg0_4id;
        }
        publicadores.DtPaquete seleccionaPaquete101mtemp = sampleControladorConsultaDeEspectaculoPublishProxyid.seleccionaPaquete(arg0_4idTemp);
if(seleccionaPaquete101mtemp == null){
%>
<%=seleccionaPaquete101mtemp %>
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
if(seleccionaPaquete101mtemp != null){
%>
<%=seleccionaPaquete101mtemp.getDescuento()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">descripcion:</TD>
<TD>
<%
if(seleccionaPaquete101mtemp != null){
java.lang.String typedescripcion106 = seleccionaPaquete101mtemp.getDescripcion();
        String tempResultdescripcion106 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripcion106));
        %>
        <%= tempResultdescripcion106 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(seleccionaPaquete101mtemp != null){
java.lang.String typenombre108 = seleccionaPaquete101mtemp.getNombre();
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