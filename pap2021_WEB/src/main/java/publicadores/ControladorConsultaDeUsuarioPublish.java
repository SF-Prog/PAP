/**
 * ControladorConsultaDeUsuarioPublish.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publicadores;

public interface ControladorConsultaDeUsuarioPublish extends java.rmi.Remote {
    public publicadores.DtEspectador[] listarUsuariosEspectador() throws java.rmi.RemoteException;
    public publicadores.DtArtista[] listarUsuariosArtista() throws java.rmi.RemoteException;
    public publicadores.DtEspectaculo[] listaInfoEspectaculos(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtUsuario dtu() throws java.rmi.RemoteException;
    public publicadores.DtEspectador dte() throws java.rmi.RemoteException;
    public publicadores.DtFuncion[] listaInfoFunciones(java.lang.String arg0) throws java.rmi.RemoteException;
    public publicadores.DtArtista dta() throws java.rmi.RemoteException;
    public publicadores.DtUsuario[] seleccionaUsuario(java.lang.String arg0) throws java.rmi.RemoteException;
}
